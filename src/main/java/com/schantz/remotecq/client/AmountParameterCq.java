package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class AmountParameterCq implements Serializable {
	@JsonProperty("selectedPct")
	private Double selectedPct = null;
	
	@JsonProperty("selectedAmount")
	private Double selectedAmount = null;
	
	@JsonProperty("selectedNamedStep")
	private String selectedNamedStep = null;
	
	
	public Double getSelectedPct() {
		return selectedPct;
	}
	
	public void setSelectedPct(Double selectedPct) {
		this.selectedPct = selectedPct;
	}
	
	public Double getSelectedAmount() {
		return selectedAmount;
	}
	
	public void setSelectedAmount(Double selectedAmount) {
		this.selectedAmount = selectedAmount;
	}
	
	public String getSelectedNamedStep() {
		return selectedNamedStep;
	}
	
	public void setSelectedNamedStep(String selectedNamedStep) {
		this.selectedNamedStep = selectedNamedStep;
	}
}

