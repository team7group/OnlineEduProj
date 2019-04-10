package com.group7.edu.service.impl;

import com.group7.edu.mapper.SysCourseMapper;
import com.group7.edu.service.SysCourseService;
import com.group7.edu.utils.ResultData;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service(value = "sysCourse")
public class SysCourseServiceImpl implements SysCourseService {

    @Resource
    SysCourseMapper sysCourseMapper;

    @Override
    public ResultData banner(int id) {
        String banner = sysCourseMapper.banner(id);
        if(banner != null){
            return ResultData.isSuccess().put("banner",banner);
        }
        return ResultData.isFailure("失败");
    }
}
