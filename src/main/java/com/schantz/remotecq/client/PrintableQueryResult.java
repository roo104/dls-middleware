package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class PrintableQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("printTemplateVersionCqCollection")
	private List<PrintTemplateVersionCq> printTemplateVersionCqCollection = new ArrayList<PrintTemplateVersionCq>();
	
	public PrintableQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public PrintableQueryResult addPrintTemplateVersionCqCollectionItem(PrintTemplateVersionCq printTemplateVersionCqCollectionItem) {
		this.printTemplateVersionCqCollection.add(printTemplateVersionCqCollectionItem);
		return this;
	}
	
	public List<PrintTemplateVersionCq> getPrintTemplateVersionCqCollection() {
		return printTemplateVersionCqCollection;
	}
	
	public void setPrintTemplateVersionCqCollection(List<PrintTemplateVersionCq> printTemplateVersionCqCollection) {
		this.printTemplateVersionCqCollection = printTemplateVersionCqCollection;
	}
}

