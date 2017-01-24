package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class DisabilityEventQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("eventCq")
	private DisabilityEventCq eventCq = null;
	
	@JsonProperty("actualizedEventQueryInfoCollection")
	private List<ActualizedEventQueryInfo> actualizedEventQueryInfoCollection = new ArrayList<ActualizedEventQueryInfo>();
	
	@JsonProperty("disabilityAnnexSpecCqCollection")
	private List<DisabilityAnnexSpecCq> disabilityAnnexSpecCqCollection = new ArrayList<DisabilityAnnexSpecCq>();
	
	public DisabilityEventQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public DisabilityEventCq getEventCq() {
		return eventCq;
	}
	
	public void setEventCq(DisabilityEventCq eventCq) {
		this.eventCq = eventCq;
	}
	
	public DisabilityEventQueryResult addActualizedEventQueryInfoCollectionItem(ActualizedEventQueryInfo actualizedEventQueryInfoCollectionItem) {
		this.actualizedEventQueryInfoCollection.add(actualizedEventQueryInfoCollectionItem);
		return this;
	}
	
	public List<ActualizedEventQueryInfo> getActualizedEventQueryInfoCollection() {
		return actualizedEventQueryInfoCollection;
	}
	
	public void setActualizedEventQueryInfoCollection(List<ActualizedEventQueryInfo> actualizedEventQueryInfoCollection) {
		this.actualizedEventQueryInfoCollection = actualizedEventQueryInfoCollection;
	}
	
	public DisabilityEventQueryResult addDisabilityAnnexSpecCqCollectionItem(DisabilityAnnexSpecCq disabilityAnnexSpecCqCollectionItem) {
		this.disabilityAnnexSpecCqCollection.add(disabilityAnnexSpecCqCollectionItem);
		return this;
	}
	
	public List<DisabilityAnnexSpecCq> getDisabilityAnnexSpecCqCollection() {
		return disabilityAnnexSpecCqCollection;
	}
	
	public void setDisabilityAnnexSpecCqCollection(List<DisabilityAnnexSpecCq> disabilityAnnexSpecCqCollection) {
		this.disabilityAnnexSpecCqCollection = disabilityAnnexSpecCqCollection;
	}
}

