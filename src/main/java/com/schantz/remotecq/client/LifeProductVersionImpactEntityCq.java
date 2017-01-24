package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class LifeProductVersionImpactEntityCq implements Serializable {
	@JsonProperty("uid")
	private String uid = null;
	
	@JsonProperty("exceptionStackTrace")
	private String exceptionStackTrace = null;
	
	@JsonProperty("impactAssessmentTypeCq")
	private String impactAssessmentTypeCq = null;
	
	@JsonProperty("impactEntityMessageCqCollection")
	private List<ImpactEntityMessageCq> impactEntityMessageCqCollection = new ArrayList<ImpactEntityMessageCq>();
	
	@JsonProperty("lifePackageProductImpactEntityCqCollection")
	private List<LifePackageProductImpactEntityCq> lifePackageProductImpactEntityCqCollection = new ArrayList<LifePackageProductImpactEntityCq>();
	
	@JsonProperty("agreementIdCq")
	private AgreementIdCq agreementIdCq = null;
	
	@JsonProperty("agreementTypeCq")
	private String agreementTypeCq = null;
	
	@JsonProperty("isValid")
	private Boolean isValid = false;
	
	@JsonProperty("isSubDetails")
	private Boolean isSubDetails = false;
	
	
	public String getUid() {
		return uid;
	}
	
	public void setUid(String uid) {
		this.uid = uid;
	}
	
	public String getExceptionStackTrace() {
		return exceptionStackTrace;
	}
	
	public void setExceptionStackTrace(String exceptionStackTrace) {
		this.exceptionStackTrace = exceptionStackTrace;
	}
	
	public String getImpactAssessmentTypeCq() {
		return impactAssessmentTypeCq;
	}
	
	public void setImpactAssessmentTypeCq(String impactAssessmentTypeCq) {
		this.impactAssessmentTypeCq = impactAssessmentTypeCq;
	}
	
	public LifeProductVersionImpactEntityCq addImpactEntityMessageCqCollectionItem(ImpactEntityMessageCq impactEntityMessageCqCollectionItem) {
		this.impactEntityMessageCqCollection.add(impactEntityMessageCqCollectionItem);
		return this;
	}
	
	public List<ImpactEntityMessageCq> getImpactEntityMessageCqCollection() {
		return impactEntityMessageCqCollection;
	}
	
	public void setImpactEntityMessageCqCollection(List<ImpactEntityMessageCq> impactEntityMessageCqCollection) {
		this.impactEntityMessageCqCollection = impactEntityMessageCqCollection;
	}
	
	public LifeProductVersionImpactEntityCq addLifePackageProductImpactEntityCqCollectionItem(LifePackageProductImpactEntityCq lifePackageProductImpactEntityCqCollectionItem) {
		this.lifePackageProductImpactEntityCqCollection.add(lifePackageProductImpactEntityCqCollectionItem);
		return this;
	}
	
	public List<LifePackageProductImpactEntityCq> getLifePackageProductImpactEntityCqCollection() {
		return lifePackageProductImpactEntityCqCollection;
	}
	
	public void setLifePackageProductImpactEntityCqCollection(List<LifePackageProductImpactEntityCq> lifePackageProductImpactEntityCqCollection) {
		this.lifePackageProductImpactEntityCqCollection = lifePackageProductImpactEntityCqCollection;
	}
	
	public AgreementIdCq getAgreementIdCq() {
		return agreementIdCq;
	}
	
	public void setAgreementIdCq(AgreementIdCq agreementIdCq) {
		this.agreementIdCq = agreementIdCq;
	}
	
	public String getAgreementTypeCq() {
		return agreementTypeCq;
	}
	
	public void setAgreementTypeCq(String agreementTypeCq) {
		this.agreementTypeCq = agreementTypeCq;
	}
	
	public Boolean getIsValid() {
		return isValid;
	}
	
	public void setIsValid(Boolean isValid) {
		this.isValid = isValid;
	}
	
	public Boolean getIsSubDetails() {
		return isSubDetails;
	}
	
	public void setIsSubDetails(Boolean isSubDetails) {
		this.isSubDetails = isSubDetails;
	}
}

