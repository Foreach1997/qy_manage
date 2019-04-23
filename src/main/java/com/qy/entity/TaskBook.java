package com.qy.entity;

import java.util.Date;

public class TaskBook {
    private Integer taskBookId;

    private String proName;

    private Date proTimeStart;

    private Float proMoney;

    private Date proTimeEnd;

    private String taskNote;

    private Integer workId;

    private Integer status;

    private String reportCode;

    private Date createTime;

    private Integer userId;

    public Integer getTaskBookId() {
        return taskBookId;
    }

    public void setTaskBookId(Integer taskBookId) {
        this.taskBookId = taskBookId;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName == null ? null : proName.trim();
    }

    public Date getProTimeStart() {
        return proTimeStart;
    }

    public void setProTimeStart(Date proTimeStart) {
        this.proTimeStart = proTimeStart;
    }

    public Float getProMoney() {
        return proMoney;
    }

    public void setProMoney(Float proMoney) {
        this.proMoney = proMoney;
    }

    public Date getProTimeEnd() {
        return proTimeEnd;
    }

    public void setProTimeEnd(Date proTimeEnd) {
        this.proTimeEnd = proTimeEnd;
    }

    public String getTaskNote() {
        return taskNote;
    }

    public void setTaskNote(String taskNote) {
        this.taskNote = taskNote == null ? null : taskNote.trim();
    }

    public Integer getWorkId() {
        return workId;
    }

    public void setWorkId(Integer workId) {
        this.workId = workId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getReportCode() {
        return reportCode;
    }

    public void setReportCode(String reportCode) {
        this.reportCode = reportCode == null ? null : reportCode.trim();
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