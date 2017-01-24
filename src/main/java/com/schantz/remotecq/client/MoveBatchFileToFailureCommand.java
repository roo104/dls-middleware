package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class MoveBatchFileToFailureCommand implements Serializable {
	@JsonProperty("fileUid")
	private String fileUid = null;
	
	
	public String getFileUid() {
		return fileUid;
	}
	
	public void setFileUid(String fileUid) {
		this.fileUid = fileUid;
	}
}

