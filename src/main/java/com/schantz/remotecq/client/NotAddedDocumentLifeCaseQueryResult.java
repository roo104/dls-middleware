package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class NotAddedDocumentLifeCaseQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("notAddedDocumentLifeCaseCqCollection")
	private List<NotAddedDocumentLifeCaseCq> notAddedDocumentLifeCaseCqCollection = new ArrayList<NotAddedDocumentLifeCaseCq>();
	
	public NotAddedDocumentLifeCaseQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public NotAddedDocumentLifeCaseQueryResult addNotAddedDocumentLifeCaseCqCollectionItem(NotAddedDocumentLifeCaseCq notAddedDocumentLifeCaseCqCollectionItem) {
		this.notAddedDocumentLifeCaseCqCollection.add(notAddedDocumentLifeCaseCqCollectionItem);
		return this;
	}
	
	public List<NotAddedDocumentLifeCaseCq> getNotAddedDocumentLifeCaseCqCollection() {
		return notAddedDocumentLifeCaseCqCollection;
	}
	
	public void setNotAddedDocumentLifeCaseCqCollection(List<NotAddedDocumentLifeCaseCq> notAddedDocumentLifeCaseCqCollection) {
		this.notAddedDocumentLifeCaseCqCollection = notAddedDocumentLifeCaseCqCollection;
	}
}

