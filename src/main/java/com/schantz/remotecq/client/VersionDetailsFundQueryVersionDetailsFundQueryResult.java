package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class VersionDetailsFundQueryVersionDetailsFundQueryResult implements Serializable {
	@JsonProperty("fundVersionId")
	private FundVersionIdCq fundVersionId = null;
	
	
	public FundVersionIdCq getFundVersionId() {
		return fundVersionId;
	}
	
	public void setFundVersionId(FundVersionIdCq fundVersionId) {
		this.fundVersionId = fundVersionId;
	}
}

