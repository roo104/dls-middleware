package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class CreateAndStoreDocumentTestCommand implements Serializable {
	@JsonProperty("document")
	private String document = null;
	
	@JsonProperty("documentName")
	private String documentName = null;
	
	@JsonProperty("mimeType")
	private String mimeType = null;
	
	
	public String getDocument() {
		return document;
	}
	
	public void setDocument(String document) {
		this.document = document;
	}
	
	public String getDocumentName() {
		return documentName;
	}
	
	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}
	
	public String getMimeType() {
		return mimeType;
	}
	
	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}
}

