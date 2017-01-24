package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class PrintTemplateEdition implements Serializable {
	@JsonProperty("editionTitle")
	private String editionTitle = null;
	
	@JsonProperty("printContextElementIdCqCollection")
	private List<PrintContextElementIdCq> printContextElementIdCqCollection = new ArrayList<PrintContextElementIdCq>();
	
	
	public String getEditionTitle() {
		return editionTitle;
	}
	
	public void setEditionTitle(String editionTitle) {
		this.editionTitle = editionTitle;
	}
	
	public PrintTemplateEdition addPrintContextElementIdCqCollectionItem(PrintContextElementIdCq printContextElementIdCqCollectionItem) {
		this.printContextElementIdCqCollection.add(printContextElementIdCqCollectionItem);
		return this;
	}
	
	public List<PrintContextElementIdCq> getPrintContextElementIdCqCollection() {
		return printContextElementIdCqCollection;
	}
	
	public void setPrintContextElementIdCqCollection(List<PrintContextElementIdCq> printContextElementIdCqCollection) {
		this.printContextElementIdCqCollection = printContextElementIdCqCollection;
	}
}

