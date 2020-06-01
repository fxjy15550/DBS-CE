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

    /**
     * @Author Tan Mingyao
     * @Description 展示全部课程服务
     * @LastModified 17:37 2020/6/1
     * @Param []
     * @Return java.util.ArrayList<com.dbs.ce.entity.Course>
     **/
    public ArrayList<Course> selectAll() {
        return courseMapper.selectAll();
    }

    /**
     * @Author Tan Mingyao
     * @Description 选课号查询服务
     * @LastModified 17:38 2020/6/1
     * @Param [cno]
     * @Return com.dbs.ce.entity.Course
     **/
    public Course selectByCno(String cno) {
        return courseMapper.selectByCno(cno);
    }

    /**
     * @Author Tan Mingyao
     * @Description 关键词搜索服务
     * @LastModified 17:37 2020/6/1
     * @Param [keyWords]
     * @Return java.util.ArrayList<com.dbs.ce.entity.Course>
     **/
    public ArrayList<Course> selectByKeyWords(String keyWords) {
        return courseMapper.selectByKeyWords(keyWords);
    }

    /**
     * @Author Tan Mingyao
     * @Description 查询专业课程服务
     * @LastModified 17:37 2020/6/1
     * @Param [dept]
     * @Return java.util.ArrayList<com.dbs.ce.entity.Course>
     **/
    public ArrayList<Course> selectCourseByDept(String dept) {
        return courseMapper.selectCourseByDept(dept);
    }
}
