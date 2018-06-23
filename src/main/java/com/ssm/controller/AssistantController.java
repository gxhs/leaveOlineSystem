package com.ssm.controller;

import com.ssm.entity.Assistant;
import com.ssm.entity.Leave;
import com.ssm.entity.Student;
import com.ssm.service.AssistantService;
import com.ssm.service.LeaveService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;

//辅导员
@Controller
@RequestMapping("/assistant")
public class AssistantController {
    @Autowired
    AssistantService assistantService;
    @Autowired
    LeaveService leaveService;

//
//    //根据学生id获取该生所有请假记录
//    @RequestMapping("/resultList")
//    public String selectLeaveBySno(Model model,
//                                        @RequestParam(value = "sno", required = true) HttpSession session, String sno) throws Exception {
//        List<Leave> leaveList = assistantService.selectLeaveBySno(sno);
//        model.addAttribute("leaveList", leaveList);
//
//        return "/leaveRecord";
//    }
//
//
//    //根据获取单条未审批的学生请假申请
//    @RequestMapping("/onLeave")
//    public String SelectOneBySno(Model model,
//                                  HttpSession session,
//                                 Integer id) throws Exception {
//        System.out.println("学生编号"+id);
//        Leave leave = assistantService.selectOneBySno(id);
//        Assistant assistant =assistantService.selectNameBySid(id);
//        int count=leaveService.countBySid(id);
//        model.addAttribute("leave", leave);
//        model.addAttribute("assistant",assistant);
//        model.addAttribute("count",count);
//        return "/unRatify";
//    }
//
//
//    //获取所有请假状态中的请假记录
//    @RequestMapping("/getAll")
//    public String getAll(Model model) throws Exception {
//        List<Leave> leaveList = assistantService.();
//        model.addAttribute("leaveList", leaveList);
//        return "leaveList";
//    }
//
//    //获取当前需要审批的学生列表


}
