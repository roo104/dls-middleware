package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class DkUseWelfareAgreementEventCommand implements Serializable {
	@JsonProperty("eventInclusionUid")
	private String eventInclusionUid = null;
	
	@JsonProperty("eventCq")
	private DkUseWelfareAgreementEventCq eventCq = null;
	
	
	public String getEventInclusionUid() {
		return eventInclusionUid;
	}
	
	public void setEventInclusionUid(String eventInclusionUid) {
		this.eventInclusionUid = eventInclusionUid;
	}
	
	public DkUseWelfareAgreementEventCq getEventCq() {
		return eventCq;
	}
	
	public void setEventCq(DkUseWelfareAgreementEventCq eventCq) {
		this.eventCq = eventCq;
	}
}

