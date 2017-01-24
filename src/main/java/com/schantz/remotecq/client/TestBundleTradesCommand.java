package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;

public class TestBundleTradesCommand implements Serializable {
	@JsonProperty("ownerId")
	private UnitLinkedOwnerIdCq ownerId = null;
	
	@JsonProperty("bundleDateTime")
	private OffsetDateTime bundleDateTime = null;
	
	@JsonProperty("isForceDbMode")
	private Boolean isForceDbMode = false;
	
	
	public UnitLinkedOwnerIdCq getOwnerId() {
		return ownerId;
	}
	
	public void setOwnerId(UnitLinkedOwnerIdCq ownerId) {
		this.ownerId = ownerId;
	}
	
	public OffsetDateTime getBundleDateTime() {
		return bundleDateTime;
	}
	
	public void setBundleDateTime(OffsetDateTime bundleDateTime) {
		this.bundleDateTime = bundleDateTime;
	}
	
	public Boolean getIsForceDbMode() {
		return isForceDbMode;
	}
	
	public void setIsForceDbMode(Boolean isForceDbMode) {
		this.isForceDbMode = isForceDbMode;
	}
}

