package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class StartableProcessesQueryStartableProcessesQueryResult implements Serializable {
	@JsonProperty("businessEntitiesRelationshipCq")
	private BusinessEntitiesRelationshipCq businessEntitiesRelationshipCq = null;
	
	
	public BusinessEntitiesRelationshipCq getBusinessEntitiesRelationshipCq() {
		return businessEntitiesRelationshipCq;
	}
	
	public void setBusinessEntitiesRelationshipCq(BusinessEntitiesRelationshipCq businessEntitiesRelationshipCq) {
		this.businessEntitiesRelationshipCq = businessEntitiesRelationshipCq;
	}
}

