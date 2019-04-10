package com.group7.edu.mapper;

import com.group7.edu.entity.SysHonour;

public interface SysHonourMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysHonour record);

    int insertSelective(SysHonour record);

    SysHonour selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysHonour record);

    int updateByPrimaryKey(SysHonour record);
}