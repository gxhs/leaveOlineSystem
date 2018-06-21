package com.ssm.controller;

import com.ssm.entity.Leave;
import com.ssm.service.LeaveService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.Date;

//假条
@Controller
@RequestMapping("/leave")
public class LeaveController {
    @Autowired
    LeaveService leaveService;

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
        String teacher;
        if (hours<=72) {
            teacher = "班主任";
        }else {
            teacher="书记";
        }
        System.out.println(teacher);
        Leave leave = new Leave();
        leave.setStarttime(starttime);
        leave.setEndtime(endtime);
        leave.setType(type);
        leave.setReason(reason);
        leave.setTime(time);
        leave.setStudentId(studentId);
        leave.setApprover(teacher);
        leave.setState("待审批");
        System.out.println("前");
        leaveService.insert(leave);
        System.out.println("后");
        return "index";
    }
}
