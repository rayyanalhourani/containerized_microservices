package com.AnalyticsService.controllers;

import com.AnalyticsService.model.Analytics;
import com.AnalyticsService.service.AnalyticsService;
import com.AnalyticsService.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class DataController {

    @Autowired
    AnalyticsService analysticsService;
    @Autowired
    StudentService service;

    @GetMapping("/")
    public String home(){
        ArrayList<Integer> marks = service.getMarks();
        if(marks.isEmpty()){
            return "no data found";
        }
        Analytics analytics = new Analytics(marks);
        analysticsService.UpdateMarks(analytics);
        return "data updated";
    }
}
