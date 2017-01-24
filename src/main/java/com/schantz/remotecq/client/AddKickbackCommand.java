package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;

public class AddKickbackCommand implements Serializable {
	@JsonProperty("fundId")
	private FundIdCq fundId = null;
	
	@JsonProperty("amount")
	private Double amount = null;
	
	@JsonProperty("amountDate")
	private LocalDate amountDate = null;
	
	@JsonProperty("periodStart")
	private LocalDate periodStart = null;
	
	@JsonProperty("periodEnd")
	private LocalDate periodEnd = null;
	
	
	public FundIdCq getFundId() {
		return fundId;
	}
	
	public void setFundId(FundIdCq fundId) {
		this.fundId = fundId;
	}
	
	public Double getAmount() {
		return amount;
	}
	
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	public LocalDate getAmountDate() {
		return amountDate;
	}
	
	public void setAmountDate(LocalDate amountDate) {
		this.amountDate = amountDate;
	}
	
	public LocalDate getPeriodStart() {
		return periodStart;
	}
	
	public void setPeriodStart(LocalDate periodStart) {
		this.periodStart = periodStart;
	}
	
	public LocalDate getPeriodEnd() {
		return periodEnd;
	}
	
	public void setPeriodEnd(LocalDate periodEnd) {
		this.periodEnd = periodEnd;
	}
}

