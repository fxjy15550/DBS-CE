package com.dbs.ce.mapper;

import com.dbs.ce.entity.Student;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentMapper {
    Student selectBySno(String sno);
    Student selectByStudentName(String sname);
    boolean checkSnoExist(String sno);
    boolean checkNicknameExist(String nickname);
    boolean checkPasswordCorrect(String sno, String password);
    int insert(Student student) throws Exception;
    boolean updatePwdBySno(@Param("sno") String sno,
                                 @Param("password") String password) throws Exception;
}
