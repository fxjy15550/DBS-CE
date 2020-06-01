package com.dbs.ce.service;

import com.dbs.ce.DTO.EvaluateDTO;
import com.dbs.ce.entity.Evaluate;
import com.dbs.ce.mapper.EvaluateMapper;
import com.dbs.ce.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;

@Service
public class EvaluateService {
    @Autowired
    EvaluateMapper evaluateMapper;
    @Autowired
    StudentMapper studentMapper;

    /**
     * @Author Tan Mingyao
     * @Description 课程评价展示服务
     * @LastModified 17:39 2020/6/1
     * @Param [cno]
     * @Return java.util.ArrayList<com.dbs.ce.DTO.EvaluateDTO>
     **/
    public ArrayList<EvaluateDTO> selectEvaluationByCno(String cno) {
        ArrayList<Evaluate> evaluateList = evaluateMapper.selectEvaluateByCno(cno);
        ArrayList<EvaluateDTO> evaluateDTOList = new ArrayList<>();
        for (Evaluate e : evaluateList) {
            EvaluateDTO eD = new EvaluateDTO();
            eD.setNickname(studentMapper.selectBySno(e.getSno()).getNickname());
            eD.setContent(e.getEcontent());
            eD.setDate(e.getEdate());
            evaluateDTOList.add(eD);
        }
        return evaluateDTOList;
    }

    /**
     * @Author Tan Mingyao
     * @Description 添加/修改评价服务
     * @LastModified 17:39 2020/6/1
     * @Param [evaluate]
     * @Return int
     **/
    public int newEvaluate(Evaluate evaluate) {
        evaluate.setEdate(Timestamp.valueOf(LocalDateTime.now()));
        int result = evaluateMapper.checkIfEvaluated(evaluate.getSno(), evaluate.getCno());
        if (result == 0) {
            return evaluateMapper.insertEvaluate(evaluate);
        } else {
            return evaluateMapper.updateEvaluate(evaluate);
        }
    }

    /**
     * @Author Tan Mingyao
     * @Description 删除评价服务
     * @LastModified 17:38 2020/6/1
     * @Param [sno, cno]
     * @Return int
     **/
    public int deleteEvaluateBySC(String sno, String cno) {
        return evaluateMapper.deleteEvaluateBySC(sno, cno);
    }
}

