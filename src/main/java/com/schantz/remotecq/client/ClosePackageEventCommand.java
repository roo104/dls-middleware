package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class ClosePackageEventCommand implements Serializable {
	@JsonProperty("eventInclusionUid")
	private String eventInclusionUid = null;
	
	@JsonProperty("eventCq")
	private ClosePackageEventCq eventCq = null;
	
	
	public String getEventInclusionUid() {
		return eventInclusionUid;
	}
	
	public void setEventInclusionUid(String eventInclusionUid) {
		this.eventInclusionUid = eventInclusionUid;
	}
	
	public ClosePackageEventCq getEventCq() {
		return eventCq;
	}
	
	public void setEventCq(ClosePackageEventCq eventCq) {
		this.eventCq = eventCq;
	}
}

