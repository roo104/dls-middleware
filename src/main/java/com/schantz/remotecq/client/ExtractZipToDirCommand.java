package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class ExtractZipToDirCommand implements Serializable {
	@JsonProperty("zipData")
	private byte[] zipData = null;
	
	@JsonProperty("toDirUid")
	private String toDirUid = null;
	
	
	public byte[] getZipData() {
		return zipData;
	}
	
	public void setZipData(byte[] zipData) {
		this.zipData = zipData;
	}
	
	public String getToDirUid() {
		return toDirUid;
	}
	
	public void setToDirUid(String toDirUid) {
		this.toDirUid = toDirUid;
	}
}

