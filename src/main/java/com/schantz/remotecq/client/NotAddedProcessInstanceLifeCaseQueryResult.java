package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class NotAddedProcessInstanceLifeCaseQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("notAddedProcessInstanceLifeCaseCqCollection")
	private List<NotAddedProcessInstanceLifeCaseCq> notAddedProcessInstanceLifeCaseCqCollection = new ArrayList<NotAddedProcessInstanceLifeCaseCq>();
	
	public NotAddedProcessInstanceLifeCaseQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public NotAddedProcessInstanceLifeCaseQueryResult addNotAddedProcessInstanceLifeCaseCqCollectionItem(NotAddedProcessInstanceLifeCaseCq notAddedProcessInstanceLifeCaseCqCollectionItem) {
		this.notAddedProcessInstanceLifeCaseCqCollection.add(notAddedProcessInstanceLifeCaseCqCollectionItem);
		return this;
	}
	
	public List<NotAddedProcessInstanceLifeCaseCq> getNotAddedProcessInstanceLifeCaseCqCollection() {
		return notAddedProcessInstanceLifeCaseCqCollection;
	}
	
	public void setNotAddedProcessInstanceLifeCaseCqCollection(List<NotAddedProcessInstanceLifeCaseCq> notAddedProcessInstanceLifeCaseCqCollection) {
		this.notAddedProcessInstanceLifeCaseCqCollection = notAddedProcessInstanceLifeCaseCqCollection;
	}
}

