package com.group7.edu.mapper;

import com.group7.edu.entity.SysAd;

public interface SysAdMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysAd record);

    int insertSelective(SysAd record);

    SysAd selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysAd record);

    int updateByPrimaryKeyWithBLOBs(SysAd record);

    int updateByPrimaryKey(SysAd record);
}