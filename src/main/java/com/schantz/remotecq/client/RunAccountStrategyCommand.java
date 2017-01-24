package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class RunAccountStrategyCommand implements Serializable {
	@JsonProperty("oiAccountId")
	private OiAccountIdCq oiAccountId = null;
	
	
	public OiAccountIdCq getOiAccountId() {
		return oiAccountId;
	}
	
	public void setOiAccountId(OiAccountIdCq oiAccountId) {
		this.oiAccountId = oiAccountId;
	}
}

