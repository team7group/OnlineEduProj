package com.group7.edu.mapper;

import com.group7.edu.entity.SysHomepageCarousel;

public interface SysHomepageCarouselMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysHomepageCarousel record);

    int insertSelective(SysHomepageCarousel record);

    SysHomepageCarousel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysHomepageCarousel record);

    int updateByPrimaryKey(SysHomepageCarousel record);
}