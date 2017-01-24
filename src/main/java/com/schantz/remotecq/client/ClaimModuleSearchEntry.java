package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class ClaimModuleSearchEntry implements Serializable {
	@JsonProperty("claimModuleName")
	private String claimModuleName = null;
	
	@JsonProperty("description")
	private String description = null;
	
	@JsonProperty("lockedToAgreementCollection")
	private List<String> lockedToAgreementCollection = new ArrayList<String>();
	
	@JsonProperty("maximumAmountYearly")
	private Double maximumAmountYearly = null;
	
	@JsonProperty("defaultVersion")
	private ClaimModuleVersionIdCq defaultVersion = null;
	
	@JsonProperty("claimModuleIdCq")
	private ClaimModuleIdCq claimModuleIdCq = null;
	
	@JsonProperty("claimModuleTypeCq")
	private String claimModuleTypeCq = null;
	
	@JsonProperty("isAttachableToAgreement")
	private Boolean isAttachableToAgreement = false;
	
	
	public String getClaimModuleName() {
		return claimModuleName;
	}
	
	public void setClaimModuleName(String claimModuleName) {
		this.claimModuleName = claimModuleName;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public ClaimModuleSearchEntry addLockedToAgreementCollectionItem(String lockedToAgreementCollectionItem) {
		this.lockedToAgreementCollection.add(lockedToAgreementCollectionItem);
		return this;
	}
	
	public List<String> getLockedToAgreementCollection() {
		return lockedToAgreementCollection;
	}
	
	public void setLockedToAgreementCollection(List<String> lockedToAgreementCollection) {
		this.lockedToAgreementCollection = lockedToAgreementCollection;
	}
	
	public Double getMaximumAmountYearly() {
		return maximumAmountYearly;
	}
	
	public void setMaximumAmountYearly(Double maximumAmountYearly) {
		this.maximumAmountYearly = maximumAmountYearly;
	}
	
	public ClaimModuleVersionIdCq getDefaultVersion() {
		return defaultVersion;
	}
	
	public void setDefaultVersion(ClaimModuleVersionIdCq defaultVersion) {
		this.defaultVersion = defaultVersion;
	}
	
	public ClaimModuleIdCq getClaimModuleIdCq() {
		return claimModuleIdCq;
	}
	
	public void setClaimModuleIdCq(ClaimModuleIdCq claimModuleIdCq) {
		this.claimModuleIdCq = claimModuleIdCq;
	}
	
	public String getClaimModuleTypeCq() {
		return claimModuleTypeCq;
	}
	
	public void setClaimModuleTypeCq(String claimModuleTypeCq) {
		this.claimModuleTypeCq = claimModuleTypeCq;
	}
	
	public Boolean getIsAttachableToAgreement() {
		return isAttachableToAgreement;
	}
	
	public void setIsAttachableToAgreement(Boolean isAttachableToAgreement) {
		this.isAttachableToAgreement = isAttachableToAgreement;
	}
}

