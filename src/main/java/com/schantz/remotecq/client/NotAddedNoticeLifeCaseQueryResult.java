package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class NotAddedNoticeLifeCaseQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("notAddedNoticeLifeCaseCqCollection")
	private List<NotAddedNoticeLifeCaseCq> notAddedNoticeLifeCaseCqCollection = new ArrayList<NotAddedNoticeLifeCaseCq>();
	
	public NotAddedNoticeLifeCaseQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public NotAddedNoticeLifeCaseQueryResult addNotAddedNoticeLifeCaseCqCollectionItem(NotAddedNoticeLifeCaseCq notAddedNoticeLifeCaseCqCollectionItem) {
		this.notAddedNoticeLifeCaseCqCollection.add(notAddedNoticeLifeCaseCqCollectionItem);
		return this;
	}
	
	public List<NotAddedNoticeLifeCaseCq> getNotAddedNoticeLifeCaseCqCollection() {
		return notAddedNoticeLifeCaseCqCollection;
	}
	
	public void setNotAddedNoticeLifeCaseCqCollection(List<NotAddedNoticeLifeCaseCq> notAddedNoticeLifeCaseCqCollection) {
		this.notAddedNoticeLifeCaseCqCollection = notAddedNoticeLifeCaseCqCollection;
	}
}

