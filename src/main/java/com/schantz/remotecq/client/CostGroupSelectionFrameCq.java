package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class CostGroupSelectionFrameCq implements Serializable {
	@JsonProperty("frameId")
	private String frameId = null;
	
	@JsonProperty("defaultOption")
	private CostGroupIdCq defaultOption = null;
	
	@JsonProperty("optionCollection")
	private List<CostGroupIdCq> optionCollection = new ArrayList<CostGroupIdCq>();
	
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
	
	public CostGroupIdCq getDefaultOption() {
		return defaultOption;
	}
	
	public void setDefaultOption(CostGroupIdCq defaultOption) {
		this.defaultOption = defaultOption;
	}
	
	public CostGroupSelectionFrameCq addOptionCollectionItem(CostGroupIdCq optionCollectionItem) {
		this.optionCollection.add(optionCollectionItem);
		return this;
	}
	
	public List<CostGroupIdCq> getOptionCollection() {
		return optionCollection;
	}
	
	public void setOptionCollection(List<CostGroupIdCq> optionCollection) {
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

