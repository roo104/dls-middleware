package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class UlAccountQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("ulAccountEntryCqCollection")
	private List<UlAccountEntryCq> ulAccountEntryCqCollection = new ArrayList<UlAccountEntryCq>();
	
	public UlAccountQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public UlAccountQueryResult addUlAccountEntryCqCollectionItem(UlAccountEntryCq ulAccountEntryCqCollectionItem) {
		this.ulAccountEntryCqCollection.add(ulAccountEntryCqCollectionItem);
		return this;
	}
	
	public List<UlAccountEntryCq> getUlAccountEntryCqCollection() {
		return ulAccountEntryCqCollection;
	}
	
	public void setUlAccountEntryCqCollection(List<UlAccountEntryCq> ulAccountEntryCqCollection) {
		this.ulAccountEntryCqCollection = ulAccountEntryCqCollection;
	}
}

