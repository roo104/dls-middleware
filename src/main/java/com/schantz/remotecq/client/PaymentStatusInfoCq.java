package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class PaymentStatusInfoCq implements Serializable {
	@JsonProperty("text")
	private CqMessageKey text = null;
	
	@JsonProperty("level")
	private String level = null;
	
	
	public CqMessageKey getText() {
		return text;
	}
	
	public void setText(CqMessageKey text) {
		this.text = text;
	}
	
	public String getLevel() {
		return level;
	}
	
	public void setLevel(String level) {
		this.level = level;
	}
}

