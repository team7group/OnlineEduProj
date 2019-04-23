package com.group7.edu.controller;

import com.group7.edu.dto.SysOrderDto;
import com.group7.edu.service.SysOrderService;
import com.group7.edu.utils.PageEntity;
import com.group7.edu.utils.ResultData;
import com.group7.edu.utils.ShiroUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: WangJinYue
 * @Description: 订单查看
 * @Date: Created in 16:46 2019/4/11
 * @Modified By:
 */
@RestController
public class SysOrderController {

    @Resource
    private SysOrderService sysOrderService;

    //查看历史订单
    @RequestMapping("/sys/order_history")
    public ResponseEntity orderHistory(@RequestBody SysOrderDto sysOrderDto){
        List<SysOrderDto> orderHistory = sysOrderService.findOrderHistory(sysOrderDto);
        return new ResponseEntity(new PageEntity<>(orderHistory), HttpStatus.OK);
    }




}
