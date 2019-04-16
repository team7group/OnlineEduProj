package com.group7.edu.service.impl;

import com.group7.edu.entity.SysCourse;
import com.group7.edu.mapper.SysCourseMapper;
import com.group7.edu.service.SysCourseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author default
 * @date 2019/4/9
 */
@Service
public class SysCourseServiceImpl implements SysCourseService {
    @Resource
    private SysCourseMapper sysCourseMapper;

    @Override
    public List<SysCourse> selectAllSysCourse(SysCourse sysCourse) {

        return sysCourseMapper.selectAllSysCourse(sysCourse);
    }
}
