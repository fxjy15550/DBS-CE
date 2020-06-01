package com.dbs.ce.controller;

import com.dbs.ce.entity.Course;
import com.dbs.ce.service.CourseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Api(value = "课程", tags = "课程接口")
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/course")
public class CourseController {
    @Autowired
    CourseService courseService;

    @ApiOperation(value = "专业课程查询", notes = "根据系名获取专业课程")
    @GetMapping(value = "/dept/{dept}", produces = "application/json")
    public ArrayList<Course> getSpecializedCourseByMajorId(@ApiParam(value = "系名", required = true)
                                                           @PathVariable String dept) {
        return courseService.selectCourseByDept(dept);
    }

    @ApiOperation(value = "课程号查询", notes = "根据课程号获取课程")
    @GetMapping(value = "/{cno}", produces = "application/json")
    public Course getCourse(@ApiParam(value = "课程号", required = true)
                            @PathVariable String cno) {
        return courseService.selectByCno(cno);
    }

    @ApiOperation(value = "搜索相关课程", notes = "根据关键字搜索课程")
    @GetMapping("/search/{searchStr}")
    public ArrayList<Course> search(@ApiParam(value = "关键字", required = true)
                                    @PathVariable String searchStr) {
        return courseService.selectByKeyWords(searchStr);
    }
}
