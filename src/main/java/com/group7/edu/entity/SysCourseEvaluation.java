package com.group7.edu.entity;

import lombok.ToString;

import java.util.Date;

/**
 * 课程评价
 *
 * @author default
 * @date   2019/04/11
 */
@ToString
public class SysCourseEvaluation {
    /**
     * 课程评价Id
     */
    private Integer id;

    /**
     * 课程Id
     */
    private Integer course;

    /**
     * 分值，最大为10
     */
    private Integer score;

    /**
     * 评价时间
     */
    private Date createdTime;

    /**
     * 评价内容
     */
    private String evaluationText;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 文件uuid
     */
    private String uuid;

    /**
     * 文件名
     */
    private String fileName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCourse() {
        return course;
    }

    public void setCourse(Integer course) {
        this.course = course;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getEvaluationText() {
        return evaluationText;
    }

    public void setEvaluationText(String evaluationText) {
        this.evaluationText = evaluationText == null ? null : evaluationText.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }
}