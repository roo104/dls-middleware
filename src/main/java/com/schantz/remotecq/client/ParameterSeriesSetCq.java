package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class ParameterSeriesSetCq implements Serializable {
	@JsonProperty("description")
	private String description = null;
	
	@JsonProperty("id")
	private ParameterSeriesSetIdCq id = null;
	
	@JsonProperty("type")
	private ParameterSeriesSetTypeCq type = null;
	
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public ParameterSeriesSetIdCq getId() {
		return id;
	}
	
	public void setId(ParameterSeriesSetIdCq id) {
		this.id = id;
	}
	
	public ParameterSeriesSetTypeCq getType() {
		return type;
	}
	
	public void setType(ParameterSeriesSetTypeCq type) {
		this.type = type;
	}
}

