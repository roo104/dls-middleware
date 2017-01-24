package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class CommandStatusMessage implements Serializable {
	@JsonProperty("statusType")
	private String statusType = null;
	
	@JsonProperty("messageKey")
	private CqMessageKey messageKey = null;
	
	
	public String getStatusType() {
		return statusType;
	}
	
	public void setStatusType(String statusType) {
		this.statusType = statusType;
	}
	
	public CqMessageKey getMessageKey() {
		return messageKey;
	}
	
	public void setMessageKey(CqMessageKey messageKey) {
		this.messageKey = messageKey;
	}
}

