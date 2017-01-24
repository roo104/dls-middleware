package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class MoveContributorReceivableToWaitingCommand implements Serializable {
	@JsonProperty("contributorReceivableIdCq")
	private ContributorReceivableIdCq contributorReceivableIdCq = null;
	
	@JsonProperty("receivableOnHoldStatusCq")
	private String receivableOnHoldStatusCq = null;
	
	
	public ContributorReceivableIdCq getContributorReceivableIdCq() {
		return contributorReceivableIdCq;
	}
	
	public void setContributorReceivableIdCq(ContributorReceivableIdCq contributorReceivableIdCq) {
		this.contributorReceivableIdCq = contributorReceivableIdCq;
	}
	
	public String getReceivableOnHoldStatusCq() {
		return receivableOnHoldStatusCq;
	}
	
	public void setReceivableOnHoldStatusCq(String receivableOnHoldStatusCq) {
		this.receivableOnHoldStatusCq = receivableOnHoldStatusCq;
	}
}

