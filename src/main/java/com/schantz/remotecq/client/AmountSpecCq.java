package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class AmountSpecCq implements Serializable {
	@JsonProperty("specAmount")
	private Double specAmount = null;
	
	
	public Double getSpecAmount() {
		return specAmount;
	}
	
	public void setSpecAmount(Double specAmount) {
		this.specAmount = specAmount;
	}
}

