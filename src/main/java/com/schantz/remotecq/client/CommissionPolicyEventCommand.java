package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class CommissionPolicyEventCommand implements Serializable {
	@JsonProperty("eventInclusionUid")
	private String eventInclusionUid = null;
	
	@JsonProperty("eventCq")
	private CommissionPolicyEventCq eventCq = null;
	
	
	public String getEventInclusionUid() {
		return eventInclusionUid;
	}
	
	public void setEventInclusionUid(String eventInclusionUid) {
		this.eventInclusionUid = eventInclusionUid;
	}
	
	public CommissionPolicyEventCq getEventCq() {
		return eventCq;
	}
	
	public void setEventCq(CommissionPolicyEventCq eventCq) {
		this.eventCq = eventCq;
	}
}

