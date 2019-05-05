package com.group7.edu.service.lxh.impl;

import com.group7.edu.entity.lxh.SysCourse;
import com.group7.edu.mapper.lxh.SysCourseMapperLxh;
import com.group7.edu.service.lxh.SysCourseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author default
 * @date 2019/4/9
 */
@Service("sysCourseServiceLxh")
public class SysCourseServiceImpl implements SysCourseService {
    @Resource
    private SysCourseMapperLxh sysCourseMapperLxh;

    @Override
    public List<SysCourse> selectAllSysCourse(SysCourse sysCourse) {
        return sysCourseMapperLxh.selectAllSysCourse(sysCourse);
    }
}
