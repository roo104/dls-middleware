package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class EventsQuoteQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("eventCqCollection")
	private List<EventCq> eventCqCollection = new ArrayList<EventCq>();
	
	@JsonProperty("unitLinkChangesCollection")
	private List<PolicyQuotePortfolioDataCq> unitLinkChangesCollection = new ArrayList<PolicyQuotePortfolioDataCq>();
	
	public EventsQuoteQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public EventsQuoteQueryResult addEventCqCollectionItem(EventCq eventCqCollectionItem) {
		this.eventCqCollection.add(eventCqCollectionItem);
		return this;
	}
	
	public List<EventCq> getEventCqCollection() {
		return eventCqCollection;
	}
	
	public void setEventCqCollection(List<EventCq> eventCqCollection) {
		this.eventCqCollection = eventCqCollection;
	}
	
	public EventsQuoteQueryResult addUnitLinkChangesCollectionItem(PolicyQuotePortfolioDataCq unitLinkChangesCollectionItem) {
		this.unitLinkChangesCollection.add(unitLinkChangesCollectionItem);
		return this;
	}
	
	public List<PolicyQuotePortfolioDataCq> getUnitLinkChangesCollection() {
		return unitLinkChangesCollection;
	}
	
	public void setUnitLinkChangesCollection(List<PolicyQuotePortfolioDataCq> unitLinkChangesCollection) {
		this.unitLinkChangesCollection = unitLinkChangesCollection;
	}
}

