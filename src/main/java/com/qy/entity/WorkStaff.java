package com.qy.entity;

import java.util.Date;

public class WorkStaff {
    private Integer workStaffId;

    private Integer userId;

    private Integer workLeadId;

    private Integer workId;

    private Date createTiem;

    private String proCode;

    private Float planMoney;

    private Float realMoney;

    private Integer status;

    private String reportNote;

    private String review;

    private String smallTask;

    private Integer depId;

    private String note;

    private Date startTime;

    private Date endTime;

    private Integer warnStatus;

    private Integer warnPop;

    public Integer getWorkStaffId() {
        return workStaffId;
    }

    public void setWorkStaffId(Integer workStaffId) {
        this.workStaffId = workStaffId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getWorkLeadId() {
        return workLeadId;
    }

    public void setWorkLeadId(Integer workLeadId) {
        this.workLeadId = workLeadId;
    }

    public Integer getWorkId() {
        return workId;
    }

    public void setWorkId(Integer workId) {
        this.workId = workId;
    }

    public Date getCreateTiem() {
        return createTiem;
    }

    public void setCreateTiem(Date createTiem) {
        this.createTiem = createTiem;
    }

    public String getProCode() {
        return proCode;
    }

    public void setProCode(String proCode) {
        this.proCode = proCode == null ? null : proCode.trim();
    }

    public Float getPlanMoney() {
        return planMoney;
    }

    public void setPlanMoney(Float planMoney) {
        this.planMoney = planMoney;
    }

    public Float getRealMoney() {
        return realMoney;
    }

    public void setRealMoney(Float realMoney) {
        this.realMoney = realMoney;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getReportNote() {
        return reportNote;
    }

    public void setReportNote(String reportNote) {
        this.reportNote = reportNote == null ? null : reportNote.trim();
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review == null ? null : review.trim();
    }

    public String getSmallTask() {
        return smallTask;
    }

    public void setSmallTask(String smallTask) {
        this.smallTask = smallTask == null ? null : smallTask.trim();
    }

    public Integer getDepId() {
        return depId;
    }

    public void setDepId(Integer depId) {
        this.depId = depId;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getWarnStatus() {
        return warnStatus;
    }

    public void setWarnStatus(Integer warnStatus) {
        this.warnStatus = warnStatus;
    }

    public Integer getWarnPop() {
        return warnPop;
    }

    public void setWarnPop(Integer warnPop) {
        this.warnPop = warnPop;
    }
}