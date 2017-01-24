package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class RuleFundCq implements Serializable {
	@JsonProperty("defaultPct")
	private Double defaultPct = null;
	
	@JsonProperty("minPct")
	private Double minPct = null;
	
	@JsonProperty("maxPct")
	private Double maxPct = null;
	
	@JsonProperty("selected")
	private Boolean selected = false;
	
	@JsonProperty("fundDetailsCq")
	private FundDetailsCq fundDetailsCq = null;
	
	
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
	
	public Boolean getSelected() {
		return selected;
	}
	
	public void setSelected(Boolean selected) {
		this.selected = selected;
	}
	
	public FundDetailsCq getFundDetailsCq() {
		return fundDetailsCq;
	}
	
	public void setFundDetailsCq(FundDetailsCq fundDetailsCq) {
		this.fundDetailsCq = fundDetailsCq;
	}
}

