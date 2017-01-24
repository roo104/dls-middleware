package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class StartableProcessesQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("startableProcessCqCollection")
	private List<StartableProcessCq> startableProcessCqCollection = new ArrayList<StartableProcessCq>();
	
	public StartableProcessesQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public StartableProcessesQueryResult addStartableProcessCqCollectionItem(StartableProcessCq startableProcessCqCollectionItem) {
		this.startableProcessCqCollection.add(startableProcessCqCollectionItem);
		return this;
	}
	
	public List<StartableProcessCq> getStartableProcessCqCollection() {
		return startableProcessCqCollection;
	}
	
	public void setStartableProcessCqCollection(List<StartableProcessCq> startableProcessCqCollection) {
		this.startableProcessCqCollection = startableProcessCqCollection;
	}
}

