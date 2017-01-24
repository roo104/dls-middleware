package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class PrintContextCq implements Serializable {
	@JsonProperty("printTemplateSelectionCqCollection")
	private List<PrintTemplateSelectionCq> printTemplateSelectionCqCollection = new ArrayList<PrintTemplateSelectionCq>();
	
	@JsonProperty("printContextElementCqCollection")
	private List<PrintContextElementCq> printContextElementCqCollection = new ArrayList<PrintContextElementCq>();
	
	@JsonProperty("selectedOutputChannel")
	private String selectedOutputChannel = null;
	
	@JsonProperty("defaultOutputChannel")
	private String defaultOutputChannel = null;
	
	@JsonProperty("printContextCustomArgumentCqCollection")
	private List<PrintContextCustomArgumentCq> printContextCustomArgumentCqCollection = new ArrayList<PrintContextCustomArgumentCq>();
	
	public PrintContextCq addPrintTemplateSelectionCqCollectionItem(PrintTemplateSelectionCq printTemplateSelectionCqCollectionItem) {
		this.printTemplateSelectionCqCollection.add(printTemplateSelectionCqCollectionItem);
		return this;
	}
	
	public List<PrintTemplateSelectionCq> getPrintTemplateSelectionCqCollection() {
		return printTemplateSelectionCqCollection;
	}
	
	public void setPrintTemplateSelectionCqCollection(List<PrintTemplateSelectionCq> printTemplateSelectionCqCollection) {
		this.printTemplateSelectionCqCollection = printTemplateSelectionCqCollection;
	}
	
	public PrintContextCq addPrintContextElementCqCollectionItem(PrintContextElementCq printContextElementCqCollectionItem) {
		this.printContextElementCqCollection.add(printContextElementCqCollectionItem);
		return this;
	}
	
	public List<PrintContextElementCq> getPrintContextElementCqCollection() {
		return printContextElementCqCollection;
	}
	
	public void setPrintContextElementCqCollection(List<PrintContextElementCq> printContextElementCqCollection) {
		this.printContextElementCqCollection = printContextElementCqCollection;
	}
	
	public String getSelectedOutputChannel() {
		return selectedOutputChannel;
	}
	
	public void setSelectedOutputChannel(String selectedOutputChannel) {
		this.selectedOutputChannel = selectedOutputChannel;
	}
	
	public String getDefaultOutputChannel() {
		return defaultOutputChannel;
	}
	
	public void setDefaultOutputChannel(String defaultOutputChannel) {
		this.defaultOutputChannel = defaultOutputChannel;
	}
	
	public PrintContextCq addPrintContextCustomArgumentCqCollectionItem(PrintContextCustomArgumentCq printContextCustomArgumentCqCollectionItem) {
		this.printContextCustomArgumentCqCollection.add(printContextCustomArgumentCqCollectionItem);
		return this;
	}
	
	public List<PrintContextCustomArgumentCq> getPrintContextCustomArgumentCqCollection() {
		return printContextCustomArgumentCqCollection;
	}
	
	public void setPrintContextCustomArgumentCqCollection(List<PrintContextCustomArgumentCq> printContextCustomArgumentCqCollection) {
		this.printContextCustomArgumentCqCollection = printContextCustomArgumentCqCollection;
	}
}

