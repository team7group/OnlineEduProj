package com.group7.edu.service.kgw.impl;

import com.group7.edu.entity.SysFocus;
import com.group7.edu.mapper.SysFocusMapperDTO;
import com.group7.edu.service.kgw.SysFocusService;
import com.group7.edu.utils.ResultData;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SysFocusServiceImpl implements SysFocusService {

    @Resource
    SysFocusMapperDTO sysFocusMapperDTO;

    @Override
    public ResultData selectAll() {
        List<SysFocus> list = sysFocusMapperDTO.selectAll();
        return list==null?ResultData.isFailure("服务器繁忙请稍后再试"):ResultData.isSuccess().put("focus",list);
    }
}
