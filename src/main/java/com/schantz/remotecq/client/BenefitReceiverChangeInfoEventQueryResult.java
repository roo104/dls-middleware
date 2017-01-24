package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class BenefitReceiverChangeInfoEventQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("eventCq")
	private BenefitReceiverChangeInfoEventCq eventCq = null;
	
	@JsonProperty("benefitReceiverChangeInfoAnnexSpecCqCollection")
	private List<BenefitReceiverChangeInfoAnnexSpecCq> benefitReceiverChangeInfoAnnexSpecCqCollection = new ArrayList<BenefitReceiverChangeInfoAnnexSpecCq>();
	
	@JsonProperty("actualizedEventQueryInfoCollection")
	private List<ActualizedEventQueryInfo> actualizedEventQueryInfoCollection = new ArrayList<ActualizedEventQueryInfo>();
	
	public BenefitReceiverChangeInfoEventQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public BenefitReceiverChangeInfoEventCq getEventCq() {
		return eventCq;
	}
	
	public void setEventCq(BenefitReceiverChangeInfoEventCq eventCq) {
		this.eventCq = eventCq;
	}
	
	public BenefitReceiverChangeInfoEventQueryResult addBenefitReceiverChangeInfoAnnexSpecCqCollectionItem(BenefitReceiverChangeInfoAnnexSpecCq benefitReceiverChangeInfoAnnexSpecCqCollectionItem) {
		this.benefitReceiverChangeInfoAnnexSpecCqCollection.add(benefitReceiverChangeInfoAnnexSpecCqCollectionItem);
		return this;
	}
	
	public List<BenefitReceiverChangeInfoAnnexSpecCq> getBenefitReceiverChangeInfoAnnexSpecCqCollection() {
		return benefitReceiverChangeInfoAnnexSpecCqCollection;
	}
	
	public void setBenefitReceiverChangeInfoAnnexSpecCqCollection(List<BenefitReceiverChangeInfoAnnexSpecCq> benefitReceiverChangeInfoAnnexSpecCqCollection) {
		this.benefitReceiverChangeInfoAnnexSpecCqCollection = benefitReceiverChangeInfoAnnexSpecCqCollection;
	}
	
	public BenefitReceiverChangeInfoEventQueryResult addActualizedEventQueryInfoCollectionItem(ActualizedEventQueryInfo actualizedEventQueryInfoCollectionItem) {
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

