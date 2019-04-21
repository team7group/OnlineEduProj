package com.group7.edu.entity;

/**
 * 联系方式，用户提交上来的
 *
 * @author default
 * @date   2019/04/21
 */
public class SysContactWay {
    /**
     * 联系我们id
     */
    private Integer id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 学校名称
     */
    private String school;

    /**
     * 服务类型
     */
    private Integer service;

    /**
     * 关注点id
     */
    private Integer focus;

    /**
     * 预算 不需要精度，改成decimal也行
     */
    private Double bugget;

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school == null ? null : school.trim();
    }

    public Integer getService() {
        return service;
    }

    public void setService(Integer service) {
        this.service = service;
    }

    public Integer getFocus() {
        return focus;
    }

    public void setFocus(Integer focus) {
        this.focus = focus;
    }

    public Double getBugget() {
        return bugget;
    }

    public void setBugget(Double bugget) {
        this.bugget = bugget;
    }
}