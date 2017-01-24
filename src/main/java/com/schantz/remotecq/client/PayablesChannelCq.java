package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class PayablesChannelCq implements Serializable {
	@JsonProperty("payablesChannelTypeCq")
	private String payablesChannelTypeCq = null;
	
	@JsonProperty("externalAccountRefCq")
	private ExternalAccountRefCq externalAccountRefCq = null;
	
	
	public String getPayablesChannelTypeCq() {
		return payablesChannelTypeCq;
	}
	
	public void setPayablesChannelTypeCq(String payablesChannelTypeCq) {
		this.payablesChannelTypeCq = payablesChannelTypeCq;
	}
	
	public ExternalAccountRefCq getExternalAccountRefCq() {
		return externalAccountRefCq;
	}
	
	public void setExternalAccountRefCq(ExternalAccountRefCq externalAccountRefCq) {
		this.externalAccountRefCq = externalAccountRefCq;
	}
}

