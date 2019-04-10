package com.group7.edu.mapper;

import com.group7.edu.entity.SysFeedback;

public interface SysFeedbackMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysFeedback record);

    int insertSelective(SysFeedback record);

    SysFeedback selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysFeedback record);

    int updateByPrimaryKey(SysFeedback record);
}