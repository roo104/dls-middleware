package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class BatchFileDirIdCq implements Serializable {
	@JsonProperty("name")
	private String name = null;
	
	@JsonProperty("fileDirUid")
	private String fileDirUid = null;
	
	@JsonProperty("isDirectory")
	private Boolean isDirectory = false;
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getFileDirUid() {
		return fileDirUid;
	}
	
	public void setFileDirUid(String fileDirUid) {
		this.fileDirUid = fileDirUid;
	}
	
	public Boolean getIsDirectory() {
		return isDirectory;
	}
	
	public void setIsDirectory(Boolean isDirectory) {
		this.isDirectory = isDirectory;
	}
}

