package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class CreateManualNoticeCommand implements Serializable {
	@JsonProperty("subject")
	private String subject = null;
	
	@JsonProperty("description")
	private String description = null;
	
	@JsonProperty("agreementId")
	private AgreementIdCq agreementId = null;
	
	@JsonProperty("personId")
	private PersonIdCq personId = null;
	
	@JsonProperty("policyId")
	private PolicyIdCq policyId = null;
	
	@JsonProperty("companyId")
	private CompanyIdCq companyId = null;
	
	@JsonProperty("noticeSubTypeCq")
	private String noticeSubTypeCq = null;
	
	@JsonProperty("priceGroupId")
	private PriceGroupIdCq priceGroupId = null;
	
	
	public String getSubject() {
		return subject;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public AgreementIdCq getAgreementId() {
		return agreementId;
	}
	
	public void setAgreementId(AgreementIdCq agreementId) {
		this.agreementId = agreementId;
	}
	
	public PersonIdCq getPersonId() {
		return personId;
	}
	
	public void setPersonId(PersonIdCq personId) {
		this.personId = personId;
	}
	
	public PolicyIdCq getPolicyId() {
		return policyId;
	}
	
	public void setPolicyId(PolicyIdCq policyId) {
		this.policyId = policyId;
	}
	
	public CompanyIdCq getCompanyId() {
		return companyId;
	}
	
	public void setCompanyId(CompanyIdCq companyId) {
		this.companyId = companyId;
	}
	
	public String getNoticeSubTypeCq() {
		return noticeSubTypeCq;
	}
	
	public void setNoticeSubTypeCq(String noticeSubTypeCq) {
		this.noticeSubTypeCq = noticeSubTypeCq;
	}
	
	public PriceGroupIdCq getPriceGroupId() {
		return priceGroupId;
	}
	
	public void setPriceGroupId(PriceGroupIdCq priceGroupId) {
		this.priceGroupId = priceGroupId;
	}
}

