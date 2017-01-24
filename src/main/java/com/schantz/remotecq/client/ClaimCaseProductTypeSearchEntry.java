package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class ClaimCaseProductTypeSearchEntry implements Serializable {
	@JsonProperty("claimProductTypeDataCqCollection")
	private List<ClaimProductTypeDataCq> claimProductTypeDataCqCollection = new ArrayList<ClaimProductTypeDataCq>();
	
	@JsonProperty("lifeCaseIdCq")
	private LifeCaseIdCq lifeCaseIdCq = null;
	
	public ClaimCaseProductTypeSearchEntry addClaimProductTypeDataCqCollectionItem(ClaimProductTypeDataCq claimProductTypeDataCqCollectionItem) {
		this.claimProductTypeDataCqCollection.add(claimProductTypeDataCqCollectionItem);
		return this;
	}
	
	public List<ClaimProductTypeDataCq> getClaimProductTypeDataCqCollection() {
		return claimProductTypeDataCqCollection;
	}
	
	public void setClaimProductTypeDataCqCollection(List<ClaimProductTypeDataCq> claimProductTypeDataCqCollection) {
		this.claimProductTypeDataCqCollection = claimProductTypeDataCqCollection;
	}
	
	public LifeCaseIdCq getLifeCaseIdCq() {
		return lifeCaseIdCq;
	}
	
	public void setLifeCaseIdCq(LifeCaseIdCq lifeCaseIdCq) {
		this.lifeCaseIdCq = lifeCaseIdCq;
	}
}

