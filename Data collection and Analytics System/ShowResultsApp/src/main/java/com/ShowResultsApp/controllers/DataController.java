package com.ShowResultsApp.controllers;

import com.ShowResultsApp.model.Analytics;
import com.ShowResultsApp.service.AnalyticsService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import java.net.http.HttpRequest;


@Controller
public class DataController {

    private RestTemplate restTemplate=new RestTemplate();

    @Autowired
    AnalyticsService service;

    @GetMapping("/")
    public String enterMarksPage(HttpServletRequest request, Model model){
        HttpSession httpSession = request.getSession();
        if(httpSession.getAttribute("ShowResultUsername")==null){
            return "redirect:/login";
        }

        String url = "http://analytics:8081/";
        restTemplate.getForObject(url, String.class);
        Analytics analytics =service.getAnalytics();
        model.addAttribute("analytics",analytics);
        return "showData";
    }


}
