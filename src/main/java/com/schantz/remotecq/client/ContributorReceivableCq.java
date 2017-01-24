package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class ContributorReceivableCq implements Serializable {
	@JsonProperty("createTime")
	private OffsetDateTime createTime = null;
	
	@JsonProperty("createUser")
	private String createUser = null;
	
	@JsonProperty("totalAmount")
	private Double totalAmount = null;
	
	@JsonProperty("companyRegistration")
	private String companyRegistration = null;
	
	@JsonProperty("personRegistration")
	private String personRegistration = null;
	
	@JsonProperty("personName")
	private String personName = null;
	
	@JsonProperty("monthlySalary")
	private Double monthlySalary = null;
	
	@JsonProperty("monthlySalaryStartDate")
	private LocalDate monthlySalaryStartDate = null;
	
	@JsonProperty("employmentPct")
	private Double employmentPct = null;
	
	@JsonProperty("employmentPctStartDate")
	private LocalDate employmentPctStartDate = null;
	
	@JsonProperty("deliveryNumber")
	private String deliveryNumber = null;
	
	@JsonProperty("agreement")
	private String agreement = null;
	
	@JsonProperty("debtorGroupNumber")
	private String debtorGroupNumber = null;
	
	@JsonProperty("rejected")
	private Boolean rejected = false;
	
	@JsonProperty("externalReference")
	private String externalReference = null;
	
	@JsonProperty("changedByUser")
	private String changedByUser = null;
	
	@JsonProperty("salaryIndex")
	private String salaryIndex = null;
	
	@JsonProperty("seniorityDate")
	private LocalDate seniorityDate = null;
	
	@JsonProperty("educationCode")
	private String educationCode = null;
	
	@JsonProperty("education")
	private String education = null;
	
	@JsonProperty("valueDate")
	private LocalDate valueDate = null;
	
	@JsonProperty("startDate")
	private LocalDate startDate = null;
	
	@JsonProperty("cancelled")
	private Boolean cancelled = false;
	
	@JsonProperty("contributorReceivableStatusCq")
	private ContributorReceivableStatusCq contributorReceivableStatusCq = null;
	
	@JsonProperty("receivableOnHoldStatusCq")
	private String receivableOnHoldStatusCq = null;
	
	@JsonProperty("policyReceivableSummaryCq")
	private PolicyReceivableSummaryCq policyReceivableSummaryCq = null;
	
	@JsonProperty("contributorReceivableIdCq")
	private ContributorReceivableIdCq contributorReceivableIdCq = null;
	
	@JsonProperty("contributorReceivableChangeCqCollection")
	private List<ContributorReceivableChangeCq> contributorReceivableChangeCqCollection = new ArrayList<ContributorReceivableChangeCq>();
	
	@JsonProperty("policyReceivableCqCollection")
	private List<PolicyReceivableCq> policyReceivableCqCollection = new ArrayList<PolicyReceivableCq>();
	
	@JsonProperty("matchingCompanyId")
	private CompanyIdCq matchingCompanyId = null;
	
	@JsonProperty("matchingPersonId")
	private PersonIdCq matchingPersonId = null;
	
	@JsonProperty("matchingPolicyId")
	private PolicyIdCq matchingPolicyId = null;
	
	@JsonProperty("salaryTypeCq")
	private String salaryTypeCq = null;
	
	@JsonProperty("employmentSpecTypeCq")
	private String employmentSpecTypeCq = null;
	
	@JsonProperty("employmentSpecCodeCq")
	private String employmentSpecCodeCq = null;
	
	@JsonProperty("versionHistoryCollection")
	private List<ContributorReceivableIdCq> versionHistoryCollection = new ArrayList<ContributorReceivableIdCq>();
	
	@JsonProperty("contributorReceivableActionCqCollection")
	private List<String> contributorReceivableActionCqCollection = new ArrayList<String>();
	
	
	public OffsetDateTime getCreateTime() {
		return createTime;
	}
	
	public void setCreateTime(OffsetDateTime createTime) {
		this.createTime = createTime;
	}
	
	public String getCreateUser() {
		return createUser;
	}
	
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	
	public Double getTotalAmount() {
		return totalAmount;
	}
	
	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	public String getCompanyRegistration() {
		return companyRegistration;
	}
	
	public void setCompanyRegistration(String companyRegistration) {
		this.companyRegistration = companyRegistration;
	}
	
	public String getPersonRegistration() {
		return personRegistration;
	}
	
	public void setPersonRegistration(String personRegistration) {
		this.personRegistration = personRegistration;
	}
	
	public String getPersonName() {
		return personName;
	}
	
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	
	public Double getMonthlySalary() {
		return monthlySalary;
	}
	
	public void setMonthlySalary(Double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}
	
	public LocalDate getMonthlySalaryStartDate() {
		return monthlySalaryStartDate;
	}
	
	public void setMonthlySalaryStartDate(LocalDate monthlySalaryStartDate) {
		this.monthlySalaryStartDate = monthlySalaryStartDate;
	}
	
	public Double getEmploymentPct() {
		return employmentPct;
	}
	
	public void setEmploymentPct(Double employmentPct) {
		this.employmentPct = employmentPct;
	}
	
	public LocalDate getEmploymentPctStartDate() {
		return employmentPctStartDate;
	}
	
	public void setEmploymentPctStartDate(LocalDate employmentPctStartDate) {
		this.employmentPctStartDate = employmentPctStartDate;
	}
	
	public String getDeliveryNumber() {
		return deliveryNumber;
	}
	
	public void setDeliveryNumber(String deliveryNumber) {
		this.deliveryNumber = deliveryNumber;
	}
	
	public String getAgreement() {
		return agreement;
	}
	
	public void setAgreement(String agreement) {
		this.agreement = agreement;
	}
	
	public String getDebtorGroupNumber() {
		return debtorGroupNumber;
	}
	
	public void setDebtorGroupNumber(String debtorGroupNumber) {
		this.debtorGroupNumber = debtorGroupNumber;
	}
	
	public Boolean getRejected() {
		return rejected;
	}
	
	public void setRejected(Boolean rejected) {
		this.rejected = rejected;
	}
	
	public String getExternalReference() {
		return externalReference;
	}
	
	public void setExternalReference(String externalReference) {
		this.externalReference = externalReference;
	}
	
	public String getChangedByUser() {
		return changedByUser;
	}
	
	public void setChangedByUser(String changedByUser) {
		this.changedByUser = changedByUser;
	}
	
	public String getSalaryIndex() {
		return salaryIndex;
	}
	
	public void setSalaryIndex(String salaryIndex) {
		this.salaryIndex = salaryIndex;
	}
	
	public LocalDate getSeniorityDate() {
		return seniorityDate;
	}
	
	public void setSeniorityDate(LocalDate seniorityDate) {
		this.seniorityDate = seniorityDate;
	}
	
	public String getEducationCode() {
		return educationCode;
	}
	
	public void setEducationCode(String educationCode) {
		this.educationCode = educationCode;
	}
	
	public String getEducation() {
		return education;
	}
	
	public void setEducation(String education) {
		this.education = education;
	}
	
	public LocalDate getValueDate() {
		return valueDate;
	}
	
	public void setValueDate(LocalDate valueDate) {
		this.valueDate = valueDate;
	}
	
	public LocalDate getStartDate() {
		return startDate;
	}
	
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	
	public Boolean getCancelled() {
		return cancelled;
	}
	
	public void setCancelled(Boolean cancelled) {
		this.cancelled = cancelled;
	}
	
	public ContributorReceivableStatusCq getContributorReceivableStatusCq() {
		return contributorReceivableStatusCq;
	}
	
	public void setContributorReceivableStatusCq(ContributorReceivableStatusCq contributorReceivableStatusCq) {
		this.contributorReceivableStatusCq = contributorReceivableStatusCq;
	}
	
	public String getReceivableOnHoldStatusCq() {
		return receivableOnHoldStatusCq;
	}
	
	public void setReceivableOnHoldStatusCq(String receivableOnHoldStatusCq) {
		this.receivableOnHoldStatusCq = receivableOnHoldStatusCq;
	}
	
	public PolicyReceivableSummaryCq getPolicyReceivableSummaryCq() {
		return policyReceivableSummaryCq;
	}
	
	public void setPolicyReceivableSummaryCq(PolicyReceivableSummaryCq policyReceivableSummaryCq) {
		this.policyReceivableSummaryCq = policyReceivableSummaryCq;
	}
	
	public ContributorReceivableIdCq getContributorReceivableIdCq() {
		return contributorReceivableIdCq;
	}
	
	public void setContributorReceivableIdCq(ContributorReceivableIdCq contributorReceivableIdCq) {
		this.contributorReceivableIdCq = contributorReceivableIdCq;
	}
	
	public ContributorReceivableCq addContributorReceivableChangeCqCollectionItem(ContributorReceivableChangeCq contributorReceivableChangeCqCollectionItem) {
		this.contributorReceivableChangeCqCollection.add(contributorReceivableChangeCqCollectionItem);
		return this;
	}
	
	public List<ContributorReceivableChangeCq> getContributorReceivableChangeCqCollection() {
		return contributorReceivableChangeCqCollection;
	}
	
	public void setContributorReceivableChangeCqCollection(List<ContributorReceivableChangeCq> contributorReceivableChangeCqCollection) {
		this.contributorReceivableChangeCqCollection = contributorReceivableChangeCqCollection;
	}
	
	public ContributorReceivableCq addPolicyReceivableCqCollectionItem(PolicyReceivableCq policyReceivableCqCollectionItem) {
		this.policyReceivableCqCollection.add(policyReceivableCqCollectionItem);
		return this;
	}
	
	public List<PolicyReceivableCq> getPolicyReceivableCqCollection() {
		return policyReceivableCqCollection;
	}
	
	public void setPolicyReceivableCqCollection(List<PolicyReceivableCq> policyReceivableCqCollection) {
		this.policyReceivableCqCollection = policyReceivableCqCollection;
	}
	
	public CompanyIdCq getMatchingCompanyId() {
		return matchingCompanyId;
	}
	
	public void setMatchingCompanyId(CompanyIdCq matchingCompanyId) {
		this.matchingCompanyId = matchingCompanyId;
	}
	
	public PersonIdCq getMatchingPersonId() {
		return matchingPersonId;
	}
	
	public void setMatchingPersonId(PersonIdCq matchingPersonId) {
		this.matchingPersonId = matchingPersonId;
	}
	
	public PolicyIdCq getMatchingPolicyId() {
		return matchingPolicyId;
	}
	
	public void setMatchingPolicyId(PolicyIdCq matchingPolicyId) {
		this.matchingPolicyId = matchingPolicyId;
	}
	
	public String getSalaryTypeCq() {
		return salaryTypeCq;
	}
	
	public void setSalaryTypeCq(String salaryTypeCq) {
		this.salaryTypeCq = salaryTypeCq;
	}
	
	public String getEmploymentSpecTypeCq() {
		return employmentSpecTypeCq;
	}
	
	public void setEmploymentSpecTypeCq(String employmentSpecTypeCq) {
		this.employmentSpecTypeCq = employmentSpecTypeCq;
	}
	
	public String getEmploymentSpecCodeCq() {
		return employmentSpecCodeCq;
	}
	
	public void setEmploymentSpecCodeCq(String employmentSpecCodeCq) {
		this.employmentSpecCodeCq = employmentSpecCodeCq;
	}
	
	public ContributorReceivableCq addVersionHistoryCollectionItem(ContributorReceivableIdCq versionHistoryCollectionItem) {
		this.versionHistoryCollection.add(versionHistoryCollectionItem);
		return this;
	}
	
	public List<ContributorReceivableIdCq> getVersionHistoryCollection() {
		return versionHistoryCollection;
	}
	
	public void setVersionHistoryCollection(List<ContributorReceivableIdCq> versionHistoryCollection) {
		this.versionHistoryCollection = versionHistoryCollection;
	}
	
	public ContributorReceivableCq addContributorReceivableActionCqCollectionItem(String contributorReceivableActionCqCollectionItem) {
		this.contributorReceivableActionCqCollection.add(contributorReceivableActionCqCollectionItem);
		return this;
	}
	
	public List<String> getContributorReceivableActionCqCollection() {
		return contributorReceivableActionCqCollection;
	}
	
	public void setContributorReceivableActionCqCollection(List<String> contributorReceivableActionCqCollection) {
		this.contributorReceivableActionCqCollection = contributorReceivableActionCqCollection;
	}
}

