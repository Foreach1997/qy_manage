package com.qy.entity;

import java.util.Date;

public class ReportBook {
    private Integer reportBookId;

    private String reportBookFile;

    private Integer status;

    private Integer userId;

    private String proSource;

    private String proBackground;

    private String proDescribe;

    private String proFeasibility;

    private Float proMoney;

    private String proBenefit;

    private String proRisk;

    private Date createTime;

    private String proCode;

    private String reason;

    public Integer getReportBookId() {
        return reportBookId;
    }

    public void setReportBookId(Integer reportBookId) {
        this.reportBookId = reportBookId;
    }

    public String getReportBookFile() {
        return reportBookFile;
    }

    public void setReportBookFile(String reportBookFile) {
        this.reportBookFile = reportBookFile == null ? null : reportBookFile.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getProSource() {
        return proSource;
    }

    public void setProSource(String proSource) {
        this.proSource = proSource == null ? null : proSource.trim();
    }

    public String getProBackground() {
        return proBackground;
    }

    public void setProBackground(String proBackground) {
        this.proBackground = proBackground == null ? null : proBackground.trim();
    }

    public String getProDescribe() {
        return proDescribe;
    }

    public void setProDescribe(String proDescribe) {
        this.proDescribe = proDescribe == null ? null : proDescribe.trim();
    }

    public String getProFeasibility() {
        return proFeasibility;
    }

    public void setProFeasibility(String proFeasibility) {
        this.proFeasibility = proFeasibility == null ? null : proFeasibility.trim();
    }

    public Float getProMoney() {
        return proMoney;
    }

    public void setProMoney(Float proMoney) {
        this.proMoney = proMoney;
    }

    public String getProBenefit() {
        return proBenefit;
    }

    public void setProBenefit(String proBenefit) {
        this.proBenefit = proBenefit == null ? null : proBenefit.trim();
    }

    public String getProRisk() {
        return proRisk;
    }

    public void setProRisk(String proRisk) {
        this.proRisk = proRisk == null ? null : proRisk.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getProCode() {
        return proCode;
    }

    public void setProCode(String proCode) {
        this.proCode = proCode == null ? null : proCode.trim();
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }
}