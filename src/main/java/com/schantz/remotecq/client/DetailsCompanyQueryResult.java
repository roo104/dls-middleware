package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class DetailsCompanyQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("primaryPhone")
	private String primaryPhone = null;
	
	@JsonProperty("primaryEmail")
	private String primaryEmail = null;
	
	@JsonProperty("primaryAddress")
	private AddressCq primaryAddress = null;
	
	@JsonProperty("companyTypeCq")
	private String companyTypeCq = null;
	
	@JsonProperty("agreementIdCollection")
	private List<AgreementIdCq> agreementIdCollection = new ArrayList<AgreementIdCq>();
	
	@JsonProperty("companyId")
	private CompanyIdCq companyId = null;
	
	@JsonProperty("defaultOutputChannelType")
	private String defaultOutputChannelType = null;
	
	public DetailsCompanyQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public String getPrimaryPhone() {
		return primaryPhone;
	}
	
	public void setPrimaryPhone(String primaryPhone) {
		this.primaryPhone = primaryPhone;
	}
	
	public String getPrimaryEmail() {
		return primaryEmail;
	}
	
	public void setPrimaryEmail(String primaryEmail) {
		this.primaryEmail = primaryEmail;
	}
	
	public AddressCq getPrimaryAddress() {
		return primaryAddress;
	}
	
	public void setPrimaryAddress(AddressCq primaryAddress) {
		this.primaryAddress = primaryAddress;
	}
	
	public String getCompanyTypeCq() {
		return companyTypeCq;
	}
	
	public void setCompanyTypeCq(String companyTypeCq) {
		this.companyTypeCq = companyTypeCq;
	}
	
	public DetailsCompanyQueryResult addAgreementIdCollectionItem(AgreementIdCq agreementIdCollectionItem) {
		this.agreementIdCollection.add(agreementIdCollectionItem);
		return this;
	}
	
	public List<AgreementIdCq> getAgreementIdCollection() {
		return agreementIdCollection;
	}
	
	public void setAgreementIdCollection(List<AgreementIdCq> agreementIdCollection) {
		this.agreementIdCollection = agreementIdCollection;
	}
	
	public CompanyIdCq getCompanyId() {
		return companyId;
	}
	
	public void setCompanyId(CompanyIdCq companyId) {
		this.companyId = companyId;
	}
	
	public String getDefaultOutputChannelType() {
		return defaultOutputChannelType;
	}
	
	public void setDefaultOutputChannelType(String defaultOutputChannelType) {
		this.defaultOutputChannelType = defaultOutputChannelType;
	}
}

