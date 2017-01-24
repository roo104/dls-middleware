package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;

public class EiConfigCertificateDataCq implements Serializable {
	@JsonProperty("data")
	private byte[] data = null;
	
	@JsonProperty("expiry")
	private LocalDate expiry = null;
	
	@JsonProperty("passPhrase")
	private String passPhrase = null;
	
	@JsonProperty("fileName")
	private String fileName = null;
	
	@JsonProperty("contentType")
	private String contentType = null;
	
	
	public byte[] getData() {
		return data;
	}
	
	public void setData(byte[] data) {
		this.data = data;
	}
	
	public LocalDate getExpiry() {
		return expiry;
	}
	
	public void setExpiry(LocalDate expiry) {
		this.expiry = expiry;
	}
	
	public String getPassPhrase() {
		return passPhrase;
	}
	
	public void setPassPhrase(String passPhrase) {
		this.passPhrase = passPhrase;
	}
	
	public String getFileName() {
		return fileName;
	}
	
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	public String getContentType() {
		return contentType;
	}
	
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
}

