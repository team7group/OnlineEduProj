package com.group7.edu.mapper;

import com.group7.edu.entity.SysNetDiskFile;

public interface SysNetDiskFileMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysNetDiskFile record);

    int insertSelective(SysNetDiskFile record);

    SysNetDiskFile selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysNetDiskFile record);

    int updateByPrimaryKey(SysNetDiskFile record);
}