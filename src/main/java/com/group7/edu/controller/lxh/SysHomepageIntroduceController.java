package com.group7.edu.controller.lxh;

import com.group7.edu.entity.lxh.SysHomepageIntroduce;
import com.group7.edu.service.lxh.SysHomepageIntroduceService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;

/**
 * 
 *
 * @author default
 * @date   2019/04/15
 */
@RestController("sysHomepageIntroduceControllerLxh")
public class SysHomepageIntroduceController {
    @Resource(name = "sysHomepageIntroduceServiceLxh")
    private SysHomepageIntroduceService sysHomepageIntroduceService;

    @RequestMapping("/home/introduce/id")
    public SysHomepageIntroduce findSysIntroduce(Integer id) {
        System.out.println("------------------------------------------------------------");
        System.out.println("SysHomepageIntroduceController.findSysIntroduce");
        System.out.println("id = [" + id + "]");
        System.out.println("time = " + new Date());
        System.out.println("------------------------------------------------------------");
        SysHomepageIntroduce sysHomepageIntroduce1 = sysHomepageIntroduceService.selectByPrimaryKey(id);
        return sysHomepageIntroduce1;
    }

}