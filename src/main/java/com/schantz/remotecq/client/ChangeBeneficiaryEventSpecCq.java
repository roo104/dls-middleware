package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class ChangeBeneficiaryEventSpecCq implements Serializable {
	@JsonProperty("priority")
	private Long priority = null;
	
	@JsonProperty("share")
	private Double share = null;
	
	@JsonProperty("specText")
	private String specText = null;
	
	@JsonProperty("unretractable")
	private Boolean unretractable = false;
	
	@JsonProperty("legalPartyIdCq")
	private LegalPartyIdCq legalPartyIdCq = null;
	
	@JsonProperty("beneficiaryTypeCq")
	private String beneficiaryTypeCq = null;
	
	@JsonProperty("policyCoverIdCq")
	private PolicyCoverIdCq policyCoverIdCq = null;
	
	@JsonProperty("policyPackageIdCq")
	private PolicyPackageIdCq policyPackageIdCq = null;
	
	
	public Long getPriority() {
		return priority;
	}
	
	public void setPriority(Long priority) {
		this.priority = priority;
	}
	
	public Double getShare() {
		return share;
	}
	
	public void setShare(Double share) {
		this.share = share;
	}
	
	public String getSpecText() {
		return specText;
	}
	
	public void setSpecText(String specText) {
		this.specText = specText;
	}
	
	public Boolean getUnretractable() {
		return unretractable;
	}
	
	public void setUnretractable(Boolean unretractable) {
		this.unretractable = unretractable;
	}
	
	public LegalPartyIdCq getLegalPartyIdCq() {
		return legalPartyIdCq;
	}
	
	public void setLegalPartyIdCq(LegalPartyIdCq legalPartyIdCq) {
		this.legalPartyIdCq = legalPartyIdCq;
	}
	
	public String getBeneficiaryTypeCq() {
		return beneficiaryTypeCq;
	}
	
	public void setBeneficiaryTypeCq(String beneficiaryTypeCq) {
		this.beneficiaryTypeCq = beneficiaryTypeCq;
	}
	
	public PolicyCoverIdCq getPolicyCoverIdCq() {
		return policyCoverIdCq;
	}
	
	public void setPolicyCoverIdCq(PolicyCoverIdCq policyCoverIdCq) {
		this.policyCoverIdCq = policyCoverIdCq;
	}
	
	public PolicyPackageIdCq getPolicyPackageIdCq() {
		return policyPackageIdCq;
	}
	
	public void setPolicyPackageIdCq(PolicyPackageIdCq policyPackageIdCq) {
		this.policyPackageIdCq = policyPackageIdCq;
	}
}

