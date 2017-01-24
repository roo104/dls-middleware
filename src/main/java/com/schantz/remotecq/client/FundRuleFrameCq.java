package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class FundRuleFrameCq implements Serializable {
	@JsonProperty("defaultPct")
	private Double defaultPct = null;
	
	@JsonProperty("minPct")
	private Double minPct = null;
	
	@JsonProperty("maxPct")
	private Double maxPct = null;
	
	@JsonProperty("fundId")
	private FundIdCq fundId = null;
	
	@JsonProperty("viewAtFundDataVersion")
	private FundDataVersionCq viewAtFundDataVersion = null;
	
	@JsonProperty("fundDataVersionCqCollection")
	private List<FundDataVersionCq> fundDataVersionCqCollection = new ArrayList<FundDataVersionCq>();
	
	
	public Double getDefaultPct() {
		return defaultPct;
	}
	
	public void setDefaultPct(Double defaultPct) {
		this.defaultPct = defaultPct;
	}
	
	public Double getMinPct() {
		return minPct;
	}
	
	public void setMinPct(Double minPct) {
		this.minPct = minPct;
	}
	
	public Double getMaxPct() {
		return maxPct;
	}
	
	public void setMaxPct(Double maxPct) {
		this.maxPct = maxPct;
	}
	
	public FundIdCq getFundId() {
		return fundId;
	}
	
	public void setFundId(FundIdCq fundId) {
		this.fundId = fundId;
	}
	
	public FundDataVersionCq getViewAtFundDataVersion() {
		return viewAtFundDataVersion;
	}
	
	public void setViewAtFundDataVersion(FundDataVersionCq viewAtFundDataVersion) {
		this.viewAtFundDataVersion = viewAtFundDataVersion;
	}
	
	public FundRuleFrameCq addFundDataVersionCqCollectionItem(FundDataVersionCq fundDataVersionCqCollectionItem) {
		this.fundDataVersionCqCollection.add(fundDataVersionCqCollectionItem);
		return this;
	}
	
	public List<FundDataVersionCq> getFundDataVersionCqCollection() {
		return fundDataVersionCqCollection;
	}
	
	public void setFundDataVersionCqCollection(List<FundDataVersionCq> fundDataVersionCqCollection) {
		this.fundDataVersionCqCollection = fundDataVersionCqCollection;
	}
}

