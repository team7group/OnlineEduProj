package com.group7.edu.entity;

/**
 * 问答，展示在课程详情页上面的
 *
 * @author default
 * @date   2019/04/11
 */
public class SysAnswerQuestion {
    /**
     * 答疑Id
     */
    private Integer id;

    /**
     * 课程Id
     */
    private Integer courseid;

    /**
     * 问题
     */
    private String question;

    /**
     * 答案
     */
    private String answer;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCourseid() {
        return courseid;
    }

    public void setCourseid(Integer courseid) {
        this.courseid = courseid;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question == null ? null : question.trim();
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
    }
}