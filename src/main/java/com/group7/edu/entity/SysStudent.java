package com.group7.edu.entity;

import java.util.Date;

/**
 * 学生
 *
 * @author default
 * @date   2019/04/09
 */
public class SysStudent {
    /**
     * 学生Id
     */
    private Integer id;

    /**
     * 学号
     */
    private Integer number;

    /**
     * 用户名
     */
    private String username;

    /**
     * 用户昵称
     */
    private String nickname;

    /**
     * 用户密码哈希值
     */
    private String passwordHash;

    /**
     * 用户密码私盐
     */
    private String passwordSalt;

    /**
     * 用户是否被禁止
     */
    private Boolean banned;

    /**
     * 用户打卡信息，二进制一位一天，可记录一个月的
     */
    private Integer checkinDays;

    /**
     * 用户头像uuid
     */
    private String iconUuid;

    /**
     * 用户手机号
     */
    private String phone;

    /**
     * 用户邮箱
     */
    private String email;

    /**
     * 用户性别
     */
    private String sex;

    /**
     * 用户生日
     */
    private Date birthday;

    /**
     * 用户微信号
     */
    private String wechat;

    /**
     * 用户QQ号
     */
    private String qq;

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

    public Integer getCheckinDays() {
        return checkinDays;
    }

    public void setCheckinDays(Integer checkinDays) {
        this.checkinDays = checkinDays;
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
}