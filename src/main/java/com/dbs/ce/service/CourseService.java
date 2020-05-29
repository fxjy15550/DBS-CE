package com.dbs.ce.service;

import com.dbs.ce.entity.Course;
import com.dbs.ce.mapper.CourseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CourseService {
    @Autowired
    private CourseMapper courseMapper;

    public ArrayList<Course> selectAll() {
        return courseMapper.selectAll();
    }
}
