package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;

public class PersonBatchSearchEntry implements Serializable {
	@JsonProperty("batchTime")
	private OffsetDateTime batchTime = null;
	
	@JsonProperty("messageKey")
	private CqMessageKey messageKey = null;
	
	@JsonProperty("batchIdCq")
	private BatchIdCq batchIdCq = null;
	
	
	public OffsetDateTime getBatchTime() {
		return batchTime;
	}
	
	public void setBatchTime(OffsetDateTime batchTime) {
		this.batchTime = batchTime;
	}
	
	public CqMessageKey getMessageKey() {
		return messageKey;
	}
	
	public void setMessageKey(CqMessageKey messageKey) {
		this.messageKey = messageKey;
	}
	
	public BatchIdCq getBatchIdCq() {
		return batchIdCq;
	}
	
	public void setBatchIdCq(BatchIdCq batchIdCq) {
		this.batchIdCq = batchIdCq;
	}
}

