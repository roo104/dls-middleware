package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class ProcessInstanceStateLogCq implements Serializable {
	@JsonProperty("processInstanceStateLogEntryCqCollection")
	private List<ProcessInstanceStateLogEntryCq> processInstanceStateLogEntryCqCollection = new ArrayList<ProcessInstanceStateLogEntryCq>();
	
	public ProcessInstanceStateLogCq addProcessInstanceStateLogEntryCqCollectionItem(ProcessInstanceStateLogEntryCq processInstanceStateLogEntryCqCollectionItem) {
		this.processInstanceStateLogEntryCqCollection.add(processInstanceStateLogEntryCqCollectionItem);
		return this;
	}
	
	public List<ProcessInstanceStateLogEntryCq> getProcessInstanceStateLogEntryCqCollection() {
		return processInstanceStateLogEntryCqCollection;
	}
	
	public void setProcessInstanceStateLogEntryCqCollection(List<ProcessInstanceStateLogEntryCq> processInstanceStateLogEntryCqCollection) {
		this.processInstanceStateLogEntryCqCollection = processInstanceStateLogEntryCqCollection;
	}
}

