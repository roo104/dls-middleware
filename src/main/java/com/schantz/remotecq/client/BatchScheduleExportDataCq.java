package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class BatchScheduleExportDataCq implements Serializable {
	@JsonProperty("fileName")
	private String fileName = null;
	
	@JsonProperty("mimeType")
	private String mimeType = null;
	
	@JsonProperty("data")
	private byte[] data = null;
	
	
	public String getFileName() {
		return fileName;
	}
	
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	public String getMimeType() {
		return mimeType;
	}
	
	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}
	
	public byte[] getData() {
		return data;
	}
	
	public void setData(byte[] data) {
		this.data = data;
	}
}

