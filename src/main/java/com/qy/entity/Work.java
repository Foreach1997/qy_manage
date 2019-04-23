package com.qy.entity;

import java.util.Date;

public class Work {
    private Integer workId;

    private Integer userId;

    private String workRoleName;

    private Date createTime;

    private Integer status;

    private Integer depId;

    private String proCode;

    public Integer getWorkId() {
        return workId;
    }

    public void setWorkId(Integer workId) {
        this.workId = workId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getWorkRoleName() {
        return workRoleName;
    }

    public void setWorkRoleName(String workRoleName) {
        this.workRoleName = workRoleName == null ? null : workRoleName.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getDepId() {
        return depId;
    }

    public void setDepId(Integer depId) {
        this.depId = depId;
    }

    public String getProCode() {
        return proCode;
    }

    public void setProCode(String proCode) {
        this.proCode = proCode == null ? null : proCode.trim();
    }
}