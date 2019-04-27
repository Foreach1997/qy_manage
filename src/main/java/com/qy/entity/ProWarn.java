package com.qy.entity;

import java.io.Serializable;

public class ProWarn implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * warn_id
     */
    private Integer warnId;

    /**
     * pro_code
     */
    private String proCode;

    /**
     * 创建者
     */
    private Integer userId;

    /**
     * 领导id
     */
    private Integer leadId;


    public ProWarn() {
    }

    public Integer getWarnId() {
        return warnId;
    }

    public void setWarnId(Integer warnId) {
        this.warnId = warnId;
    }

    public String getProCode() {
        return proCode;
    }

    public void setProCode(String proCode) {
        this.proCode = proCode;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getLeadId() {
        return leadId;
    }

    public void setLeadId(Integer leadId) {
        this.leadId = leadId;
    }
}
