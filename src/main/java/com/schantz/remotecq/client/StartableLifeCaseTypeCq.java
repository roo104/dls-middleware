package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class StartableLifeCaseTypeCq implements Serializable {
	@JsonProperty("lifeCaseTypeCq")
	private String lifeCaseTypeCq = null;
	
	@JsonProperty("configurationFieldCqCollection")
	private List<ConfigurationFieldCq> configurationFieldCqCollection = new ArrayList<ConfigurationFieldCq>();
	
	
	public String getLifeCaseTypeCq() {
		return lifeCaseTypeCq;
	}
	
	public void setLifeCaseTypeCq(String lifeCaseTypeCq) {
		this.lifeCaseTypeCq = lifeCaseTypeCq;
	}
	
	public StartableLifeCaseTypeCq addConfigurationFieldCqCollectionItem(ConfigurationFieldCq configurationFieldCqCollectionItem) {
		this.configurationFieldCqCollection.add(configurationFieldCqCollectionItem);
		return this;
	}
	
	public List<ConfigurationFieldCq> getConfigurationFieldCqCollection() {
		return configurationFieldCqCollection;
	}
	
	public void setConfigurationFieldCqCollection(List<ConfigurationFieldCq> configurationFieldCqCollection) {
		this.configurationFieldCqCollection = configurationFieldCqCollection;
	}
}

