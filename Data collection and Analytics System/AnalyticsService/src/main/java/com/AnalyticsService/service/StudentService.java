package com.AnalyticsService.service;

import com.AnalyticsService.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class StudentService{
    @Autowired
    private StudentRepository studentRepositry;

    public ArrayList<Integer> getMarks(){
        ArrayList<Integer> marks = new ArrayList<>();
        for (Student st:studentRepositry.findAll()) {
            marks.add(st.getMark());
        }
        return marks;
    }



}
