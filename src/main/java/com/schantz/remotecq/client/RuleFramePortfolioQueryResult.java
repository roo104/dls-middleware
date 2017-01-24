package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class RuleFramePortfolioQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("allowedPortfolioRuleFramesCollection")
	private List<PortfolioRuleFrameVersionCq> allowedPortfolioRuleFramesCollection = new ArrayList<PortfolioRuleFrameVersionCq>();
	
	@JsonProperty("selectedPortfolioRuleFrame")
	private PortfolioRuleFrameVersionCq selectedPortfolioRuleFrame = null;
	
	public RuleFramePortfolioQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public RuleFramePortfolioQueryResult addAllowedPortfolioRuleFramesCollectionItem(PortfolioRuleFrameVersionCq allowedPortfolioRuleFramesCollectionItem) {
		this.allowedPortfolioRuleFramesCollection.add(allowedPortfolioRuleFramesCollectionItem);
		return this;
	}
	
	public List<PortfolioRuleFrameVersionCq> getAllowedPortfolioRuleFramesCollection() {
		return allowedPortfolioRuleFramesCollection;
	}
	
	public void setAllowedPortfolioRuleFramesCollection(List<PortfolioRuleFrameVersionCq> allowedPortfolioRuleFramesCollection) {
		this.allowedPortfolioRuleFramesCollection = allowedPortfolioRuleFramesCollection;
	}
	
	public PortfolioRuleFrameVersionCq getSelectedPortfolioRuleFrame() {
		return selectedPortfolioRuleFrame;
	}
	
	public void setSelectedPortfolioRuleFrame(PortfolioRuleFrameVersionCq selectedPortfolioRuleFrame) {
		this.selectedPortfolioRuleFrame = selectedPortfolioRuleFrame;
	}
}

