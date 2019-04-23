package com.qy.entity;

import java.util.Date;

public class ProMake {
    private Integer makeId;

    private Integer makeType;

    private String makeFile;

    private String proCode;

    private Date createTime;

    private Integer userId;

    public Integer getMakeId() {
        return makeId;
    }

    public void setMakeId(Integer makeId) {
        this.makeId = makeId;
    }

    public Integer getMakeType() {
        return makeType;
    }

    public void setMakeType(Integer makeType) {
        this.makeType = makeType;
    }

    public String getMakeFile() {
        return makeFile;
    }

    public void setMakeFile(String makeFile) {
        this.makeFile = makeFile == null ? null : makeFile.trim();
    }

    public String getProCode() {
        return proCode;
    }

    public void setProCode(String proCode) {
        this.proCode = proCode == null ? null : proCode.trim();
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