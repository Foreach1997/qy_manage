package com.qy.entity;

import java.io.Serializable;
import java.util.Date;

public class ProFinish implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * pro_code
     */
    private String proCode;

    /**
     * finish_target
     */
    private String finishTarget;

    /**
     * money
     */
    private Float money;

    /**
     * 预期利益对比
     */
    private String contrast;

    /**
     * 项目体会
     */
    private String proExperience;

    /**
     * create_time
     */
    private Date createTime;

    /**
     * user_id
     */
    private Integer userId;


    public ProFinish() {
    }

    public String getProCode() {
        return proCode;
    }

    public void setProCode(String proCode) {
        this.proCode = proCode;
    }

    public String getFinishTarget() {
        return finishTarget;
    }

    public void setFinishTarget(String finishTarget) {
        this.finishTarget = finishTarget;
    }

    public Float getMoney() {
        return money;
    }

    public void setMoney(Float money) {
        this.money = money;
    }

    public String getContrast() {
        return contrast;
    }

    public void setContrast(String contrast) {
        this.contrast = contrast;
    }

    public String getProExperience() {
        return proExperience;
    }

    public void setProExperience(String proExperience) {
        this.proExperience = proExperience;
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
