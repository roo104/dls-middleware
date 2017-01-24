package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class ContributorReceivableSummaryCq implements Serializable {
	@JsonProperty("onHoldCount")
	private Long onHoldCount = null;
	
	@JsonProperty("rejectedCount")
	private Long rejectedCount = null;
	
	@JsonProperty("errorCount")
	private Long errorCount = null;
	
	@JsonProperty("okCount")
	private Long okCount = null;
	
	
	public Long getOnHoldCount() {
		return onHoldCount;
	}
	
	public void setOnHoldCount(Long onHoldCount) {
		this.onHoldCount = onHoldCount;
	}
	
	public Long getRejectedCount() {
		return rejectedCount;
	}
	
	public void setRejectedCount(Long rejectedCount) {
		this.rejectedCount = rejectedCount;
	}
	
	public Long getErrorCount() {
		return errorCount;
	}
	
	public void setErrorCount(Long errorCount) {
		this.errorCount = errorCount;
	}
	
	public Long getOkCount() {
		return okCount;
	}
	
	public void setOkCount(Long okCount) {
		this.okCount = okCount;
	}
}

