package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class ListBatchFileDirQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("batchFileDirCollection")
	private List<BatchFileDir> batchFileDirCollection = new ArrayList<BatchFileDir>();
	
	public ListBatchFileDirQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public ListBatchFileDirQueryResult addBatchFileDirCollectionItem(BatchFileDir batchFileDirCollectionItem) {
		this.batchFileDirCollection.add(batchFileDirCollectionItem);
		return this;
	}
	
	public List<BatchFileDir> getBatchFileDirCollection() {
		return batchFileDirCollection;
	}
	
	public void setBatchFileDirCollection(List<BatchFileDir> batchFileDirCollection) {
		this.batchFileDirCollection = batchFileDirCollection;
	}
}

