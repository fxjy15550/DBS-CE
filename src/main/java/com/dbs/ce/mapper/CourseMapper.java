package com.dbs.ce.mapper;

import com.dbs.ce.entity.Course;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface CourseMapper {
    ArrayList<Course> selectAll();

    Course selectByCno(String cno);

    ArrayList<Course> selectCourseByDept(String cdept);

    ArrayList<Course> selectByKeyWords(String keywords);
}
