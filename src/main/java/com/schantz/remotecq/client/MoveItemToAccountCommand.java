package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class MoveItemToAccountCommand implements Serializable {
	@JsonProperty("oiAccountItemId")
	private OiAccountItemIdCq oiAccountItemId = null;
	
	@JsonProperty("registration")
	private String registration = null;
	
	@JsonProperty("description")
	private String description = null;
	
	@JsonProperty("toAccountType")
	private String toAccountType = null;
	
	
	public OiAccountItemIdCq getOiAccountItemId() {
		return oiAccountItemId;
	}
	
	public void setOiAccountItemId(OiAccountItemIdCq oiAccountItemId) {
		this.oiAccountItemId = oiAccountItemId;
	}
	
	public String getRegistration() {
		return registration;
	}
	
	public void setRegistration(String registration) {
		this.registration = registration;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getToAccountType() {
		return toAccountType;
	}
	
	public void setToAccountType(String toAccountType) {
		this.toAccountType = toAccountType;
	}
}

