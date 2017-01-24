package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class DocumentDataCq implements Serializable {
	@JsonProperty("document")
	private byte[] document = null;
	
	
	public byte[] getDocument() {
		return document;
	}
	
	public void setDocument(byte[] document) {
		this.document = document;
	}
}

