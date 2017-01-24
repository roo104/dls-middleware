package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class CqLock implements Serializable {
	@JsonProperty("cls")
	private String cls = null;
	
	@JsonProperty("uid")
	private String uid = null;
	
	@JsonProperty("seq")
	private Long seq = null;
	
	
	public String getCls() {
		return cls;
	}
	
	public void setCls(String cls) {
		this.cls = cls;
	}
	
	public String getUid() {
		return uid;
	}
	
	public void setUid(String uid) {
		this.uid = uid;
	}
	
	public Long getSeq() {
		return seq;
	}
	
	public void setSeq(Long seq) {
		this.seq = seq;
	}
}

