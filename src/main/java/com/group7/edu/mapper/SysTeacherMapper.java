package com.group7.edu.mapper;

import com.group7.edu.entity.SysTeacher;
import com.group7.edu.entity.SysTeacherExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysTeacherMapper {
    long countByExample(SysTeacherExample example);

    int deleteByExample(SysTeacherExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysTeacher record);

    int insertSelective(SysTeacher record);

    List<SysTeacher> selectByExample(SysTeacherExample example);

    SysTeacher selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysTeacher record, @Param("example") SysTeacherExample example);

    int updateByExample(@Param("record") SysTeacher record, @Param("example") SysTeacherExample example);

    int updateByPrimaryKeySelective(SysTeacher record);

    int updateByPrimaryKey(SysTeacher record);
}