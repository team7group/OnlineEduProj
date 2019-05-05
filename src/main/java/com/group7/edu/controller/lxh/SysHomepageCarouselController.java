package com.group7.edu.controller.lxh;

import com.group7.edu.entity.lxh.SysHomepageCarousel;
import com.group7.edu.osshandle.OssPicture;
import com.group7.edu.service.lxh.SysHomepageCarouselService;
import com.group7.edu.utils.SysConst;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @author default
 * @date 2019/4/15
 */
@RestController("sysHomepageCarouselControllerLxh")
@CrossOrigin(value = "*", allowCredentials = "true")
public class SysHomepageCarouselController {
    @Resource(name = "sysHomepageCarouselServiceLxh")
    private SysHomepageCarouselService sysHomepageCarouselService;

    @Resource
    private OssPicture ossPicture;

    @RequestMapping("/home/carouse/id")
    public SysHomepageCarousel findSysCarouse(Integer id) {
        System.out.println("------------------------------------------------------------");
        System.out.println("SysHomepageCarouselController.findSysCarouse");
        System.out.println("id = [" + id + "]");
        System.out.println("time = " + new Date());
        System.out.println("------------------------------------------------------------");
        System.out.println(id);
        SysHomepageCarousel sysHomepageCarousel1 = sysHomepageCarouselService.selectByPrimaryKey(id);
        try {
            sysHomepageCarousel1.setImageUuid(SysConst.IMG_URL);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sysHomepageCarousel1;
    }
}
