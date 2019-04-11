package com.group7.edu.entity;

import java.util.Date;

/**
 * 班级
 *
 * @author default
 * @date   2019/04/11
 */
public class SysGroup {
    /**
     * 班级Id
     */
    private Integer id;

    /**
     * 班级名称
     */
    private String name;

    /**
     * 班级是第几期
     */
    private Integer times;

    /**
     * 上课时间
     */
    private Date classTime;

    /**
     * 课程表Id
     */
    private Integer syllabus;

    /**
     * 封面url
     */
    private String coverUrl;

    /**
     * 班级QQ群号
     */
    private String qqGroup;

    /**
     * 班级公告
     */
    private String classText;

    /**
     * 公告发布时间
     */
    private Date textTime;

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

    public Integer getTimes() {
        return times;
    }

    public void setTimes(Integer times) {
        this.times = times;
    }

    public Date getClassTime() {
        return classTime;
    }

    public void setClassTime(Date classTime) {
        this.classTime = classTime;
    }

    public Integer getSyllabus() {
        return syllabus;
    }

    public void setSyllabus(Integer syllabus) {
        this.syllabus = syllabus;
    }

    public String getCoverUrl() {
        return coverUrl;
    }

    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl == null ? null : coverUrl.trim();
    }

    public String getQqGroup() {
        return qqGroup;
    }

    public void setQqGroup(String qqGroup) {
        this.qqGroup = qqGroup == null ? null : qqGroup.trim();
    }

    public String getClassText() {
        return classText;
    }

    public void setClassText(String classText) {
        this.classText = classText == null ? null : classText.trim();
    }

    public Date getTextTime() {
        return textTime;
    }

    public void setTextTime(Date textTime) {
        this.textTime = textTime;
    }
}