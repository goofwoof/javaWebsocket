package com.PPNet.pojo;

import java.sql.Date;

public class Message {
    private Integer idmessage;

    private String text;

    private String from;

    private String to;

    private Date time;

    public Integer getIdmessage() {
        return idmessage;
    }

    public void setIdmessage(Integer idmessage) {
        this.idmessage = idmessage;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text == null ? null : text.trim();
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from == null ? null : from.trim();
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to == null ? null : to.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}