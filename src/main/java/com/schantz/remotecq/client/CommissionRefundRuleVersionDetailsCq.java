package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class CommissionRefundRuleVersionDetailsCq implements Serializable {
	@JsonProperty("cancelTime")
	private OffsetDateTime cancelTime = null;
	
	@JsonProperty("startDate")
	private LocalDate startDate = null;
	
	@JsonProperty("endDate")
	private LocalDate endDate = null;
	
	@JsonProperty("createUser")
	private String createUser = null;
	
	@JsonProperty("createTime")
	private OffsetDateTime createTime = null;
	
	@JsonProperty("versionNote")
	private String versionNote = null;
	
	@JsonProperty("versionNumber")
	private String versionNumber = null;
	
	@JsonProperty("commissionRefundRuleEntryCqCollection")
	private List<CommissionRefundRuleEntryCq> commissionRefundRuleEntryCqCollection = new ArrayList<CommissionRefundRuleEntryCq>();
	
	@JsonProperty("commissionRefundRuleCq")
	private CommissionRefundRuleCq commissionRefundRuleCq = null;
	
	@JsonProperty("commissionRefundRuleVersionIdCq")
	private CommissionRefundRuleVersionIdCq commissionRefundRuleVersionIdCq = null;
	
	@JsonProperty("isCancelled")
	private Boolean isCancelled = false;
	
	@JsonProperty("isDraft")
	private Boolean isDraft = false;
	
	
	public OffsetDateTime getCancelTime() {
		return cancelTime;
	}
	
	public void setCancelTime(OffsetDateTime cancelTime) {
		this.cancelTime = cancelTime;
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
	
	public String getCreateUser() {
		return createUser;
	}
	
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	
	public OffsetDateTime getCreateTime() {
		return createTime;
	}
	
	public void setCreateTime(OffsetDateTime createTime) {
		this.createTime = createTime;
	}
	
	public String getVersionNote() {
		return versionNote;
	}
	
	public void setVersionNote(String versionNote) {
		this.versionNote = versionNote;
	}
	
	public String getVersionNumber() {
		return versionNumber;
	}
	
	public void setVersionNumber(String versionNumber) {
		this.versionNumber = versionNumber;
	}
	
	public CommissionRefundRuleVersionDetailsCq addCommissionRefundRuleEntryCqCollectionItem(CommissionRefundRuleEntryCq commissionRefundRuleEntryCqCollectionItem) {
		this.commissionRefundRuleEntryCqCollection.add(commissionRefundRuleEntryCqCollectionItem);
		return this;
	}
	
	public List<CommissionRefundRuleEntryCq> getCommissionRefundRuleEntryCqCollection() {
		return commissionRefundRuleEntryCqCollection;
	}
	
	public void setCommissionRefundRuleEntryCqCollection(List<CommissionRefundRuleEntryCq> commissionRefundRuleEntryCqCollection) {
		this.commissionRefundRuleEntryCqCollection = commissionRefundRuleEntryCqCollection;
	}
	
	public CommissionRefundRuleCq getCommissionRefundRuleCq() {
		return commissionRefundRuleCq;
	}
	
	public void setCommissionRefundRuleCq(CommissionRefundRuleCq commissionRefundRuleCq) {
		this.commissionRefundRuleCq = commissionRefundRuleCq;
	}
	
	public CommissionRefundRuleVersionIdCq getCommissionRefundRuleVersionIdCq() {
		return commissionRefundRuleVersionIdCq;
	}
	
	public void setCommissionRefundRuleVersionIdCq(CommissionRefundRuleVersionIdCq commissionRefundRuleVersionIdCq) {
		this.commissionRefundRuleVersionIdCq = commissionRefundRuleVersionIdCq;
	}
	
	public Boolean getIsCancelled() {
		return isCancelled;
	}
	
	public void setIsCancelled(Boolean isCancelled) {
		this.isCancelled = isCancelled;
	}
	
	public Boolean getIsDraft() {
		return isDraft;
	}
	
	public void setIsDraft(Boolean isDraft) {
		this.isDraft = isDraft;
	}
}

