package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class ChangeReserveEventCommand implements Serializable {
	@JsonProperty("eventInclusionUid")
	private String eventInclusionUid = null;
	
	@JsonProperty("eventCq")
	private ChangeReserveEventCq eventCq = null;
	
	
	public String getEventInclusionUid() {
		return eventInclusionUid;
	}
	
	public void setEventInclusionUid(String eventInclusionUid) {
		this.eventInclusionUid = eventInclusionUid;
	}
	
	public ChangeReserveEventCq getEventCq() {
		return eventCq;
	}
	
	public void setEventCq(ChangeReserveEventCq eventCq) {
		this.eventCq = eventCq;
	}
}

