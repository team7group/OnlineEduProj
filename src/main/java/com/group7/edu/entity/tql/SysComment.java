package com.group7.edu.entity.tql;

import java.util.Date;

public class SysComment {
    private Integer id;
    private Integer uid;
    private Integer vid;
    private String content;
    private Date createdTime;
    private String nickname;

    @Override
    public String toString() {
        return "SysComment{" +
                "id=" + id +
                ", uid=" + uid +
                ", vid=" + vid +
                ", content='" + content + '\'' +
                ", createdTime=" + createdTime +
                ", nickname='" + nickname + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getVid() {
        return vid;
    }

    public void setVid(Integer vid) {
        this.vid = vid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
