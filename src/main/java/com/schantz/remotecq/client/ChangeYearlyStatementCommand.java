package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class ChangeYearlyStatementCommand implements Serializable {
	@JsonProperty("riskBonusGroupIdCq")
	private RiskBonusGroupIdCq riskBonusGroupIdCq = null;
	
	@JsonProperty("yearlyStatementCq")
	private YearlyStatementCq yearlyStatementCq = null;
	
	
	public RiskBonusGroupIdCq getRiskBonusGroupIdCq() {
		return riskBonusGroupIdCq;
	}
	
	public void setRiskBonusGroupIdCq(RiskBonusGroupIdCq riskBonusGroupIdCq) {
		this.riskBonusGroupIdCq = riskBonusGroupIdCq;
	}
	
	public YearlyStatementCq getYearlyStatementCq() {
		return yearlyStatementCq;
	}
	
	public void setYearlyStatementCq(YearlyStatementCq yearlyStatementCq) {
		this.yearlyStatementCq = yearlyStatementCq;
	}
}

