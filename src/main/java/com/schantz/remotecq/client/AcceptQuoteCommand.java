package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class AcceptQuoteCommand implements Serializable {
	@JsonProperty("quoteId")
	private QuoteIdCq quoteId = null;
	
	
	public QuoteIdCq getQuoteId() {
		return quoteId;
	}
	
	public void setQuoteId(QuoteIdCq quoteId) {
		this.quoteId = quoteId;
	}
}

