package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class LifePolicyStatusFrameCq implements Serializable {
	@JsonProperty("frameId")
	private String frameId = null;
	
	@JsonProperty("defaultOption")
	private String defaultOption = null;
	
	@JsonProperty("optionCollection")
	private List<String> optionCollection = new ArrayList<String>();
	
	@JsonProperty("isAllowEmpty")
	private Boolean isAllowEmpty = false;
	
	@JsonProperty("isMandatory")
	private Boolean isMandatory = false;
	
	
	public String getFrameId() {
		return frameId;
	}
	
	public void setFrameId(String frameId) {
		this.frameId = frameId;
	}
	
	public String getDefaultOption() {
		return defaultOption;
	}
	
	public void setDefaultOption(String defaultOption) {
		this.defaultOption = defaultOption;
	}
	
	public LifePolicyStatusFrameCq addOptionCollectionItem(String optionCollectionItem) {
		this.optionCollection.add(optionCollectionItem);
		return this;
	}
	
	public List<String> getOptionCollection() {
		return optionCollection;
	}
	
	public void setOptionCollection(List<String> optionCollection) {
		this.optionCollection = optionCollection;
	}
	
	public Boolean getIsAllowEmpty() {
		return isAllowEmpty;
	}
	
	public void setIsAllowEmpty(Boolean isAllowEmpty) {
		this.isAllowEmpty = isAllowEmpty;
	}
	
	public Boolean getIsMandatory() {
		return isMandatory;
	}
	
	public void setIsMandatory(Boolean isMandatory) {
		this.isMandatory = isMandatory;
	}
}

