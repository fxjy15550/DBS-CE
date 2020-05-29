package com.dbs.ce;

import com.dbs.ce.mapper.StudentMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class StudentMapperTest {
    @Autowired
    StudentMapper studentMapper;

    @Test
    void select() {
        System.out.println(studentMapper.selectBySno("201215121"));
    }
}
