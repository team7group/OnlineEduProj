package com.group7.edu.entity;

import java.util.Date;

/**
 * 讲师
 *
 * @author default
 * @date   2019/04/11
 */
public class SysTeacher {
    /**
     * 讲师Id
     */
    private Integer id;

    /**
     * 讲师工号
     */
    private Integer number;

    /**
     * 讲师用户名
     */
    private String username;

    /**
     * 讲师用户昵称（将改为讲师至理名言）
     */
    private String nickname;

    /**
     * 讲师用户真实姓名
     */
    private String realname;

    /**
     * 讲师用户密码哈希值
     */
    private String passwordHash;

    /**
     * 讲师用户密码私盐
     */
    private String passwordSalt;

    /**
     * 讲师用户是否被禁止
     */
    private Boolean banned;

    /**
     * 讲师评分，最大为10，不需要精确
     */
    private Integer score;

    /**
     * 讲师总学生数量
     */
    private Integer studentCount;

    /**
     * 授课总时长
     */
    private Integer teachingDuration;

    /**
     * 讲师用户头像uuid
     */
    private String iconUuid;

    /**
     * 讲师用户手机号
     */
    private String phone;

    /**
     * 讲师用户邮箱
     */
    private String email;

    /**
     * 讲师用户性别
     */
    private String sex;

    /**
     * 讲师用户生日
     */
    private Date birthday;

    /**
     * 讲师用户微信号
     */
    private String wechat;

    /**
     * 讲师用户QQ号
     */
    private String qq;

    /**
     * 讲师简介
     */
    private String lecturerText;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash == null ? null : passwordHash.trim();
    }

    public String getPasswordSalt() {
        return passwordSalt;
    }

    public void setPasswordSalt(String passwordSalt) {
        this.passwordSalt = passwordSalt == null ? null : passwordSalt.trim();
    }

    public Boolean getBanned() {
        return banned;
    }

    public void setBanned(Boolean banned) {
        this.banned = banned;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(Integer studentCount) {
        this.studentCount = studentCount;
    }

    public Integer getTeachingDuration() {
        return teachingDuration;
    }

    public void setTeachingDuration(Integer teachingDuration) {
        this.teachingDuration = teachingDuration;
    }

    public String getIconUuid() {
        return iconUuid;
    }

    public void setIconUuid(String iconUuid) {
        this.iconUuid = iconUuid == null ? null : iconUuid.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat == null ? null : wechat.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getLecturerText() {
        return lecturerText;
    }

    public void setLecturerText(String lecturerText) {
        this.lecturerText = lecturerText == null ? null : lecturerText.trim();
    }
}