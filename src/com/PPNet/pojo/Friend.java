package com.PPNet.pojo;

import java.sql.Date;

public class Friend {
    private Integer idfriend;

    private String hostuserid;

    private String frienduserid;

    private Integer flag;

    private Date time;

    public Integer getIdfriend() {
        return idfriend;
    }

    public void setIdfriend(Integer idfriend) {
        this.idfriend = idfriend;
    }

    public String getHostuserid() {
        return hostuserid;
    }

    public void setHostuserid(String hostuserid) {
        this.hostuserid = hostuserid == null ? null : hostuserid.trim();
    }

    public String getFrienduserid() {
        return frienduserid;
    }

    public void setFrienduserid(String frienduserid) {
        this.frienduserid = frienduserid == null ? null : frienduserid.trim();
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}