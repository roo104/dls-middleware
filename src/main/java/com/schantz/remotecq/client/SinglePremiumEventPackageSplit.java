package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class SinglePremiumEventPackageSplit implements Serializable {
	@JsonProperty("singlePremiumEventCoverSplitCollection")
	private List<SinglePremiumEventCoverSplit> singlePremiumEventCoverSplitCollection = new ArrayList<SinglePremiumEventCoverSplit>();
	
	@JsonProperty("policyPackageIdCq")
	private PolicyPackageIdCq policyPackageIdCq = null;
	
	public SinglePremiumEventPackageSplit addSinglePremiumEventCoverSplitCollectionItem(SinglePremiumEventCoverSplit singlePremiumEventCoverSplitCollectionItem) {
		this.singlePremiumEventCoverSplitCollection.add(singlePremiumEventCoverSplitCollectionItem);
		return this;
	}
	
	public List<SinglePremiumEventCoverSplit> getSinglePremiumEventCoverSplitCollection() {
		return singlePremiumEventCoverSplitCollection;
	}
	
	public void setSinglePremiumEventCoverSplitCollection(List<SinglePremiumEventCoverSplit> singlePremiumEventCoverSplitCollection) {
		this.singlePremiumEventCoverSplitCollection = singlePremiumEventCoverSplitCollection;
	}
	
	public PolicyPackageIdCq getPolicyPackageIdCq() {
		return policyPackageIdCq;
	}
	
	public void setPolicyPackageIdCq(PolicyPackageIdCq policyPackageIdCq) {
		this.policyPackageIdCq = policyPackageIdCq;
	}
}

