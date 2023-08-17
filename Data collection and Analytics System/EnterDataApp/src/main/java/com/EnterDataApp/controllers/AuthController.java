package com.EnterDataApp.controllers;

import com.EnterDataApp.model.User;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class AuthController {

    private RestTemplate restTemplate=new RestTemplate();

    @GetMapping("/login")
    public String loginPage(Model model){
        model.addAttribute("user" , new User());
        return "login-form";
    }

    @PostMapping("/login")
    public String auth(HttpServletRequest request, @ModelAttribute("user") User user){
        String url = "http://authservice:8083/";
        String result = restTemplate.postForObject(url,user,String.class);
        HttpSession httpSession = request.getSession();


        if (result.equals("valid")){
            httpSession.setAttribute("DataEntryUsername","admin");
            return "redirect:/";
        }

        else{
            return "redirect:/login";
        }

    }
}
