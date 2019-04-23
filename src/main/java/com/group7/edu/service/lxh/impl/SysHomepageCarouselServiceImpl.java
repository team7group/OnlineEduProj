package com.group7.edu.service.lxh.impl;

import com.group7.edu.entity.lxh.SysHomepageCarousel;
import com.group7.edu.mapper.lxh.SysHomepageCarouselMapperLxh;
import com.group7.edu.service.lxh.SysHomepageCarouselService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author default
 * @date 2019/4/15
 */

@Service("sysHomepageCarouselServiceLxh")
public class SysHomepageCarouselServiceImpl implements SysHomepageCarouselService {

    @Resource
    private SysHomepageCarouselMapperLxh sysHomepageCarouselMapperLxh;


    @Override
    public SysHomepageCarousel selectByPrimaryKey(Integer id) {
        return sysHomepageCarouselMapperLxh.selectByPrimaryKey(id);
    }
}
