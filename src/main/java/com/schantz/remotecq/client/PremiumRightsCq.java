package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class PremiumRightsCq implements Serializable {
	@JsonProperty("premiumRights")
	private Double premiumRights = null;
	
	@JsonProperty("lockedInterest")
	private Double lockedInterest = null;
	
	
	public Double getPremiumRights() {
		return premiumRights;
	}
	
	public void setPremiumRights(Double premiumRights) {
		this.premiumRights = premiumRights;
	}
	
	public Double getLockedInterest() {
		return lockedInterest;
	}
	
	public void setLockedInterest(Double lockedInterest) {
		this.lockedInterest = lockedInterest;
	}
}

