package com.dbs.ce.mapper;

import com.dbs.ce.entity.Evaluate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface EvaluateMapper {
    int insertEvaluate(Evaluate evaluate);

    int updateEvaluate(Evaluate evaluate);

    int deleteEvaluateBySC(String sno, String cno);

    ArrayList<Evaluate> selectEvaluateByCno(String cno);

    int checkIfEvaluated(String sno,String cno);
}
