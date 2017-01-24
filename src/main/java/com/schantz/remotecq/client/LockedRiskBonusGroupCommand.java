package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class LockedRiskBonusGroupCommand implements Serializable {
	@JsonProperty("riskBonusGroupIdCq")
	private RiskBonusGroupIdCq riskBonusGroupIdCq = null;
	
	@JsonProperty("agreementIdCqCollection")
	private List<AgreementIdCq> agreementIdCqCollection = new ArrayList<AgreementIdCq>();
	
	
	public RiskBonusGroupIdCq getRiskBonusGroupIdCq() {
		return riskBonusGroupIdCq;
	}
	
	public void setRiskBonusGroupIdCq(RiskBonusGroupIdCq riskBonusGroupIdCq) {
		this.riskBonusGroupIdCq = riskBonusGroupIdCq;
	}
	
	public LockedRiskBonusGroupCommand addAgreementIdCqCollectionItem(AgreementIdCq agreementIdCqCollectionItem) {
		this.agreementIdCqCollection.add(agreementIdCqCollectionItem);
		return this;
	}
	
	public List<AgreementIdCq> getAgreementIdCqCollection() {
		return agreementIdCqCollection;
	}
	
	public void setAgreementIdCqCollection(List<AgreementIdCq> agreementIdCqCollection) {
		this.agreementIdCqCollection = agreementIdCqCollection;
	}
}

