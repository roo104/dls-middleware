package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;

public class NewPortfolioRuleFrameVersionCommand implements Serializable {
	@JsonProperty("startDate")
	private LocalDate startDate = null;
	
	@JsonProperty("cloneSource")
	private PortfolioRuleFrameVersionIdCq cloneSource = null;
	
	
	public LocalDate getStartDate() {
		return startDate;
	}
	
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	
	public PortfolioRuleFrameVersionIdCq getCloneSource() {
		return cloneSource;
	}
	
	public void setCloneSource(PortfolioRuleFrameVersionIdCq cloneSource) {
		this.cloneSource = cloneSource;
	}
}

