package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class RetirementEventQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("eventCq")
	private RetirementEventCq eventCq = null;
	
	@JsonProperty("retirementAnnexSpecCqCollection")
	private List<RetirementAnnexSpecCq> retirementAnnexSpecCqCollection = new ArrayList<RetirementAnnexSpecCq>();
	
	@JsonProperty("actualizedEventQueryInfoCollection")
	private List<ActualizedEventQueryInfo> actualizedEventQueryInfoCollection = new ArrayList<ActualizedEventQueryInfo>();
	
	public RetirementEventQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public RetirementEventCq getEventCq() {
		return eventCq;
	}
	
	public void setEventCq(RetirementEventCq eventCq) {
		this.eventCq = eventCq;
	}
	
	public RetirementEventQueryResult addRetirementAnnexSpecCqCollectionItem(RetirementAnnexSpecCq retirementAnnexSpecCqCollectionItem) {
		this.retirementAnnexSpecCqCollection.add(retirementAnnexSpecCqCollectionItem);
		return this;
	}
	
	public List<RetirementAnnexSpecCq> getRetirementAnnexSpecCqCollection() {
		return retirementAnnexSpecCqCollection;
	}
	
	public void setRetirementAnnexSpecCqCollection(List<RetirementAnnexSpecCq> retirementAnnexSpecCqCollection) {
		this.retirementAnnexSpecCqCollection = retirementAnnexSpecCqCollection;
	}
	
	public RetirementEventQueryResult addActualizedEventQueryInfoCollectionItem(ActualizedEventQueryInfo actualizedEventQueryInfoCollectionItem) {
		this.actualizedEventQueryInfoCollection.add(actualizedEventQueryInfoCollectionItem);
		return this;
	}
	
	public List<ActualizedEventQueryInfo> getActualizedEventQueryInfoCollection() {
		return actualizedEventQueryInfoCollection;
	}
	
	public void setActualizedEventQueryInfoCollection(List<ActualizedEventQueryInfo> actualizedEventQueryInfoCollection) {
		this.actualizedEventQueryInfoCollection = actualizedEventQueryInfoCollection;
	}
}

