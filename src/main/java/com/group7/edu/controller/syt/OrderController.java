package com.group7.edu.controller.syt;


import com.group7.edu.service.syt.OrderService;
import com.group7.edu.utils.ResultData;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;

@RestController
public class OrderController {

    @Resource
    private OrderService orderService;

    @RequestMapping("/sys/order/courseInfo")
    public ResultData showCourse(Integer id){
        System.out.println("------------------------------------------------------------");
        System.out.println("OrderController.showCourse");
        System.out.println("id = [" + id + "]");
        System.out.println("time = " + new Date());
        System.out.println("------------------------------------------------------------");
        if(id == null || id == 0){
            return ResultData.isFailure("课程编号不能为空");
        }

        return orderService.showCourse(id);
    }

    @RequestMapping("/sys/order/payWay")
    public ResultData payWayList(){
        System.out.println("------------------------------------------------------------");
        System.out.println("OrderController.payWayList");
        System.out.println("");
        System.out.println("time = " + new Date());
        System.out.println("------------------------------------------------------------");
        return orderService.showPayWay();
    }

    @RequestMapping("/sys/order/remind")
    public ResultData remind( Integer id){
        System.out.println("------------------------------------------------------------");
        System.out.println("OrderController.remind");
        System.out.println("id = [" + id + "]");
        System.out.println("time = " + new Date());
        System.out.println("------------------------------------------------------------");
        if(id == null || id == 0){
            return ResultData.isFailure("课程不能为空");
        }
        return orderService.remind(id);
    }

    @RequestMapping("/sys/order/orderInfo")
    public ResultData showOrder(Integer id){
        System.out.println("------------------------------------------------------------");
        System.out.println("OrderController.showOrder");
        System.out.println("id = [" + id + "]");
        System.out.println("time = " + new Date());
        System.out.println("------------------------------------------------------------");
        if(id == null || id == 0){
            return ResultData.isFailure("生成订单失败");
        }
        return orderService.orderInfo(id);
    }





}
