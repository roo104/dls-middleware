package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class RenameCommissionRegulationCommand implements Serializable {
	@JsonProperty("commissionRegulationIdCq")
	private CommissionRegulationIdCq commissionRegulationIdCq = null;
	
	@JsonProperty("entityNameCq")
	private EntityNameCq entityNameCq = null;
	
	
	public CommissionRegulationIdCq getCommissionRegulationIdCq() {
		return commissionRegulationIdCq;
	}
	
	public void setCommissionRegulationIdCq(CommissionRegulationIdCq commissionRegulationIdCq) {
		this.commissionRegulationIdCq = commissionRegulationIdCq;
	}
	
	public EntityNameCq getEntityNameCq() {
		return entityNameCq;
	}
	
	public void setEntityNameCq(EntityNameCq entityNameCq) {
		this.entityNameCq = entityNameCq;
	}
}

