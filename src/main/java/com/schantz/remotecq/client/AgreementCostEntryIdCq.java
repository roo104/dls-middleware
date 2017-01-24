package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class AgreementCostEntryIdCq implements Serializable {
	@JsonProperty("stepId")
	private String stepId = null;
	
	@JsonProperty("boundType")
	private String boundType = null;
	
	@JsonProperty("costId")
	private AgreementCostIdCq costId = null;
	
	
	public String getStepId() {
		return stepId;
	}
	
	public void setStepId(String stepId) {
		this.stepId = stepId;
	}
	
	public String getBoundType() {
		return boundType;
	}
	
	public void setBoundType(String boundType) {
		this.boundType = boundType;
	}
	
	public AgreementCostIdCq getCostId() {
		return costId;
	}
	
	public void setCostId(AgreementCostIdCq costId) {
		this.costId = costId;
	}
}

