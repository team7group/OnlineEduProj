package com.group7.edu.service.wjy.impl;

import com.group7.edu.dto.SysOrderDto;
import com.group7.edu.mapper.wjy.SysOrderMapperWjy;
import com.group7.edu.service.wjy.SysOrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: WangJinYue
 * @Description:
 * @Date: Created in 19:25 2019/4/11
 * @Modified By:
 */
@Service("sysOrderServiceWjy")
public class SysOrderServiceImpl implements SysOrderService {
    @Resource
    private SysOrderMapperWjy sysOrderMapperWjy;

    //拿历史订单
    @Override
    public List<SysOrderDto> findOrderHistory(SysOrderDto id) {
        List<SysOrderDto> order = sysOrderMapperWjy.findOrderHistory(id);
        return order;
    }
}
