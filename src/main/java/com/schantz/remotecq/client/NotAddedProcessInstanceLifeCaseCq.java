package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class NotAddedProcessInstanceLifeCaseCq implements Serializable {
	@JsonProperty("processInstanceCq")
	private ProcessInstanceCq processInstanceCq = null;
	
	@JsonProperty("idCqCollection")
	private List<IdCq> idCqCollection = new ArrayList<IdCq>();
	
	
	public ProcessInstanceCq getProcessInstanceCq() {
		return processInstanceCq;
	}
	
	public void setProcessInstanceCq(ProcessInstanceCq processInstanceCq) {
		this.processInstanceCq = processInstanceCq;
	}
	
	public NotAddedProcessInstanceLifeCaseCq addIdCqCollectionItem(IdCq idCqCollectionItem) {
		this.idCqCollection.add(idCqCollectionItem);
		return this;
	}
	
	public List<IdCq> getIdCqCollection() {
		return idCqCollection;
	}
	
	public void setIdCqCollection(List<IdCq> idCqCollection) {
		this.idCqCollection = idCqCollection;
	}
}

