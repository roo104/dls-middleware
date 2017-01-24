package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class PolicyRelationSearchQueryResultDataCq implements Serializable {
	@JsonProperty("policySearchEntry")
	private PolicySearchEntry policySearchEntry = null;
	
	@JsonProperty("currentHoldsCollection")
	private List<OnHoldCq> currentHoldsCollection = new ArrayList<OnHoldCq>();
	
	
	public PolicySearchEntry getPolicySearchEntry() {
		return policySearchEntry;
	}
	
	public void setPolicySearchEntry(PolicySearchEntry policySearchEntry) {
		this.policySearchEntry = policySearchEntry;
	}
	
	public PolicyRelationSearchQueryResultDataCq addCurrentHoldsCollectionItem(OnHoldCq currentHoldsCollectionItem) {
		this.currentHoldsCollection.add(currentHoldsCollectionItem);
		return this;
	}
	
	public List<OnHoldCq> getCurrentHoldsCollection() {
		return currentHoldsCollection;
	}
	
	public void setCurrentHoldsCollection(List<OnHoldCq> currentHoldsCollection) {
		this.currentHoldsCollection = currentHoldsCollection;
	}
}

