package com.group7.edu.mapper.hky;

import com.group7.edu.entity.SysCourse;
import org.springframework.stereotype.Component;

@Component("sysCourseMapperHky")
public interface SysCourseMapperHky {
    int deleteByPrimaryKey(Integer id);

    int insert(SysCourse record);

    int insertSelective(SysCourse record);

    SysCourse selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysCourse record);

    int updateByPrimaryKey(SysCourse record);

    String banner(int id);
}