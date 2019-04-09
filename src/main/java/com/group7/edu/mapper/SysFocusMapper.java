package com.group7.edu.mapper;

import com.group7.edu.entity.SysFocus;

public interface SysFocusMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysFocus record);

    int insertSelective(SysFocus record);

    SysFocus selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysFocus record);

    int updateByPrimaryKey(SysFocus record);
}