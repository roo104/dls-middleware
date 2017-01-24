package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;

public class DkGenerateInfoServiceFileQueryGeneratePaymentFileQueryResult implements Serializable {
	@JsonProperty("name")
	private String name = null;
	
	@JsonProperty("cvr")
	private String cvr = null;
	
	@JsonProperty("cpr")
	private String cpr = null;
	
	@JsonProperty("dueDate")
	private LocalDate dueDate = null;
	
	@JsonProperty("amount")
	private Double amount = null;
	
	@JsonProperty("salary")
	private Double salary = null;
	
	@JsonProperty("depositAmount")
	private Double depositAmount = null;
	
	@JsonProperty("depositFromDate")
	private LocalDate depositFromDate = null;
	
	@JsonProperty("depositToDate")
	private LocalDate depositToDate = null;
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCvr() {
		return cvr;
	}
	
	public void setCvr(String cvr) {
		this.cvr = cvr;
	}
	
	public String getCpr() {
		return cpr;
	}
	
	public void setCpr(String cpr) {
		this.cpr = cpr;
	}
	
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
	
	public Double getSalary() {
		return salary;
	}
	
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public Double getDepositAmount() {
		return depositAmount;
	}
	
	public void setDepositAmount(Double depositAmount) {
		this.depositAmount = depositAmount;
	}
	
	public LocalDate getDepositFromDate() {
		return depositFromDate;
	}
	
	public void setDepositFromDate(LocalDate depositFromDate) {
		this.depositFromDate = depositFromDate;
	}
	
	public LocalDate getDepositToDate() {
		return depositToDate;
	}
	
	public void setDepositToDate(LocalDate depositToDate) {
		this.depositToDate = depositToDate;
	}
}

