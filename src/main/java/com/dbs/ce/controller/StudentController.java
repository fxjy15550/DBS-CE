package com.dbs.ce.controller;

import com.dbs.ce.entity.Student;
import com.dbs.ce.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("/select")
    public Student select(String sno) {
        return studentService.select(sno);
    }
}
