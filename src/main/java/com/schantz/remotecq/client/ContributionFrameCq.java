package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class ContributionFrameCq implements Serializable {
	@JsonProperty("contributerTypeCq")
	private String contributerTypeCq = null;
	
	@JsonProperty("amountFrameCq")
	private AmountFrameCqObject amountFrameCq = null;
	
	
	public String getContributerTypeCq() {
		return contributerTypeCq;
	}
	
	public void setContributerTypeCq(String contributerTypeCq) {
		this.contributerTypeCq = contributerTypeCq;
	}
	
	public AmountFrameCqObject getAmountFrameCq() {
		return amountFrameCq;
	}
	
	public void setAmountFrameCq(AmountFrameCqObject amountFrameCq) {
		this.amountFrameCq = amountFrameCq;
	}
}

