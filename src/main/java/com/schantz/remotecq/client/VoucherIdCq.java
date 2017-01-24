package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class VoucherIdCq implements Serializable {
	@JsonProperty("voucherId")
	private String voucherId = null;
	
	
	public String getVoucherId() {
		return voucherId;
	}
	
	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}
}

