package com.PPNet.pojo;

import java.sql.Date;

import net.sf.json.JSONObject;

public class JtoClass {
	public static User JtoUser(JSONObject json_test) {
		return new User(json_test.getString("userid"),json_test.getString("username"),
			 	json_test.getString("password"),(byte) json_test.getInt("findable"));
	}
	public static Chatroommessage JtoChatroommessage(JSONObject json_test) {
		return new Chatroommessage(null,json_test.getString("chatroomid"),
				json_test.getString("message"),json_test.getString("from"),new Date(System.nanoTime()));
	}
}
