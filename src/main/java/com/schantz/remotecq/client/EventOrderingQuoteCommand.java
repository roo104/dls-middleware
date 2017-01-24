package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class EventOrderingQuoteCommand implements Serializable {
	@JsonProperty("quoteId")
	private QuoteIdCq quoteId = null;
	
	@JsonProperty("inclusionGroup")
	private EventInclusionGroupCq inclusionGroup = null;
	
	
	public QuoteIdCq getQuoteId() {
		return quoteId;
	}
	
	public void setQuoteId(QuoteIdCq quoteId) {
		this.quoteId = quoteId;
	}
	
	public EventInclusionGroupCq getInclusionGroup() {
		return inclusionGroup;
	}
	
	public void setInclusionGroup(EventInclusionGroupCq inclusionGroup) {
		this.inclusionGroup = inclusionGroup;
	}
}

