package com.qy.entity;

import java.util.Date;

public class PlanBook {
    private Integer planBookId;

    private String planTarget;

    private String planOrg;

    private String planWork;

    private String planMilepost;

    private String ganttChart;

    private String planRelation;

    private String risk;

    private String measures;

    private Date createTime;

    private Integer userId;

    private Integer reportBookId;

    private Integer status;

    public Integer getPlanBookId() {
        return planBookId;
    }

    public void setPlanBookId(Integer planBookId) {
        this.planBookId = planBookId;
    }

    public String getPlanTarget() {
        return planTarget;
    }

    public void setPlanTarget(String planTarget) {
        this.planTarget = planTarget == null ? null : planTarget.trim();
    }

    public String getPlanOrg() {
        return planOrg;
    }

    public void setPlanOrg(String planOrg) {
        this.planOrg = planOrg == null ? null : planOrg.trim();
    }

    public String getPlanWork() {
        return planWork;
    }

    public void setPlanWork(String planWork) {
        this.planWork = planWork == null ? null : planWork.trim();
    }

    public String getPlanMilepost() {
        return planMilepost;
    }

    public void setPlanMilepost(String planMilepost) {
        this.planMilepost = planMilepost == null ? null : planMilepost.trim();
    }

    public String getGanttChart() {
        return ganttChart;
    }

    public void setGanttChart(String ganttChart) {
        this.ganttChart = ganttChart == null ? null : ganttChart.trim();
    }

    public String getPlanRelation() {
        return planRelation;
    }

    public void setPlanRelation(String planRelation) {
        this.planRelation = planRelation == null ? null : planRelation.trim();
    }

    public String getRisk() {
        return risk;
    }

    public void setRisk(String risk) {
        this.risk = risk == null ? null : risk.trim();
    }

    public String getMeasures() {
        return measures;
    }

    public void setMeasures(String measures) {
        this.measures = measures == null ? null : measures.trim();
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

    public Integer getReportBookId() {
        return reportBookId;
    }

    public void setReportBookId(Integer reportBookId) {
        this.reportBookId = reportBookId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}