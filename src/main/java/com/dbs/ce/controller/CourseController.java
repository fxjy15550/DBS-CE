package com.dbs.ce.controller;

import com.dbs.ce.entity.Course;
import com.dbs.ce.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;

@RestController
@RequestMapping("/course")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @RequestMapping("/selectAll")
    public ArrayList<Course> selectAll() {
        return courseService.selectAll();
    }
}
