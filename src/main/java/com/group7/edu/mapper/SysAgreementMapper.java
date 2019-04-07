package com.group7.edu.mapper;

import com.group7.edu.entity.SysAgreement;
import com.group7.edu.entity.SysAgreementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysAgreementMapper {
    long countByExample(SysAgreementExample example);

    int deleteByExample(SysAgreementExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysAgreement record);

    int insertSelective(SysAgreement record);

    List<SysAgreement> selectByExampleWithBLOBs(SysAgreementExample example);

    List<SysAgreement> selectByExample(SysAgreementExample example);

    SysAgreement selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysAgreement record, @Param("example") SysAgreementExample example);

    int updateByExampleWithBLOBs(@Param("record") SysAgreement record, @Param("example") SysAgreementExample example);

    int updateByExample(@Param("record") SysAgreement record, @Param("example") SysAgreementExample example);

    int updateByPrimaryKeySelective(SysAgreement record);

    int updateByPrimaryKeyWithBLOBs(SysAgreement record);

    int updateByPrimaryKey(SysAgreement record);
}