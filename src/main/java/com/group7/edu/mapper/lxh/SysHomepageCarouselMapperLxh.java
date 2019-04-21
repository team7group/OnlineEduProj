package com.group7.edu.mapper.lxh;

import com.group7.edu.entity.lxh.SysHomepageCarousel;

public interface SysHomepageCarouselMapperLxh {
    int deleteByPrimaryKey(Integer id);

    int insert(SysHomepageCarousel record);

    int insertSelective(SysHomepageCarousel record);

    SysHomepageCarousel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysHomepageCarousel record);

    int updateByPrimaryKey(SysHomepageCarousel record);
}