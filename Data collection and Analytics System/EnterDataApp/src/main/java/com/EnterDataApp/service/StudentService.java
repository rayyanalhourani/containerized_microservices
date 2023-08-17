package com.EnterDataApp.service;

import com.EnterDataApp.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService{
    @Autowired
    StudentRepositry studentRepositry;

    public void addMark(Student student){
        studentRepositry.save(student);
    }
}
