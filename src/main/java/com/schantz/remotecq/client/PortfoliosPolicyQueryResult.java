package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class PortfoliosPolicyQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("portfolioEntryCqCollection")
	private List<PortfolioEntryCq> portfolioEntryCqCollection = new ArrayList<PortfolioEntryCq>();
	
	public PortfoliosPolicyQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public PortfoliosPolicyQueryResult addPortfolioEntryCqCollectionItem(PortfolioEntryCq portfolioEntryCqCollectionItem) {
		this.portfolioEntryCqCollection.add(portfolioEntryCqCollectionItem);
		return this;
	}
	
	public List<PortfolioEntryCq> getPortfolioEntryCqCollection() {
		return portfolioEntryCqCollection;
	}
	
	public void setPortfolioEntryCqCollection(List<PortfolioEntryCq> portfolioEntryCqCollection) {
		this.portfolioEntryCqCollection = portfolioEntryCqCollection;
	}
}

