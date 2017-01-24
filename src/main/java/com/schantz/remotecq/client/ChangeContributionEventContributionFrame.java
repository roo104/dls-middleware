package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class ChangeContributionEventContributionFrame implements Serializable {
	@JsonProperty("contributerTypeCq")
	private String contributerTypeCq = null;
	
	@JsonProperty("amountFrameEntryCq")
	private AmountFrameEntryCq amountFrameEntryCq = null;
	
	
	public String getContributerTypeCq() {
		return contributerTypeCq;
	}
	
	public void setContributerTypeCq(String contributerTypeCq) {
		this.contributerTypeCq = contributerTypeCq;
	}
	
	public AmountFrameEntryCq getAmountFrameEntryCq() {
		return amountFrameEntryCq;
	}
	
	public void setAmountFrameEntryCq(AmountFrameEntryCq amountFrameEntryCq) {
		this.amountFrameEntryCq = amountFrameEntryCq;
	}
}

