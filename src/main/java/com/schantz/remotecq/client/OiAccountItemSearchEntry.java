package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class OiAccountItemSearchEntry implements Serializable {
	@JsonProperty("oiAccountItemCq")
	private OiAccountItemCq oiAccountItemCq = null;
	
	
	public OiAccountItemCq getOiAccountItemCq() {
		return oiAccountItemCq;
	}
	
	public void setOiAccountItemCq(OiAccountItemCq oiAccountItemCq) {
		this.oiAccountItemCq = oiAccountItemCq;
	}
}

