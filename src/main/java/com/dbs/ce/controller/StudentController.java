/**
 * @Author Tan Mingyao
 * @Description
 * @Date 21:44 2020/5/29
 * @Param
 * @return
 **/
package com.dbs.ce.controller;

import com.dbs.ce.DTO.LoginDTO;
import com.dbs.ce.DTO.ResponseDTO;
import com.dbs.ce.DTO.UpdateDTO;
import com.dbs.ce.entity.Student;
import com.dbs.ce.service.StudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@Api(value = "学生", tags = "学生接口")
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService studentService;

    @ApiOperation(value = "学生注册", notes = "学生输入信息注册")
    @PostMapping(value = "/register", produces = "application/json")
    public ResponseDTO studentRegister(@RequestBody Student student) {
        return studentService.register(student);
    }

    @ApiOperation(value = "学生登录", notes = "登录成功后用户信息回填")
    @PostMapping(value = "/login", produces = "application/json")
    public ResponseDTO studentLogin(@RequestBody LoginDTO loginDTO) {
        return studentService.login(loginDTO.getUserId(), loginDTO.getPassword());
    }

    @ApiOperation(value = "修改密码", notes = "根据验证码修改密码（TODO）")
    @PostMapping(value = "/password", produces = "application/json")
    public ResponseDTO updatePassword(@RequestBody UpdateDTO updateDTO) {
            return studentService.updatePassword(updateDTO.getUserId(),
                    updateDTO.getPassword(), updateDTO.getUpdateInfo());
    }
}
