package com.group7.edu.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 用于课程购买详情页的数据传输
 * @author c
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SysCourseDTO {
    /**
     * courseId     课程Id
     * courseName   课程名称
     * price        价格
     * origPrice    原价
     * terminalDate 结束时间
     * createdTime  创建时间
     * startTime    开始时间
     * coverUrl     封面URL
     * courseText   课程简介
     */
    private Integer courseId;
    private String courseName;
    private BigDecimal price;
    private BigDecimal origPrice;
    private Date terminalDate;
    private Date createdTime;
    private Date startTime;
    private String coverUrl;
    private String courseText;

    /**
     * adTitle      广告标题
     * adText       广告内容
     */
    private String adTitle;
    private String adText;

    /**
     * groupId      班级Id
     * groupName    班级名称
     * times        当前是第几期
     */
    private Integer groupId;
    private String groupName;
    private Integer times;

    /**
     * teacherIcon          教师头像
     * teacherName          教师姓名
     * teacherSignature     教师个性签名
     * teacherScore         教师评分
     * studentCount         教师学生数量
     * duration             教师授课时长
     */
    private String teacherIcon;
    private String teacherName;
    private String teacherSignature;
    private String teacherScore;
    private Integer studentCount;
    private Integer duration;

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
        this.courseName = courseName;
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

    public Date getTerminalDate() {
        return terminalDate;
    }

    public void setTerminalDate(Date terminalDate) {
        this.terminalDate = terminalDate;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public String getCoverUrl() {
        return coverUrl;
    }

    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
    }

    public String getCourseText() {
        return courseText;
    }

    public void setCourseText(String courseText) {
        this.courseText = courseText;
    }

    public String getAdTitle() {
        return adTitle;
    }

    public void setAdTitle(String adTitle) {
        this.adTitle = adTitle;
    }

    public String getAdText() {
        return adText;
    }

    public void setAdText(String adText) {
        this.adText = adText;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Integer getTimes() {
        return times;
    }

    public void setTimes(Integer times) {
        this.times = times;
    }

    public String getTeacherIcon() {
        return teacherIcon;
    }

    public void setTeacherIcon(String teacherIcon) {
        this.teacherIcon = teacherIcon;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherSignature() {
        return teacherSignature;
    }

    public void setTeacherSignature(String teacherSignature) {
        this.teacherSignature = teacherSignature;
    }

    public String getTeacherScore() {
        return teacherScore;
    }

    public void setTeacherScore(String teacherScore) {
        this.teacherScore = teacherScore;
    }

    public Integer getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(Integer studentCount) {
        this.studentCount = studentCount;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }
}
