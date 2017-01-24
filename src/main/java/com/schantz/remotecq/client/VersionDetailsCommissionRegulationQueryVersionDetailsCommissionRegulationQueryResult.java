package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class VersionDetailsCommissionRegulationQueryVersionDetailsCommissionRegulationQueryResult implements Serializable {
	@JsonProperty("commissionRegulationVersionIdCq")
	private CommissionRegulationVersionIdCq commissionRegulationVersionIdCq = null;
	
	
	public CommissionRegulationVersionIdCq getCommissionRegulationVersionIdCq() {
		return commissionRegulationVersionIdCq;
	}
	
	public void setCommissionRegulationVersionIdCq(CommissionRegulationVersionIdCq commissionRegulationVersionIdCq) {
		this.commissionRegulationVersionIdCq = commissionRegulationVersionIdCq;
	}
}

