package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class ProjectionResultSectionCq implements Serializable {
	@JsonProperty("projectionResultCoverCqCollection")
	private List<ProjectionResultCoverCq> projectionResultCoverCqCollection = new ArrayList<ProjectionResultCoverCq>();
	
	@JsonProperty("policyPackageIdCq")
	private PolicyPackageIdCq policyPackageIdCq = null;
	
	@JsonProperty("originalPackageId")
	private PolicyPackageIdCq originalPackageId = null;
	
	@JsonProperty("benefitTriggerEventCq")
	private String benefitTriggerEventCq = null;
	
	@JsonProperty("benefitTypeCq")
	private String benefitTypeCq = null;
	
	public ProjectionResultSectionCq addProjectionResultCoverCqCollectionItem(ProjectionResultCoverCq projectionResultCoverCqCollectionItem) {
		this.projectionResultCoverCqCollection.add(projectionResultCoverCqCollectionItem);
		return this;
	}
	
	public List<ProjectionResultCoverCq> getProjectionResultCoverCqCollection() {
		return projectionResultCoverCqCollection;
	}
	
	public void setProjectionResultCoverCqCollection(List<ProjectionResultCoverCq> projectionResultCoverCqCollection) {
		this.projectionResultCoverCqCollection = projectionResultCoverCqCollection;
	}
	
	public PolicyPackageIdCq getPolicyPackageIdCq() {
		return policyPackageIdCq;
	}
	
	public void setPolicyPackageIdCq(PolicyPackageIdCq policyPackageIdCq) {
		this.policyPackageIdCq = policyPackageIdCq;
	}
	
	public PolicyPackageIdCq getOriginalPackageId() {
		return originalPackageId;
	}
	
	public void setOriginalPackageId(PolicyPackageIdCq originalPackageId) {
		this.originalPackageId = originalPackageId;
	}
	
	public String getBenefitTriggerEventCq() {
		return benefitTriggerEventCq;
	}
	
	public void setBenefitTriggerEventCq(String benefitTriggerEventCq) {
		this.benefitTriggerEventCq = benefitTriggerEventCq;
	}
	
	public String getBenefitTypeCq() {
		return benefitTypeCq;
	}
	
	public void setBenefitTypeCq(String benefitTypeCq) {
		this.benefitTypeCq = benefitTypeCq;
	}
}

