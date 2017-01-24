package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class OiAccountItemCq implements Serializable {
	@JsonProperty("postingsId")
	private Long postingsId = null;
	
	@JsonProperty("policyId")
	private String policyId = null;
	
	@JsonProperty("transactionDate")
	private OffsetDateTime transactionDate = null;
	
	@JsonProperty("valeurDate")
	private LocalDate valeurDate = null;
	
	@JsonProperty("dueDate")
	private LocalDate dueDate = null;
	
	@JsonProperty("dueDateEnd")
	private LocalDate dueDateEnd = null;
	
	@JsonProperty("amount")
	private Double amount = null;
	
	@JsonProperty("doubleEntryId")
	private Long doubleEntryId = null;
	
	@JsonProperty("doubleEntryAccountDesc")
	private String doubleEntryAccountDesc = null;
	
	@JsonProperty("mirrorId")
	private Long mirrorId = null;
	
	@JsonProperty("reference")
	private String reference = null;
	
	@JsonProperty("createUser")
	private String createUser = null;
	
	@JsonProperty("unmatchedAmount")
	private Double unmatchedAmount = null;
	
	@JsonProperty("match")
	private String match = null;
	
	@JsonProperty("isCancelled")
	private Boolean isCancelled = false;
	
	@JsonProperty("manual")
	private Boolean manual = false;
	
	@JsonProperty("unitLink")
	private Boolean unitLink = false;
	
	@JsonProperty("oiAccountVoucherTypeCq")
	private String oiAccountVoucherTypeCq = null;
	
	@JsonProperty("oiAccountItemIdCq")
	private OiAccountItemIdCq oiAccountItemIdCq = null;
	
	@JsonProperty("oiAccountItemActionCqCollection")
	private List<String> oiAccountItemActionCqCollection = new ArrayList<String>();
	
	@JsonProperty("oiAccountItemMatchStateCq")
	private String oiAccountItemMatchStateCq = null;
	
	@JsonProperty("doubleEntryAccountType")
	private String doubleEntryAccountType = null;
	
	@JsonProperty("policyReceivableIdCq")
	private PolicyReceivableIdCq policyReceivableIdCq = null;
	
	@JsonProperty("oiAccountVoucherSubTypeCq")
	private OiAccountVoucherSubTypeCq oiAccountVoucherSubTypeCq = null;
	
	@JsonProperty("accountTypeCq")
	private String accountTypeCq = null;
	
	@JsonProperty("oiAccountItemVoucherStatusCq")
	private String oiAccountItemVoucherStatusCq = null;
	
	
	public Long getPostingsId() {
		return postingsId;
	}
	
	public void setPostingsId(Long postingsId) {
		this.postingsId = postingsId;
	}
	
	public String getPolicyId() {
		return policyId;
	}
	
	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}
	
	public OffsetDateTime getTransactionDate() {
		return transactionDate;
	}
	
	public void setTransactionDate(OffsetDateTime transactionDate) {
		this.transactionDate = transactionDate;
	}
	
	public LocalDate getValeurDate() {
		return valeurDate;
	}
	
	public void setValeurDate(LocalDate valeurDate) {
		this.valeurDate = valeurDate;
	}
	
	public LocalDate getDueDate() {
		return dueDate;
	}
	
	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}
	
	public LocalDate getDueDateEnd() {
		return dueDateEnd;
	}
	
	public void setDueDateEnd(LocalDate dueDateEnd) {
		this.dueDateEnd = dueDateEnd;
	}
	
	public Double getAmount() {
		return amount;
	}
	
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	public Long getDoubleEntryId() {
		return doubleEntryId;
	}
	
	public void setDoubleEntryId(Long doubleEntryId) {
		this.doubleEntryId = doubleEntryId;
	}
	
	public String getDoubleEntryAccountDesc() {
		return doubleEntryAccountDesc;
	}
	
	public void setDoubleEntryAccountDesc(String doubleEntryAccountDesc) {
		this.doubleEntryAccountDesc = doubleEntryAccountDesc;
	}
	
	public Long getMirrorId() {
		return mirrorId;
	}
	
	public void setMirrorId(Long mirrorId) {
		this.mirrorId = mirrorId;
	}
	
	public String getReference() {
		return reference;
	}
	
	public void setReference(String reference) {
		this.reference = reference;
	}
	
	public String getCreateUser() {
		return createUser;
	}
	
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	
	public Double getUnmatchedAmount() {
		return unmatchedAmount;
	}
	
	public void setUnmatchedAmount(Double unmatchedAmount) {
		this.unmatchedAmount = unmatchedAmount;
	}
	
	public String getMatch() {
		return match;
	}
	
	public void setMatch(String match) {
		this.match = match;
	}
	
	public Boolean getIsCancelled() {
		return isCancelled;
	}
	
	public void setIsCancelled(Boolean isCancelled) {
		this.isCancelled = isCancelled;
	}
	
	public Boolean getManual() {
		return manual;
	}
	
	public void setManual(Boolean manual) {
		this.manual = manual;
	}
	
	public Boolean getUnitLink() {
		return unitLink;
	}
	
	public void setUnitLink(Boolean unitLink) {
		this.unitLink = unitLink;
	}
	
	public String getOiAccountVoucherTypeCq() {
		return oiAccountVoucherTypeCq;
	}
	
	public void setOiAccountVoucherTypeCq(String oiAccountVoucherTypeCq) {
		this.oiAccountVoucherTypeCq = oiAccountVoucherTypeCq;
	}
	
	public OiAccountItemIdCq getOiAccountItemIdCq() {
		return oiAccountItemIdCq;
	}
	
	public void setOiAccountItemIdCq(OiAccountItemIdCq oiAccountItemIdCq) {
		this.oiAccountItemIdCq = oiAccountItemIdCq;
	}
	
	public OiAccountItemCq addOiAccountItemActionCqCollectionItem(String oiAccountItemActionCqCollectionItem) {
		this.oiAccountItemActionCqCollection.add(oiAccountItemActionCqCollectionItem);
		return this;
	}
	
	public List<String> getOiAccountItemActionCqCollection() {
		return oiAccountItemActionCqCollection;
	}
	
	public void setOiAccountItemActionCqCollection(List<String> oiAccountItemActionCqCollection) {
		this.oiAccountItemActionCqCollection = oiAccountItemActionCqCollection;
	}
	
	public String getOiAccountItemMatchStateCq() {
		return oiAccountItemMatchStateCq;
	}
	
	public void setOiAccountItemMatchStateCq(String oiAccountItemMatchStateCq) {
		this.oiAccountItemMatchStateCq = oiAccountItemMatchStateCq;
	}
	
	public String getDoubleEntryAccountType() {
		return doubleEntryAccountType;
	}
	
	public void setDoubleEntryAccountType(String doubleEntryAccountType) {
		this.doubleEntryAccountType = doubleEntryAccountType;
	}
	
	public PolicyReceivableIdCq getPolicyReceivableIdCq() {
		return policyReceivableIdCq;
	}
	
	public void setPolicyReceivableIdCq(PolicyReceivableIdCq policyReceivableIdCq) {
		this.policyReceivableIdCq = policyReceivableIdCq;
	}
	
	public OiAccountVoucherSubTypeCq getOiAccountVoucherSubTypeCq() {
		return oiAccountVoucherSubTypeCq;
	}
	
	public void setOiAccountVoucherSubTypeCq(OiAccountVoucherSubTypeCq oiAccountVoucherSubTypeCq) {
		this.oiAccountVoucherSubTypeCq = oiAccountVoucherSubTypeCq;
	}
	
	public String getAccountTypeCq() {
		return accountTypeCq;
	}
	
	public void setAccountTypeCq(String accountTypeCq) {
		this.accountTypeCq = accountTypeCq;
	}
	
	public String getOiAccountItemVoucherStatusCq() {
		return oiAccountItemVoucherStatusCq;
	}
	
	public void setOiAccountItemVoucherStatusCq(String oiAccountItemVoucherStatusCq) {
		this.oiAccountItemVoucherStatusCq = oiAccountItemVoucherStatusCq;
	}
}

