package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class TimeParameterCq implements Serializable {
	@JsonProperty("value")
	private Long value = null;
	
	@JsonProperty("periodLength")
	private String periodLength = null;
	
	
	public Long getValue() {
		return value;
	}
	
	public void setValue(Long value) {
		this.value = value;
	}
	
	public String getPeriodLength() {
		return periodLength;
	}
	
	public void setPeriodLength(String periodLength) {
		this.periodLength = periodLength;
	}
}

