package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class ExportRecordingQueryExportRecordingQueryResult implements Serializable {
	@JsonProperty("description")
	private String description = null;
	
	@JsonProperty("entryUidCollection")
	private List<String> entryUidCollection = new ArrayList<String>();
	
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public ExportRecordingQueryExportRecordingQueryResult addEntryUidCollectionItem(String entryUidCollectionItem) {
		this.entryUidCollection.add(entryUidCollectionItem);
		return this;
	}
	
	public List<String> getEntryUidCollection() {
		return entryUidCollection;
	}
	
	public void setEntryUidCollection(List<String> entryUidCollection) {
		this.entryUidCollection = entryUidCollection;
	}
}

