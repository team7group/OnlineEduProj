package com.group7.edu.mapper.hky;

import com.group7.edu.entity.SysStudentVideoRelation;
import org.springframework.stereotype.Component;

@Component("sysStudentVideoRelationMapperHky")
public interface SysStudentVideoRelationMapperHky {
    int deleteByPrimaryKey(Integer id);

    int insert(SysStudentVideoRelation record);

    int insertSelective(SysStudentVideoRelation record);

    SysStudentVideoRelation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysStudentVideoRelation record);

    int updateByPrimaryKey(SysStudentVideoRelation record);

    Boolean isWatch(int userId, int videoId);
}