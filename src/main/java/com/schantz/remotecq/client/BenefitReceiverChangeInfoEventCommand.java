package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class BenefitReceiverChangeInfoEventCommand implements Serializable {
	@JsonProperty("eventInclusionUid")
	private String eventInclusionUid = null;
	
	@JsonProperty("eventCq")
	private BenefitReceiverChangeInfoEventCq eventCq = null;
	
	
	public String getEventInclusionUid() {
		return eventInclusionUid;
	}
	
	public void setEventInclusionUid(String eventInclusionUid) {
		this.eventInclusionUid = eventInclusionUid;
	}
	
	public BenefitReceiverChangeInfoEventCq getEventCq() {
		return eventCq;
	}
	
	public void setEventCq(BenefitReceiverChangeInfoEventCq eventCq) {
		this.eventCq = eventCq;
	}
}

