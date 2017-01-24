package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class ManualPaymentAcceptCommand implements Serializable {
	@JsonProperty("receivableBatchIdCq")
	private ReceivableBatchIdCq receivableBatchIdCq = null;
	
	@JsonProperty("isAcceptPaymentSplit")
	private Boolean isAcceptPaymentSplit = false;
	
	
	public ReceivableBatchIdCq getReceivableBatchIdCq() {
		return receivableBatchIdCq;
	}
	
	public void setReceivableBatchIdCq(ReceivableBatchIdCq receivableBatchIdCq) {
		this.receivableBatchIdCq = receivableBatchIdCq;
	}
	
	public Boolean getIsAcceptPaymentSplit() {
		return isAcceptPaymentSplit;
	}
	
	public void setIsAcceptPaymentSplit(Boolean isAcceptPaymentSplit) {
		this.isAcceptPaymentSplit = isAcceptPaymentSplit;
	}
}

