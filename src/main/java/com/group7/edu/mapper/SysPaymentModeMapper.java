package com.group7.edu.mapper;

import com.group7.edu.entity.SysPaymentMode;

public interface SysPaymentModeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysPaymentMode record);

    int insertSelective(SysPaymentMode record);

    SysPaymentMode selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysPaymentMode record);

    int updateByPrimaryKey(SysPaymentMode record);
}