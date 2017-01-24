package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class ProjectionPremiumAssumptionsEntry implements Serializable {
	@JsonProperty("premium")
	private Double premium = null;
	
	@JsonProperty("taxCodeCq")
	private String taxCodeCq = null;
	
	
	public Double getPremium() {
		return premium;
	}
	
	public void setPremium(Double premium) {
		this.premium = premium;
	}
	
	public String getTaxCodeCq() {
		return taxCodeCq;
	}
	
	public void setTaxCodeCq(String taxCodeCq) {
		this.taxCodeCq = taxCodeCq;
	}
}

