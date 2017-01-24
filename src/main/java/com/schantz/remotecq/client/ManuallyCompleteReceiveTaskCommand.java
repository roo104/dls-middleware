package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class ManuallyCompleteReceiveTaskCommand implements Serializable {
	@JsonProperty("processInstanceStateIdCq")
	private ProcessInstanceStateIdCq processInstanceStateIdCq = null;
	
	@JsonProperty("fileName")
	private String fileName = null;
	
	@JsonProperty("data")
	private byte[] data = null;
	
	@JsonProperty("documentName")
	private String documentName = null;
	
	@JsonProperty("mimeTypeCq")
	private String mimeTypeCq = null;
	
	
	public ProcessInstanceStateIdCq getProcessInstanceStateIdCq() {
		return processInstanceStateIdCq;
	}
	
	public void setProcessInstanceStateIdCq(ProcessInstanceStateIdCq processInstanceStateIdCq) {
		this.processInstanceStateIdCq = processInstanceStateIdCq;
	}
	
	public String getFileName() {
		return fileName;
	}
	
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	public byte[] getData() {
		return data;
	}
	
	public void setData(byte[] data) {
		this.data = data;
	}
	
	public String getDocumentName() {
		return documentName;
	}
	
	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}
	
	public String getMimeTypeCq() {
		return mimeTypeCq;
	}
	
	public void setMimeTypeCq(String mimeTypeCq) {
		this.mimeTypeCq = mimeTypeCq;
	}
}

