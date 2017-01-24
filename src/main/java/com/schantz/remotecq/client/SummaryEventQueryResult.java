package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class SummaryEventQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("headerCollection")
	private List<CqMessageKey> headerCollection = new ArrayList<CqMessageKey>();
	
	@JsonProperty("eventDetailEntryCollection")
	private List<EventDetailEntry> eventDetailEntryCollection = new ArrayList<EventDetailEntry>();
	
	@JsonProperty("lifeEventIdCq")
	private String lifeEventIdCq = null;
	
	@JsonProperty("validationOverrideCqCollection")
	private List<ValidationOverrideCq> validationOverrideCqCollection = new ArrayList<ValidationOverrideCq>();
	
	@JsonProperty("commissionDataCq")
	private CommissionDataCq commissionDataCq = null;
	
	public SummaryEventQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public SummaryEventQueryResult addHeaderCollectionItem(CqMessageKey headerCollectionItem) {
		this.headerCollection.add(headerCollectionItem);
		return this;
	}
	
	public List<CqMessageKey> getHeaderCollection() {
		return headerCollection;
	}
	
	public void setHeaderCollection(List<CqMessageKey> headerCollection) {
		this.headerCollection = headerCollection;
	}
	
	public SummaryEventQueryResult addEventDetailEntryCollectionItem(EventDetailEntry eventDetailEntryCollectionItem) {
		this.eventDetailEntryCollection.add(eventDetailEntryCollectionItem);
		return this;
	}
	
	public List<EventDetailEntry> getEventDetailEntryCollection() {
		return eventDetailEntryCollection;
	}
	
	public void setEventDetailEntryCollection(List<EventDetailEntry> eventDetailEntryCollection) {
		this.eventDetailEntryCollection = eventDetailEntryCollection;
	}
	
	public String getLifeEventIdCq() {
		return lifeEventIdCq;
	}
	
	public void setLifeEventIdCq(String lifeEventIdCq) {
		this.lifeEventIdCq = lifeEventIdCq;
	}
	
	public SummaryEventQueryResult addValidationOverrideCqCollectionItem(ValidationOverrideCq validationOverrideCqCollectionItem) {
		this.validationOverrideCqCollection.add(validationOverrideCqCollectionItem);
		return this;
	}
	
	public List<ValidationOverrideCq> getValidationOverrideCqCollection() {
		return validationOverrideCqCollection;
	}
	
	public void setValidationOverrideCqCollection(List<ValidationOverrideCq> validationOverrideCqCollection) {
		this.validationOverrideCqCollection = validationOverrideCqCollection;
	}
	
	public CommissionDataCq getCommissionDataCq() {
		return commissionDataCq;
	}
	
	public void setCommissionDataCq(CommissionDataCq commissionDataCq) {
		this.commissionDataCq = commissionDataCq;
	}
}

