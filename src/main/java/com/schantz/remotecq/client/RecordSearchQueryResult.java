package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class RecordSearchQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("entryCollection")
	private List<RecordSearchEntryCq> entryCollection = new ArrayList<RecordSearchEntryCq>();
	
	@JsonProperty("sortOrderCq")
	private String sortOrderCq = null;
	
	@JsonProperty("pagingInfoCq")
	private PagingInfoCq pagingInfoCq = null;
	
	@JsonProperty("recordEntryUidCollection")
	private List<String> recordEntryUidCollection = new ArrayList<String>();
	
	public RecordSearchQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public RecordSearchQueryResult addEntryCollectionItem(RecordSearchEntryCq entryCollectionItem) {
		this.entryCollection.add(entryCollectionItem);
		return this;
	}
	
	public List<RecordSearchEntryCq> getEntryCollection() {
		return entryCollection;
	}
	
	public void setEntryCollection(List<RecordSearchEntryCq> entryCollection) {
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
	
	public RecordSearchQueryResult addRecordEntryUidCollectionItem(String recordEntryUidCollectionItem) {
		this.recordEntryUidCollection.add(recordEntryUidCollectionItem);
		return this;
	}
	
	public List<String> getRecordEntryUidCollection() {
		return recordEntryUidCollection;
	}
	
	public void setRecordEntryUidCollection(List<String> recordEntryUidCollection) {
		this.recordEntryUidCollection = recordEntryUidCollection;
	}
}

