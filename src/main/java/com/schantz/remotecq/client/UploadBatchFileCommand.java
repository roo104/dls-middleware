package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class UploadBatchFileCommand implements Serializable {
	@JsonProperty("data")
	private byte[] data = null;
	
	@JsonProperty("fileName")
	private String fileName = null;
	
	@JsonProperty("toDirUid")
	private String toDirUid = null;
	
	
	public byte[] getData() {
		return data;
	}
	
	public void setData(byte[] data) {
		this.data = data;
	}
	
	public String getFileName() {
		return fileName;
	}
	
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	public String getToDirUid() {
		return toDirUid;
	}
	
	public void setToDirUid(String toDirUid) {
		this.toDirUid = toDirUid;
	}
}

