package com.group7.edu.entity;

/**
 * 用户反馈
 *
 * @author default
 * @date   2019/04/11
 */
public class SysFeedback {
    /**
     * 投诉建议Id
     */
    private Integer id;

    /**
     * 类型
     */
    private Integer type;

    /**
     * 科目id
     */
    private Integer subject;

    /**
     * 学院id
     */
    private Integer department;

    /**
     * 图片url
     */
    private String imageUrl;

    /**
     * 内容
     */
    private String feedbackText;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getSubject() {
        return subject;
    }

    public void setSubject(Integer subject) {
        this.subject = subject;
    }

    public Integer getDepartment() {
        return department;
    }

    public void setDepartment(Integer department) {
        this.department = department;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl == null ? null : imageUrl.trim();
    }

    public String getFeedbackText() {
        return feedbackText;
    }

    public void setFeedbackText(String feedbackText) {
        this.feedbackText = feedbackText == null ? null : feedbackText.trim();
    }
}