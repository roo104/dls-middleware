package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class EditFundDraftCommand implements Serializable {
	@JsonProperty("draftId")
	private FundVersionIdCq draftId = null;
	
	@JsonProperty("fundVersionDetailsCq")
	private FundVersionDetailsCq fundVersionDetailsCq = null;
	
	
	public FundVersionIdCq getDraftId() {
		return draftId;
	}
	
	public void setDraftId(FundVersionIdCq draftId) {
		this.draftId = draftId;
	}
	
	public FundVersionDetailsCq getFundVersionDetailsCq() {
		return fundVersionDetailsCq;
	}
	
	public void setFundVersionDetailsCq(FundVersionDetailsCq fundVersionDetailsCq) {
		this.fundVersionDetailsCq = fundVersionDetailsCq;
	}
}

