package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class RecordBundleIdCq implements Serializable {
	@JsonProperty("id")
	private Long id = null;
	
	@JsonProperty("recordBundleUidCq")
	private String recordBundleUidCq = null;
	
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getRecordBundleUidCq() {
		return recordBundleUidCq;
	}
	
	public void setRecordBundleUidCq(String recordBundleUidCq) {
		this.recordBundleUidCq = recordBundleUidCq;
	}
}

