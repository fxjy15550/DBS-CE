package com.dbs.ce;

import com.dbs.ce.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserMapperTest {
    @Autowired
    UserMapper userMapper;


    @Test
    void findAll() {
        System.out.println(userMapper.findAll());
    }
}
