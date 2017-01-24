package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class ChangeContributionEventCommand implements Serializable {
	@JsonProperty("eventInclusionUid")
	private String eventInclusionUid = null;
	
	@JsonProperty("eventCq")
	private ChangeContributionEventCq eventCq = null;
	
	@JsonProperty("quoteIdCq")
	private QuoteIdCq quoteIdCq = null;
	
	
	public String getEventInclusionUid() {
		return eventInclusionUid;
	}
	
	public void setEventInclusionUid(String eventInclusionUid) {
		this.eventInclusionUid = eventInclusionUid;
	}
	
	public ChangeContributionEventCq getEventCq() {
		return eventCq;
	}
	
	public void setEventCq(ChangeContributionEventCq eventCq) {
		this.eventCq = eventCq;
	}
	
	public QuoteIdCq getQuoteIdCq() {
		return quoteIdCq;
	}
	
	public void setQuoteIdCq(QuoteIdCq quoteIdCq) {
		this.quoteIdCq = quoteIdCq;
	}
}

