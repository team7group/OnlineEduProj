package com.group7.edu.controller.wjy;

import com.group7.edu.dto.SysOrderDto;
import com.group7.edu.service.wjy.SysOrderService;
import com.group7.edu.utils.PageEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @Author: WangJinYue
 * @Description: 订单查看
 * @Date: Created in 16:46 2019/4/11
 * @Modified By:
 */
@RestController
@CrossOrigin(value = "*", allowCredentials = "true")
public class SysOrderController {

    @Resource(name = "sysOrderServiceWjy")
    private SysOrderService sysOrderService;

    //查看历史订单
    @RequestMapping("/sys/order_history")
    public ResponseEntity orderHistory(SysOrderDto sysOrderDto){
        System.out.println("------------------------------------------------------------");
        System.out.println("SysOrderController.orderHistory");
        System.out.println("sysOrderDto = [" + sysOrderDto + "]");
        System.out.println("time = " + new Date());
        System.out.println("------------------------------------------------------------");
        List<SysOrderDto> orderHistory = sysOrderService.findOrderHistory(sysOrderDto);
        return new ResponseEntity(new PageEntity<>(orderHistory), HttpStatus.OK);
    }




}
