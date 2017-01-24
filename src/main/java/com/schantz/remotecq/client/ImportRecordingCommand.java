package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class ImportRecordingCommand implements Serializable {
	@JsonProperty("data")
	private byte[] data = null;
	
	
	public byte[] getData() {
		return data;
	}
	
	public void setData(byte[] data) {
		this.data = data;
	}
}

