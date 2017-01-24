package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class ArchivedReferenceCq implements Serializable {
	@JsonProperty("externalId")
	private String externalId = null;
	
	@JsonProperty("privilege")
	private String privilege = null;
	
	@JsonProperty("archivedReferenceUid")
	private String archivedReferenceUid = null;
	
	
	public String getExternalId() {
		return externalId;
	}
	
	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}
	
	public String getPrivilege() {
		return privilege;
	}
	
	public void setPrivilege(String privilege) {
		this.privilege = privilege;
	}
	
	public String getArchivedReferenceUid() {
		return archivedReferenceUid;
	}
	
	public void setArchivedReferenceUid(String archivedReferenceUid) {
		this.archivedReferenceUid = archivedReferenceUid;
	}
}

