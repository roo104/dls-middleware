package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class StartWfc2Cq implements Serializable {
	@JsonProperty("forcedGridPositionX")
	private Long forcedGridPositionX = null;
	
	@JsonProperty("forcedGridPositionY")
	private Long forcedGridPositionY = null;
	
	@JsonProperty("configWfc2IdCq")
	private ConfigWfc2IdCq configWfc2IdCq = null;
	
	@JsonProperty("configurationFieldCqCollection")
	private List<ConfigurationFieldCq> configurationFieldCqCollection = new ArrayList<ConfigurationFieldCq>();
	
	@JsonProperty("manuallyStartable")
	private Boolean manuallyStartable = false;
	
	@JsonProperty("startsWhenDescription")
	private String startsWhenDescription = null;
	
	@JsonProperty("nextElement")
	private PathWfc2Cq nextElement = null;
	
	
	public Long getForcedGridPositionX() {
		return forcedGridPositionX;
	}
	
	public void setForcedGridPositionX(Long forcedGridPositionX) {
		this.forcedGridPositionX = forcedGridPositionX;
	}
	
	public Long getForcedGridPositionY() {
		return forcedGridPositionY;
	}
	
	public void setForcedGridPositionY(Long forcedGridPositionY) {
		this.forcedGridPositionY = forcedGridPositionY;
	}
	
	public ConfigWfc2IdCq getConfigWfc2IdCq() {
		return configWfc2IdCq;
	}
	
	public void setConfigWfc2IdCq(ConfigWfc2IdCq configWfc2IdCq) {
		this.configWfc2IdCq = configWfc2IdCq;
	}
	
	public StartWfc2Cq addConfigurationFieldCqCollectionItem(ConfigurationFieldCq configurationFieldCqCollectionItem) {
		this.configurationFieldCqCollection.add(configurationFieldCqCollectionItem);
		return this;
	}
	
	public List<ConfigurationFieldCq> getConfigurationFieldCqCollection() {
		return configurationFieldCqCollection;
	}
	
	public void setConfigurationFieldCqCollection(List<ConfigurationFieldCq> configurationFieldCqCollection) {
		this.configurationFieldCqCollection = configurationFieldCqCollection;
	}
	
	public Boolean getManuallyStartable() {
		return manuallyStartable;
	}
	
	public void setManuallyStartable(Boolean manuallyStartable) {
		this.manuallyStartable = manuallyStartable;
	}
	
	public String getStartsWhenDescription() {
		return startsWhenDescription;
	}
	
	public void setStartsWhenDescription(String startsWhenDescription) {
		this.startsWhenDescription = startsWhenDescription;
	}
	
	public PathWfc2Cq getNextElement() {
		return nextElement;
	}
	
	public void setNextElement(PathWfc2Cq nextElement) {
		this.nextElement = nextElement;
	}
}

