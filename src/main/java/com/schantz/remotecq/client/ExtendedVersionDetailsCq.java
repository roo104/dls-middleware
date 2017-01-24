package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class ExtendedVersionDetailsCq implements Serializable {
	@JsonProperty("versionId")
	private AgreementVersionIdCq versionId = null;
	
	@JsonProperty("startDate")
	private LocalDate startDate = null;
	
	@JsonProperty("endDate")
	private LocalDate endDate = null;
	
	@JsonProperty("transactionalStart")
	private OffsetDateTime transactionalStart = null;
	
	@JsonProperty("transactionalEnd")
	private OffsetDateTime transactionalEnd = null;
	
	@JsonProperty("draft")
	private Boolean draft = false;
	
	@JsonProperty("currentLevelChange")
	private Boolean currentLevelChange = false;
	
	@JsonProperty("inheritedChange")
	private Boolean inheritedChange = false;
	
	@JsonProperty("quoteId")
	private String quoteId = null;
	
	@JsonProperty("quoteName")
	private String quoteName = null;
	
	@JsonProperty("quoteCreationTimeStamp")
	private OffsetDateTime quoteCreationTimeStamp = null;
	
	@JsonProperty("quoteAcceptTimeStamp")
	private OffsetDateTime quoteAcceptTimeStamp = null;
	
	@JsonProperty("createUser")
	private String createUser = null;
	
	@JsonProperty("draftBundleName")
	private String draftBundleName = null;
	
	@JsonProperty("localCreateTime")
	private OffsetDateTime localCreateTime = null;
	
	@JsonProperty("localCancelTime")
	private OffsetDateTime localCancelTime = null;
	
	@JsonProperty("agreementStateCq")
	private String agreementStateCq = null;
	
	@JsonProperty("parentsCollection")
	private List<AgreementVersionIdCq> parentsCollection = new ArrayList<AgreementVersionIdCq>();
	
	@JsonProperty("othersInDraftBundleCollection")
	private List<AgreementVersionIdCq> othersInDraftBundleCollection = new ArrayList<AgreementVersionIdCq>();
	
	@JsonProperty("agreementGraphNodeCq")
	private AgreementGraphNodeCq agreementGraphNodeCq = null;
	
	@JsonProperty("isTerminated")
	private Boolean isTerminated = false;
	
	
	public AgreementVersionIdCq getVersionId() {
		return versionId;
	}
	
	public void setVersionId(AgreementVersionIdCq versionId) {
		this.versionId = versionId;
	}
	
	public LocalDate getStartDate() {
		return startDate;
	}
	
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	
	public LocalDate getEndDate() {
		return endDate;
	}
	
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	
	public OffsetDateTime getTransactionalStart() {
		return transactionalStart;
	}
	
	public void setTransactionalStart(OffsetDateTime transactionalStart) {
		this.transactionalStart = transactionalStart;
	}
	
	public OffsetDateTime getTransactionalEnd() {
		return transactionalEnd;
	}
	
	public void setTransactionalEnd(OffsetDateTime transactionalEnd) {
		this.transactionalEnd = transactionalEnd;
	}
	
	public Boolean getDraft() {
		return draft;
	}
	
	public void setDraft(Boolean draft) {
		this.draft = draft;
	}
	
	public Boolean getCurrentLevelChange() {
		return currentLevelChange;
	}
	
	public void setCurrentLevelChange(Boolean currentLevelChange) {
		this.currentLevelChange = currentLevelChange;
	}
	
	public Boolean getInheritedChange() {
		return inheritedChange;
	}
	
	public void setInheritedChange(Boolean inheritedChange) {
		this.inheritedChange = inheritedChange;
	}
	
	public String getQuoteId() {
		return quoteId;
	}
	
	public void setQuoteId(String quoteId) {
		this.quoteId = quoteId;
	}
	
	public String getQuoteName() {
		return quoteName;
	}
	
	public void setQuoteName(String quoteName) {
		this.quoteName = quoteName;
	}
	
	public OffsetDateTime getQuoteCreationTimeStamp() {
		return quoteCreationTimeStamp;
	}
	
	public void setQuoteCreationTimeStamp(OffsetDateTime quoteCreationTimeStamp) {
		this.quoteCreationTimeStamp = quoteCreationTimeStamp;
	}
	
	public OffsetDateTime getQuoteAcceptTimeStamp() {
		return quoteAcceptTimeStamp;
	}
	
	public void setQuoteAcceptTimeStamp(OffsetDateTime quoteAcceptTimeStamp) {
		this.quoteAcceptTimeStamp = quoteAcceptTimeStamp;
	}
	
	public String getCreateUser() {
		return createUser;
	}
	
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	
	public String getDraftBundleName() {
		return draftBundleName;
	}
	
	public void setDraftBundleName(String draftBundleName) {
		this.draftBundleName = draftBundleName;
	}
	
	public OffsetDateTime getLocalCreateTime() {
		return localCreateTime;
	}
	
	public void setLocalCreateTime(OffsetDateTime localCreateTime) {
		this.localCreateTime = localCreateTime;
	}
	
	public OffsetDateTime getLocalCancelTime() {
		return localCancelTime;
	}
	
	public void setLocalCancelTime(OffsetDateTime localCancelTime) {
		this.localCancelTime = localCancelTime;
	}
	
	public String getAgreementStateCq() {
		return agreementStateCq;
	}
	
	public void setAgreementStateCq(String agreementStateCq) {
		this.agreementStateCq = agreementStateCq;
	}
	
	public ExtendedVersionDetailsCq addParentsCollectionItem(AgreementVersionIdCq parentsCollectionItem) {
		this.parentsCollection.add(parentsCollectionItem);
		return this;
	}
	
	public List<AgreementVersionIdCq> getParentsCollection() {
		return parentsCollection;
	}
	
	public void setParentsCollection(List<AgreementVersionIdCq> parentsCollection) {
		this.parentsCollection = parentsCollection;
	}
	
	public ExtendedVersionDetailsCq addOthersInDraftBundleCollectionItem(AgreementVersionIdCq othersInDraftBundleCollectionItem) {
		this.othersInDraftBundleCollection.add(othersInDraftBundleCollectionItem);
		return this;
	}
	
	public List<AgreementVersionIdCq> getOthersInDraftBundleCollection() {
		return othersInDraftBundleCollection;
	}
	
	public void setOthersInDraftBundleCollection(List<AgreementVersionIdCq> othersInDraftBundleCollection) {
		this.othersInDraftBundleCollection = othersInDraftBundleCollection;
	}
	
	public AgreementGraphNodeCq getAgreementGraphNodeCq() {
		return agreementGraphNodeCq;
	}
	
	public void setAgreementGraphNodeCq(AgreementGraphNodeCq agreementGraphNodeCq) {
		this.agreementGraphNodeCq = agreementGraphNodeCq;
	}
	
	public Boolean getIsTerminated() {
		return isTerminated;
	}
	
	public void setIsTerminated(Boolean isTerminated) {
		this.isTerminated = isTerminated;
	}
}

