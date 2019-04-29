package com.qy.entity;

import java.io.Serializable;
import java.util.Date;

/**
 *  notice
 * @author 大狼狗 2019-04-29
 */
public class Notice implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * notice_id
     */
    private Integer noticeId;

    /**
     * note
     */
    private String note;

    /**
     * create_time
     */
    private Date createTime;

    /**
     * role_id
     */
    private Integer roleId;

    /**
     * dep_id
     */
    private Integer depId;

    /**
     * user_id
     */
    private Integer userId;


    public Notice() {
    }

    public Integer getNoticeId() {
        return noticeId;
    }

    public void setNoticeId(Integer noticeId) {
        this.noticeId = noticeId;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getDepId() {
        return depId;
    }

    public void setDepId(Integer depId) {
        this.depId = depId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

}