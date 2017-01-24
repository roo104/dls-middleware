package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class ConvertedPackageCq implements Serializable {
	@JsonProperty("packageInstanceId")
	private String packageInstanceId = null;
	
	@JsonProperty("priority")
	private Long priority = null;
	
	@JsonProperty("bonusSpecCq")
	private BonusSpecCq bonusSpecCq = null;
	
	@JsonProperty("agreementPackageId")
	private AgreementPackageIdCq agreementPackageId = null;
	
	@JsonProperty("isUnitLinkOwner")
	private Boolean isUnitLinkOwner = false;
	
	
	public String getPackageInstanceId() {
		return packageInstanceId;
	}
	
	public void setPackageInstanceId(String packageInstanceId) {
		this.packageInstanceId = packageInstanceId;
	}
	
	public Long getPriority() {
		return priority;
	}
	
	public void setPriority(Long priority) {
		this.priority = priority;
	}
	
	public BonusSpecCq getBonusSpecCq() {
		return bonusSpecCq;
	}
	
	public void setBonusSpecCq(BonusSpecCq bonusSpecCq) {
		this.bonusSpecCq = bonusSpecCq;
	}
	
	public AgreementPackageIdCq getAgreementPackageId() {
		return agreementPackageId;
	}
	
	public void setAgreementPackageId(AgreementPackageIdCq agreementPackageId) {
		this.agreementPackageId = agreementPackageId;
	}
	
	public Boolean getIsUnitLinkOwner() {
		return isUnitLinkOwner;
	}
	
	public void setIsUnitLinkOwner(Boolean isUnitLinkOwner) {
		this.isUnitLinkOwner = isUnitLinkOwner;
	}
}

