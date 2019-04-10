package com.group7.edu.mapper;

import com.group7.edu.entity.SysAnswerQuestion;

public interface SysAnswerQuestionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysAnswerQuestion record);

    int insertSelective(SysAnswerQuestion record);

    SysAnswerQuestion selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysAnswerQuestion record);

    int updateByPrimaryKey(SysAnswerQuestion record);
}