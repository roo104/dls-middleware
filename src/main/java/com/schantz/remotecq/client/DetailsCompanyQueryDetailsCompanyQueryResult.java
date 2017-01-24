package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;

public class DetailsCompanyQueryDetailsCompanyQueryResult implements Serializable {
	@JsonProperty("viewAtDate")
	private LocalDate viewAtDate = null;
	
	@JsonProperty("companyId")
	private CompanyIdCq companyId = null;
	
	
	public LocalDate getViewAtDate() {
		return viewAtDate;
	}
	
	public void setViewAtDate(LocalDate viewAtDate) {
		this.viewAtDate = viewAtDate;
	}
	
	public CompanyIdCq getCompanyId() {
		return companyId;
	}
	
	public void setCompanyId(CompanyIdCq companyId) {
		this.companyId = companyId;
	}
}

