package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class GetBatchFileDirQueryGetBatchFileDirQueryResult implements Serializable {
	@JsonProperty("filePath")
	private String filePath = null;
	
	
	public String getFilePath() {
		return filePath;
	}
	
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
}

