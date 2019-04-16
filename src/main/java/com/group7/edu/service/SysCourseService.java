package com.group7.edu.service;

import com.group7.edu.entity.SysCourse;

import java.util.List;

/**
 * @author default
 * @date 2019/4/9
 */
public interface SysCourseService {
    /**
     * 查询课程集合
     */
    List<SysCourse> selectAllSysCourse(SysCourse sysCourse);
}
