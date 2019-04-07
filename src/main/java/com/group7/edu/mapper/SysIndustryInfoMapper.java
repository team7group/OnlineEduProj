package com.group7.edu.mapper;

import com.group7.edu.entity.SysIndustryInfo;
import com.group7.edu.entity.SysIndustryInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysIndustryInfoMapper {
    long countByExample(SysIndustryInfoExample example);

    int deleteByExample(SysIndustryInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysIndustryInfo record);

    int insertSelective(SysIndustryInfo record);

    List<SysIndustryInfo> selectByExample(SysIndustryInfoExample example);

    SysIndustryInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysIndustryInfo record, @Param("example") SysIndustryInfoExample example);

    int updateByExample(@Param("record") SysIndustryInfo record, @Param("example") SysIndustryInfoExample example);

    int updateByPrimaryKeySelective(SysIndustryInfo record);

    int updateByPrimaryKey(SysIndustryInfo record);
}