package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class MoveBatchFileToDirCommand implements Serializable {
	@JsonProperty("fileUid")
	private String fileUid = null;
	
	@JsonProperty("toDirUid")
	private String toDirUid = null;
	
	
	public String getFileUid() {
		return fileUid;
	}
	
	public void setFileUid(String fileUid) {
		this.fileUid = fileUid;
	}
	
	public String getToDirUid() {
		return toDirUid;
	}
	
	public void setToDirUid(String toDirUid) {
		this.toDirUid = toDirUid;
	}
}

