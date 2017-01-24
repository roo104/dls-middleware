package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class PrintDataProviderCq implements Serializable {
	@JsonProperty("description")
	private String description = null;
	
	@JsonProperty("alwaysAvailable")
	private Boolean alwaysAvailable = false;
	
	@JsonProperty("generalPrintContentTypeCqCollection")
	private List<String> generalPrintContentTypeCqCollection = new ArrayList<String>();
	
	@JsonProperty("generalPrintContextTypeCqCollection")
	private List<String> generalPrintContextTypeCqCollection = new ArrayList<String>();
	
	@JsonProperty("printDataProviderIdCq")
	private PrintDataProviderIdCq printDataProviderIdCq = null;
	
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Boolean getAlwaysAvailable() {
		return alwaysAvailable;
	}
	
	public void setAlwaysAvailable(Boolean alwaysAvailable) {
		this.alwaysAvailable = alwaysAvailable;
	}
	
	public PrintDataProviderCq addGeneralPrintContentTypeCqCollectionItem(String generalPrintContentTypeCqCollectionItem) {
		this.generalPrintContentTypeCqCollection.add(generalPrintContentTypeCqCollectionItem);
		return this;
	}
	
	public List<String> getGeneralPrintContentTypeCqCollection() {
		return generalPrintContentTypeCqCollection;
	}
	
	public void setGeneralPrintContentTypeCqCollection(List<String> generalPrintContentTypeCqCollection) {
		this.generalPrintContentTypeCqCollection = generalPrintContentTypeCqCollection;
	}
	
	public PrintDataProviderCq addGeneralPrintContextTypeCqCollectionItem(String generalPrintContextTypeCqCollectionItem) {
		this.generalPrintContextTypeCqCollection.add(generalPrintContextTypeCqCollectionItem);
		return this;
	}
	
	public List<String> getGeneralPrintContextTypeCqCollection() {
		return generalPrintContextTypeCqCollection;
	}
	
	public void setGeneralPrintContextTypeCqCollection(List<String> generalPrintContextTypeCqCollection) {
		this.generalPrintContextTypeCqCollection = generalPrintContextTypeCqCollection;
	}
	
	public PrintDataProviderIdCq getPrintDataProviderIdCq() {
		return printDataProviderIdCq;
	}
	
	public void setPrintDataProviderIdCq(PrintDataProviderIdCq printDataProviderIdCq) {
		this.printDataProviderIdCq = printDataProviderIdCq;
	}
}

