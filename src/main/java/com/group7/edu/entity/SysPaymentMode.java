package com.group7.edu.entity;

/**
 * 支付方式
 *
 * @author default
 * @date   2019/04/21
 */
public class SysPaymentMode {
    /**
     * 支付方式Id
     */
    private Integer id;

    /**
     * 支付方式名称
     */
    private String name;

    /**
     * 支付方式uuid
     */
    private String iconUuid;

    /**
     * 支付方式分类
     */
    private Integer paymentType;

    /**
     * 账户所有者名称
     */
    private String accountName;

    /**
     * 支付机构名称
     */
    private String agent;

    /**
     * 支付账号
     */
    private String accountNumber;

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

    public String getIconUuid() {
        return iconUuid;
    }

    public void setIconUuid(String iconUuid) {
        this.iconUuid = iconUuid == null ? null : iconUuid.trim();
    }

    public Integer getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(Integer paymentType) {
        this.paymentType = paymentType;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName == null ? null : accountName.trim();
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent == null ? null : agent.trim();
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber == null ? null : accountNumber.trim();
    }
}