package com.group7.edu.controller;

import com.group7.edu.entity.SysNews;
import com.group7.edu.service.SysNewsService;
import com.group7.edu.utils.PageEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author default
 * @date 2019/4/10
 */
@RestController
public class SysNewsController {
    @Resource
    private SysNewsService sysNewsService;
    @RequestMapping("/home/news/list")
    public ResponseEntity findSysCourse(@RequestBody SysNews sysNews) {

        List<SysNews> list = sysNewsService.selectAllSysNews(sysNews);

        return new ResponseEntity( new PageEntity<>(list), HttpStatus.OK);
    }

}
