package com.group7.edu.mapper;

import com.group7.edu.entity.SysNews;

import java.util.List;

public interface SysNewsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysNews record);

    int insertSelective(SysNews record);

    SysNews selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysNews record);

    int updateByPrimaryKeyWithBLOBs(SysNews record);

    int updateByPrimaryKey(SysNews record);

    List<SysNews> selectAllSysNews(SysNews sysNews);

    List<SysNews> newsList (SysNews news);

}