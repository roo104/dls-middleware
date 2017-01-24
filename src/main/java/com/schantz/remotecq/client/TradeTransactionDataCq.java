package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;

public class TradeTransactionDataCq implements Serializable {
	@JsonProperty("fundName")
	private String fundName = null;
	
	@JsonProperty("value")
	private Double value = null;
	
	@JsonProperty("pctValue")
	private Double pctValue = null;
	
	@JsonProperty("valueDate")
	private LocalDate valueDate = null;
	
	@JsonProperty("fundUnits")
	private Double fundUnits = null;
	
	@JsonProperty("fundPrice")
	private Long fundPrice = null;
	
	@JsonProperty("postingsId")
	private Long postingsId = null;
	
	@JsonProperty("dbPostingsId")
	private Long dbPostingsId = null;
	
	@JsonProperty("transactionDate")
	private OffsetDateTime transactionDate = null;
	
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
	
	public Double getPctValue() {
		return pctValue;
	}
	
	public void setPctValue(Double pctValue) {
		this.pctValue = pctValue;
	}
	
	public LocalDate getValueDate() {
		return valueDate;
	}
	
	public void setValueDate(LocalDate valueDate) {
		this.valueDate = valueDate;
	}
	
	public Double getFundUnits() {
		return fundUnits;
	}
	
	public void setFundUnits(Double fundUnits) {
		this.fundUnits = fundUnits;
	}
	
	public Long getFundPrice() {
		return fundPrice;
	}
	
	public void setFundPrice(Long fundPrice) {
		this.fundPrice = fundPrice;
	}
	
	public Long getPostingsId() {
		return postingsId;
	}
	
	public void setPostingsId(Long postingsId) {
		this.postingsId = postingsId;
	}
	
	public Long getDbPostingsId() {
		return dbPostingsId;
	}
	
	public void setDbPostingsId(Long dbPostingsId) {
		this.dbPostingsId = dbPostingsId;
	}
	
	public OffsetDateTime getTransactionDate() {
		return transactionDate;
	}
	
	public void setTransactionDate(OffsetDateTime transactionDate) {
		this.transactionDate = transactionDate;
	}
	
	public String getCurrencyCodeCq() {
		return currencyCodeCq;
	}
	
	public void setCurrencyCodeCq(String currencyCodeCq) {
		this.currencyCodeCq = currencyCodeCq;
	}
}

