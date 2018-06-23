package com.ssm.controller;


import com.ssm.entity.Assistant;
import com.ssm.entity.Faculty;
import com.ssm.entity.Student;
import com.ssm.service.AssistantService;
import com.ssm.service.FacultyService;
import com.ssm.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    StudentService studentService;
    @Autowired
    FacultyService facultyService;
    @Autowired
    AssistantService assistantService;

    String sno;
    String psw;

    @RequestMapping("/url")
    public String url(String name, String password, String logintype) {
        sno=name;
        psw = password;
        System.out.println("前"+name);
        System.out.println("前"+password);
        if (logintype.equals("student")) {
            return "redirect:/login/student";
        } else if (logintype.equals("assistant")) {
            return "redirect:/login/assistant";
        }else
        return "redirect:/login/Faculty";
    }

    @RequestMapping("/student")
    public String student(HttpSession session, Model model) {
        System.out.println("前"+sno);
        System.out.println("前"+psw);
        Student student = studentService.selectBySno(sno);
//        System.out.println("hoou"+    student.getSno());
//        System.out.println("hoou"+    student.getPassword());
        if (student.getSno().equals(sno) && student.getPassword().equals(psw)) {
            session.setAttribute("sno", sno);
            session.setAttribute("studentId",student.getId());
            model.addAttribute("student", student);
            return "studentLeave";
        }
        return "login";
    }

    @RequestMapping("/assistant")
    public String assistant(Model model,HttpSession session) {
        Assistant assistant = assistantService.selectByAno(sno);
        assistant.getAno();
        assistant.getPassword();
        if (assistant.getAno().equals(sno) && assistant.getPassword().equals(psw)) {
            session.setAttribute("ano", sno);
            String name=assistant.getName();
            System.out.println("***************************************************"+name);
            model.addAttribute("Aname",name);
            return "/AssistantHoutai";
        }
        return "login";
    }

    @RequestMapping("/Faculty")
    public String Faculty(HttpSession session) {
        Faculty faculty = facultyService.selectByName(sno);
        if (faculty.getName().equals(sno) && faculty.getPassword().equals(psw)) {
            session.setAttribute("name", sno);
            return "/faculty";
        }
        return "login";
    }
}
