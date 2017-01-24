package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class PricePrivilegeIdCq implements Serializable {
	@JsonProperty("pricePrivilegeId")
	private String pricePrivilegeId = null;
	
	@JsonProperty("pricePrivilegeName")
	private String pricePrivilegeName = null;
	
	
	public String getPricePrivilegeId() {
		return pricePrivilegeId;
	}
	
	public void setPricePrivilegeId(String pricePrivilegeId) {
		this.pricePrivilegeId = pricePrivilegeId;
	}
	
	public String getPricePrivilegeName() {
		return pricePrivilegeName;
	}
	
	public void setPricePrivilegeName(String pricePrivilegeName) {
		this.pricePrivilegeName = pricePrivilegeName;
	}
}

