package com.group7.edu.service.impl;

import com.group7.edu.dto.SysOrderDto;
import com.group7.edu.mapper.SysOrderMapper;
import com.group7.edu.service.SysOrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @Author: WangJinYue
 * @Description:
 * @Date: Created in 19:25 2019/4/11
 * @Modified By:
 */
@Service
public class SysOrderServiceImpl implements SysOrderService {
    @Resource
    private SysOrderMapper sysOrderMapper;

    //拿历史订单
    @Override
    public List<SysOrderDto> findOrderHistory(SysOrderDto id) {
        List<SysOrderDto> order = sysOrderMapper.findOrderHistory(id);
        return order;
    }
}
