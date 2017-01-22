package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class ClaimGrantHealthCareVersionCq implements Serializable {
  @JsonProperty("entity")
  private String entity = null;

  @JsonProperty("message")
  private CqMessageKey message = null;

  @JsonProperty("claimGrantVersionInfoCq")
  private ClaimGrantVersionInfoCq claimGrantVersionInfoCq = null;

  @JsonProperty("claimGrantCq")
  private ClaimGrantCq claimGrantCq = null;

  @JsonProperty("claimGrantStatusCq")
  private String claimGrantStatusCq = null;

  @JsonProperty("insured")
  private PersonIdCq insured = null;

  @JsonProperty("claimGrantCauseCq")
  private ClaimGrantCauseCq claimGrantCauseCq = null;

  @JsonProperty("policyCoverIdCq")
  private PolicyCoverIdCq policyCoverIdCq = null;

  @JsonProperty("claimRejectionCauseCq")
  private ClaimRejectionCauseCq claimRejectionCauseCq = null;

  @JsonProperty("productType")
  private String productType = null;

  @JsonProperty("totalCost")
  private Double totalCost = null;

  @JsonProperty("treatmentsLeft")
  private Long treatmentsLeft = null;

  @JsonProperty("periodStart")
  private LocalDate periodStart = null;

  @JsonProperty("periodEnd")
  private LocalDate periodEnd = null;

  @JsonProperty("treatmentsAllowed")
  private Long treatmentsAllowed = null;

  @JsonProperty("maximumAmount")
  private Double maximumAmount = null;

  @JsonProperty("companyIdCqCollection")
  private List<CompanyIdCq> companyIdCqCollection = new ArrayList<CompanyIdCq>();

  @JsonProperty("claimGrantHealthCareVersionIdCq")
  private ClaimGrantHealthCareVersionIdCq claimGrantHealthCareVersionIdCq = null;

  @JsonProperty("claimTreatmentProductCq")
  private ClaimTreatmentProductCq claimTreatmentProductCq = null;


  public String getEntity() {
    return entity;
  }

  public void setEntity(String entity) {
    this.entity = entity;
  }

  public CqMessageKey getMessage() {
    return message;
  }

  public void setMessage(CqMessageKey message) {
    this.message = message;
  }

  public ClaimGrantVersionInfoCq getClaimGrantVersionInfoCq() {
    return claimGrantVersionInfoCq;
  }

  public void setClaimGrantVersionInfoCq(ClaimGrantVersionInfoCq claimGrantVersionInfoCq) {
    this.claimGrantVersionInfoCq = claimGrantVersionInfoCq;
  }

  public ClaimGrantCq getClaimGrantCq() {
    return claimGrantCq;
  }

  public void setClaimGrantCq(ClaimGrantCq claimGrantCq) {
    this.claimGrantCq = claimGrantCq;
  }

  public String getClaimGrantStatusCq() {
    return claimGrantStatusCq;
  }

  public void setClaimGrantStatusCq(String claimGrantStatusCq) {
    this.claimGrantStatusCq = claimGrantStatusCq;
  }

  public PersonIdCq getInsured() {
    return insured;
  }

  public void setInsured(PersonIdCq insured) {
    this.insured = insured;
  }

  public ClaimGrantCauseCq getClaimGrantCauseCq() {
    return claimGrantCauseCq;
  }

  public void setClaimGrantCauseCq(ClaimGrantCauseCq claimGrantCauseCq) {
    this.claimGrantCauseCq = claimGrantCauseCq;
  }

  public PolicyCoverIdCq getPolicyCoverIdCq() {
    return policyCoverIdCq;
  }

  public void setPolicyCoverIdCq(PolicyCoverIdCq policyCoverIdCq) {
    this.policyCoverIdCq = policyCoverIdCq;
  }

  public ClaimRejectionCauseCq getClaimRejectionCauseCq() {
    return claimRejectionCauseCq;
  }

  public void setClaimRejectionCauseCq(ClaimRejectionCauseCq claimRejectionCauseCq) {
    this.claimRejectionCauseCq = claimRejectionCauseCq;
  }

  public String getProductType() {
    return productType;
  }

  public void setProductType(String productType) {
    this.productType = productType;
  }

  public Double getTotalCost() {
    return totalCost;
  }

  public void setTotalCost(Double totalCost) {
    this.totalCost = totalCost;
  }

  public Long getTreatmentsLeft() {
    return treatmentsLeft;
  }

  public void setTreatmentsLeft(Long treatmentsLeft) {
    this.treatmentsLeft = treatmentsLeft;
  }

  public LocalDate getPeriodStart() {
    return periodStart;
  }

  public void setPeriodStart(LocalDate periodStart) {
    this.periodStart = periodStart;
  }

  public LocalDate getPeriodEnd() {
    return periodEnd;
  }

  public void setPeriodEnd(LocalDate periodEnd) {
    this.periodEnd = periodEnd;
  }

  public Long getTreatmentsAllowed() {
    return treatmentsAllowed;
  }

  public void setTreatmentsAllowed(Long treatmentsAllowed) {
    this.treatmentsAllowed = treatmentsAllowed;
  }

  public Double getMaximumAmount() {
    return maximumAmount;
  }

  public void setMaximumAmount(Double maximumAmount) {
    this.maximumAmount = maximumAmount;
  }
  public ClaimGrantHealthCareVersionCq addCompanyIdCqCollectionItem(CompanyIdCq companyIdCqCollectionItem) {
    this.companyIdCqCollection.add(companyIdCqCollectionItem);
    return this;
  }

  public List<CompanyIdCq> getCompanyIdCqCollection() {
    return companyIdCqCollection;
  }

  public void setCompanyIdCqCollection(List<CompanyIdCq> companyIdCqCollection) {
    this.companyIdCqCollection = companyIdCqCollection;
  }

  public ClaimGrantHealthCareVersionIdCq getClaimGrantHealthCareVersionIdCq() {
    return claimGrantHealthCareVersionIdCq;
  }

  public void setClaimGrantHealthCareVersionIdCq(ClaimGrantHealthCareVersionIdCq claimGrantHealthCareVersionIdCq) {
    this.claimGrantHealthCareVersionIdCq = claimGrantHealthCareVersionIdCq;
  }

  public ClaimTreatmentProductCq getClaimTreatmentProductCq() {
    return claimTreatmentProductCq;
  }

  public void setClaimTreatmentProductCq(ClaimTreatmentProductCq claimTreatmentProductCq) {
    this.claimTreatmentProductCq = claimTreatmentProductCq;
  }
}

