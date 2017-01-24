package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class UserIdCq implements Serializable {
	@JsonProperty("userUid")
	private String userUid = null;
	
	@JsonProperty("userId")
	private String userId = null;
	
	
	public String getUserUid() {
		return userUid;
	}
	
	public void setUserUid(String userUid) {
		this.userUid = userUid;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
}

