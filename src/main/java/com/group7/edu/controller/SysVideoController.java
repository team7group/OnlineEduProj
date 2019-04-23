package com.group7.edu.controller;

import com.group7.edu.entity.SysVideo;
import com.group7.edu.service.SysVideoService;
import com.group7.edu.utils.PageEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: WangJinYue
 * @Description:
 * @Date: Created in 8:52 2019/4/17
 * @Modified By:
 */
@RestController
public class SysVideoController {

    @Resource
    private SysVideoService sysVideoService;

    @RequestMapping("/sys/my_collections")
    public ResponseEntity myCollections(@RequestBody SysVideo sysVideo){
        List<SysVideo> list = sysVideoService.findMyCollections(sysVideo);
        return new ResponseEntity(new PageEntity<>(list), HttpStatus.OK);
    }
}
