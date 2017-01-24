package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class ClaimGrantDisabilityDetailsQueryClaimGrantDisabilityDetailsQueryResult implements Serializable {
	@JsonProperty("claimVersionIdCq")
	private ClaimVersionIdCq claimVersionIdCq = null;
	
	@JsonProperty("isIncludeQuote")
	private Boolean isIncludeQuote = false;
	
	
	public ClaimVersionIdCq getClaimVersionIdCq() {
		return claimVersionIdCq;
	}
	
	public void setClaimVersionIdCq(ClaimVersionIdCq claimVersionIdCq) {
		this.claimVersionIdCq = claimVersionIdCq;
	}
	
	public Boolean getIsIncludeQuote() {
		return isIncludeQuote;
	}
	
	public void setIsIncludeQuote(Boolean isIncludeQuote) {
		this.isIncludeQuote = isIncludeQuote;
	}
}

