package com.group7.edu.mapper;

import com.group7.edu.entity.SysSubject;

public interface SysSubjectMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysSubject record);

    int insertSelective(SysSubject record);

    SysSubject selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysSubject record);

    int updateByPrimaryKey(SysSubject record);
}