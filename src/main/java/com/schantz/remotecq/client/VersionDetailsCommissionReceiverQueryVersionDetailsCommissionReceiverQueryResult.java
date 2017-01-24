package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class VersionDetailsCommissionReceiverQueryVersionDetailsCommissionReceiverQueryResult implements Serializable {
	@JsonProperty("commissionReceiverVersionIdCq")
	private CommissionReceiverVersionIdCq commissionReceiverVersionIdCq = null;
	
	@JsonProperty("commissionReceiverIdCq")
	private CommissionReceiverIdCq commissionReceiverIdCq = null;
	
	
	public CommissionReceiverVersionIdCq getCommissionReceiverVersionIdCq() {
		return commissionReceiverVersionIdCq;
	}
	
	public void setCommissionReceiverVersionIdCq(CommissionReceiverVersionIdCq commissionReceiverVersionIdCq) {
		this.commissionReceiverVersionIdCq = commissionReceiverVersionIdCq;
	}
	
	public CommissionReceiverIdCq getCommissionReceiverIdCq() {
		return commissionReceiverIdCq;
	}
	
	public void setCommissionReceiverIdCq(CommissionReceiverIdCq commissionReceiverIdCq) {
		this.commissionReceiverIdCq = commissionReceiverIdCq;
	}
}

