package com.group7.edu.utils;

import com.alibaba.fastjson.annotation.JSONField;
import com.group7.edu.dto.SysOrderDto;
import com.group7.edu.entity.SysStudent;

/**
 * @Author: WangJinYue
 * @Description:
 * @Date: Created in 22:58 2019/4/13
 * @Modified By:
 */
public abstract class BaseEntity {

    //分页大小
    private Integer pageSize;
    //分页开始
    private Integer pageNum;

    private Integer total;

    //排序类型DESC  or  AES
    private String sort;

    private String orderBy;

    private  Integer uid = ShiroUtils.getUserId();

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    @JSONField(serialize = false)
    public Integer getPageSize() {
        return pageSize;
    }


    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    @JSONField(serialize = false)
    public Integer getPageNum() {
        return pageNum;
    }


    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    @JSONField(serialize = false)
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @JSONField(serialize = false)
    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    @JSONField(serialize = false)
    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }
}