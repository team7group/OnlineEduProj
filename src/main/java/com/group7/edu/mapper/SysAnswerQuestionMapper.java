package com.group7.edu.mapper;

import com.group7.edu.entity.SysAnswerQuestion;
import com.group7.edu.entity.SysAnswerQuestionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysAnswerQuestionMapper {
    long countByExample(SysAnswerQuestionExample example);

    int deleteByExample(SysAnswerQuestionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysAnswerQuestion record);

    int insertSelective(SysAnswerQuestion record);

    List<SysAnswerQuestion> selectByExample(SysAnswerQuestionExample example);

    SysAnswerQuestion selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysAnswerQuestion record, @Param("example") SysAnswerQuestionExample example);

    int updateByExample(@Param("record") SysAnswerQuestion record, @Param("example") SysAnswerQuestionExample example);

    int updateByPrimaryKeySelective(SysAnswerQuestion record);

    int updateByPrimaryKey(SysAnswerQuestion record);
}