package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class EiConfigCq implements Serializable {
	@JsonProperty("partner")
	private String partner = null;
	
	@JsonProperty("protocol")
	private String protocol = null;
	
	@JsonProperty("hostAddress")
	private String hostAddress = null;
	
	@JsonProperty("receiver")
	private String receiver = null;
	
	@JsonProperty("port")
	private Long port = null;
	
	@JsonProperty("customerId")
	private String customerId = null;
	
	@JsonProperty("platform")
	private String platform = null;
	
	@JsonProperty("isContainsCertificate")
	private Boolean isContainsCertificate = false;
	
	
	public String getPartner() {
		return partner;
	}
	
	public void setPartner(String partner) {
		this.partner = partner;
	}
	
	public String getProtocol() {
		return protocol;
	}
	
	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}
	
	public String getHostAddress() {
		return hostAddress;
	}
	
	public void setHostAddress(String hostAddress) {
		this.hostAddress = hostAddress;
	}
	
	public String getReceiver() {
		return receiver;
	}
	
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	
	public Long getPort() {
		return port;
	}
	
	public void setPort(Long port) {
		this.port = port;
	}
	
	public String getCustomerId() {
		return customerId;
	}
	
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	
	public String getPlatform() {
		return platform;
	}
	
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	
	public Boolean getIsContainsCertificate() {
		return isContainsCertificate;
	}
	
	public void setIsContainsCertificate(Boolean isContainsCertificate) {
		this.isContainsCertificate = isContainsCertificate;
	}
}

