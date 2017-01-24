package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class ChangeProductEventQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("eventCq")
	private ChangeProductEventCq eventCq = null;
	
	@JsonProperty("changeProductCoverDataCqCollection")
	private List<ChangeProductCoverDataCq> changeProductCoverDataCqCollection = new ArrayList<ChangeProductCoverDataCq>();
	
	public ChangeProductEventQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public ChangeProductEventCq getEventCq() {
		return eventCq;
	}
	
	public void setEventCq(ChangeProductEventCq eventCq) {
		this.eventCq = eventCq;
	}
	
	public ChangeProductEventQueryResult addChangeProductCoverDataCqCollectionItem(ChangeProductCoverDataCq changeProductCoverDataCqCollectionItem) {
		this.changeProductCoverDataCqCollection.add(changeProductCoverDataCqCollectionItem);
		return this;
	}
	
	public List<ChangeProductCoverDataCq> getChangeProductCoverDataCqCollection() {
		return changeProductCoverDataCqCollection;
	}
	
	public void setChangeProductCoverDataCqCollection(List<ChangeProductCoverDataCq> changeProductCoverDataCqCollection) {
		this.changeProductCoverDataCqCollection = changeProductCoverDataCqCollection;
	}
}

