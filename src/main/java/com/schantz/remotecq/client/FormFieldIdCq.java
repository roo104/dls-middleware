package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class FormFieldIdCq implements Serializable {
	@JsonProperty("fieldUid")
	private String fieldUid = null;
	
	@JsonProperty("processVersionIdCq")
	private ProcessVersionIdCq processVersionIdCq = null;
	
	
	public String getFieldUid() {
		return fieldUid;
	}
	
	public void setFieldUid(String fieldUid) {
		this.fieldUid = fieldUid;
	}
	
	public ProcessVersionIdCq getProcessVersionIdCq() {
		return processVersionIdCq;
	}
	
	public void setProcessVersionIdCq(ProcessVersionIdCq processVersionIdCq) {
		this.processVersionIdCq = processVersionIdCq;
	}
}

