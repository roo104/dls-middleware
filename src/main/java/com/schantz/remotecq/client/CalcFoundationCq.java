package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class CalcFoundationCq implements Serializable {
	@JsonProperty("balanceCq")
	private BalanceCq balanceCq = null;
	
	@JsonProperty("reserveAccountTypeCq")
	private String reserveAccountTypeCq = null;
	
	@JsonProperty("premiumRightsCq")
	private PremiumRightsCq premiumRightsCq = null;
	
	@JsonProperty("optimizationBalance")
	private OptimizationBalanceCq optimizationBalance = null;
	
	@JsonProperty("calcFoundationId")
	private CalcFoundationIdCq calcFoundationId = null;
	
	
	public BalanceCq getBalanceCq() {
		return balanceCq;
	}
	
	public void setBalanceCq(BalanceCq balanceCq) {
		this.balanceCq = balanceCq;
	}
	
	public String getReserveAccountTypeCq() {
		return reserveAccountTypeCq;
	}
	
	public void setReserveAccountTypeCq(String reserveAccountTypeCq) {
		this.reserveAccountTypeCq = reserveAccountTypeCq;
	}
	
	public PremiumRightsCq getPremiumRightsCq() {
		return premiumRightsCq;
	}
	
	public void setPremiumRightsCq(PremiumRightsCq premiumRightsCq) {
		this.premiumRightsCq = premiumRightsCq;
	}
	
	public OptimizationBalanceCq getOptimizationBalance() {
		return optimizationBalance;
	}
	
	public void setOptimizationBalance(OptimizationBalanceCq optimizationBalance) {
		this.optimizationBalance = optimizationBalance;
	}
	
	public CalcFoundationIdCq getCalcFoundationId() {
		return calcFoundationId;
	}
	
	public void setCalcFoundationId(CalcFoundationIdCq calcFoundationId) {
		this.calcFoundationId = calcFoundationId;
	}
}

