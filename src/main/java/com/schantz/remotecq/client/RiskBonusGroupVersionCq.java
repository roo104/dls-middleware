package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class RiskBonusGroupVersionCq implements Serializable {
	@JsonProperty("versionNote")
	private String versionNote = null;
	
	@JsonProperty("terminationDate")
	private LocalDate terminationDate = null;
	
	@JsonProperty("riskBonusGroupCq")
	private RiskBonusGroupCq riskBonusGroupCq = null;
	
	@JsonProperty("lifeCoverTypeCqCollection")
	private List<LifeCoverTypeCq> lifeCoverTypeCqCollection = new ArrayList<LifeCoverTypeCq>();
	
	@JsonProperty("riskBonusGroupVersionIdCq")
	private RiskBonusGroupVersionIdCq riskBonusGroupVersionIdCq = null;
	
	@JsonProperty("riskBonusGroupVersionInfoCq")
	private RiskBonusGroupVersionInfoCq riskBonusGroupVersionInfoCq = null;
	
	@JsonProperty("riskBonusGroupStateCq")
	private String riskBonusGroupStateCq = null;
	
	@JsonProperty("riskBonusGroupSpecCq")
	private RiskBonusGroupSpecCq riskBonusGroupSpecCq = null;
	
	@JsonProperty("riskBonusGroupStatusTypeCq")
	private String riskBonusGroupStatusTypeCq = null;
	
	
	public String getVersionNote() {
		return versionNote;
	}
	
	public void setVersionNote(String versionNote) {
		this.versionNote = versionNote;
	}
	
	public LocalDate getTerminationDate() {
		return terminationDate;
	}
	
	public void setTerminationDate(LocalDate terminationDate) {
		this.terminationDate = terminationDate;
	}
	
	public RiskBonusGroupCq getRiskBonusGroupCq() {
		return riskBonusGroupCq;
	}
	
	public void setRiskBonusGroupCq(RiskBonusGroupCq riskBonusGroupCq) {
		this.riskBonusGroupCq = riskBonusGroupCq;
	}
	
	public RiskBonusGroupVersionCq addLifeCoverTypeCqCollectionItem(LifeCoverTypeCq lifeCoverTypeCqCollectionItem) {
		this.lifeCoverTypeCqCollection.add(lifeCoverTypeCqCollectionItem);
		return this;
	}
	
	public List<LifeCoverTypeCq> getLifeCoverTypeCqCollection() {
		return lifeCoverTypeCqCollection;
	}
	
	public void setLifeCoverTypeCqCollection(List<LifeCoverTypeCq> lifeCoverTypeCqCollection) {
		this.lifeCoverTypeCqCollection = lifeCoverTypeCqCollection;
	}
	
	public RiskBonusGroupVersionIdCq getRiskBonusGroupVersionIdCq() {
		return riskBonusGroupVersionIdCq;
	}
	
	public void setRiskBonusGroupVersionIdCq(RiskBonusGroupVersionIdCq riskBonusGroupVersionIdCq) {
		this.riskBonusGroupVersionIdCq = riskBonusGroupVersionIdCq;
	}
	
	public RiskBonusGroupVersionInfoCq getRiskBonusGroupVersionInfoCq() {
		return riskBonusGroupVersionInfoCq;
	}
	
	public void setRiskBonusGroupVersionInfoCq(RiskBonusGroupVersionInfoCq riskBonusGroupVersionInfoCq) {
		this.riskBonusGroupVersionInfoCq = riskBonusGroupVersionInfoCq;
	}
	
	public String getRiskBonusGroupStateCq() {
		return riskBonusGroupStateCq;
	}
	
	public void setRiskBonusGroupStateCq(String riskBonusGroupStateCq) {
		this.riskBonusGroupStateCq = riskBonusGroupStateCq;
	}
	
	public RiskBonusGroupSpecCq getRiskBonusGroupSpecCq() {
		return riskBonusGroupSpecCq;
	}
	
	public void setRiskBonusGroupSpecCq(RiskBonusGroupSpecCq riskBonusGroupSpecCq) {
		this.riskBonusGroupSpecCq = riskBonusGroupSpecCq;
	}
	
	public String getRiskBonusGroupStatusTypeCq() {
		return riskBonusGroupStatusTypeCq;
	}
	
	public void setRiskBonusGroupStatusTypeCq(String riskBonusGroupStatusTypeCq) {
		this.riskBonusGroupStatusTypeCq = riskBonusGroupStatusTypeCq;
	}
}

