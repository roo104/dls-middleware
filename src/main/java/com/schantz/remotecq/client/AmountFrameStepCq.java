package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class AmountFrameStepCq implements Serializable {
	@JsonProperty("stepIdAlsoInAParent")
	private Boolean stepIdAlsoInAParent = false;
	
	@JsonProperty("amountFrameEntryCq")
	private AmountFrameEntryCq amountFrameEntryCq = null;
	
	@JsonProperty("isDeselectedStep")
	private Boolean isDeselectedStep = false;
	
	@JsonProperty("isDefaultStep")
	private Boolean isDefaultStep = false;
	
	
	public Boolean getStepIdAlsoInAParent() {
		return stepIdAlsoInAParent;
	}
	
	public void setStepIdAlsoInAParent(Boolean stepIdAlsoInAParent) {
		this.stepIdAlsoInAParent = stepIdAlsoInAParent;
	}
	
	public AmountFrameEntryCq getAmountFrameEntryCq() {
		return amountFrameEntryCq;
	}
	
	public void setAmountFrameEntryCq(AmountFrameEntryCq amountFrameEntryCq) {
		this.amountFrameEntryCq = amountFrameEntryCq;
	}
	
	public Boolean getIsDeselectedStep() {
		return isDeselectedStep;
	}
	
	public void setIsDeselectedStep(Boolean isDeselectedStep) {
		this.isDeselectedStep = isDeselectedStep;
	}
	
	public Boolean getIsDefaultStep() {
		return isDefaultStep;
	}
	
	public void setIsDefaultStep(Boolean isDefaultStep) {
		this.isDefaultStep = isDefaultStep;
	}
}

