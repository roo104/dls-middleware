package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class DocumentIdCq implements Serializable {
	@JsonProperty("externalId")
	private String externalId = null;
	
	@JsonProperty("archivedReferenceCq")
	private ArchivedReferenceCq archivedReferenceCq = null;
	
	
	public String getExternalId() {
		return externalId;
	}
	
	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}
	
	public ArchivedReferenceCq getArchivedReferenceCq() {
		return archivedReferenceCq;
	}
	
	public void setArchivedReferenceCq(ArchivedReferenceCq archivedReferenceCq) {
		this.archivedReferenceCq = archivedReferenceCq;
	}
}

