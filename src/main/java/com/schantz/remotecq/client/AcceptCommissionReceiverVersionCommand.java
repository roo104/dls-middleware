package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class AcceptCommissionReceiverVersionCommand implements Serializable {
	@JsonProperty("draftId")
	private CommissionReceiverVersionIdCq draftId = null;
	
	
	public CommissionReceiverVersionIdCq getDraftId() {
		return draftId;
	}
	
	public void setDraftId(CommissionReceiverVersionIdCq draftId) {
		this.draftId = draftId;
	}
}

