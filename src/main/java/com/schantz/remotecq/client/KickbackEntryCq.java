package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;

public class KickbackEntryCq implements Serializable {
	@JsonProperty("amount")
	private Double amount = null;
	
	@JsonProperty("amountDate")
	private LocalDate amountDate = null;
	
	@JsonProperty("periodStart")
	private LocalDate periodStart = null;
	
	@JsonProperty("periodEnd")
	private LocalDate periodEnd = null;
	
	@JsonProperty("kickbackUid")
	private String kickbackUid = null;
	
	@JsonProperty("completedDate")
	private LocalDate completedDate = null;
	
	
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
	
	public String getKickbackUid() {
		return kickbackUid;
	}
	
	public void setKickbackUid(String kickbackUid) {
		this.kickbackUid = kickbackUid;
	}
	
	public LocalDate getCompletedDate() {
		return completedDate;
	}
	
	public void setCompletedDate(LocalDate completedDate) {
		this.completedDate = completedDate;
	}
}

