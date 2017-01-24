package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class HealthEvaluationNeededEventCommand implements Serializable {
	@JsonProperty("eventInclusionUid")
	private String eventInclusionUid = null;
	
	@JsonProperty("eventCq")
	private HealthEvaluationNeededEventCq eventCq = null;
	
	
	public String getEventInclusionUid() {
		return eventInclusionUid;
	}
	
	public void setEventInclusionUid(String eventInclusionUid) {
		this.eventInclusionUid = eventInclusionUid;
	}
	
	public HealthEvaluationNeededEventCq getEventCq() {
		return eventCq;
	}
	
	public void setEventCq(HealthEvaluationNeededEventCq eventCq) {
		this.eventCq = eventCq;
	}
}

