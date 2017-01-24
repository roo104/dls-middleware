package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class AcceptDraftPriceGroupCommand implements Serializable {
	@JsonProperty("draftId")
	private PriceGroupVersionIdCq draftId = null;
	
	@JsonProperty("markMeAsCancelled")
	private PriceGroupVersionIdCq markMeAsCancelled = null;
	
	
	public PriceGroupVersionIdCq getDraftId() {
		return draftId;
	}
	
	public void setDraftId(PriceGroupVersionIdCq draftId) {
		this.draftId = draftId;
	}
	
	public PriceGroupVersionIdCq getMarkMeAsCancelled() {
		return markMeAsCancelled;
	}
	
	public void setMarkMeAsCancelled(PriceGroupVersionIdCq markMeAsCancelled) {
		this.markMeAsCancelled = markMeAsCancelled;
	}
}

