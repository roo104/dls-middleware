package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;

public class LegalPartyRoleCq implements Serializable {
	@JsonProperty("startDate")
	private LocalDate startDate = null;
	
	@JsonProperty("endDate")
	private LocalDate endDate = null;
	
	@JsonProperty("legalPartyRoleId")
	private String legalPartyRoleId = null;
	
	@JsonProperty("legalPartyRolesCq")
	private String legalPartyRolesCq = null;
	
	
	public LocalDate getStartDate() {
		return startDate;
	}
	
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	
	public LocalDate getEndDate() {
		return endDate;
	}
	
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	
	public String getLegalPartyRoleId() {
		return legalPartyRoleId;
	}
	
	public void setLegalPartyRoleId(String legalPartyRoleId) {
		this.legalPartyRoleId = legalPartyRoleId;
	}
	
	public String getLegalPartyRolesCq() {
		return legalPartyRolesCq;
	}
	
	public void setLegalPartyRolesCq(String legalPartyRolesCq) {
		this.legalPartyRolesCq = legalPartyRolesCq;
	}
}

