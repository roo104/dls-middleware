package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class ContributorReceivableStatusCq implements Serializable {
	@JsonProperty("inserted")
	private Boolean inserted = false;
	
	@JsonProperty("description")
	private String description = null;
	
	@JsonProperty("receivableStatusCqCollection")
	private List<String> receivableStatusCqCollection = new ArrayList<String>();
	
	
	public Boolean getInserted() {
		return inserted;
	}
	
	public void setInserted(Boolean inserted) {
		this.inserted = inserted;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public ContributorReceivableStatusCq addReceivableStatusCqCollectionItem(String receivableStatusCqCollectionItem) {
		this.receivableStatusCqCollection.add(receivableStatusCqCollectionItem);
		return this;
	}
	
	public List<String> getReceivableStatusCqCollection() {
		return receivableStatusCqCollection;
	}
	
	public void setReceivableStatusCqCollection(List<String> receivableStatusCqCollection) {
		this.receivableStatusCqCollection = receivableStatusCqCollection;
	}
}

