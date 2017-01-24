package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class DocumentQueryDocumentQueryResult implements Serializable {
	@JsonProperty("documentIdCq")
	private DocumentIdCq documentIdCq = null;
	
	
	public DocumentIdCq getDocumentIdCq() {
		return documentIdCq;
	}
	
	public void setDocumentIdCq(DocumentIdCq documentIdCq) {
		this.documentIdCq = documentIdCq;
	}
}

