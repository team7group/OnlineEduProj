package com.group7.edu.mapper;

import com.group7.edu.entity.AnswerQuestion;
import com.group7.edu.entity.AnswerQuestionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AnswerQuestionMapper {
    long countByExample(AnswerQuestionExample example);

    int deleteByExample(AnswerQuestionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AnswerQuestion record);

    int insertSelective(AnswerQuestion record);

    List<AnswerQuestion> selectByExample(AnswerQuestionExample example);

    AnswerQuestion selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AnswerQuestion record, @Param("example") AnswerQuestionExample example);

    int updateByExample(@Param("record") AnswerQuestion record, @Param("example") AnswerQuestionExample example);

    int updateByPrimaryKeySelective(AnswerQuestion record);

    int updateByPrimaryKey(AnswerQuestion record);
}