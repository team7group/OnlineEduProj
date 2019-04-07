package com.group7.edu.mapper;

import com.group7.edu.entity.SysFeedback;
import com.group7.edu.entity.SysFeedbackExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysFeedbackMapper {
    long countByExample(SysFeedbackExample example);

    int deleteByExample(SysFeedbackExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysFeedback record);

    int insertSelective(SysFeedback record);

    List<SysFeedback> selectByExample(SysFeedbackExample example);

    SysFeedback selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysFeedback record, @Param("example") SysFeedbackExample example);

    int updateByExample(@Param("record") SysFeedback record, @Param("example") SysFeedbackExample example);

    int updateByPrimaryKeySelective(SysFeedback record);

    int updateByPrimaryKey(SysFeedback record);
}