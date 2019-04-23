package com.group7.edu.controller.syt;


import com.group7.edu.service.syt.OrderService;
import com.group7.edu.utils.ResultData;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class OrderController {

    @Resource
    private OrderService orderService;

    @RequestMapping("/sys/order/courseInfo")
    public ResultData showCourse(Integer id){
        if(id == null || id == 0){
            return ResultData.isFailure("课程编号不能为空");
        }

        return orderService.showCourse(id);
    }

    @RequestMapping("/sys/order/payWay")
    public ResultData payWayList(){
        return orderService.showPayWay();
    }

    @RequestMapping("/sys/order/remind")
    public ResultData remind( Integer id){
        if(id == null || id == 0){
            return ResultData.isFailure("课程不能为空");
        }
        return orderService.remind(id);
    }

    @RequestMapping("/sys/order/orderInfo")
    public ResultData showOrder(Integer id){

        if(id == null || id == 0){
            return ResultData.isFailure("生成订单失败");
        }
        return orderService.orderInfo(id);
    }





}
