package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class AmountFrameCqObject implements Serializable {
	@JsonProperty("frameId")
	private String frameId = null;
	
	@JsonProperty("stepCollection")
	private List<Object> stepCollection = new ArrayList<Object>();
	
	@JsonProperty("amountFrameTypeCq")
	private String amountFrameTypeCq = null;
	
	@JsonProperty("amountFrameStepTypeCq")
	private String amountFrameStepTypeCq = null;
	
	@JsonProperty("isFixedPrimaryFrame")
	private Boolean isFixedPrimaryFrame = false;
	
	@JsonProperty("isMandatory")
	private Boolean isMandatory = false;
	
	
	public String getFrameId() {
		return frameId;
	}
	
	public void setFrameId(String frameId) {
		this.frameId = frameId;
	}
	
	public AmountFrameCqObject addStepCollectionItem(Object stepCollectionItem) {
		this.stepCollection.add(stepCollectionItem);
		return this;
	}
	
	public List<Object> getStepCollection() {
		return stepCollection;
	}
	
	public void setStepCollection(List<Object> stepCollection) {
		this.stepCollection = stepCollection;
	}
	
	public String getAmountFrameTypeCq() {
		return amountFrameTypeCq;
	}
	
	public void setAmountFrameTypeCq(String amountFrameTypeCq) {
		this.amountFrameTypeCq = amountFrameTypeCq;
	}
	
	public String getAmountFrameStepTypeCq() {
		return amountFrameStepTypeCq;
	}
	
	public void setAmountFrameStepTypeCq(String amountFrameStepTypeCq) {
		this.amountFrameStepTypeCq = amountFrameStepTypeCq;
	}
	
	public Boolean getIsFixedPrimaryFrame() {
		return isFixedPrimaryFrame;
	}
	
	public void setIsFixedPrimaryFrame(Boolean isFixedPrimaryFrame) {
		this.isFixedPrimaryFrame = isFixedPrimaryFrame;
	}
	
	public Boolean getIsMandatory() {
		return isMandatory;
	}
	
	public void setIsMandatory(Boolean isMandatory) {
		this.isMandatory = isMandatory;
	}
}

