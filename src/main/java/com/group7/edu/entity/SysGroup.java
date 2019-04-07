package com.group7.edu.entity;

import java.util.Date;

public class SysGroup {
    private Integer id;

    private String name;

    private Integer times;

    private Date classTime;

    private Integer syllabus;

    private String coverUrl;

    private String qqGroup;

    private String classText;

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