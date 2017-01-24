package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class BatchFileDirExportData implements Serializable {
	@JsonProperty("fileName")
	private String fileName = null;
	
	@JsonProperty("data")
	private byte[] data = null;
	
	@JsonProperty("mimeType")
	private String mimeType = null;
	
	
	public String getFileName() {
		return fileName;
	}
	
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	public byte[] getData() {
		return data;
	}
	
	public void setData(byte[] data) {
		this.data = data;
	}
	
	public String getMimeType() {
		return mimeType;
	}
	
	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}
}

