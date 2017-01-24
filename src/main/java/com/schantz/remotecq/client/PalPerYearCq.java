package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class PalPerYearCq implements Serializable {
	@JsonProperty("year")
	private Long year = null;
	
	@JsonProperty("palAmount")
	private Double palAmount = null;
	
	
	public Long getYear() {
		return year;
	}
	
	public void setYear(Long year) {
		this.year = year;
	}
	
	public Double getPalAmount() {
		return palAmount;
	}
	
	public void setPalAmount(Double palAmount) {
		this.palAmount = palAmount;
	}
}

