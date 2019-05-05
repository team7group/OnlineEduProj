package com.group7.edu.dto;

import com.group7.edu.utils.wjy.BaseEntity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author: WangJinYue
 * @Description: 订单中的 课程名称
 * @Date: Created in 20:55 2019/4/11
 * @Modified By:
 */
public class SysOrderDto extends BaseEntity {
    private String courseName;
    private Date terminalTime;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Date getTerminalTime() {
        return terminalTime;
    }

    public void setTerminalTime(Date terminalTime) {
        this.terminalTime = terminalTime;
    }


    private String coverUrl;

    public String getCoverUrl() {
        return coverUrl;
    }

    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
    }

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public Integer getUid() {
        System.out.println("\t\t\t\tsuper.getUid:"+super.getUid());
        return super.getUid();
    }
    @Override
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
}
