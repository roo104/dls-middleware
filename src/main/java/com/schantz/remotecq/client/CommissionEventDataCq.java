package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class CommissionEventDataCq implements Serializable {
  @JsonProperty("eventDate")
  private LocalDate eventDate = null;

  @JsonProperty("singlePremium")
  private Double singlePremium = null;

  @JsonProperty("commissionSum")
  private Double commissionSum = null;

  @JsonProperty("contributionDelta")
  private Double contributionDelta = null;

  @JsonProperty("noCommissionReason")
  private String noCommissionReason = null;

  @JsonProperty("contributionBefore")
  private Double contributionBefore = null;

  @JsonProperty("contributionAfter")
  private Double contributionAfter = null;

  @JsonProperty("policyIdCq")
  private PolicyIdCq policyIdCq = null;

  @JsonProperty("lifeEventTypeCq")
  private LifeEventTypeCq lifeEventTypeCq = null;

  @JsonProperty("commissionPaymentidCqCollection")
  private List<CommissionPaymentidCq> commissionPaymentidCqCollection = new ArrayList<CommissionPaymentidCq>();

  @JsonProperty("commissionTypeCq")
  private String commissionTypeCq = null;

  @JsonProperty("isCancelledMarked")
  private Boolean isCancelledMarked = false;

  @JsonProperty("isCancelledHandled")
  private Boolean isCancelledHandled = false;

  @JsonProperty("isCommissionHandled")
  private Boolean isCommissionHandled = false;

  @JsonProperty("isCommissionPresent")
  private Boolean isCommissionPresent = false;

  @JsonProperty("isNoCommission")
  private Boolean isNoCommission = false;


  public LocalDate getEventDate() {
    return eventDate;
  }

  public void setEventDate(LocalDate eventDate) {
    this.eventDate = eventDate;
  }

  public Double getSinglePremium() {
    return singlePremium;
  }

  public void setSinglePremium(Double singlePremium) {
    this.singlePremium = singlePremium;
  }

  public Double getCommissionSum() {
    return commissionSum;
  }

  public void setCommissionSum(Double commissionSum) {
    this.commissionSum = commissionSum;
  }

  public Double getContributionDelta() {
    return contributionDelta;
  }

  public void setContributionDelta(Double contributionDelta) {
    this.contributionDelta = contributionDelta;
  }

  public String getNoCommissionReason() {
    return noCommissionReason;
  }

  public void setNoCommissionReason(String noCommissionReason) {
    this.noCommissionReason = noCommissionReason;
  }

  public Double getContributionBefore() {
    return contributionBefore;
  }

  public void setContributionBefore(Double contributionBefore) {
    this.contributionBefore = contributionBefore;
  }

  public Double getContributionAfter() {
    return contributionAfter;
  }

  public void setContributionAfter(Double contributionAfter) {
    this.contributionAfter = contributionAfter;
  }

  public PolicyIdCq getPolicyIdCq() {
    return policyIdCq;
  }

  public void setPolicyIdCq(PolicyIdCq policyIdCq) {
    this.policyIdCq = policyIdCq;
  }

  public LifeEventTypeCq getLifeEventTypeCq() {
    return lifeEventTypeCq;
  }

  public void setLifeEventTypeCq(LifeEventTypeCq lifeEventTypeCq) {
    this.lifeEventTypeCq = lifeEventTypeCq;
  }
  public CommissionEventDataCq addCommissionPaymentidCqCollectionItem(CommissionPaymentidCq commissionPaymentidCqCollectionItem) {
    this.commissionPaymentidCqCollection.add(commissionPaymentidCqCollectionItem);
    return this;
  }

  public List<CommissionPaymentidCq> getCommissionPaymentidCqCollection() {
    return commissionPaymentidCqCollection;
  }

  public void setCommissionPaymentidCqCollection(List<CommissionPaymentidCq> commissionPaymentidCqCollection) {
    this.commissionPaymentidCqCollection = commissionPaymentidCqCollection;
  }

  public String getCommissionTypeCq() {
    return commissionTypeCq;
  }

  public void setCommissionTypeCq(String commissionTypeCq) {
    this.commissionTypeCq = commissionTypeCq;
  }

  public Boolean getIsCancelledMarked() {
    return isCancelledMarked;
  }

  public void setIsCancelledMarked(Boolean isCancelledMarked) {
    this.isCancelledMarked = isCancelledMarked;
  }

  public Boolean getIsCancelledHandled() {
    return isCancelledHandled;
  }

  public void setIsCancelledHandled(Boolean isCancelledHandled) {
    this.isCancelledHandled = isCancelledHandled;
  }

  public Boolean getIsCommissionHandled() {
    return isCommissionHandled;
  }

  public void setIsCommissionHandled(Boolean isCommissionHandled) {
    this.isCommissionHandled = isCommissionHandled;
  }

  public Boolean getIsCommissionPresent() {
    return isCommissionPresent;
  }

  public void setIsCommissionPresent(Boolean isCommissionPresent) {
    this.isCommissionPresent = isCommissionPresent;
  }

  public Boolean getIsNoCommission() {
    return isNoCommission;
  }

  public void setIsNoCommission(Boolean isNoCommission) {
    this.isNoCommission = isNoCommission;
  }
}

