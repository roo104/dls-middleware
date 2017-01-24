package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class ParameterSeriesQueryParameterSeriesQueryResult implements Serializable {
	@JsonProperty("seriesId")
	private ParameterSeriesIdCq seriesId = null;
	
	
	public ParameterSeriesIdCq getSeriesId() {
		return seriesId;
	}
	
	public void setSeriesId(ParameterSeriesIdCq seriesId) {
		this.seriesId = seriesId;
	}
}

