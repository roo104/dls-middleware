package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;

public class AccountItemEntryCq implements Serializable {
	@JsonProperty("dueDate")
	private LocalDate dueDate = null;
	
	@JsonProperty("amount")
	private Double amount = null;
	
	@JsonProperty("policyId")
	private String policyId = null;
	
	@JsonProperty("referenceNo")
	private String referenceNo = null;
	
	
	public LocalDate getDueDate() {
		return dueDate;
	}
	
	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}
	
	public Double getAmount() {
		return amount;
	}
	
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	public String getPolicyId() {
		return policyId;
	}
	
	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}
	
	public String getReferenceNo() {
		return referenceNo;
	}
	
	public void setReferenceNo(String referenceNo) {
		this.referenceNo = referenceNo;
	}
}

