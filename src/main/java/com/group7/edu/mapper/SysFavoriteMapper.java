package com.group7.edu.mapper;

import com.group7.edu.entity.SysFavorite;

public interface SysFavoriteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysFavorite record);

    int insertSelective(SysFavorite record);

    SysFavorite selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysFavorite record);

    int updateByPrimaryKey(SysFavorite record);
}