package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class OiAccountItemDetailsCq implements Serializable {
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

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("glAccount1")
  private String glAccount1 = null;

  @JsonProperty("glAccount2")
  private String glAccount2 = null;

  @JsonProperty("glDate")
  private LocalDate glDate = null;

  @JsonProperty("glDim1")
  private String glDim1 = null;

  @JsonProperty("glDim2")
  private String glDim2 = null;

  @JsonProperty("glDim3")
  private String glDim3 = null;

  @JsonProperty("glDim4")
  private String glDim4 = null;

  @JsonProperty("glDim5")
  private String glDim5 = null;

  @JsonProperty("glDim6")
  private String glDim6 = null;

  @JsonProperty("glDim7")
  private String glDim7 = null;

  @JsonProperty("glDim8")
  private String glDim8 = null;

  @JsonProperty("referenceNo")
  private String referenceNo = null;

  @JsonProperty("oiAccountVoucherCq")
  private OiAccountVoucherCq oiAccountVoucherCq = null;

  @JsonProperty("accountOwner")
  private LegalPartyIdCq accountOwner = null;

  @JsonProperty("policyIdCq")
  private PolicyIdCq policyIdCq = null;


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
  public OiAccountItemDetailsCq addOiAccountItemActionCqCollectionItem(String oiAccountItemActionCqCollectionItem) {
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

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getGlAccount1() {
    return glAccount1;
  }

  public void setGlAccount1(String glAccount1) {
    this.glAccount1 = glAccount1;
  }

  public String getGlAccount2() {
    return glAccount2;
  }

  public void setGlAccount2(String glAccount2) {
    this.glAccount2 = glAccount2;
  }

  public LocalDate getGlDate() {
    return glDate;
  }

  public void setGlDate(LocalDate glDate) {
    this.glDate = glDate;
  }

  public String getGlDim1() {
    return glDim1;
  }

  public void setGlDim1(String glDim1) {
    this.glDim1 = glDim1;
  }

  public String getGlDim2() {
    return glDim2;
  }

  public void setGlDim2(String glDim2) {
    this.glDim2 = glDim2;
  }

  public String getGlDim3() {
    return glDim3;
  }

  public void setGlDim3(String glDim3) {
    this.glDim3 = glDim3;
  }

  public String getGlDim4() {
    return glDim4;
  }

  public void setGlDim4(String glDim4) {
    this.glDim4 = glDim4;
  }

  public String getGlDim5() {
    return glDim5;
  }

  public void setGlDim5(String glDim5) {
    this.glDim5 = glDim5;
  }

  public String getGlDim6() {
    return glDim6;
  }

  public void setGlDim6(String glDim6) {
    this.glDim6 = glDim6;
  }

  public String getGlDim7() {
    return glDim7;
  }

  public void setGlDim7(String glDim7) {
    this.glDim7 = glDim7;
  }

  public String getGlDim8() {
    return glDim8;
  }

  public void setGlDim8(String glDim8) {
    this.glDim8 = glDim8;
  }

  public String getReferenceNo() {
    return referenceNo;
  }

  public void setReferenceNo(String referenceNo) {
    this.referenceNo = referenceNo;
  }

  public OiAccountVoucherCq getOiAccountVoucherCq() {
    return oiAccountVoucherCq;
  }

  public void setOiAccountVoucherCq(OiAccountVoucherCq oiAccountVoucherCq) {
    this.oiAccountVoucherCq = oiAccountVoucherCq;
  }

  public LegalPartyIdCq getAccountOwner() {
    return accountOwner;
  }

  public void setAccountOwner(LegalPartyIdCq accountOwner) {
    this.accountOwner = accountOwner;
  }

  public PolicyIdCq getPolicyIdCq() {
    return policyIdCq;
  }

  public void setPolicyIdCq(PolicyIdCq policyIdCq) {
    this.policyIdCq = policyIdCq;
  }
}

