package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class AcceptQuoteWithPrintCommand implements Serializable {
	@JsonProperty("quoteId")
	private QuoteIdCq quoteId = null;
	
	@JsonProperty("documentName")
	private String documentName = null;
	
	@JsonProperty("printContextCq")
	private PrintContextCq printContextCq = null;
	
	@JsonProperty("documentMetaDataCqCollection")
	private List<DocumentMetaDataCq> documentMetaDataCqCollection = new ArrayList<DocumentMetaDataCq>();
	
	
	public QuoteIdCq getQuoteId() {
		return quoteId;
	}
	
	public void setQuoteId(QuoteIdCq quoteId) {
		this.quoteId = quoteId;
	}
	
	public String getDocumentName() {
		return documentName;
	}
	
	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}
	
	public PrintContextCq getPrintContextCq() {
		return printContextCq;
	}
	
	public void setPrintContextCq(PrintContextCq printContextCq) {
		this.printContextCq = printContextCq;
	}
	
	public AcceptQuoteWithPrintCommand addDocumentMetaDataCqCollectionItem(DocumentMetaDataCq documentMetaDataCqCollectionItem) {
		this.documentMetaDataCqCollection.add(documentMetaDataCqCollectionItem);
		return this;
	}
	
	public List<DocumentMetaDataCq> getDocumentMetaDataCqCollection() {
		return documentMetaDataCqCollection;
	}
	
	public void setDocumentMetaDataCqCollection(List<DocumentMetaDataCq> documentMetaDataCqCollection) {
		this.documentMetaDataCqCollection = documentMetaDataCqCollection;
	}
}

