package com.group7.edu.mapper;

import com.group7.edu.entity.SysHomepageIntroduce;

public interface SysHomepageIntroduceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysHomepageIntroduce record);

    int insertSelective(SysHomepageIntroduce record);

    SysHomepageIntroduce selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysHomepageIntroduce record);

    int updateByPrimaryKey(SysHomepageIntroduce record);
}