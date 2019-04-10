package com.group7.edu.service.impl;


import com.group7.edu.mapper.SysCourseEvaluationMapper;
import com.group7.edu.service.SysCourseEvaluation;
import com.group7.edu.utils.ResultData;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;

@Service(value = "sysCourseEvaluation")
public class SysCourseEvaluationImpl implements SysCourseEvaluation {

    @Resource
    SysCourseEvaluationMapper sysCourseEvaluationMapper;


    @Override
    public ResultData evaluation(int course) {
        System.out.println(course);
        double evaluation = sysCourseEvaluationMapper.evaluation(course);
        return ResultData.isSuccess().put("evaluation",evaluation);
    }
}
