package com.dbs.ce;

import com.dbs.ce.entity.Evaluate;
import com.dbs.ce.mapper.EvaluateMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@SpringBootTest
public class EvaluateMapperTest {
    @Autowired
    EvaluateMapper evaluateMapper;

    @Test
    void selectEvaluateByCnoTest() {
        System.out.println(evaluateMapper.selectEvaluateByCno("1"));
    }

    @Test
    void deleteEvaluateBySCTest() {
        System.out.println(evaluateMapper.deleteEvaluateBySC("17020031060", "2"));
    }

    @Test
    void insertEvaluateTest() {
        Evaluate evaluate = new Evaluate();
        evaluate.setCno("3");
        evaluate.setSno("17020031065");
        evaluate.setEcontent("gkljfgdfsd");
        evaluate.setEdate(Timestamp.valueOf(LocalDateTime.now()));
        System.out.println(evaluateMapper.insertEvaluate(evaluate));
    }

    @Test
    void checkIfEvaluatedTest() {
        System.out.println(evaluateMapper.checkIfEvaluated("17020031065", "3"));
    }

    @Test
    void updateEvaluateTest() {
        Evaluate evaluate = new Evaluate();
        evaluate.setCno("3");
        evaluate.setSno("17020031065");
        evaluate.setEcontent("gkgdfsd");
        evaluate.setEdate(Timestamp.valueOf(LocalDateTime.now()));
        System.out.println(evaluateMapper.updateEvaluate(evaluate));
    }
}
