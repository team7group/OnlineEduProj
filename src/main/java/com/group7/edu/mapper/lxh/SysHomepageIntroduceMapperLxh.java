package com.group7.edu.mapper.lxh;

import com.group7.edu.entity.lxh.SysHomepageIntroduce;

public interface SysHomepageIntroduceMapperLxh {
    int deleteByPrimaryKey(Integer id);

    int insert(SysHomepageIntroduce record);

    int insertSelective(SysHomepageIntroduce record);

    SysHomepageIntroduce selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysHomepageIntroduce record);

    int updateByPrimaryKey(SysHomepageIntroduce record);
}