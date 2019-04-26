package com.group7.edu.entity.hky;

import java.util.List;

//@Data
//@NoArgsConstructor
//@AllArgsConstructor
public class Page {

    private Integer nowPage;
    private Integer totalPage;
    private List content;

    public Integer getNowPage() {
        return nowPage;
    }

    public void setNowPage(Integer nowPage) {
        this.nowPage = nowPage;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public List getContent() {
        return content;
    }

    public void setContent(List content) {
        this.content = content;
    }
}
