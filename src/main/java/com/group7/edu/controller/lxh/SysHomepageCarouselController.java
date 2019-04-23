package com.group7.edu.controller.lxh;

import com.group7.edu.entity.lxh.SysHomepageCarousel;
import com.group7.edu.service.lxh.SysHomepageCarouselService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author default
 * @date 2019/4/15
 */
@RestController("sysHomepageCarouselControllerLxh")
public class SysHomepageCarouselController {
    @Resource(name = "sysHomepageCarouselServiceLxh")
    private SysHomepageCarouselService sysHomepageCarouselService;

    @RequestMapping("/home/carouse/id")
    public SysHomepageCarousel findSysCarouse(Integer id) {
        System.out.println(id);
        SysHomepageCarousel sysHomepageCarousel1 = sysHomepageCarouselService.selectByPrimaryKey(id);
        return sysHomepageCarousel1;
    }
}
