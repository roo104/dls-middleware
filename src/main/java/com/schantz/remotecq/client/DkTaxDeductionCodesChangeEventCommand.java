package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class DkTaxDeductionCodesChangeEventCommand implements Serializable {
	@JsonProperty("eventInclusionUid")
	private String eventInclusionUid = null;
	
	@JsonProperty("eventCq")
	private DkTaxDeductionCodesChangeEventCq eventCq = null;
	
	
	public String getEventInclusionUid() {
		return eventInclusionUid;
	}
	
	public void setEventInclusionUid(String eventInclusionUid) {
		this.eventInclusionUid = eventInclusionUid;
	}
	
	public DkTaxDeductionCodesChangeEventCq getEventCq() {
		return eventCq;
	}
	
	public void setEventCq(DkTaxDeductionCodesChangeEventCq eventCq) {
		this.eventCq = eventCq;
	}
}

