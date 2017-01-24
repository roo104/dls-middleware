package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class NotAddedEventLifeCaseQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("notAddedEventLifeCqCollection")
	private List<NotAddedEventLifeCq> notAddedEventLifeCqCollection = new ArrayList<NotAddedEventLifeCq>();
	
	public NotAddedEventLifeCaseQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public NotAddedEventLifeCaseQueryResult addNotAddedEventLifeCqCollectionItem(NotAddedEventLifeCq notAddedEventLifeCqCollectionItem) {
		this.notAddedEventLifeCqCollection.add(notAddedEventLifeCqCollectionItem);
		return this;
	}
	
	public List<NotAddedEventLifeCq> getNotAddedEventLifeCqCollection() {
		return notAddedEventLifeCqCollection;
	}
	
	public void setNotAddedEventLifeCqCollection(List<NotAddedEventLifeCq> notAddedEventLifeCqCollection) {
		this.notAddedEventLifeCqCollection = notAddedEventLifeCqCollection;
	}
}

