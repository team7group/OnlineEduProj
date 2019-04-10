package com.group7.edu.service.impl;

import com.group7.edu.entity.SysGroup;
import com.group7.edu.mapper.SysGroupMapper;
import com.group7.edu.service.SysGroupService;
import com.group7.edu.utils.ResultData;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service( value = "sysGroup" )
public class SysGroupServiceImpl implements SysGroupService {

    @Resource
    SysGroupMapper sysGroupMapper;

    @Override
    public ResultData notice(int id) {
        List<Object> list = new ArrayList<Object>();
        List<SysGroup> sysGroups = sysGroupMapper.notice(id);
        if(sysGroups != null && sysGroups.size() != 0){
            SysGroup sysGroup = sysGroups.get(0);
            list.add(sysGroup.getClassText());
            list.add(sysGroup.getTextTime());
            return ResultData.isSuccess().put("notice",list);
        }


        return ResultData.isFailure("查询失败");
    }
}
