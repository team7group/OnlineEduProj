package com.group7.edu.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 订单
 *
 * @author default
 * @date   2019/04/21
 */
public class SysOrder {
    /**
     * 订单编号
     */
    private Integer id;

    /**
     * 购买者Id
     */
    private Integer uid;

    /**
     * 消费金额
     */
    private BigDecimal cost;

    /**
     * 下单时间
     */
    private Date createdTime;

    /**
     * 课程Id
     */
    private Integer courseId;

    /**
     * 课程名称
     */
    private String courseName;

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

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName == null ? null : courseName.trim();
    }
}