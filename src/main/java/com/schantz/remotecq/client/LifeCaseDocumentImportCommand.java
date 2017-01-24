package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class LifeCaseDocumentImportCommand implements Serializable {
	@JsonProperty("data")
	private byte[] data = null;
	
	@JsonProperty("fileName")
	private String fileName = null;
	
	@JsonProperty("documentName")
	private String documentName = null;
	
	@JsonProperty("mimeTypeCq")
	private String mimeTypeCq = null;
	
	@JsonProperty("lifeCaseIdCq")
	private LifeCaseIdCq lifeCaseIdCq = null;
	
	
	public byte[] getData() {
		return data;
	}
	
	public void setData(byte[] data) {
		this.data = data;
	}
	
	public String getFileName() {
		return fileName;
	}
	
	public void setFileName(String fileName) {
		this.fileName = fileName;
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
	
	public LifeCaseIdCq getLifeCaseIdCq() {
		return lifeCaseIdCq;
	}
	
	public void setLifeCaseIdCq(LifeCaseIdCq lifeCaseIdCq) {
		this.lifeCaseIdCq = lifeCaseIdCq;
	}
}

