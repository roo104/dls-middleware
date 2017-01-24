package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class BatchDataResultRecordEntry implements Serializable {
	@JsonProperty("lineNumber")
	private String lineNumber = null;
	
	@JsonProperty("data")
	private String data = null;
	
	
	public String getLineNumber() {
		return lineNumber;
	}
	
	public void setLineNumber(String lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public String getData() {
		return data;
	}
	
	public void setData(String data) {
		this.data = data;
	}
}

