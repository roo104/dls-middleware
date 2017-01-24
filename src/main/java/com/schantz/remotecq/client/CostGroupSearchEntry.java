package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class CostGroupSearchEntry implements Serializable {
	@JsonProperty("costGroupIdCq")
	private CostGroupIdCq costGroupIdCq = null;
	
	
	public CostGroupIdCq getCostGroupIdCq() {
		return costGroupIdCq;
	}
	
	public void setCostGroupIdCq(CostGroupIdCq costGroupIdCq) {
		this.costGroupIdCq = costGroupIdCq;
	}
}

