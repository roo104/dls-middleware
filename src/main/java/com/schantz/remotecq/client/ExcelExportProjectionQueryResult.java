package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class ExcelExportProjectionQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("data")
	private byte[] data = null;
	
	@JsonProperty("filename")
	private String filename = null;
	
	@JsonProperty("mimetype")
	private String mimetype = null;
	
	public ExcelExportProjectionQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public byte[] getData() {
		return data;
	}
	
	public void setData(byte[] data) {
		this.data = data;
	}
	
	public String getFilename() {
		return filename;
	}
	
	public void setFilename(String filename) {
		this.filename = filename;
	}
	
	public String getMimetype() {
		return mimetype;
	}
	
	public void setMimetype(String mimetype) {
		this.mimetype = mimetype;
	}
}

