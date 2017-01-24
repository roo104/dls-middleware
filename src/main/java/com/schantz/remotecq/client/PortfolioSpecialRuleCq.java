package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class PortfolioSpecialRuleCq implements Serializable {
	@JsonProperty("companyIdCq")
	private CompanyIdCq companyIdCq = null;
	
	
	public CompanyIdCq getCompanyIdCq() {
		return companyIdCq;
	}
	
	public void setCompanyIdCq(CompanyIdCq companyIdCq) {
		this.companyIdCq = companyIdCq;
	}
}

