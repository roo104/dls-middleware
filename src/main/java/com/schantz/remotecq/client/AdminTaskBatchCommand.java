package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class AdminTaskBatchCommand implements Serializable {
	@JsonProperty("adminTaskBatchParameterCq")
	private String adminTaskBatchParameterCq = null;
	
	
	public String getAdminTaskBatchParameterCq() {
		return adminTaskBatchParameterCq;
	}
	
	public void setAdminTaskBatchParameterCq(String adminTaskBatchParameterCq) {
		this.adminTaskBatchParameterCq = adminTaskBatchParameterCq;
	}
}

