package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class DetailedImpactEntityQueryDetailedImpactEntityQueryResult implements Serializable {
	@JsonProperty("impatchEntityUid")
	private String impatchEntityUid = null;
	
	
	public String getImpatchEntityUid() {
		return impatchEntityUid;
	}
	
	public void setImpatchEntityUid(String impatchEntityUid) {
		this.impatchEntityUid = impatchEntityUid;
	}
}

