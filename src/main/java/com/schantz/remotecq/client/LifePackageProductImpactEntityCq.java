package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class LifePackageProductImpactEntityCq implements Serializable {
	@JsonProperty("uid")
	private String uid = null;
	
	@JsonProperty("exceptionStackTrace")
	private String exceptionStackTrace = null;
	
	@JsonProperty("impactAssessmentTypeCq")
	private String impactAssessmentTypeCq = null;
	
	@JsonProperty("impactEntityMessageCqCollection")
	private List<ImpactEntityMessageCq> impactEntityMessageCqCollection = new ArrayList<ImpactEntityMessageCq>();
	
	@JsonProperty("lifeCoverProductImpactEntityCqCollection")
	private List<LifeCoverProductImpactEntityCq> lifeCoverProductImpactEntityCqCollection = new ArrayList<LifeCoverProductImpactEntityCq>();
	
	@JsonProperty("agreementPackageIdCq")
	private AgreementPackageIdCq agreementPackageIdCq = null;
	
	
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
	
	public LifePackageProductImpactEntityCq addImpactEntityMessageCqCollectionItem(ImpactEntityMessageCq impactEntityMessageCqCollectionItem) {
		this.impactEntityMessageCqCollection.add(impactEntityMessageCqCollectionItem);
		return this;
	}
	
	public List<ImpactEntityMessageCq> getImpactEntityMessageCqCollection() {
		return impactEntityMessageCqCollection;
	}
	
	public void setImpactEntityMessageCqCollection(List<ImpactEntityMessageCq> impactEntityMessageCqCollection) {
		this.impactEntityMessageCqCollection = impactEntityMessageCqCollection;
	}
	
	public LifePackageProductImpactEntityCq addLifeCoverProductImpactEntityCqCollectionItem(LifeCoverProductImpactEntityCq lifeCoverProductImpactEntityCqCollectionItem) {
		this.lifeCoverProductImpactEntityCqCollection.add(lifeCoverProductImpactEntityCqCollectionItem);
		return this;
	}
	
	public List<LifeCoverProductImpactEntityCq> getLifeCoverProductImpactEntityCqCollection() {
		return lifeCoverProductImpactEntityCqCollection;
	}
	
	public void setLifeCoverProductImpactEntityCqCollection(List<LifeCoverProductImpactEntityCq> lifeCoverProductImpactEntityCqCollection) {
		this.lifeCoverProductImpactEntityCqCollection = lifeCoverProductImpactEntityCqCollection;
	}
	
	public AgreementPackageIdCq getAgreementPackageIdCq() {
		return agreementPackageIdCq;
	}
	
	public void setAgreementPackageIdCq(AgreementPackageIdCq agreementPackageIdCq) {
		this.agreementPackageIdCq = agreementPackageIdCq;
	}
}

