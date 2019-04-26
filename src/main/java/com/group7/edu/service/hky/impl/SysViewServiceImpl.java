package com.group7.edu.service.hky.impl;

import com.group7.edu.entity.hky.Page;
import com.group7.edu.entity.hky.Part;
import com.group7.edu.mapper.hky.SysStudentVideoRelationMapperHky;
import com.group7.edu.mapper.hky.SysVideoMapperHky;
import com.group7.edu.service.hky.SysVideoService;
import com.group7.edu.utils.ResultData;
import com.group7.edu.utils.ShiroUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service(value = "SysViewServiceHky")
public class SysViewServiceImpl implements SysVideoService {

    @Resource(name = "sysVideoMapperHky")
    SysVideoMapperHky sysVideoMapper;

    @Resource(name = "sysStudentVideoRelationMapperHky")
    SysStudentVideoRelationMapperHky studentVideoRelationMapper;

    @Override
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
    public ResultData part(int nowPage, int numbers, int course, int capter) {

        Map<String, List<Part>> map = new HashMap<>();
        int limit = (nowPage - 1) * numbers;

        List<Part> list = sysVideoMapper.part(course,capter,limit,numbers);
        Integer totalPage = sysVideoMapper.totalPage(course, capter);
        if (list == null || list.size() == 0 || totalPage == 0){
            return ResultData.isFailure("查询子章节失败");
        }
        for (Part part : list) {
            Boolean isWatch = studentVideoRelationMapper.isWatch(ShiroUtils.getUserId(),part.getId());
            part.setWatch(isWatch);
        }
        if (totalPage % numbers != 0){
            totalPage = totalPage / numbers + 1;
        }else {
            totalPage = totalPage / numbers;
        }

        Page page = new Page();
        page.setNowPage(nowPage + 1);
        page.setTotalPage(totalPage);
        page.setContent(list);
        return ResultData.isSuccess().put("page",page);
    }
}
