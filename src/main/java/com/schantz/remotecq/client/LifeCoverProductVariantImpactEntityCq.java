package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class LifeCoverProductVariantImpactEntityCq implements Serializable {
	@JsonProperty("uid")
	private String uid = null;
	
	@JsonProperty("exceptionStackTrace")
	private String exceptionStackTrace = null;
	
	@JsonProperty("impactAssessmentTypeCq")
	private String impactAssessmentTypeCq = null;
	
	@JsonProperty("impactEntityMessageCqCollection")
	private List<ImpactEntityMessageCq> impactEntityMessageCqCollection = new ArrayList<ImpactEntityMessageCq>();
	
	@JsonProperty("agreementCoverVariantIdCq")
	private AgreementCoverVariantIdCq agreementCoverVariantIdCq = null;
	
	
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
	
	public LifeCoverProductVariantImpactEntityCq addImpactEntityMessageCqCollectionItem(ImpactEntityMessageCq impactEntityMessageCqCollectionItem) {
		this.impactEntityMessageCqCollection.add(impactEntityMessageCqCollectionItem);
		return this;
	}
	
	public List<ImpactEntityMessageCq> getImpactEntityMessageCqCollection() {
		return impactEntityMessageCqCollection;
	}
	
	public void setImpactEntityMessageCqCollection(List<ImpactEntityMessageCq> impactEntityMessageCqCollection) {
		this.impactEntityMessageCqCollection = impactEntityMessageCqCollection;
	}
	
	public AgreementCoverVariantIdCq getAgreementCoverVariantIdCq() {
		return agreementCoverVariantIdCq;
	}
	
	public void setAgreementCoverVariantIdCq(AgreementCoverVariantIdCq agreementCoverVariantIdCq) {
		this.agreementCoverVariantIdCq = agreementCoverVariantIdCq;
	}
}

