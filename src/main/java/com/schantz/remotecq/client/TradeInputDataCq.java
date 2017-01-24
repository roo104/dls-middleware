package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class TradeInputDataCq implements Serializable {
	@JsonProperty("fundName")
	private String fundName = null;
	
	@JsonProperty("value")
	private Double value = null;
	
	@JsonProperty("pctValue")
	private Double pctValue = null;
	
	@JsonProperty("tradeDataTypeCq")
	private String tradeDataTypeCq = null;
	
	
	public String getFundName() {
		return fundName;
	}
	
	public void setFundName(String fundName) {
		this.fundName = fundName;
	}
	
	public Double getValue() {
		return value;
	}
	
	public void setValue(Double value) {
		this.value = value;
	}
	
	public Double getPctValue() {
		return pctValue;
	}
	
	public void setPctValue(Double pctValue) {
		this.pctValue = pctValue;
	}
	
	public String getTradeDataTypeCq() {
		return tradeDataTypeCq;
	}
	
	public void setTradeDataTypeCq(String tradeDataTypeCq) {
		this.tradeDataTypeCq = tradeDataTypeCq;
	}
}

