package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class PayablesReceiverReferrableCq implements Serializable {
  @JsonProperty("accountNumber")
  private String accountNumber = null;

  @JsonProperty("balance")
  private Double balance = null;

  @JsonProperty("referrableUid")
  private String referrableUid = null;

  @JsonProperty("claimedBy")
  private String claimedBy = null;

  @JsonProperty("authorizedBy")
  private String authorizedBy = null;

  @JsonProperty("authorizedDate")
  private OffsetDateTime authorizedDate = null;

  @JsonProperty("referralReasonCqCollection")
  private List<ReferralReasonCq> referralReasonCqCollection = new ArrayList<ReferralReasonCq>();

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("legalPartyIdCq")
  private LegalPartyIdCq legalPartyIdCq = null;

  @JsonProperty("oiAccountTypeCq")
  private String oiAccountTypeCq = null;

  @JsonProperty("payablesChannelTypeCq")
  private String payablesChannelTypeCq = null;

  @JsonProperty("isStopPayment")
  private Boolean isStopPayment = false;

  @JsonProperty("isReferredForAuthorization")
  private Boolean isReferredForAuthorization = false;


  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public Double getBalance() {
    return balance;
  }

  public void setBalance(Double balance) {
    this.balance = balance;
  }

  public String getReferrableUid() {
    return referrableUid;
  }

  public void setReferrableUid(String referrableUid) {
    this.referrableUid = referrableUid;
  }

  public String getClaimedBy() {
    return claimedBy;
  }

  public void setClaimedBy(String claimedBy) {
    this.claimedBy = claimedBy;
  }

  public String getAuthorizedBy() {
    return authorizedBy;
  }

  public void setAuthorizedBy(String authorizedBy) {
    this.authorizedBy = authorizedBy;
  }

  public OffsetDateTime getAuthorizedDate() {
    return authorizedDate;
  }

  public void setAuthorizedDate(OffsetDateTime authorizedDate) {
    this.authorizedDate = authorizedDate;
  }
  public PayablesReceiverReferrableCq addReferralReasonCqCollectionItem(ReferralReasonCq referralReasonCqCollectionItem) {
    this.referralReasonCqCollection.add(referralReasonCqCollectionItem);
    return this;
  }

  public List<ReferralReasonCq> getReferralReasonCqCollection() {
    return referralReasonCqCollection;
  }

  public void setReferralReasonCqCollection(List<ReferralReasonCq> referralReasonCqCollection) {
    this.referralReasonCqCollection = referralReasonCqCollection;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public LegalPartyIdCq getLegalPartyIdCq() {
    return legalPartyIdCq;
  }

  public void setLegalPartyIdCq(LegalPartyIdCq legalPartyIdCq) {
    this.legalPartyIdCq = legalPartyIdCq;
  }

  public String getOiAccountTypeCq() {
    return oiAccountTypeCq;
  }

  public void setOiAccountTypeCq(String oiAccountTypeCq) {
    this.oiAccountTypeCq = oiAccountTypeCq;
  }

  public String getPayablesChannelTypeCq() {
    return payablesChannelTypeCq;
  }

  public void setPayablesChannelTypeCq(String payablesChannelTypeCq) {
    this.payablesChannelTypeCq = payablesChannelTypeCq;
  }

  public Boolean getIsStopPayment() {
    return isStopPayment;
  }

  public void setIsStopPayment(Boolean isStopPayment) {
    this.isStopPayment = isStopPayment;
  }

  public Boolean getIsReferredForAuthorization() {
    return isReferredForAuthorization;
  }

  public void setIsReferredForAuthorization(Boolean isReferredForAuthorization) {
    this.isReferredForAuthorization = isReferredForAuthorization;
  }
}

