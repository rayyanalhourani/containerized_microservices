package com.EnterDataApp.controllers;

import com.EnterDataApp.model.Student;
import com.EnterDataApp.model.User;
import com.EnterDataApp.service.StudentService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.apache.catalina.session.StandardSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DataController {


    @Autowired
    private StudentService studentService;


    @GetMapping("/")
    public String enterMarksPage(HttpServletRequest request, Model model){

        HttpSession httpSession= request.getSession();
        if(httpSession.getAttribute("DataEntryUsername")==null){
            return "redirect:/login";
        }

            model.addAttribute("student", new Student());
            return "enterData";
    }

    @PostMapping("/savedata")
    public String saveData(HttpServletRequest request,@ModelAttribute("student") Student student){
        HttpSession httpSession= request.getSession();
        if(httpSession.getAttribute("DataEntryUsername")==null){
            return "redirect:/login";
        }

        studentService.addMark(student);
        return "redirect:/";
    }


}
