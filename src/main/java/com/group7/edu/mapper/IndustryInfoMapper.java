package com.group7.edu.mapper;

import com.group7.edu.entity.IndustryInfo;
import com.group7.edu.entity.IndustryInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IndustryInfoMapper {
    long countByExample(IndustryInfoExample example);

    int deleteByExample(IndustryInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IndustryInfo record);

    int insertSelective(IndustryInfo record);

    List<IndustryInfo> selectByExample(IndustryInfoExample example);

    IndustryInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IndustryInfo record, @Param("example") IndustryInfoExample example);

    int updateByExample(@Param("record") IndustryInfo record, @Param("example") IndustryInfoExample example);

    int updateByPrimaryKeySelective(IndustryInfo record);

    int updateByPrimaryKey(IndustryInfo record);
}