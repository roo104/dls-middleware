package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class CreateBatchDirCommand implements Serializable {
	@JsonProperty("dirName")
	private String dirName = null;
	
	@JsonProperty("dirUid")
	private String dirUid = null;
	
	
	public String getDirName() {
		return dirName;
	}
	
	public void setDirName(String dirName) {
		this.dirName = dirName;
	}
	
	public String getDirUid() {
		return dirUid;
	}
	
	public void setDirUid(String dirUid) {
		this.dirUid = dirUid;
	}
}

