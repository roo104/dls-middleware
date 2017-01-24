package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class PortfolioRuleFramesUlOwnerQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("portfolioRuleFrameVersionCqCollection")
	private List<PortfolioRuleFrameVersionCq> portfolioRuleFrameVersionCqCollection = new ArrayList<PortfolioRuleFrameVersionCq>();
	
	public PortfolioRuleFramesUlOwnerQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public PortfolioRuleFramesUlOwnerQueryResult addPortfolioRuleFrameVersionCqCollectionItem(PortfolioRuleFrameVersionCq portfolioRuleFrameVersionCqCollectionItem) {
		this.portfolioRuleFrameVersionCqCollection.add(portfolioRuleFrameVersionCqCollectionItem);
		return this;
	}
	
	public List<PortfolioRuleFrameVersionCq> getPortfolioRuleFrameVersionCqCollection() {
		return portfolioRuleFrameVersionCqCollection;
	}
	
	public void setPortfolioRuleFrameVersionCqCollection(List<PortfolioRuleFrameVersionCq> portfolioRuleFrameVersionCqCollection) {
		this.portfolioRuleFrameVersionCqCollection = portfolioRuleFrameVersionCqCollection;
	}
}

