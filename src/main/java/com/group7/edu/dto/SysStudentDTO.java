package com.group7.edu.dto;

import com.group7.edu.entity.SysStudent;

public class SysStudentDTO extends SysStudent {
    //密码
    private String password;
    //确认密码
    private String confirmPassword;
//    //验证码
//    private String captchaCode;
    //记住我
    private boolean rememberMe;
    //登录时用户名
    private String phoneOrEmail;
    //重置密码的验证码
    private String verificationCode;

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getVerificationCode() {
        return verificationCode;
    }

    public void setVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

//    public String getCaptchaCode() {
//        return captchaCode;
//    }
//
//    public void setCaptchaCode(String captchaCode) {
//        this.captchaCode = captchaCode;
//    }

    public boolean isRememberMe() {
        return rememberMe;
    }

    public void setRememberMe(boolean rememberMe) {
        this.rememberMe = rememberMe;
    }

    public String getPhoneOrEmail() {
        return phoneOrEmail;
    }

    public void setPhoneOrEmail(String phoneOrEmail) {
        this.phoneOrEmail = phoneOrEmail;
    }
}
