package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class AcceptCommissionRefundDraftCommand implements Serializable {
	@JsonProperty("draftId")
	private CommissionRefundRuleVersionIdCq draftId = null;
	
	
	public CommissionRefundRuleVersionIdCq getDraftId() {
		return draftId;
	}
	
	public void setDraftId(CommissionRefundRuleVersionIdCq draftId) {
		this.draftId = draftId;
	}
}

