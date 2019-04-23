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
}