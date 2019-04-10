package com.group7.edu.entity;

public class Part {
    private Integer id;
    private Integer part;
    private String coverUuid;
    private boolean isWatch;

    public void Part(){}
    public void Part(Integer id,Integer part,String coverUuid, boolean isWatch){
        this.part = part;
        this.isWatch = isWatch;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPart() {
        return part;
    }

    public void setPart(Integer part) {
        this.part = part;
    }

    public boolean isWatch() {
        return isWatch;
    }

    public void setWatch(boolean watch) {
        isWatch = watch;
    }

    public void setCoverUuid(String coverUuid){
        this.coverUuid = coverUuid;
    }

    public String getCoverUuid(){
        return coverUuid;
    }
}
