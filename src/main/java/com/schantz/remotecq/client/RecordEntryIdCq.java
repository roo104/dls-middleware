package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class RecordEntryIdCq implements Serializable {
	@JsonProperty("id")
	private Long id = null;
	
	@JsonProperty("recordBundleId")
	private RecordBundleIdCq recordBundleId = null;
	
	@JsonProperty("recordEntryUidCq")
	private String recordEntryUidCq = null;
	
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public RecordBundleIdCq getRecordBundleId() {
		return recordBundleId;
	}
	
	public void setRecordBundleId(RecordBundleIdCq recordBundleId) {
		this.recordBundleId = recordBundleId;
	}
	
	public String getRecordEntryUidCq() {
		return recordEntryUidCq;
	}
	
	public void setRecordEntryUidCq(String recordEntryUidCq) {
		this.recordEntryUidCq = recordEntryUidCq;
	}
}

