package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class CreatePrintCommand implements Serializable {
	@JsonProperty("documentName")
	private String documentName = null;
	
	@JsonProperty("documentMetaDataCqCollection")
	private List<DocumentMetaDataCq> documentMetaDataCqCollection = new ArrayList<DocumentMetaDataCq>();
	
	@JsonProperty("printContextCq")
	private PrintContextCq printContextCq = null;
	
	
	public String getDocumentName() {
		return documentName;
	}
	
	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}
	
	public CreatePrintCommand addDocumentMetaDataCqCollectionItem(DocumentMetaDataCq documentMetaDataCqCollectionItem) {
		this.documentMetaDataCqCollection.add(documentMetaDataCqCollectionItem);
		return this;
	}
	
	public List<DocumentMetaDataCq> getDocumentMetaDataCqCollection() {
		return documentMetaDataCqCollection;
	}
	
	public void setDocumentMetaDataCqCollection(List<DocumentMetaDataCq> documentMetaDataCqCollection) {
		this.documentMetaDataCqCollection = documentMetaDataCqCollection;
	}
	
	public PrintContextCq getPrintContextCq() {
		return printContextCq;
	}
	
	public void setPrintContextCq(PrintContextCq printContextCq) {
		this.printContextCq = printContextCq;
	}
}

