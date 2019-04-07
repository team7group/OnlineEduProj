package com.group7.edu.mapper;

import com.group7.edu.entity.Agreement;
import com.group7.edu.entity.AgreementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AgreementMapper {
    long countByExample(AgreementExample example);

    int deleteByExample(AgreementExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Agreement record);

    int insertSelective(Agreement record);

    List<Agreement> selectByExampleWithBLOBs(AgreementExample example);

    List<Agreement> selectByExample(AgreementExample example);

    Agreement selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Agreement record, @Param("example") AgreementExample example);

    int updateByExampleWithBLOBs(@Param("record") Agreement record, @Param("example") AgreementExample example);

    int updateByExample(@Param("record") Agreement record, @Param("example") AgreementExample example);

    int updateByPrimaryKeySelective(Agreement record);

    int updateByPrimaryKeyWithBLOBs(Agreement record);

    int updateByPrimaryKey(Agreement record);
}