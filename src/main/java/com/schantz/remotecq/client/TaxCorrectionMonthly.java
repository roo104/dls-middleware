package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class TaxCorrectionMonthly implements Serializable {
	@JsonProperty("monthAsInteger")
	private Long monthAsInteger = null;
	
	@JsonProperty("taxBefore")
	private Double taxBefore = null;
	
	@JsonProperty("taxPctAfter")
	private Double taxPctAfter = null;
	
	@JsonProperty("taxAllowanceAfter")
	private Double taxAllowanceAfter = null;
	
	@JsonProperty("taxAfter")
	private Double taxAfter = null;
	
	@JsonProperty("isMonthIncluded")
	private Boolean isMonthIncluded = false;
	
	
	public Long getMonthAsInteger() {
		return monthAsInteger;
	}
	
	public void setMonthAsInteger(Long monthAsInteger) {
		this.monthAsInteger = monthAsInteger;
	}
	
	public Double getTaxBefore() {
		return taxBefore;
	}
	
	public void setTaxBefore(Double taxBefore) {
		this.taxBefore = taxBefore;
	}
	
	public Double getTaxPctAfter() {
		return taxPctAfter;
	}
	
	public void setTaxPctAfter(Double taxPctAfter) {
		this.taxPctAfter = taxPctAfter;
	}
	
	public Double getTaxAllowanceAfter() {
		return taxAllowanceAfter;
	}
	
	public void setTaxAllowanceAfter(Double taxAllowanceAfter) {
		this.taxAllowanceAfter = taxAllowanceAfter;
	}
	
	public Double getTaxAfter() {
		return taxAfter;
	}
	
	public void setTaxAfter(Double taxAfter) {
		this.taxAfter = taxAfter;
	}
	
	public Boolean getIsMonthIncluded() {
		return isMonthIncluded;
	}
	
	public void setIsMonthIncluded(Boolean isMonthIncluded) {
		this.isMonthIncluded = isMonthIncluded;
	}
}

