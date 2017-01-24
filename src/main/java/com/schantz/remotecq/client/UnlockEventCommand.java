package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class UnlockEventCommand implements Serializable {
	@JsonProperty("eventInclusionUid")
	private String eventInclusionUid = null;
	
	
	public String getEventInclusionUid() {
		return eventInclusionUid;
	}
	
	public void setEventInclusionUid(String eventInclusionUid) {
		this.eventInclusionUid = eventInclusionUid;
	}
}

