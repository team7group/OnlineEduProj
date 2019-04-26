package com.group7.edu.utils;

import java.util.List;


public class PagingUtils {
    private long total;
    private List<?> rows;

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

    public PagingUtils() {

    }


    public PagingUtils(long total, List<?> rows) {
        this.total = total;
        this.rows = rows;
    }
}
