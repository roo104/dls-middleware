package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class ParameterSeriesIdCq implements Serializable {
	@JsonProperty("uniqueId")
	private String uniqueId = null;
	
	@JsonProperty("id")
	private String id = null;
	
	@JsonProperty("seriesSetId")
	private ParameterSeriesSetIdCq seriesSetId = null;
	
	
	public String getUniqueId() {
		return uniqueId;
	}
	
	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public ParameterSeriesSetIdCq getSeriesSetId() {
		return seriesSetId;
	}
	
	public void setSeriesSetId(ParameterSeriesSetIdCq seriesSetId) {
		this.seriesSetId = seriesSetId;
	}
}

