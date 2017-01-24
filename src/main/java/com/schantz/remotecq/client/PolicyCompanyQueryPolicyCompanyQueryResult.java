package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;

public class PolicyCompanyQueryPolicyCompanyQueryResult implements Serializable {
	@JsonProperty("includeQuotes")
	private Boolean includeQuotes = false;
	
	@JsonProperty("viewAtDate")
	private LocalDate viewAtDate = null;
	
	@JsonProperty("companyId")
	private CompanyIdCq companyId = null;
	
	
	public Boolean getIncludeQuotes() {
		return includeQuotes;
	}
	
	public void setIncludeQuotes(Boolean includeQuotes) {
		this.includeQuotes = includeQuotes;
	}
	
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

