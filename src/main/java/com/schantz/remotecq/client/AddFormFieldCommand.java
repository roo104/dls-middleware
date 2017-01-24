package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class AddFormFieldCommand implements Serializable {
	@JsonProperty("fieldLabel")
	private String fieldLabel = null;
	
	@JsonProperty("fieldDataStoreKey")
	private String fieldDataStoreKey = null;
	
	@JsonProperty("fieldTypeCq")
	private String fieldTypeCq = null;
	
	@JsonProperty("configWfc2IdCq")
	private ConfigWfc2IdCq configWfc2IdCq = null;
	
	@JsonProperty("isRequired")
	private Boolean isRequired = false;
	
	
	public String getFieldLabel() {
		return fieldLabel;
	}
	
	public void setFieldLabel(String fieldLabel) {
		this.fieldLabel = fieldLabel;
	}
	
	public String getFieldDataStoreKey() {
		return fieldDataStoreKey;
	}
	
	public void setFieldDataStoreKey(String fieldDataStoreKey) {
		this.fieldDataStoreKey = fieldDataStoreKey;
	}
	
	public String getFieldTypeCq() {
		return fieldTypeCq;
	}
	
	public void setFieldTypeCq(String fieldTypeCq) {
		this.fieldTypeCq = fieldTypeCq;
	}
	
	public ConfigWfc2IdCq getConfigWfc2IdCq() {
		return configWfc2IdCq;
	}
	
	public void setConfigWfc2IdCq(ConfigWfc2IdCq configWfc2IdCq) {
		this.configWfc2IdCq = configWfc2IdCq;
	}
	
	public Boolean getIsRequired() {
		return isRequired;
	}
	
	public void setIsRequired(Boolean isRequired) {
		this.isRequired = isRequired;
	}
}

