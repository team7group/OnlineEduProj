package com.group7.edu.utils;

import java.util.List;

public class ResultData {

    private long total;//总的记录数
    private List<?> rows;//当前页集合

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<?> getRows() {
        return rows;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
    }

    public ResultData(long total, List<?> rows) {
        this.total = total;
        this.rows = rows;
    }

    public ResultData() {
    }
}
