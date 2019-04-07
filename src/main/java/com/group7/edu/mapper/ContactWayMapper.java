package com.group7.edu.mapper;

import com.group7.edu.entity.ContactWay;
import com.group7.edu.entity.ContactWayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContactWayMapper {
    long countByExample(ContactWayExample example);

    int deleteByExample(ContactWayExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ContactWay record);

    int insertSelective(ContactWay record);

    List<ContactWay> selectByExample(ContactWayExample example);

    ContactWay selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ContactWay record, @Param("example") ContactWayExample example);

    int updateByExample(@Param("record") ContactWay record, @Param("example") ContactWayExample example);

    int updateByPrimaryKeySelective(ContactWay record);

    int updateByPrimaryKey(ContactWay record);
}