package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;

public class TradePortfolioCq implements Serializable {
	@JsonProperty("amount")
	private Double amount = null;
	
	@JsonProperty("tradeCommandTime")
	private OffsetDateTime tradeCommandTime = null;
	
	@JsonProperty("tradeDateTime")
	private OffsetDateTime tradeDateTime = null;
	
	@JsonProperty("pctCharge")
	private Double pctCharge = null;
	
	@JsonProperty("fixedCharge")
	private Double fixedCharge = null;
	
	@JsonProperty("tradeUid")
	private String tradeUid = null;
	
	@JsonProperty("createUser")
	private String createUser = null;
	
	@JsonProperty("tradeCommandTypeCq")
	private String tradeCommandTypeCq = null;
	
	@JsonProperty("tradeStatusCq")
	private String tradeStatusCq = null;
	
	
	public Double getAmount() {
		return amount;
	}
	
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	public OffsetDateTime getTradeCommandTime() {
		return tradeCommandTime;
	}
	
	public void setTradeCommandTime(OffsetDateTime tradeCommandTime) {
		this.tradeCommandTime = tradeCommandTime;
	}
	
	public OffsetDateTime getTradeDateTime() {
		return tradeDateTime;
	}
	
	public void setTradeDateTime(OffsetDateTime tradeDateTime) {
		this.tradeDateTime = tradeDateTime;
	}
	
	public Double getPctCharge() {
		return pctCharge;
	}
	
	public void setPctCharge(Double pctCharge) {
		this.pctCharge = pctCharge;
	}
	
	public Double getFixedCharge() {
		return fixedCharge;
	}
	
	public void setFixedCharge(Double fixedCharge) {
		this.fixedCharge = fixedCharge;
	}
	
	public String getTradeUid() {
		return tradeUid;
	}
	
	public void setTradeUid(String tradeUid) {
		this.tradeUid = tradeUid;
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
	
	public String getTradeStatusCq() {
		return tradeStatusCq;
	}
	
	public void setTradeStatusCq(String tradeStatusCq) {
		this.tradeStatusCq = tradeStatusCq;
	}
}

