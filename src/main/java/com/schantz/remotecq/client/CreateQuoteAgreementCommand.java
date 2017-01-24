package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class CreateQuoteAgreementCommand implements Serializable {
	@JsonProperty("qouteName")
	private String qouteName = null;
	
	@JsonProperty("draftId")
	private AgreementVersionIdCq draftId = null;
	
	@JsonProperty("markMeAsCancelled")
	private AgreementVersionIdCq markMeAsCancelled = null;
	
	
	public String getQouteName() {
		return qouteName;
	}
	
	public void setQouteName(String qouteName) {
		this.qouteName = qouteName;
	}
	
	public AgreementVersionIdCq getDraftId() {
		return draftId;
	}
	
	public void setDraftId(AgreementVersionIdCq draftId) {
		this.draftId = draftId;
	}
	
	public AgreementVersionIdCq getMarkMeAsCancelled() {
		return markMeAsCancelled;
	}
	
	public void setMarkMeAsCancelled(AgreementVersionIdCq markMeAsCancelled) {
		this.markMeAsCancelled = markMeAsCancelled;
	}
}

