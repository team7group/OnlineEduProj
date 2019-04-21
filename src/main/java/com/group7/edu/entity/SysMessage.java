package com.group7.edu.entity;

/**
 * 消息
 *
 * @author default
 * @date   2019/04/21
 */
public class SysMessage {
    /**
     * 消息Id
     */
    private Integer id;

    /**
     * 消息类型
     */
    private Integer type;

    /**
     * 消息发送者id
     */
    private Integer sender;

    /**
     * 消息接收者Id
     */
    private Integer uid;

    /**
     * 消息内容
     */
    private String messageText;

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

    public Integer getSender() {
        return sender;
    }

    public void setSender(Integer sender) {
        this.sender = sender;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText == null ? null : messageText.trim();
    }
}