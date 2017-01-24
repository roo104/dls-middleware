package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class FundVersionIdCq implements Serializable {
	@JsonProperty("uniqueId")
	private String uniqueId = null;
	
	@JsonProperty("fundIdCq")
	private FundIdCq fundIdCq = null;
	
	
	public String getUniqueId() {
		return uniqueId;
	}
	
	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}
	
	public FundIdCq getFundIdCq() {
		return fundIdCq;
	}
	
	public void setFundIdCq(FundIdCq fundIdCq) {
		this.fundIdCq = fundIdCq;
	}
}

