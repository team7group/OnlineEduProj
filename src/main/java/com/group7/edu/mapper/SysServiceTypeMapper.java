package com.group7.edu.mapper;

import com.group7.edu.entity.SysServiceType;
import com.group7.edu.entity.SysServiceTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysServiceTypeMapper {
    long countByExample(SysServiceTypeExample example);

    int deleteByExample(SysServiceTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysServiceType record);

    int insertSelective(SysServiceType record);

    List<SysServiceType> selectByExample(SysServiceTypeExample example);

    SysServiceType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysServiceType record, @Param("example") SysServiceTypeExample example);

    int updateByExample(@Param("record") SysServiceType record, @Param("example") SysServiceTypeExample example);

    int updateByPrimaryKeySelective(SysServiceType record);

    int updateByPrimaryKey(SysServiceType record);
}