package com.group7.edu.controller;

import com.group7.edu.entity.SysHomepageCarousel;
import com.group7.edu.service.SysHomepageCarouselService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author default
 * @date 2019/4/15
 */
@RestController

public class SysHomepageCarouselController {
    @Resource
    private SysHomepageCarouselService sysHomepageCarouselService;

    @RequestMapping("/home/carouse/id")
    public SysHomepageCarousel findSysCarouse(Integer id) {
        System.out.println(id);
        SysHomepageCarousel sysHomepageCarousel1 = sysHomepageCarouselService.selectByPrimaryKey(id);
        return sysHomepageCarousel1;
    }
}
