package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class LockSearchQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("entryCollection")
	private List<LockSearchEntry> entryCollection = new ArrayList<LockSearchEntry>();
	
	@JsonProperty("sortOrderCq")
	private String sortOrderCq = null;
	
	@JsonProperty("pagingInfoCq")
	private PagingInfoCq pagingInfoCq = null;
	
	public LockSearchQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public LockSearchQueryResult addEntryCollectionItem(LockSearchEntry entryCollectionItem) {
		this.entryCollection.add(entryCollectionItem);
		return this;
	}
	
	public List<LockSearchEntry> getEntryCollection() {
		return entryCollection;
	}
	
	public void setEntryCollection(List<LockSearchEntry> entryCollection) {
		this.entryCollection = entryCollection;
	}
	
	public String getSortOrderCq() {
		return sortOrderCq;
	}
	
	public void setSortOrderCq(String sortOrderCq) {
		this.sortOrderCq = sortOrderCq;
	}
	
	public PagingInfoCq getPagingInfoCq() {
		return pagingInfoCq;
	}
	
	public void setPagingInfoCq(PagingInfoCq pagingInfoCq) {
		this.pagingInfoCq = pagingInfoCq;
	}
}

