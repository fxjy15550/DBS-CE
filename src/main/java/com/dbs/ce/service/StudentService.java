package com.dbs.ce.service;

import com.dbs.ce.DTO.ResponseDTO;
import com.dbs.ce.entity.Student;
import com.dbs.ce.mapper.StudentMapper;
import com.dbs.ce.util.StringCheckUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private StudentMapper studentMapper;

    /**
     * @Author Tan Mingyao
     * @Description 登录服务
     * @Date 17:36 2020/5/29
     * @Param [sno, password]
     * @return com.dbs.ce.DTO.ResponseDTO
     **/
    public ResponseDTO login(String sno, String password) {
        Student student = studentMapper.selectBySno(sno);
        if (student == null) //用户id不存在
            return new ResponseDTO(ResponseDTO.NotFound, "用户不存在");
        else if (!student.getPassword().equals(password)) //密码错误
            return new ResponseDTO(ResponseDTO.Forbidden, "密码错误");
        else {
            student.setPassword(null);  //置空密码
            return new ResponseDTO(ResponseDTO.OK, "登录成功", student);
        }
    }

   /**
    * @Author Tan Mingyao
    * @Description 注册服务
    * @Date 17:35 2020/5/29
    * @Param [student]
    * @return com.dbs.ce.DTO.ResponseDTO
    **/
    public ResponseDTO register(Student student) {
        //确保student不为null
        if (student == null)
            return new ResponseDTO(ResponseDTO.NotFound, "用户信息为空");
            //确保id不重复
        else if (studentMapper.checkSnoExist(student.getSno()))
            return new ResponseDTO(ResponseDTO.Forbidden, "该学号已注册");
            //确保nickname不重复
        else if (studentMapper.checkNicknameExist(student.getNickname()))
            return new ResponseDTO(ResponseDTO.Forbidden, "该昵称已被使用");
        else {
            int result = 0;
            try {
                result = studentMapper.insert(student);
            } catch (Exception e) {
                return new ResponseDTO(ResponseDTO.FAILED, "注册失败:" + e.getMessage());
            }
            if (result == 1)
                return new ResponseDTO(ResponseDTO.OK, "注册成功");
            else
                return new ResponseDTO(ResponseDTO.FAILED, "未知错误");
        }
    }

    /**
     * @Author Tan Mingyao
     * @Description 修改密码服务
     * @Date 17:41 2020/5/29
     * @Param [sno, password, newPassword]
     * @return com.dbs.ce.DTO.ResponseDTO
     **/
    public ResponseDTO updatePassword(String sno, String password, String newPassword) {
        if (StringCheckUtil.checkIsEmpty(sno))
            return new ResponseDTO(ResponseDTO.NotFound, "用户ID为空");
        else if (studentMapper.checkPasswordCorrect(sno, password)) {
            if(!StringCheckUtil.checkPwdStr(newPassword))
                return new ResponseDTO(ResponseDTO.Forbidden, "新密码不合法");
            try {
                if(studentMapper.updatePwdBySno(sno, newPassword))
                    return new ResponseDTO(ResponseDTO.OK, "修改密码成功");
                else
                    return new ResponseDTO(ResponseDTO.Forbidden, "未知错误");
            } catch (Exception e) {
                return new ResponseDTO(ResponseDTO.FAILED, "修改密码失败:" + e.getMessage());
            }
        } else {
            return new ResponseDTO(ResponseDTO.Forbidden, "用户ID或密码错误");
        }
    }

}
