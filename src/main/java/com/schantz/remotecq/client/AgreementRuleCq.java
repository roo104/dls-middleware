package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class AgreementRuleCq implements Serializable {
	@JsonProperty("agreementRuleIdCq")
	private AgreementRuleIdCq agreementRuleIdCq = null;
	
	@JsonProperty("agreementRuleDataCq")
	private AgreementRuleDataCq agreementRuleDataCq = null;
	
	
	public AgreementRuleIdCq getAgreementRuleIdCq() {
		return agreementRuleIdCq;
	}
	
	public void setAgreementRuleIdCq(AgreementRuleIdCq agreementRuleIdCq) {
		this.agreementRuleIdCq = agreementRuleIdCq;
	}
	
	public AgreementRuleDataCq getAgreementRuleDataCq() {
		return agreementRuleDataCq;
	}
	
	public void setAgreementRuleDataCq(AgreementRuleDataCq agreementRuleDataCq) {
		this.agreementRuleDataCq = agreementRuleDataCq;
	}
}

