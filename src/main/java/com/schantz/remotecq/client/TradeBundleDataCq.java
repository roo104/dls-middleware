package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;

public class TradeBundleDataCq implements Serializable {
	@JsonProperty("tradeAmount")
	private Double tradeAmount = null;
	
	@JsonProperty("cancelled")
	private Boolean cancelled = false;
	
	@JsonProperty("commandTime")
	private OffsetDateTime commandTime = null;
	
	@JsonProperty("tradeUid")
	private String tradeUid = null;
	
	@JsonProperty("tradeCharge")
	private Double tradeCharge = null;
	
	@JsonProperty("createUser")
	private String createUser = null;
	
	@JsonProperty("tradeCommandTypeCq")
	private String tradeCommandTypeCq = null;
	
	@JsonProperty("policyIdCq")
	private PolicyIdCq policyIdCq = null;
	
	
	public Double getTradeAmount() {
		return tradeAmount;
	}
	
	public void setTradeAmount(Double tradeAmount) {
		this.tradeAmount = tradeAmount;
	}
	
	public Boolean getCancelled() {
		return cancelled;
	}
	
	public void setCancelled(Boolean cancelled) {
		this.cancelled = cancelled;
	}
	
	public OffsetDateTime getCommandTime() {
		return commandTime;
	}
	
	public void setCommandTime(OffsetDateTime commandTime) {
		this.commandTime = commandTime;
	}
	
	public String getTradeUid() {
		return tradeUid;
	}
	
	public void setTradeUid(String tradeUid) {
		this.tradeUid = tradeUid;
	}
	
	public Double getTradeCharge() {
		return tradeCharge;
	}
	
	public void setTradeCharge(Double tradeCharge) {
		this.tradeCharge = tradeCharge;
	}
	
	public String getCreateUser() {
		return createUser;
	}
	
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	
	public String getTradeCommandTypeCq() {
		return tradeCommandTypeCq;
	}
	
	public void setTradeCommandTypeCq(String tradeCommandTypeCq) {
		this.tradeCommandTypeCq = tradeCommandTypeCq;
	}
	
	public PolicyIdCq getPolicyIdCq() {
		return policyIdCq;
	}
	
	public void setPolicyIdCq(PolicyIdCq policyIdCq) {
		this.policyIdCq = policyIdCq;
	}
}

