package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class PolicyQuotePortfolioQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("policyQuotePortfolioDataCqCollection")
	private List<PolicyQuotePortfolioDataCq> policyQuotePortfolioDataCqCollection = new ArrayList<PolicyQuotePortfolioDataCq>();
	
	public PolicyQuotePortfolioQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public PolicyQuotePortfolioQueryResult addPolicyQuotePortfolioDataCqCollectionItem(PolicyQuotePortfolioDataCq policyQuotePortfolioDataCqCollectionItem) {
		this.policyQuotePortfolioDataCqCollection.add(policyQuotePortfolioDataCqCollectionItem);
		return this;
	}
	
	public List<PolicyQuotePortfolioDataCq> getPolicyQuotePortfolioDataCqCollection() {
		return policyQuotePortfolioDataCqCollection;
	}
	
	public void setPolicyQuotePortfolioDataCqCollection(List<PolicyQuotePortfolioDataCq> policyQuotePortfolioDataCqCollection) {
		this.policyQuotePortfolioDataCqCollection = policyQuotePortfolioDataCqCollection;
	}
}

