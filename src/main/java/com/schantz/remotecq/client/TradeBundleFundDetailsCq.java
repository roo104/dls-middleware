package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;

public class TradeBundleFundDetailsCq implements Serializable {
	@JsonProperty("fundName")
	private String fundName = null;
	
	@JsonProperty("value")
	private Double value = null;
	
	@JsonProperty("fundPrice")
	private Long fundPrice = null;
	
	@JsonProperty("fundPriceDateTime")
	private OffsetDateTime fundPriceDateTime = null;
	
	@JsonProperty("units")
	private Double units = null;
	
	@JsonProperty("fundId")
	private String fundId = null;
	
	@JsonProperty("currencyCodeCq")
	private String currencyCodeCq = null;
	
	
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
	
	public Long getFundPrice() {
		return fundPrice;
	}
	
	public void setFundPrice(Long fundPrice) {
		this.fundPrice = fundPrice;
	}
	
	public OffsetDateTime getFundPriceDateTime() {
		return fundPriceDateTime;
	}
	
	public void setFundPriceDateTime(OffsetDateTime fundPriceDateTime) {
		this.fundPriceDateTime = fundPriceDateTime;
	}
	
	public Double getUnits() {
		return units;
	}
	
	public void setUnits(Double units) {
		this.units = units;
	}
	
	public String getFundId() {
		return fundId;
	}
	
	public void setFundId(String fundId) {
		this.fundId = fundId;
	}
	
	public String getCurrencyCodeCq() {
		return currencyCodeCq;
	}
	
	public void setCurrencyCodeCq(String currencyCodeCq) {
		this.currencyCodeCq = currencyCodeCq;
	}
}

