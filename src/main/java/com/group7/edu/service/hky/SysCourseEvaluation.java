package com.group7.edu.service.hky;

import com.group7.edu.utils.ResultData;

public interface SysCourseEvaluation {

    ResultData evaluation(int course);

    ResultData advice(com.group7.edu.entity.SysCourseEvaluation sysCourseEvaluation);
}
