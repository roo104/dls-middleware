package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class DeleteCommissionRegulationCommand implements Serializable {
	@JsonProperty("commissionRegulationIdCq")
	private CommissionRegulationIdCq commissionRegulationIdCq = null;
	
	
	public CommissionRegulationIdCq getCommissionRegulationIdCq() {
		return commissionRegulationIdCq;
	}
	
	public void setCommissionRegulationIdCq(CommissionRegulationIdCq commissionRegulationIdCq) {
		this.commissionRegulationIdCq = commissionRegulationIdCq;
	}
}

