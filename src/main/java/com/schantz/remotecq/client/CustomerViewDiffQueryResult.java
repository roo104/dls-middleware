package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class CustomerViewDiffQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("diffDataCollection")
	private List<CustomerViewData> diffDataCollection = new ArrayList<CustomerViewData>();
	
	@JsonProperty("policyDataCollection")
	private List<CustomerViewData> policyDataCollection = new ArrayList<CustomerViewData>();
	
	public CustomerViewDiffQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public CustomerViewDiffQueryResult addDiffDataCollectionItem(CustomerViewData diffDataCollectionItem) {
		this.diffDataCollection.add(diffDataCollectionItem);
		return this;
	}
	
	public List<CustomerViewData> getDiffDataCollection() {
		return diffDataCollection;
	}
	
	public void setDiffDataCollection(List<CustomerViewData> diffDataCollection) {
		this.diffDataCollection = diffDataCollection;
	}
	
	public CustomerViewDiffQueryResult addPolicyDataCollectionItem(CustomerViewData policyDataCollectionItem) {
		this.policyDataCollection.add(policyDataCollectionItem);
		return this;
	}
	
	public List<CustomerViewData> getPolicyDataCollection() {
		return policyDataCollection;
	}
	
	public void setPolicyDataCollection(List<CustomerViewData> policyDataCollection) {
		this.policyDataCollection = policyDataCollection;
	}
}

