package com.group7.edu.mapper;

import com.group7.edu.entity.SysAgreement;

import java.util.List;

public interface SysAgreementMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysAgreement record);

    int insertSelective(SysAgreement record);

    SysAgreement selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysAgreement record);

    int updateByPrimaryKeyWithBLOBs(SysAgreement record);

    int updateByPrimaryKey(SysAgreement record);

    List<SysAgreement> selectByName(String name);
}