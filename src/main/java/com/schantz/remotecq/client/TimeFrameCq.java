package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class TimeFrameCq implements Serializable {
	@JsonProperty("frameId")
	private String frameId = null;
	
	@JsonProperty("frame")
	private LongFrameCq frame = null;
	
	@JsonProperty("frameMagicUnresolved")
	private LongFrameCq frameMagicUnresolved = null;
	
	@JsonProperty("periodLength")
	private String periodLength = null;
	
	@JsonProperty("isMandatory")
	private Boolean isMandatory = false;
	
	
	public String getFrameId() {
		return frameId;
	}
	
	public void setFrameId(String frameId) {
		this.frameId = frameId;
	}
	
	public LongFrameCq getFrame() {
		return frame;
	}
	
	public void setFrame(LongFrameCq frame) {
		this.frame = frame;
	}
	
	public LongFrameCq getFrameMagicUnresolved() {
		return frameMagicUnresolved;
	}
	
	public void setFrameMagicUnresolved(LongFrameCq frameMagicUnresolved) {
		this.frameMagicUnresolved = frameMagicUnresolved;
	}
	
	public String getPeriodLength() {
		return periodLength;
	}
	
	public void setPeriodLength(String periodLength) {
		this.periodLength = periodLength;
	}
	
	public Boolean getIsMandatory() {
		return isMandatory;
	}
	
	public void setIsMandatory(Boolean isMandatory) {
		this.isMandatory = isMandatory;
	}
}

