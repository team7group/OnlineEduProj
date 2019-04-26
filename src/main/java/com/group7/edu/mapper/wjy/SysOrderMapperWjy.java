package com.group7.edu.mapper.wjy;

import com.group7.edu.dto.SysOrderDto;
import com.group7.edu.entity.SysOrder;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface SysOrderMapperWjy {
    int deleteByPrimaryKey(Integer id);

    int insert(SysOrder record);

    int insertSelective(SysOrder record);

    SysOrder selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysOrder record);

    int updateByPrimaryKey(SysOrder record);

    //查看过期订单
    //List<SysOrderDto> findBackOrder(@Param("date") Date date,@Param("id") long id);

    //查看历史订单
    List<SysOrderDto> findOrderHistory(SysOrderDto sysOrderDto);
}