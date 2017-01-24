package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class ValidationOverrideCq implements Serializable {
	@JsonProperty("exceptionKey")
	private CqMessageKey exceptionKey = null;
	
	@JsonProperty("exceptionKeyText")
	private String exceptionKeyText = null;
	
	@JsonProperty("overrideReason")
	private String overrideReason = null;
	
	@JsonProperty("overrideUser")
	private String overrideUser = null;
	
	@JsonProperty("overrideId")
	private ValidationOverrideIdCq overrideId = null;
	
	
	public CqMessageKey getExceptionKey() {
		return exceptionKey;
	}
	
	public void setExceptionKey(CqMessageKey exceptionKey) {
		this.exceptionKey = exceptionKey;
	}
	
	public String getExceptionKeyText() {
		return exceptionKeyText;
	}
	
	public void setExceptionKeyText(String exceptionKeyText) {
		this.exceptionKeyText = exceptionKeyText;
	}
	
	public String getOverrideReason() {
		return overrideReason;
	}
	
	public void setOverrideReason(String overrideReason) {
		this.overrideReason = overrideReason;
	}
	
	public String getOverrideUser() {
		return overrideUser;
	}
	
	public void setOverrideUser(String overrideUser) {
		this.overrideUser = overrideUser;
	}
	
	public ValidationOverrideIdCq getOverrideId() {
		return overrideId;
	}
	
	public void setOverrideId(ValidationOverrideIdCq overrideId) {
		this.overrideId = overrideId;
	}
}

