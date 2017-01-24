package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class DeleteBatchDirCommand implements Serializable {
	@JsonProperty("dirUid")
	private String dirUid = null;
	
	
	public String getDirUid() {
		return dirUid;
	}
	
	public void setDirUid(String dirUid) {
		this.dirUid = dirUid;
	}
}

