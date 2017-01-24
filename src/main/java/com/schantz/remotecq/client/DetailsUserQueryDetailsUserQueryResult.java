package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class DetailsUserQueryDetailsUserQueryResult implements Serializable {
	@JsonProperty("userIdCq")
	private UserIdCq userIdCq = null;
	
	
	public UserIdCq getUserIdCq() {
		return userIdCq;
	}
	
	public void setUserIdCq(UserIdCq userIdCq) {
		this.userIdCq = userIdCq;
	}
}

