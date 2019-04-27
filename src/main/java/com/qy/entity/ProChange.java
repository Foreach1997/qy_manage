package com.qy.entity;

import java.io.Serializable;
import java.util.Date;

public class ProChange implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * pro_code
     */
    private String proCode;

    /**
     * change_note
     */
    private String changeNote;

    /**
     * create_time
     */
    private Date createTime;

    /**
     * user_id
     */
    private Integer userId;


    public ProChange() {
    }

    public String getProCode() {
        return proCode;
    }

    public void setProCode(String proCode) {
        this.proCode = proCode;
    }

    public String getChangeNote() {
        return changeNote;
    }

    public void setChangeNote(String changeNote) {
        this.changeNote = changeNote;
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