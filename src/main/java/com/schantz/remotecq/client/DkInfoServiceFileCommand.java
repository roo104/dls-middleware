package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class DkInfoServiceFileCommand implements Serializable {
	@JsonProperty("fileContent")
	private byte[] fileContent = null;
	
	@JsonProperty("fileName")
	private String fileName = null;
	
	
	public byte[] getFileContent() {
		return fileContent;
	}
	
	public void setFileContent(byte[] fileContent) {
		this.fileContent = fileContent;
	}
	
	public String getFileName() {
		return fileName;
	}
	
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
}

