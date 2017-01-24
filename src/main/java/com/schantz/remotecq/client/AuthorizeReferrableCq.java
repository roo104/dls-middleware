package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class AuthorizeReferrableCq implements Serializable {
	@JsonProperty("referrableUid")
	private String referrableUid = null;
	
	
	public String getReferrableUid() {
		return referrableUid;
	}
	
	public void setReferrableUid(String referrableUid) {
		this.referrableUid = referrableUid;
	}
}

