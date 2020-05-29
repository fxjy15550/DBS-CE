package com.dbs.ce.service;

import com.dbs.ce.entity.Student;
import com.dbs.ce.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private StudentMapper studentMapper;

    public Student select(String sno) {
        return studentMapper.selectBySno(sno);
    }
}
