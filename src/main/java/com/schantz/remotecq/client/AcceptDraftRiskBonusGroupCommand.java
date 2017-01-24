package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class AcceptDraftRiskBonusGroupCommand implements Serializable {
	@JsonProperty("draftId")
	private RiskBonusGroupVersionIdCq draftId = null;
	
	@JsonProperty("markMeAsCancelled")
	private RiskBonusGroupVersionIdCq markMeAsCancelled = null;
	
	
	public RiskBonusGroupVersionIdCq getDraftId() {
		return draftId;
	}
	
	public void setDraftId(RiskBonusGroupVersionIdCq draftId) {
		this.draftId = draftId;
	}
	
	public RiskBonusGroupVersionIdCq getMarkMeAsCancelled() {
		return markMeAsCancelled;
	}
	
	public void setMarkMeAsCancelled(RiskBonusGroupVersionIdCq markMeAsCancelled) {
		this.markMeAsCancelled = markMeAsCancelled;
	}
}

