package com.group7.edu.mapper.lxh;

import com.group7.edu.entity.lxh.SysNews;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface SysNewsMapperLxh {
    int deleteByPrimaryKey(Integer id);

    int insert(SysNews record);

    int insertSelective(SysNews record);

    SysNews selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysNews record);

    int updateByPrimaryKeyWithBLOBs(SysNews record);

    int updateByPrimaryKey(SysNews record);

    List<SysNews> selectAllSysNews(SysNews sysNews);

    List<SysNews> newsList(SysNews news);

}