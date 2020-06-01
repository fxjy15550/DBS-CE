package com.dbs.ce;

import com.dbs.ce.mapper.CourseMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CourseMapperTest {
    @Autowired
    CourseMapper courseMapper;

    @Test
    void selectTest() {
        System.out.println(courseMapper.selectAll());
        System.out.println(courseMapper.selectByCno("1"));
        System.out.println(courseMapper.selectByKeyWords("数"));
        System.out.println(courseMapper.selectCourseByDept("CS"));
    }
}
