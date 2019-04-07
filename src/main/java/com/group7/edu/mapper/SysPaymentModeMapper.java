package com.group7.edu.mapper;

import com.group7.edu.entity.SysPaymentMode;
import com.group7.edu.entity.SysPaymentModeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysPaymentModeMapper {
    long countByExample(SysPaymentModeExample example);

    int deleteByExample(SysPaymentModeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysPaymentMode record);

    int insertSelective(SysPaymentMode record);

    List<SysPaymentMode> selectByExample(SysPaymentModeExample example);

    SysPaymentMode selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysPaymentMode record, @Param("example") SysPaymentModeExample example);

    int updateByExample(@Param("record") SysPaymentMode record, @Param("example") SysPaymentModeExample example);

    int updateByPrimaryKeySelective(SysPaymentMode record);

    int updateByPrimaryKey(SysPaymentMode record);
}