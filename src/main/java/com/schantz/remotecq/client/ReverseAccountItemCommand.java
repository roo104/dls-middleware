package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class ReverseAccountItemCommand implements Serializable {
	@JsonProperty("oiAccountItemId")
	private OiAccountItemIdCq oiAccountItemId = null;
	
	
	public OiAccountItemIdCq getOiAccountItemId() {
		return oiAccountItemId;
	}
	
	public void setOiAccountItemId(OiAccountItemIdCq oiAccountItemId) {
		this.oiAccountItemId = oiAccountItemId;
	}
}

