package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class SaveClaimTreatmentTypeCommand implements Serializable {
	@JsonProperty("claimTreatmentTypeCq")
	private ClaimTreatmentTypeCq claimTreatmentTypeCq = null;
	
	
	public ClaimTreatmentTypeCq getClaimTreatmentTypeCq() {
		return claimTreatmentTypeCq;
	}
	
	public void setClaimTreatmentTypeCq(ClaimTreatmentTypeCq claimTreatmentTypeCq) {
		this.claimTreatmentTypeCq = claimTreatmentTypeCq;
	}
}

