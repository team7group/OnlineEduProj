package com.group7.edu.entity.lxh;

import com.group7.edu.utils.BaseEntity;

/**
 * @author default
 * @date 2019/4/11
 */
public class MultiListQueries extends BaseEntity {
    private Integer courseId;
    private String  courseName;
    private String  category;
    private String  coverUrl;
    private String  courseTest;

    private Integer infoId;
    private Integer number;
    private String  imageUuid;
    private String  infoText;

    private Integer newId;
    private String  title;
    private String  coverUuid;
    private String  createdTime;
    private String  newsText;

    private Integer subjectId;
    private String  subjectName;
    private String params;


    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
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
        this.courseName = courseName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCoverUrl() {
        return coverUrl;
    }

    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
    }

    public String getCourseTest() {
        return courseTest;
    }

    public void setCourseTest(String courseTest) {
        this.courseTest = courseTest;
    }

    public Integer getInfoId() {
        return infoId;
    }

    public void setInfoId(Integer infoId) {
        this.infoId = infoId;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getImageUuid() {
        return imageUuid;
    }

    public void setImageUuid(String imageUuid) {
        this.imageUuid = imageUuid;
    }

    public String getInfoText() {
        return infoText;
    }

    public void setInfoText(String infoText) {
        this.infoText = infoText;
    }

    public Integer getNewId() {
        return newId;
    }

    public void setNewId(Integer newId) {
        this.newId = newId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCoverUuid() {
        return coverUuid;
    }

    public void setCoverUuid(String coverUuid) {
        this.coverUuid = coverUuid;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public String getNewsText() {
        return newsText;
    }

    public void setNewsText(String newsText) {
        this.newsText = newsText;
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {

        this.subjectName = subjectName;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"courseId\":")
                .append(courseId);
        sb.append(",\"courseName\":\"")
                .append(courseName).append('\"');
        sb.append(",\"category\":\"")
                .append(category).append('\"');
        sb.append(",\"coverUrl\":\"")
                .append(coverUrl).append('\"');
        sb.append(",\"courseTest\":\"")
                .append(courseTest).append('\"');
        sb.append(",\"infoId\":")
                .append(infoId);
        sb.append(",\"number\":")
                .append(number);
        sb.append(",\"imageUuid\":\"")
                .append(imageUuid).append('\"');
        sb.append(",\"infoText\":\"")
                .append(infoText).append('\"');
        sb.append(",\"newId\":")
                .append(newId);
        sb.append(",\"title\":\"")
                .append(title).append('\"');
        sb.append(",\"coverUuid\":\"")
                .append(coverUuid).append('\"');
        sb.append(",\"createdTime\":\"")
                .append(createdTime).append('\"');
        sb.append(",\"newsText\":\"")
                .append(newsText).append('\"');
        sb.append(",\"subjectId\":")
                .append(subjectId);
        sb.append(",\"subjectName\":\"")
                .append(subjectName).append('\"');
        sb.append('}');
        return sb.toString();
    }
}
