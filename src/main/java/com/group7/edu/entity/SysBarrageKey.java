package com.group7.edu.entity;

/**
 * 
 *
 * @author default
 * @date   2019/04/19
 */
public class SysBarrageKey {
    /**
     * id，主键，自增
     */
    private Long id;

    /**
     * 视频中的时间位置
     */
    private Integer duration;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }
}