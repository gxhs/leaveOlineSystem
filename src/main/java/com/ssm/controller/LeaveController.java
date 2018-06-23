package com.ssm.controller;

import com.ssm.dao.StudentMapper;
import com.ssm.entity.Assistant;
import com.ssm.entity.Leave;
import com.ssm.entity.Major;
import com.ssm.entity.Student;
import com.ssm.service.AssistantService;
import com.ssm.service.LeaveService;
import com.ssm.service.StudentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

//假条
@Controller
@RequestMapping("/leave")
public class LeaveController {

    Integer S_majorId;
    String approver;

    @Autowired
    AssistantService assistantService;
    @Autowired
    LeaveService leaveService;
    @Autowired
    StudentService studentService;

    //,Date endtime,String type,String reason
    @RequestMapping("/insert")
    public String insert(HttpSession session,Date starttime, Date endtime, String type, String reason, Integer id) {
        Integer studentId= (Integer) session.getAttribute("studentId");
        System.out.println(starttime);
        System.out.println(endtime);
        //计算请假时间
        long temp = endtime.getTime() - starttime.getTime();//相差毫秒数
        long hours = temp / 1000 / 3600;                //相差小时数
        long day = hours / 24;                          //天数
        int hour = (int) (hours % 24);                          //小时数
        long temp2 = temp % (1000 * 3600);
        long mins = temp2 / 1000 / 60;                    //相差分钟数
        String time = day + "天" + hour + "小时";
        System.out.println(time);
        S_majorId=id;
        Assistant assistant=assistantService.selectByPrimaryKey(id);
        approver=assistant.getName();
        if (hours>72) {
            approver= "书记";
        }
        System.out.println(assistant);
        Leave leave = new Leave();
        leave.setStarttime(starttime);
        leave.setEndtime(endtime);
        leave.setType(type);
        leave.setReason(reason);
        leave.setTime(time);
        leave.setStudentId(studentId);
        leave.setApprover(approver);
        leave.setState("待审批");
        System.out.println("前");
        leaveService.insert(leave);
        System.out.println("后");
        return "index";
    }


    //根据学生id获取该生所有请假记录
    @RequestMapping("/leaveRecord")
    public String selectLeaveBySno(Model model,
                                    HttpSession session, Integer id) throws Exception {
        List<Leave> leaveList= assistantService.selectLeaveBySno(id);
        System.out.println(leaveList.size());
        model.addAttribute("leaveList", leaveList);
        return "/leaveRecord";
    }
    //根据学生id获取该生的请假结果
    @RequestMapping("/leaveRecordOne")
    public String selectLeaveBySnoAndState(Model model,
                                   HttpSession session, Integer id) throws Exception {
        Leave leave= leaveService.selectLeaveBySno(id);
        model.addAttribute("leave", leave);
        return "/studentState";
    }


    //根据获取单条未审批的学生请假申请
    @RequestMapping("/onLeave")
    public String SelectOneBySno(Model model,
                                 HttpSession session,
                                 Integer id) throws Exception {
        System.out.println("学生编号"+id);
        Student student=studentService.selectByPrimaryKey(id);
        Integer MajorId=student.getMajorId();
        Leave leave = assistantService.selectOneBySno(id);
        Assistant assistant =assistantService.selectNameBySid(MajorId);
        System.out.println("学生"+leave.getStudent());
        int count=leaveService.countBySid(id);
        model.addAttribute("leave", leave);
        model.addAttribute("assistant",assistant);
        model.addAttribute("count",count);
        return "/Ratify";
    }

    @RequestMapping("/updateState")
    public String updateStateById(Integer id,boolean ratifyType,Integer Sid){
        System.out.println(id);
        System.out.println(ratifyType);
        System.out.println(Sid);
        String state;
        if (ratifyType){
            state="请假中";
        }else {
            state="未批准";
        }
        Leave leave =new Leave();
        leave.setState(state);
        System.out.println("老师姓名"+approver);
        leave.setApprover(approver);

        leaveService.updateStateById(leave,id);
        return "redirect:/leave/getAll";
    }


    //获取所有请假状态中的请假记录
    @RequestMapping("/getAll")
    public String getAll(Model model) throws Exception {
        List<Leave> leaveListAll = assistantService.getAll();
        model.addAttribute("leaveListAll", leaveListAll);
        return "onLeave";
    }

    //获取当前需要审批的学生列表
    @RequestMapping("/unRatify")
    public String selectAllUnratify(Model model,String id) throws Exception {
        List<Leave> leaveList1 = leaveService.selectAllUnratifyBySno(id);
        System.out.println(leaveList1.size());
        model.addAttribute("leaveList1", leaveList1);
        return "unRatify";
    }
    @RequestMapping("/reportBack")
    public String updateState(Integer id) {
        Leave leave = new Leave();
        leave.setId(id);
        leave.setState("已销假");
        leaveService.update(leave);
     return  "/AssistantHoutai";
    }
}
