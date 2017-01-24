package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class StandardPartnerFromTreatmentProductSearchQueryStandardPartnerFromTreatmentProductSearchQueryResult implements Serializable {
	@JsonProperty("claimProductIdCq")
	private ClaimProductIdCq claimProductIdCq = null;
	
	
	public ClaimProductIdCq getClaimProductIdCq() {
		return claimProductIdCq;
	}
	
	public void setClaimProductIdCq(ClaimProductIdCq claimProductIdCq) {
		this.claimProductIdCq = claimProductIdCq;
	}
}

