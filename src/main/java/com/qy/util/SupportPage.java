package com.qy.util;

public class SupportPage {

    //当前页
    private  Integer currentPage = 1;

    //页码大小
    private  Integer PageSize;


    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getPageSize() {
        return PageSize;
    }

    public void setPageSize(Integer pageSize) {
        PageSize = pageSize;
    }
}
