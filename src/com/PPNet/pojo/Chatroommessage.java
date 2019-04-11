package com.PPNet.pojo;

import java.sql.Date;

public class Chatroommessage {
    private Integer idchatroommessage;

    private String chatroomid;

    private String message;

    private String from;

    private Date time;

    public Chatroommessage(Integer idchatroommessage, String chatroomid, String message, String from, Date time) {
		super();
		this.idchatroommessage = idchatroommessage;
		this.chatroomid = chatroomid;
		this.message = message;
		this.from = from;
		this.time = time;
	}

	public Integer getIdchatroommessage() {
        return idchatroommessage;
    }

    public void setIdchatroommessage(Integer idchatroommessage) {
        this.idchatroommessage = idchatroommessage;
    }

    public String getChatroomid() {
        return chatroomid;
    }

    public void setChatroomid(String chatroomid) {
        this.chatroomid = chatroomid == null ? null : chatroomid.trim();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from == null ? null : from.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}