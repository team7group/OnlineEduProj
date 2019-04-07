package com.group7.edu.mapper;

import com.group7.edu.entity.SysFocus;
import com.group7.edu.entity.SysFocusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysFocusMapper {
    long countByExample(SysFocusExample example);

    int deleteByExample(SysFocusExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysFocus record);

    int insertSelective(SysFocus record);

    List<SysFocus> selectByExample(SysFocusExample example);

    SysFocus selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysFocus record, @Param("example") SysFocusExample example);

    int updateByExample(@Param("record") SysFocus record, @Param("example") SysFocusExample example);

    int updateByPrimaryKeySelective(SysFocus record);

    int updateByPrimaryKey(SysFocus record);
}