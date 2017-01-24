package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;

public class HistoricSimulationCompensationQuerySimulationQueryResult implements Serializable {
	@JsonProperty("viewAtTime")
	private OffsetDateTime viewAtTime = null;
	
	@JsonProperty("portfolioId")
	private PortfolioIdCq portfolioId = null;
	
	
	public OffsetDateTime getViewAtTime() {
		return viewAtTime;
	}
	
	public void setViewAtTime(OffsetDateTime viewAtTime) {
		this.viewAtTime = viewAtTime;
	}
	
	public PortfolioIdCq getPortfolioId() {
		return portfolioId;
	}
	
	public void setPortfolioId(PortfolioIdCq portfolioId) {
		this.portfolioId = portfolioId;
	}
}

