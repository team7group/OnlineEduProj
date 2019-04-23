package com.group7.edu.mapper;

import com.group7.edu.entity.SysVideo;

import java.util.List;

public interface SysVideoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysVideo record);

    int insertSelective(SysVideo record);

    SysVideo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysVideo record);

    int updateByPrimaryKey(SysVideo record);

    List<SysVideo> findMyCollections(SysVideo sysVideo);
}