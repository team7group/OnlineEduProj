package com.group7.edu.mapper;

import com.group7.edu.entity.SysOrder;
import com.group7.edu.entity.SysOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysOrderMapper {
    long countByExample(SysOrderExample example);

    int deleteByExample(SysOrderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysOrder record);

    int insertSelective(SysOrder record);

    List<SysOrder> selectByExample(SysOrderExample example);

    SysOrder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysOrder record, @Param("example") SysOrderExample example);

    int updateByExample(@Param("record") SysOrder record, @Param("example") SysOrderExample example);

    int updateByPrimaryKeySelective(SysOrder record);

    int updateByPrimaryKey(SysOrder record);
}