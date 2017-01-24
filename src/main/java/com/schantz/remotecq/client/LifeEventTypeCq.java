package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class LifeEventTypeCq implements Serializable {
	@JsonProperty("lifeEventTypeUid")
	private String lifeEventTypeUid = null;
	
	@JsonProperty("lifeEventIdCq")
	private String lifeEventIdCq = null;
	
	@JsonProperty("entityNameCq")
	private EntityNameCq entityNameCq = null;
	
	
	public String getLifeEventTypeUid() {
		return lifeEventTypeUid;
	}
	
	public void setLifeEventTypeUid(String lifeEventTypeUid) {
		this.lifeEventTypeUid = lifeEventTypeUid;
	}
	
	public String getLifeEventIdCq() {
		return lifeEventIdCq;
	}
	
	public void setLifeEventIdCq(String lifeEventIdCq) {
		this.lifeEventIdCq = lifeEventIdCq;
	}
	
	public EntityNameCq getEntityNameCq() {
		return entityNameCq;
	}
	
	public void setEntityNameCq(EntityNameCq entityNameCq) {
		this.entityNameCq = entityNameCq;
	}
}

