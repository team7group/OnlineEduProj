package com.group7.edu.entity;

import java.util.Date;

/**
 * 用户协议
 *
 * @author default
 * @date   2019/04/21
 */
public class SysAgreement {
    /**
     * 协议Id
     */
    private Integer id;

    /**
     * 协议名称
     */
    private String name;

    /**
     * 协议创建时间
     */
    private Date createdTime;

    /**
     * 协议最后修改时间
     */
    private Date lastModify;

    /**
     * 协议内容
     */
    private String agreementText;

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

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getLastModify() {
        return lastModify;
    }

    public void setLastModify(Date lastModify) {
        this.lastModify = lastModify;
    }

    public String getAgreementText() {
        return agreementText;
    }

    public void setAgreementText(String agreementText) {
        this.agreementText = agreementText == null ? null : agreementText.trim();
    }
}