package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;

public class NewCommissionRefundDraftCommand implements Serializable {
	@JsonProperty("id")
	private String id = null;
	
	@JsonProperty("name")
	private String name = null;
	
	@JsonProperty("startDate")
	private LocalDate startDate = null;
	
	@JsonProperty("basedOn")
	private CommissionRefundRuleVersionIdCq basedOn = null;
	
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public LocalDate getStartDate() {
		return startDate;
	}
	
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	
	public CommissionRefundRuleVersionIdCq getBasedOn() {
		return basedOn;
	}
	
	public void setBasedOn(CommissionRefundRuleVersionIdCq basedOn) {
		this.basedOn = basedOn;
	}
}

