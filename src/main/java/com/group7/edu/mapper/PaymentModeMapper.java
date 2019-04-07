package com.group7.edu.mapper;

import com.group7.edu.entity.PaymentMode;
import com.group7.edu.entity.PaymentModeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PaymentModeMapper {
    long countByExample(PaymentModeExample example);

    int deleteByExample(PaymentModeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PaymentMode record);

    int insertSelective(PaymentMode record);

    List<PaymentMode> selectByExample(PaymentModeExample example);

    PaymentMode selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PaymentMode record, @Param("example") PaymentModeExample example);

    int updateByExample(@Param("record") PaymentMode record, @Param("example") PaymentModeExample example);

    int updateByPrimaryKeySelective(PaymentMode record);

    int updateByPrimaryKey(PaymentMode record);
}