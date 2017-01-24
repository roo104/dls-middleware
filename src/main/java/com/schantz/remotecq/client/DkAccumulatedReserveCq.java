package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class DkAccumulatedReserveCq implements Serializable {
	@JsonProperty("name")
	private CqMessageKey name = null;
	
	@JsonProperty("amount")
	private Double amount = null;
	
	
	public CqMessageKey getName() {
		return name;
	}
	
	public void setName(CqMessageKey name) {
		this.name = name;
	}
	
	public Double getAmount() {
		return amount;
	}
	
	public void setAmount(Double amount) {
		this.amount = amount;
	}
}

