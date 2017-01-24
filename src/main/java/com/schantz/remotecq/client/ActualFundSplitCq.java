package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;

public class ActualFundSplitCq implements Serializable {
	@JsonProperty("pct")
	private Double pct = null;
	
	@JsonProperty("fundDetailsCq")
	private FundDetailsCq fundDetailsCq = null;
	
	@JsonProperty("totalValue")
	private Double totalValue = null;
	
	@JsonProperty("totalUnits")
	private Double totalUnits = null;
	
	@JsonProperty("targetPct")
	private Double targetPct = null;
	
	@JsonProperty("oiAccountId")
	private String oiAccountId = null;
	
	@JsonProperty("valueDateTime")
	private OffsetDateTime valueDateTime = null;
	
	
	public Double getPct() {
		return pct;
	}
	
	public void setPct(Double pct) {
		this.pct = pct;
	}
	
	public FundDetailsCq getFundDetailsCq() {
		return fundDetailsCq;
	}
	
	public void setFundDetailsCq(FundDetailsCq fundDetailsCq) {
		this.fundDetailsCq = fundDetailsCq;
	}
	
	public Double getTotalValue() {
		return totalValue;
	}
	
	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}
	
	public Double getTotalUnits() {
		return totalUnits;
	}
	
	public void setTotalUnits(Double totalUnits) {
		this.totalUnits = totalUnits;
	}
	
	public Double getTargetPct() {
		return targetPct;
	}
	
	public void setTargetPct(Double targetPct) {
		this.targetPct = targetPct;
	}
	
	public String getOiAccountId() {
		return oiAccountId;
	}
	
	public void setOiAccountId(String oiAccountId) {
		this.oiAccountId = oiAccountId;
	}
	
	public OffsetDateTime getValueDateTime() {
		return valueDateTime;
	}
	
	public void setValueDateTime(OffsetDateTime valueDateTime) {
		this.valueDateTime = valueDateTime;
	}
}

