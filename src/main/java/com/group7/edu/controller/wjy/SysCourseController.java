package com.group7.edu.controller.wjy;

import com.group7.edu.entity.SysCourse;
import com.group7.edu.service.wjy.SysCourseService;
import com.group7.edu.utils.PageEntity;
import com.group7.edu.utils.SysConst;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @Author: WangJinYue
 * @Description:
 * @Date: Created in 22:46 2019/4/11
 * @Modified By:
 */
@RestController("sysCourseControllerWjy")
@CrossOrigin(value = "*", allowCredentials = "true")
public class SysCourseController {
    @Resource(name = "sysCourseServiceWjy")
    private SysCourseService sysCourseService;

    @RequestMapping("/sys/my_courses")
    public ResponseEntity myCourses(SysCourse sysCourse){
        System.out.println("------------------------------------------------------------");
        System.out.println("SysCourseController.myCourses");
        System.out.println("sysCourse = [" + sysCourse + "]");
        System.out.println("time = " + new Date());
        System.out.println("------------------------------------------------------------");
        List<SysCourse> l = sysCourseService.findById();

        for (SysCourse course : l) {
            course.setCoverUrl(SysConst.IMG_URL);
        }

        return new ResponseEntity(new PageEntity<>(l), HttpStatus.OK);
    }

}
