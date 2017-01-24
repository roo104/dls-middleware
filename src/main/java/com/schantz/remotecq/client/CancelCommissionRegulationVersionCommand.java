package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class CancelCommissionRegulationVersionCommand implements Serializable {
	@JsonProperty("draftId")
	private CommissionRegulationVersionIdCq draftId = null;
	
	
	public CommissionRegulationVersionIdCq getDraftId() {
		return draftId;
	}
	
	public void setDraftId(CommissionRegulationVersionIdCq draftId) {
		this.draftId = draftId;
	}
}

