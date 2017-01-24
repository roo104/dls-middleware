package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class ActualSplitPortfolioQueryActualSplitPortfolioQueryResult implements Serializable {
	@JsonProperty("viewAtTime")
	private OffsetDateTime viewAtTime = null;
	
	@JsonProperty("portfolioIdCollection")
	private List<PortfolioIdCq> portfolioIdCollection = new ArrayList<PortfolioIdCq>();
	
	
	public OffsetDateTime getViewAtTime() {
		return viewAtTime;
	}
	
	public void setViewAtTime(OffsetDateTime viewAtTime) {
		this.viewAtTime = viewAtTime;
	}
	
	public ActualSplitPortfolioQueryActualSplitPortfolioQueryResult addPortfolioIdCollectionItem(PortfolioIdCq portfolioIdCollectionItem) {
		this.portfolioIdCollection.add(portfolioIdCollectionItem);
		return this;
	}
	
	public List<PortfolioIdCq> getPortfolioIdCollection() {
		return portfolioIdCollection;
	}
	
	public void setPortfolioIdCollection(List<PortfolioIdCq> portfolioIdCollection) {
		this.portfolioIdCollection = portfolioIdCollection;
	}
}

