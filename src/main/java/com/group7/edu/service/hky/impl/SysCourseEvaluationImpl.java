package com.group7.edu.service.hky.impl;


import com.group7.edu.mapper.hky.SysCourseEvaluationMapperHky;
import com.group7.edu.service.hky.SysCourseEvaluation;
import com.group7.edu.utils.ResultData;
import com.group7.edu.utils.ShiroUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

@Service(value = "sysCourseEvaluationHky")
public class SysCourseEvaluationImpl implements SysCourseEvaluation {

    @Resource(name = "sysCourseEvaluationMapperHky")
    SysCourseEvaluationMapperHky sysCourseEvaluationMapper;


    @Override
    public ResultData evaluation(int course) {

        Double evaluation = sysCourseEvaluationMapper.evaluation(course);
        if (evaluation == null || evaluation < 0.0){
            return ResultData.isFailure("查询评分失败");
        }
        return ResultData.isSuccess().put("evaluation",evaluation);
    }

    @Override
    public ResultData advice(com.group7.edu.entity.SysCourseEvaluation sysCourseEvaluation) {

        com.group7.edu.entity.SysCourseEvaluation sysCourseEvaluation1 = new com.group7.edu.entity.SysCourseEvaluation();
        sysCourseEvaluation1 = sysCourseEvaluationMapper.isEvaluate(ShiroUtils.getUserId(),sysCourseEvaluation.getCourse());
        if(sysCourseEvaluation1 != null){
            ResultData resultData = new ResultData();
            resultData.put("code",2);
            resultData.put("msg","您已经评价过，请不要重复评价");
            return resultData;
        }

        Date utilDate = new Date();
        java.sql.Date sqlData = new java.sql.Date(utilDate.getTime());

        sysCourseEvaluation.setCreatedTime(sqlData);
        sysCourseEvaluation.setUserId(ShiroUtils.getUserId());

        int result = sysCourseEvaluationMapper.insert(sysCourseEvaluation);
        if(result > 0 )
            return ResultData.isSuccess("意见提交成功");

        return ResultData.isFailure("意见提交失败");
    }
}
