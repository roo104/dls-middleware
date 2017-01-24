package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;

public class UlAccountEntryCq implements Serializable {
	@JsonProperty("valueDate")
	private LocalDate valueDate = null;
	
	@JsonProperty("amount")
	private Double amount = null;
	
	@JsonProperty("fundPrice")
	private Double fundPrice = null;
	
	@JsonProperty("units")
	private Double units = null;
	
	@JsonProperty("balance")
	private Double balance = null;
	
	
	public LocalDate getValueDate() {
		return valueDate;
	}
	
	public void setValueDate(LocalDate valueDate) {
		this.valueDate = valueDate;
	}
	
	public Double getAmount() {
		return amount;
	}
	
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	public Double getFundPrice() {
		return fundPrice;
	}
	
	public void setFundPrice(Double fundPrice) {
		this.fundPrice = fundPrice;
	}
	
	public Double getUnits() {
		return units;
	}
	
	public void setUnits(Double units) {
		this.units = units;
	}
	
	public Double getBalance() {
		return balance;
	}
	
	public void setBalance(Double balance) {
		this.balance = balance;
	}
}

