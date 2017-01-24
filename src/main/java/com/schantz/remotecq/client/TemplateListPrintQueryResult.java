package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class TemplateListPrintQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("printTemplateInfoCqCollection")
	private List<PrintTemplateInfoCq> printTemplateInfoCqCollection = new ArrayList<PrintTemplateInfoCq>();
	
	public TemplateListPrintQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public TemplateListPrintQueryResult addPrintTemplateInfoCqCollectionItem(PrintTemplateInfoCq printTemplateInfoCqCollectionItem) {
		this.printTemplateInfoCqCollection.add(printTemplateInfoCqCollectionItem);
		return this;
	}
	
	public List<PrintTemplateInfoCq> getPrintTemplateInfoCqCollection() {
		return printTemplateInfoCqCollection;
	}
	
	public void setPrintTemplateInfoCqCollection(List<PrintTemplateInfoCq> printTemplateInfoCqCollection) {
		this.printTemplateInfoCqCollection = printTemplateInfoCqCollection;
	}
}

