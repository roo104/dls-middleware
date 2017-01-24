package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class RetrieveAllClaimRelevantDisabilityCoversQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("policyIdCqCollection")
	private List<PolicyIdCq> policyIdCqCollection = new ArrayList<PolicyIdCq>();
	
	public RetrieveAllClaimRelevantDisabilityCoversQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public RetrieveAllClaimRelevantDisabilityCoversQueryResult addPolicyIdCqCollectionItem(PolicyIdCq policyIdCqCollectionItem) {
		this.policyIdCqCollection.add(policyIdCqCollectionItem);
		return this;
	}
	
	public List<PolicyIdCq> getPolicyIdCqCollection() {
		return policyIdCqCollection;
	}
	
	public void setPolicyIdCqCollection(List<PolicyIdCq> policyIdCqCollection) {
		this.policyIdCqCollection = policyIdCqCollection;
	}
}

