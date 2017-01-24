package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class TimeSpecParameterCq implements Serializable {
	@JsonProperty("startAge")
	private AgeCq startAge = null;
	
	@JsonProperty("endAge")
	private AgeCq endAge = null;
	
	@JsonProperty("noOfPeriods")
	private TimeParameterCq noOfPeriods = null;
	
	
	public AgeCq getStartAge() {
		return startAge;
	}
	
	public void setStartAge(AgeCq startAge) {
		this.startAge = startAge;
	}
	
	public AgeCq getEndAge() {
		return endAge;
	}
	
	public void setEndAge(AgeCq endAge) {
		this.endAge = endAge;
	}
	
	public TimeParameterCq getNoOfPeriods() {
		return noOfPeriods;
	}
	
	public void setNoOfPeriods(TimeParameterCq noOfPeriods) {
		this.noOfPeriods = noOfPeriods;
	}
}

