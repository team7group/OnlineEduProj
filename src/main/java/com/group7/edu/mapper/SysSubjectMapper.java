package com.group7.edu.mapper;

import com.group7.edu.entity.SysSubject;
import com.group7.edu.entity.SysSubjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysSubjectMapper {
    long countByExample(SysSubjectExample example);

    int deleteByExample(SysSubjectExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysSubject record);

    int insertSelective(SysSubject record);

    List<SysSubject> selectByExample(SysSubjectExample example);

    SysSubject selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysSubject record, @Param("example") SysSubjectExample example);

    int updateByExample(@Param("record") SysSubject record, @Param("example") SysSubjectExample example);

    int updateByPrimaryKeySelective(SysSubject record);

    int updateByPrimaryKey(SysSubject record);
}