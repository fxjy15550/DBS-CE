package com.dbs.ce.controller;

import com.dbs.ce.DTO.EvaluateDTO;
import com.dbs.ce.DTO.ResponseDTO;
import com.dbs.ce.entity.Evaluate;
import com.dbs.ce.service.EvaluateService;
import com.dbs.ce.service.StudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Api(value = "评价", tags = "评价接口")
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/evaluate")
public class EvaluateController {
    @Autowired
    EvaluateService evaluateService;
    @Autowired
    StudentService studentService;

    @ApiOperation(value = "获取课程评价", notes = "根据课程号获取该课程所有评价")
    @GetMapping(value = "/{cno}", produces = "application/json")
    public ArrayList<EvaluateDTO> getEvaluationByCno(@ApiParam(value = "课程号", required = true)
                                                     @PathVariable String cno) {
        return evaluateService.selectEvaluationByCno(cno);
    }

    @ApiOperation(value = "学生添加/修改课程评价", notes = "根据课程号和用户信息给该课程添加/修改评论")
    @PostMapping(value = "/new", produces = "application/json")
    public ResponseDTO newEvaluate(@RequestBody Evaluate evaluate) {
        int result = evaluateService.newEvaluate(evaluate);
        if (result == 1) {
            return new ResponseDTO(ResponseDTO.OK, "评价成功");
        } else {
            return new ResponseDTO(ResponseDTO.FAILED, "评价失败");
        }
    }

    @ApiOperation(value = "删除评价", notes = "根据课程号和用户信息删除评论")
    @DeleteMapping(value = "/delete", produces = "application/json")
    public ResponseDTO deleteCommentBySC(@RequestBody Evaluate evaluate) {
        int result = evaluateService.deleteEvaluateBySC(evaluate.getSno(), evaluate.getCno());
        if (result == 1)
            return new ResponseDTO(ResponseDTO.OK, "删除评价成功");
        else
            return new ResponseDTO(ResponseDTO.FAILED, "删除评价失败");
    }

}
