package com.group7.edu.service;

import com.group7.edu.dto.SysOrderDto;

import java.util.List;

/**
 * @Author: WangJinYue
 * @Description:
 * @Date: Created in 19:24 2019/4/11
 * @Modified By:
 */
public interface SysOrderService {
    //查看过期订单
    //List<SysOrderDto> findBackOrder(long id);
    //查看历史订单
    List<SysOrderDto> findOrderHistory(SysOrderDto sysOrderDto);
}
