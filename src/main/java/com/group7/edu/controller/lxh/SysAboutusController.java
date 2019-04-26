package com.group7.edu.controller.lxh;

import com.group7.edu.entity.lxh.SysAboutus;
import com.group7.edu.service.lxh.SysAboutusService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @author default
 * @date 2019/4/15
 */
@RestController("sysAboutusControllerLxh")
public class SysAboutusController {

    @Resource(name = "sysAboutusServiceLxh")
    private SysAboutusService sysAboutusService;

    @RequestMapping("/home/about/id")
    public SysAboutus findSysAboutus(Integer id) {
        System.out.println("------------------------------------------------------------");
        System.out.println("SysAboutusController.findSysAboutus");
        System.out.println("id = [" + id + "]");
        System.out.println("time = " + new Date());
        System.out.println("------------------------------------------------------------");
        SysAboutus sysAboutus1 = sysAboutusService.selectByPrimaryKey(id);
        return sysAboutus1;
    }

}
