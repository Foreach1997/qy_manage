package com.qy.entity;

import java.io.Serializable;
import java.util.Date;

public class ProStop implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * pro_code
     */
    private String proCode;

    /**
     * stop_note
     */
    private String stopNote;

    /**
     * create_time
     */
    private Date createTime;

    /**
     * user_id
     */
    private Integer userId;


    public ProStop() {
    }

    public String getProCode() {
        return proCode;
    }

    public void setProCode(String proCode) {
        this.proCode = proCode;
    }

    public String getStopNote() {
        return stopNote;
    }

    public void setStopNote(String stopNote) {
        this.stopNote = stopNote;
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
