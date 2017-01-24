package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class ParameterSeriesSetQueryParameterSeriesSetQueryResult implements Serializable {
	@JsonProperty("seriesSetId")
	private ParameterSeriesSetIdCq seriesSetId = null;
	
	
	public ParameterSeriesSetIdCq getSeriesSetId() {
		return seriesSetId;
	}
	
	public void setSeriesSetId(ParameterSeriesSetIdCq seriesSetId) {
		this.seriesSetId = seriesSetId;
	}
}

