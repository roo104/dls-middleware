package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class ConfigurationFieldTypeIdCq implements Serializable {
	@JsonProperty("fieldUid")
	private String fieldUid = null;
	
	@JsonProperty("fieldDataStoreKey")
	private String fieldDataStoreKey = null;
	
	@JsonProperty("configWfc2IdCq")
	private ConfigWfc2IdCq configWfc2IdCq = null;
	
	
	public String getFieldUid() {
		return fieldUid;
	}
	
	public void setFieldUid(String fieldUid) {
		this.fieldUid = fieldUid;
	}
	
	public String getFieldDataStoreKey() {
		return fieldDataStoreKey;
	}
	
	public void setFieldDataStoreKey(String fieldDataStoreKey) {
		this.fieldDataStoreKey = fieldDataStoreKey;
	}
	
	public ConfigWfc2IdCq getConfigWfc2IdCq() {
		return configWfc2IdCq;
	}
	
	public void setConfigWfc2IdCq(ConfigWfc2IdCq configWfc2IdCq) {
		this.configWfc2IdCq = configWfc2IdCq;
	}
}

