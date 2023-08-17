package com.EnterDataApp.service;

import com.EnterDataApp.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepositry extends JpaRepository<Student , Long> {
}
