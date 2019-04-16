package com.group7.edu.service.impl;

import com.group7.edu.entity.SysHomepageCarousel;
import com.group7.edu.mapper.SysHomepageCarouselMapper;
import com.group7.edu.service.SysHomepageCarouselService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author default
 * @date 2019/4/15
 */

@Service
public class SysHomepageCarouselServiceImpl implements SysHomepageCarouselService {

    @Resource
    private SysHomepageCarouselMapper sysHomepageCarouselMapper;


    @Override
    public SysHomepageCarousel selectByPrimaryKey(Integer id) {
        return sysHomepageCarouselMapper.selectByPrimaryKey(id);
    }
}
