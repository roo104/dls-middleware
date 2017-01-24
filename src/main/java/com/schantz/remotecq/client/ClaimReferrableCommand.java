package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class ClaimReferrableCommand implements Serializable {
	@JsonProperty("referrableUid")
	private String referrableUid = null;
	
	@JsonProperty("isClaimed")
	private Boolean isClaimed = false;
	
	
	public String getReferrableUid() {
		return referrableUid;
	}
	
	public void setReferrableUid(String referrableUid) {
		this.referrableUid = referrableUid;
	}
	
	public Boolean getIsClaimed() {
		return isClaimed;
	}
	
	public void setIsClaimed(Boolean isClaimed) {
		this.isClaimed = isClaimed;
	}
}

