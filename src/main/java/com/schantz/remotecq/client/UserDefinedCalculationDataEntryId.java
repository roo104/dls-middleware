package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class UserDefinedCalculationDataEntryId implements Serializable {
	@JsonProperty("uid")
	private String uid = null;
	
	
	public String getUid() {
		return uid;
	}
	
	public void setUid(String uid) {
		this.uid = uid;
	}
}

