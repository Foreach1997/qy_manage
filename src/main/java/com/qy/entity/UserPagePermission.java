package com.qy.entity;

import java.util.Date;

public class UserPagePermission {
    private Integer pageViewId;

    private String pageCode;

    private Date createTime;

    private Integer userId;

    public Integer getPageViewId() {
        return pageViewId;
    }

    public void setPageViewId(Integer pageViewId) {
        this.pageViewId = pageViewId;
    }

    public String getPageCode() {
        return pageCode;
    }

    public void setPageCode(String pageCode) {
        this.pageCode = pageCode == null ? null : pageCode.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}