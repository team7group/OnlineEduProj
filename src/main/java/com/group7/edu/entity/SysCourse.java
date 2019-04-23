package com.group7.edu.entity;

import com.group7.edu.utils.BaseEntity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 课程
 *
 * @author default
 * @date   2019/04/11
 */
public class SysCourse extends BaseEntity {
    /**
     * 课程Id 主键 自动增长
     */
    private Integer id;

    /**
     * 课程名称
     */
    private String name;

    /**
     * 讲师Id
     */
    private Integer lecturer;

    /**
     * 课程分类
     */
    private String category;

    /**
     * 课程封面uuid
     */
    private String coverUuid;

    /**
     * 课程价格
     */
    private BigDecimal price;

    /**
     * 课程原价
     */
    private BigDecimal origPrice;

    /**
     * 科目Id
     */
    private Integer subject;

    /**
     * 课程创建日期
     */
    private Date createdTime;

    /**
     * 课程开始时间
     */
    private Date starttime;

    /**
     * 课程结束日期
     */
    private Date terminalTime;

    /**
     * 课程描述
     */
    private String courseText;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Integer lecturer) {
        this.lecturer = lecturer;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    public String getCoverUuid() {
        return coverUuid;
    }

    public void setCoverUuid(String coverUuid) {
        this.coverUuid = coverUuid == null ? null : coverUuid.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getOrigPrice() {
        return origPrice;
    }

    public void setOrigPrice(BigDecimal origPrice) {
        this.origPrice = origPrice;
    }

    public Integer getSubject() {
        return subject;
    }

    public void setSubject(Integer subject) {
        this.subject = subject;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getTerminalTime() {
        return terminalTime;
    }

    public void setTerminalTime(Date terminalTime) {
        this.terminalTime = terminalTime;
    }

    public String getCourseText() {
        return courseText;
    }

    public void setCourseText(String courseText) {
        this.courseText = courseText == null ? null : courseText.trim();
    }

    private Integer uid;

    @Override
    public Integer getUid() {
        return super.getUid();
    }

    @Override
    public void setUid(Integer uid) {
        this.uid = uid;
    }
}