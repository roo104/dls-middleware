package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class BatchParameterMetaData implements Serializable {
	@JsonProperty("description")
	private String description = null;
	
	@JsonProperty("isOptional")
	private Boolean isOptional = false;
	
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Boolean getIsOptional() {
		return isOptional;
	}
	
	public void setIsOptional(Boolean isOptional) {
		this.isOptional = isOptional;
	}
}

