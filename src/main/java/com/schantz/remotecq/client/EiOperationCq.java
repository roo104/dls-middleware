package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class EiOperationCq implements Serializable {
	@JsonProperty("eiActivityModeCq")
	private String eiActivityModeCq = null;
	
	@JsonProperty("eiActivityStatusCq")
	private String eiActivityStatusCq = null;
	
	
	public String getEiActivityModeCq() {
		return eiActivityModeCq;
	}
	
	public void setEiActivityModeCq(String eiActivityModeCq) {
		this.eiActivityModeCq = eiActivityModeCq;
	}
	
	public String getEiActivityStatusCq() {
		return eiActivityStatusCq;
	}
	
	public void setEiActivityStatusCq(String eiActivityStatusCq) {
		this.eiActivityStatusCq = eiActivityStatusCq;
	}
}

