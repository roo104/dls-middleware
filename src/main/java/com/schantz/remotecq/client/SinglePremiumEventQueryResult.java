package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class SinglePremiumEventQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("eventCq")
	private SinglePremiumEventCq eventCq = null;
	
	@JsonProperty("calculatedNetAmount")
	private Double calculatedNetAmount = null;
	
	@JsonProperty("calculatedGrossAmount")
	private Double calculatedGrossAmount = null;
	
	@JsonProperty("calculatedCharge")
	private Double calculatedCharge = null;
	
	@JsonProperty("calculatedCommision")
	private Double calculatedCommision = null;
	
	@JsonProperty("singlePremiumEventPackageSplitCollection")
	private List<SinglePremiumEventPackageSplit> singlePremiumEventPackageSplitCollection = new ArrayList<SinglePremiumEventPackageSplit>();
	
	@JsonProperty("singlePremiumEventTaxCodeSplitCollection")
	private List<SinglePremiumEventTaxCodeSplit> singlePremiumEventTaxCodeSplitCollection = new ArrayList<SinglePremiumEventTaxCodeSplit>();
	
	public SinglePremiumEventQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public SinglePremiumEventCq getEventCq() {
		return eventCq;
	}
	
	public void setEventCq(SinglePremiumEventCq eventCq) {
		this.eventCq = eventCq;
	}
	
	public Double getCalculatedNetAmount() {
		return calculatedNetAmount;
	}
	
	public void setCalculatedNetAmount(Double calculatedNetAmount) {
		this.calculatedNetAmount = calculatedNetAmount;
	}
	
	public Double getCalculatedGrossAmount() {
		return calculatedGrossAmount;
	}
	
	public void setCalculatedGrossAmount(Double calculatedGrossAmount) {
		this.calculatedGrossAmount = calculatedGrossAmount;
	}
	
	public Double getCalculatedCharge() {
		return calculatedCharge;
	}
	
	public void setCalculatedCharge(Double calculatedCharge) {
		this.calculatedCharge = calculatedCharge;
	}
	
	public Double getCalculatedCommision() {
		return calculatedCommision;
	}
	
	public void setCalculatedCommision(Double calculatedCommision) {
		this.calculatedCommision = calculatedCommision;
	}
	
	public SinglePremiumEventQueryResult addSinglePremiumEventPackageSplitCollectionItem(SinglePremiumEventPackageSplit singlePremiumEventPackageSplitCollectionItem) {
		this.singlePremiumEventPackageSplitCollection.add(singlePremiumEventPackageSplitCollectionItem);
		return this;
	}
	
	public List<SinglePremiumEventPackageSplit> getSinglePremiumEventPackageSplitCollection() {
		return singlePremiumEventPackageSplitCollection;
	}
	
	public void setSinglePremiumEventPackageSplitCollection(List<SinglePremiumEventPackageSplit> singlePremiumEventPackageSplitCollection) {
		this.singlePremiumEventPackageSplitCollection = singlePremiumEventPackageSplitCollection;
	}
	
	public SinglePremiumEventQueryResult addSinglePremiumEventTaxCodeSplitCollectionItem(SinglePremiumEventTaxCodeSplit singlePremiumEventTaxCodeSplitCollectionItem) {
		this.singlePremiumEventTaxCodeSplitCollection.add(singlePremiumEventTaxCodeSplitCollectionItem);
		return this;
	}
	
	public List<SinglePremiumEventTaxCodeSplit> getSinglePremiumEventTaxCodeSplitCollection() {
		return singlePremiumEventTaxCodeSplitCollection;
	}
	
	public void setSinglePremiumEventTaxCodeSplitCollection(List<SinglePremiumEventTaxCodeSplit> singlePremiumEventTaxCodeSplitCollection) {
		this.singlePremiumEventTaxCodeSplitCollection = singlePremiumEventTaxCodeSplitCollection;
	}
}

