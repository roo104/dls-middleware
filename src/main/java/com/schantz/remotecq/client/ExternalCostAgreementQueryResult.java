package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class ExternalCostAgreementQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("externalCostDataCollection")
	private List<AgreementCostDataCq> externalCostDataCollection = new ArrayList<AgreementCostDataCq>();
	
	public ExternalCostAgreementQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public ExternalCostAgreementQueryResult addExternalCostDataCollectionItem(AgreementCostDataCq externalCostDataCollectionItem) {
		this.externalCostDataCollection.add(externalCostDataCollectionItem);
		return this;
	}
	
	public List<AgreementCostDataCq> getExternalCostDataCollection() {
		return externalCostDataCollection;
	}
	
	public void setExternalCostDataCollection(List<AgreementCostDataCq> externalCostDataCollection) {
		this.externalCostDataCollection = externalCostDataCollection;
	}
}

