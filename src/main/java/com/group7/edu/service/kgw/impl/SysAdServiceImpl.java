package com.group7.edu.service.kgw.impl;

import com.group7.edu.entity.SysAd;
import com.group7.edu.mapper.SysAdMapperDTO;
import com.group7.edu.osshandle.OssPicture;
import com.group7.edu.service.kgw.SysAdService;
import com.group7.edu.utils.ResultData;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;


@Service
public class SysAdServiceImpl implements SysAdService {

    @Resource
    SysAdMapperDTO sysAdMapperDTO;
    @Resource
    OssPicture ossPicture;

    @Override
    public ResultData selectByPage(String page) {
        List<SysAd> oldList = sysAdMapperDTO.selectAll(page);
        if(oldList==null){
            return ResultData.isFailure("服务器繁忙请稍后再试");
        }
        List<SysAd> newList = new ArrayList<>();
        for (SysAd sysAd : oldList) {
            sysAd.setFileuuid(ossPicture.originalGraph(sysAd.getFileuuid()));
            newList.add(sysAd);
        }
        return ResultData.isSuccess().put("ads",newList);
    }
}
