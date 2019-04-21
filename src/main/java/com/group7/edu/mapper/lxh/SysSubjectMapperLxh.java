package com.group7.edu.mapper.lxh;

import com.group7.edu.entity.lxh.SysSubject;

import java.util.List;

public interface SysSubjectMapperLxh {
    int deleteByPrimaryKey(Integer id);

    int insert(SysSubject record);

    int insertSelective(SysSubject record);

    SysSubject selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysSubject record);

    int updateByPrimaryKey(SysSubject record);

    List<SysSubject> subjectList(SysSubject subject);
}