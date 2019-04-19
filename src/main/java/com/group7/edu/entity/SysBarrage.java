package com.group7.edu.entity;

import java.util.Date;

/**
 * 
 *
 * @author default
 * @date   2019/04/19
 */
public class SysBarrage extends SysBarrageKey {
    /**
     * 视频id
     */
    private Integer vid;

    /**
     * 用户id
     */
    private Integer uid;

    /**
     * 弹幕位置 1：滚动 2：顶部 3：底部
     */
    private Byte pos;

    /**
     * 创建时间
     */
    private Date createdTime;

    /**
     * 弹幕内容
     */
    private String barrageText;

    public Integer getVid() {
        return vid;
    }

    public void setVid(Integer vid) {
        this.vid = vid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Byte getPos() {
        return pos;
    }

    public void setPos(Byte pos) {
        this.pos = pos;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getBarrageText() {
        return barrageText;
    }

    public void setBarrageText(String barrageText) {
        this.barrageText = barrageText == null ? null : barrageText.trim();
    }
}