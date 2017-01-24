package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class CommissionReceiverSearchEntryCq implements Serializable {
	@JsonProperty("commissionReceiverVersionDetailsCq")
	private CommissionReceiverVersionDetailsCq commissionReceiverVersionDetailsCq = null;
	
	
	public CommissionReceiverVersionDetailsCq getCommissionReceiverVersionDetailsCq() {
		return commissionReceiverVersionDetailsCq;
	}
	
	public void setCommissionReceiverVersionDetailsCq(CommissionReceiverVersionDetailsCq commissionReceiverVersionDetailsCq) {
		this.commissionReceiverVersionDetailsCq = commissionReceiverVersionDetailsCq;
	}
}

