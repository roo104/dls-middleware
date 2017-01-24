package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class DeleteDraftRiskBonusGroupCommand implements Serializable {
	@JsonProperty("riskBonusGroupVersionIdCq")
	private RiskBonusGroupVersionIdCq riskBonusGroupVersionIdCq = null;
	
	
	public RiskBonusGroupVersionIdCq getRiskBonusGroupVersionIdCq() {
		return riskBonusGroupVersionIdCq;
	}
	
	public void setRiskBonusGroupVersionIdCq(RiskBonusGroupVersionIdCq riskBonusGroupVersionIdCq) {
		this.riskBonusGroupVersionIdCq = riskBonusGroupVersionIdCq;
	}
}

