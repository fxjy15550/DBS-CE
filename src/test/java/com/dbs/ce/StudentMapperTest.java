package com.dbs.ce;

import com.dbs.ce.entity.Student;
import com.dbs.ce.mapper.StudentMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class StudentMapperTest {
    @Autowired
    StudentMapper studentMapper;

    @Test
    void selectTest() {
        System.out.println(studentMapper.selectBySno("201215121"));
        System.out.println(studentMapper.selectByStudentName("张三"));
    }

    @Test
    void checkSnoExistTest() {
        System.out.println(studentMapper.checkSnoExist("201215121"));
    }

    @Test
    void checkNicknameExistTest() {
        System.out.println(studentMapper.checkNicknameExist("张三"));
    }

    @Test
    void checkPasswordCorrectTest() {
        System.out.println(studentMapper.checkPasswordCorrect("201215121", "123456"));
    }

    @Test
    void insertTest() {
        Student student = new Student();
        student.setSno("17020031060");
        student.setSname("根本");
        student.setNickname("牵星");
        student.setPassword("1c3456");
        student.setSage(21);
        student.setSdept("CS");
        student.setSsex("男");
        try {
            System.out.println(studentMapper.insert(student));//1
        } catch (Exception e) {
            e.printStackTrace();
        }
        //字段不全
        student.setSno(null);
        student.setNickname(null);
        try {
            System.out.println(studentMapper.insert(student));
        } catch (Exception e) {
            System.out.println(e.getCause());//exception:Column 'xxx' cannot be null
        }
    }

    @Test
    void updatePwdBySnoTest() {
        try {//true
            System.out.println(studentMapper.updatePwdBySno("17020031060", "1243"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
