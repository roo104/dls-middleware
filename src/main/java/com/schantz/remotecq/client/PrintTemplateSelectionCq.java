package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class PrintTemplateSelectionCq implements Serializable {
	@JsonProperty("printTemplateArgumentContextCqCollection")
	private List<PrintTemplateArgumentContextCq> printTemplateArgumentContextCqCollection = new ArrayList<PrintTemplateArgumentContextCq>();
	
	@JsonProperty("childTemplateCollection")
	private List<PrintTemplateSelectionCq> childTemplateCollection = new ArrayList<PrintTemplateSelectionCq>();
	
	@JsonProperty("printTemplateVersionIdCq")
	private PrintTemplateVersionIdCq printTemplateVersionIdCq = null;
	
	@JsonProperty("printTemplateSelectionEditCq")
	private PrintTemplateSelectionEditCq printTemplateSelectionEditCq = null;
	
	@JsonProperty("printTemplateEdition")
	private PrintTemplateEdition printTemplateEdition = null;
	
	public PrintTemplateSelectionCq addPrintTemplateArgumentContextCqCollectionItem(PrintTemplateArgumentContextCq printTemplateArgumentContextCqCollectionItem) {
		this.printTemplateArgumentContextCqCollection.add(printTemplateArgumentContextCqCollectionItem);
		return this;
	}
	
	public List<PrintTemplateArgumentContextCq> getPrintTemplateArgumentContextCqCollection() {
		return printTemplateArgumentContextCqCollection;
	}
	
	public void setPrintTemplateArgumentContextCqCollection(List<PrintTemplateArgumentContextCq> printTemplateArgumentContextCqCollection) {
		this.printTemplateArgumentContextCqCollection = printTemplateArgumentContextCqCollection;
	}
	
	public PrintTemplateSelectionCq addChildTemplateCollectionItem(PrintTemplateSelectionCq childTemplateCollectionItem) {
		this.childTemplateCollection.add(childTemplateCollectionItem);
		return this;
	}
	
	public List<PrintTemplateSelectionCq> getChildTemplateCollection() {
		return childTemplateCollection;
	}
	
	public void setChildTemplateCollection(List<PrintTemplateSelectionCq> childTemplateCollection) {
		this.childTemplateCollection = childTemplateCollection;
	}
	
	public PrintTemplateVersionIdCq getPrintTemplateVersionIdCq() {
		return printTemplateVersionIdCq;
	}
	
	public void setPrintTemplateVersionIdCq(PrintTemplateVersionIdCq printTemplateVersionIdCq) {
		this.printTemplateVersionIdCq = printTemplateVersionIdCq;
	}
	
	public PrintTemplateSelectionEditCq getPrintTemplateSelectionEditCq() {
		return printTemplateSelectionEditCq;
	}
	
	public void setPrintTemplateSelectionEditCq(PrintTemplateSelectionEditCq printTemplateSelectionEditCq) {
		this.printTemplateSelectionEditCq = printTemplateSelectionEditCq;
	}
	
	public PrintTemplateEdition getPrintTemplateEdition() {
		return printTemplateEdition;
	}
	
	public void setPrintTemplateEdition(PrintTemplateEdition printTemplateEdition) {
		this.printTemplateEdition = printTemplateEdition;
	}
}

