package com.group7.edu.service.syt;

import com.group7.edu.utils.ResultData;

public interface OrderService {

    public ResultData showCourse(Integer courseId);

    public ResultData showPayWay();

    public ResultData remind(Integer id);

    public ResultData orderInfo(Integer id);




}
