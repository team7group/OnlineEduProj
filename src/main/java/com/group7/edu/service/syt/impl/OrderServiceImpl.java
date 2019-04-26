package com.group7.edu.service.syt.impl;

import com.group7.edu.entity.SysCourse;
import com.group7.edu.entity.SysOrder;
import com.group7.edu.entity.SysPaymentMode;
import com.group7.edu.entity.syt.SysCourseDTO;
import com.group7.edu.mapper.SysCourseMapper;
import com.group7.edu.mapper.SysOrderMapper;
import com.group7.edu.mapper.syt.SysPaymentModeMapperDTO;
import com.group7.edu.service.syt.OrderService;
import com.group7.edu.utils.CourseDTOUtils;
import com.group7.edu.utils.ResultData;
import com.group7.edu.utils.ShiroUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;


@Service("orderServiceImpl")
public class OrderServiceImpl implements OrderService {

    @Resource
    private SysCourseMapper sysCourseMapper;

    @Resource
    private SysPaymentModeMapperDTO sysPaymentModeMapperDTO;



    @Resource
    private SysOrderMapper sysOrderMapper;

    @Override
    public ResultData showCourse(Integer courseId) {
        SysCourse sysCourse = sysCourseMapper.selectByPrimaryKey(courseId);
        SysCourseDTO sysCourseDTO = CourseDTOUtils.toDTO(sysCourse);
        String qq = "299014323124";
        if(sysCourseDTO == null){
            return ResultData.isFailure("查无此课程");
        }
        return ResultData.isSuccess().put("course",sysCourseDTO).put("qq",qq);
    }

    @Override
    public ResultData showPayWay() {
        List<SysPaymentMode> list = sysPaymentModeMapperDTO.selectAll();

        return ResultData.isSuccess("").put("list",list);
    }

    @Override
    public ResultData remind(Integer id) {
        SysCourse sysCourse = sysCourseMapper.selectByPrimaryKey(id);
        SysCourseDTO sysCourseDTO = CourseDTOUtils.toDTO(sysCourse);
        if(sysCourseDTO == null){
            return ResultData.isFailure("查无此课程");
        }
        return ResultData.isSuccess().put("course",sysCourseDTO);
    }

    @Override
    public ResultData orderInfo(Integer id) {
        Integer uid = ShiroUtils.getCurrentUser().getId();
        SysCourse sysCourse = sysCourseMapper.selectByPrimaryKey(id);
        SysOrder sysOrder = new SysOrder();

        sysOrder.setUid(uid);
        sysOrder.setCost(sysCourse.getPrice());
        sysOrder.setCreatedTime(new Date());
        sysOrder.setCourseId(sysCourse.getId());
//        sysOrder.setCourseName(sysCourse.getName());

        int i = sysOrderMapper.insert(sysOrder);
        if(i == 0){
            return ResultData.isFailure("提交订单失败");
        }

        return ResultData.isSuccess("提交订单成功");
    }
}
