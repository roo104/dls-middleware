package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class ClaimModuleSelectionFrameCq implements Serializable {
	@JsonProperty("frameId")
	private String frameId = null;
	
	@JsonProperty("defaultOption")
	private ClaimModuleIdCq defaultOption = null;
	
	@JsonProperty("optionCollection")
	private List<ClaimModuleIdCq> optionCollection = new ArrayList<ClaimModuleIdCq>();
	
	@JsonProperty("extraFrameCollection")
	private List<ClaimModuleIdCq> extraFrameCollection = new ArrayList<ClaimModuleIdCq>();
	
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
	
	public ClaimModuleIdCq getDefaultOption() {
		return defaultOption;
	}
	
	public void setDefaultOption(ClaimModuleIdCq defaultOption) {
		this.defaultOption = defaultOption;
	}
	
	public ClaimModuleSelectionFrameCq addOptionCollectionItem(ClaimModuleIdCq optionCollectionItem) {
		this.optionCollection.add(optionCollectionItem);
		return this;
	}
	
	public List<ClaimModuleIdCq> getOptionCollection() {
		return optionCollection;
	}
	
	public void setOptionCollection(List<ClaimModuleIdCq> optionCollection) {
		this.optionCollection = optionCollection;
	}
	
	public ClaimModuleSelectionFrameCq addExtraFrameCollectionItem(ClaimModuleIdCq extraFrameCollectionItem) {
		this.extraFrameCollection.add(extraFrameCollectionItem);
		return this;
	}
	
	public List<ClaimModuleIdCq> getExtraFrameCollection() {
		return extraFrameCollection;
	}
	
	public void setExtraFrameCollection(List<ClaimModuleIdCq> extraFrameCollection) {
		this.extraFrameCollection = extraFrameCollection;
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

