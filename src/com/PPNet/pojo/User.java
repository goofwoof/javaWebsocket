package com.PPNet.pojo;

public class User {
    private String userid;

    private String username;

    private String password;

    private Byte findable;

    public User(String userid, String username, String password, Byte findable) {
		super();
		this.userid = userid;
		this.username = username;
		this.password = password;
		this.findable = findable;
	}

	public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Byte getFindable() {
        return findable;
    }

    public void setFindable(Byte findable) {
        this.findable = findable;
    }
}