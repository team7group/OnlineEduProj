package com.group7.edu.service.impl;


import com.github.pagehelper.PageHelper;
import com.group7.edu.entity.Part;
import com.group7.edu.mapper.SysVideoMapper;
import com.group7.edu.service.SysVideoService;
import com.group7.edu.utils.ResultData;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service(value = "viewService")
public class ViewServiceImpl implements SysVideoService {

    @Resource
    SysVideoMapper sysVideoMapper;

    public ResultData chapter(int course) {

       // Map<Integer,List<Integer>> map = new HashMap<Integer, List<Integer>>();
        ResultData resultData = new ResultData();
        List<Integer> chapter = sysVideoMapper.chapter(course);
        if(chapter == null || chapter.size() == 0){
            return ResultData.isFailure("查询章节目录失败");
        }

//          查询小节的目录
//        for (Integer s : chapter) {
//            List<Integer> part = sysVideoMapper.part(s);
//            map.put(s,part);
//        }
        return resultData.put("chapter",chapter);
    }

    @Override
    public ResultData part(int offset, int limit, int course, int capter) {
        List<Part> list = sysVideoMapper.part(course,capter,limit,offset);
        for (Part part : list) {

        }
        return null;
    }
}
