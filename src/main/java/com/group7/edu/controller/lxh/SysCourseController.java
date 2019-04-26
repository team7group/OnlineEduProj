package com.group7.edu.controller.lxh;

import com.group7.edu.entity.lxh.SysCourse;
import com.group7.edu.service.lxh.SysCourseService;
import com.group7.edu.utils.PageEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @author default
 * @date 2019/4/9
 */
@RestController("sysCourseControllerLxh")
public class SysCourseController {
    @Resource(name = "sysCourseServiceLxh")
    private SysCourseService sysCourseService;

    @PostMapping("/home/course/list")
    public ResponseEntity findSysCourse(@RequestBody SysCourse sysCourse) {
        System.out.println("------------------------------------------------------------");
        System.out.println("SysCourseController.findSysCourse");
        System.out.println("sysCourse = [" + sysCourse + "]");
        System.out.println("time = " + new Date());
        System.out.println("------------------------------------------------------------");
        List<SysCourse> list = sysCourseService.selectAllSysCourse(sysCourse);
        System.out.println("SysCourselist:"+new PageEntity<>(list));

        return new ResponseEntity( new PageEntity<>(list), HttpStatus.OK);
    }
}
