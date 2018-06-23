package com.ssm.controller;


import com.ssm.entity.Leave;
import com.ssm.service.FacultyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;

//院系
@Controller
@RequestMapping("/faculty")
public class FacultyController {
    @Autowired
    FacultyService facultyService;

    @RequestMapping("/leaveList")
    public List<Leave> getLeave(Model model,
                                @RequestParam(value = "sno", required = true) HttpSession session, String sno)throws Exception {
        List<Leave> leaveList = facultyService.getLeave(sno);
        model.addAttribute("sno",sno);
        return leaveList;
    }


    //根据获取单条未审批的学生请假申请
    @RequestMapping("/resultone")
    public String getOne(Model model,
                         @RequestParam(value = "sno", required = true) HttpSession session, String sno)throws Exception{
        Leave leave = facultyService.getOne(sno);
        model.addAttribute("sno", sno);
        return "resultone";
    }

}
