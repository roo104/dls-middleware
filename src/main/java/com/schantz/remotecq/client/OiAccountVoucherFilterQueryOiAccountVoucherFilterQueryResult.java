package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class OiAccountVoucherFilterQueryOiAccountVoucherFilterQueryResult implements Serializable {
	@JsonProperty("oiAccountTypeCq")
	private String oiAccountTypeCq = null;
	
	
	public String getOiAccountTypeCq() {
		return oiAccountTypeCq;
	}
	
	public void setOiAccountTypeCq(String oiAccountTypeCq) {
		this.oiAccountTypeCq = oiAccountTypeCq;
	}
}

