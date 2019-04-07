package com.group7.edu.mapper;

import com.group7.edu.entity.SysCourse;
import com.group7.edu.entity.SysCourseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysCourseMapper {
    long countByExample(SysCourseExample example);

    int deleteByExample(SysCourseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysCourse record);

    int insertSelective(SysCourse record);

    List<SysCourse> selectByExample(SysCourseExample example);

    SysCourse selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysCourse record, @Param("example") SysCourseExample example);

    int updateByExample(@Param("record") SysCourse record, @Param("example") SysCourseExample example);

    int updateByPrimaryKeySelective(SysCourse record);

    int updateByPrimaryKey(SysCourse record);
}