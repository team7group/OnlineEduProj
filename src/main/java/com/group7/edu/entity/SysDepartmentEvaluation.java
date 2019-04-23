package com.group7.edu.entity;

import java.util.Date;

/**
 * 学院评价
 *
 * @author default
 * @date   2019/04/11
 */
public class SysDepartmentEvaluation {
    /**
     * 学院评价Id
     */
    private Integer id;

    /**
     * 用户id
     */
    private Integer uid;

    /**
     * 学院Id
     */
    private Integer departmentId;

    /**
     * 评价时间
     */
    private Date createdTime;

    /**
     * 评价内容
     */
    private String evaluationText;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
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
}