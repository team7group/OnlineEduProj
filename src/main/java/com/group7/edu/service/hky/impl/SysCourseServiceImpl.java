package com.group7.edu.service.hky.impl;

import com.group7.edu.mapper.hky.SysCourseMapperHky;
import com.group7.edu.service.hky.SysCourseService;
import com.group7.edu.utils.ResultData;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service(value = "SysCourseServiceHky")
public class SysCourseServiceImpl implements SysCourseService {

    @Resource(name = "sysCourseMapperHky")
    SysCourseMapperHky sysCourseMapper;

    @Override
    public ResultData banner(int id) {
        String banner = sysCourseMapper.banner(id);
        if(banner != null){
            return ResultData.isSuccess().put("banner",banner);
        }
        return ResultData.isFailure("失败");
    }
}
