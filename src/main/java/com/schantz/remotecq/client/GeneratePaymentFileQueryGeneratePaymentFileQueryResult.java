package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class GeneratePaymentFileQueryGeneratePaymentFileQueryResult implements Serializable {
	@JsonProperty("receivableChannelTypeCq")
	private String receivableChannelTypeCq = null;
	
	
	public String getReceivableChannelTypeCq() {
		return receivableChannelTypeCq;
	}
	
	public void setReceivableChannelTypeCq(String receivableChannelTypeCq) {
		this.receivableChannelTypeCq = receivableChannelTypeCq;
	}
}

