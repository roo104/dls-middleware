package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;

public class ReserveAccountItemCq implements Serializable {
	@JsonProperty("createTime")
	private OffsetDateTime createTime = null;
	
	@JsonProperty("createUser")
	private String createUser = null;
	
	@JsonProperty("valeurDate")
	private LocalDate valeurDate = null;
	
	@JsonProperty("firstOrderAmount")
	private Double firstOrderAmount = null;
	
	@JsonProperty("firstOrderSum")
	private Double firstOrderSum = null;
	
	@JsonProperty("secondOrderAmount")
	private Double secondOrderAmount = null;
	
	@JsonProperty("secondOrderSum")
	private Double secondOrderSum = null;
	
	@JsonProperty("transactionDate")
	private LocalDate transactionDate = null;
	
	@JsonProperty("reserveItemTypeCq")
	private String reserveItemTypeCq = null;
	
	@JsonProperty("reserveAccountItemIdCq")
	private ReserveAccountItemIdCq reserveAccountItemIdCq = null;
	
	@JsonProperty("policyCoverIdCq")
	private PolicyCoverIdCq policyCoverIdCq = null;
	
	@JsonProperty("accountId")
	private ReserveAccountIdCq accountId = null;
	
	
	public OffsetDateTime getCreateTime() {
		return createTime;
	}
	
	public void setCreateTime(OffsetDateTime createTime) {
		this.createTime = createTime;
	}
	
	public String getCreateUser() {
		return createUser;
	}
	
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	
	public LocalDate getValeurDate() {
		return valeurDate;
	}
	
	public void setValeurDate(LocalDate valeurDate) {
		this.valeurDate = valeurDate;
	}
	
	public Double getFirstOrderAmount() {
		return firstOrderAmount;
	}
	
	public void setFirstOrderAmount(Double firstOrderAmount) {
		this.firstOrderAmount = firstOrderAmount;
	}
	
	public Double getFirstOrderSum() {
		return firstOrderSum;
	}
	
	public void setFirstOrderSum(Double firstOrderSum) {
		this.firstOrderSum = firstOrderSum;
	}
	
	public Double getSecondOrderAmount() {
		return secondOrderAmount;
	}
	
	public void setSecondOrderAmount(Double secondOrderAmount) {
		this.secondOrderAmount = secondOrderAmount;
	}
	
	public Double getSecondOrderSum() {
		return secondOrderSum;
	}
	
	public void setSecondOrderSum(Double secondOrderSum) {
		this.secondOrderSum = secondOrderSum;
	}
	
	public LocalDate getTransactionDate() {
		return transactionDate;
	}
	
	public void setTransactionDate(LocalDate transactionDate) {
		this.transactionDate = transactionDate;
	}
	
	public String getReserveItemTypeCq() {
		return reserveItemTypeCq;
	}
	
	public void setReserveItemTypeCq(String reserveItemTypeCq) {
		this.reserveItemTypeCq = reserveItemTypeCq;
	}
	
	public ReserveAccountItemIdCq getReserveAccountItemIdCq() {
		return reserveAccountItemIdCq;
	}
	
	public void setReserveAccountItemIdCq(ReserveAccountItemIdCq reserveAccountItemIdCq) {
		this.reserveAccountItemIdCq = reserveAccountItemIdCq;
	}
	
	public PolicyCoverIdCq getPolicyCoverIdCq() {
		return policyCoverIdCq;
	}
	
	public void setPolicyCoverIdCq(PolicyCoverIdCq policyCoverIdCq) {
		this.policyCoverIdCq = policyCoverIdCq;
	}
	
	public ReserveAccountIdCq getAccountId() {
		return accountId;
	}
	
	public void setAccountId(ReserveAccountIdCq accountId) {
		this.accountId = accountId;
	}
}

