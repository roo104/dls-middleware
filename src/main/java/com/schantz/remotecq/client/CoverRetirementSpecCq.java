package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class CoverRetirementSpecCq implements Serializable {
  @JsonProperty("interestIncrease")
  private Double interestIncrease = null;

  @JsonProperty("noOfMonths")
  private Long noOfMonths = null;

  @JsonProperty("endDate")
  private LocalDate endDate = null;

  @JsonProperty("transferPct")
  private Double transferPct = null;

  @JsonProperty("transferAmount")
  private Double transferAmount = null;

  @JsonProperty("benefitInformationEventSpecCqCollection")
  private List<BenefitInformationEventSpecCq> benefitInformationEventSpecCqCollection = new ArrayList<BenefitInformationEventSpecCq>();

  @JsonProperty("policyCoverIdCq")
  private PolicyCoverIdCq policyCoverIdCq = null;

  @JsonProperty("taxCodeCq")
  private String taxCodeCq = null;


  public Double getInterestIncrease() {
    return interestIncrease;
  }

  public void setInterestIncrease(Double interestIncrease) {
    this.interestIncrease = interestIncrease;
  }

  public Long getNoOfMonths() {
    return noOfMonths;
  }

  public void setNoOfMonths(Long noOfMonths) {
    this.noOfMonths = noOfMonths;
  }

  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  public Double getTransferPct() {
    return transferPct;
  }

  public void setTransferPct(Double transferPct) {
    this.transferPct = transferPct;
  }

  public Double getTransferAmount() {
    return transferAmount;
  }

  public void setTransferAmount(Double transferAmount) {
    this.transferAmount = transferAmount;
  }
  public CoverRetirementSpecCq addBenefitInformationEventSpecCqCollectionItem(BenefitInformationEventSpecCq benefitInformationEventSpecCqCollectionItem) {
    this.benefitInformationEventSpecCqCollection.add(benefitInformationEventSpecCqCollectionItem);
    return this;
  }

  public List<BenefitInformationEventSpecCq> getBenefitInformationEventSpecCqCollection() {
    return benefitInformationEventSpecCqCollection;
  }

  public void setBenefitInformationEventSpecCqCollection(List<BenefitInformationEventSpecCq> benefitInformationEventSpecCqCollection) {
    this.benefitInformationEventSpecCqCollection = benefitInformationEventSpecCqCollection;
  }

  public PolicyCoverIdCq getPolicyCoverIdCq() {
    return policyCoverIdCq;
  }

  public void setPolicyCoverIdCq(PolicyCoverIdCq policyCoverIdCq) {
    this.policyCoverIdCq = policyCoverIdCq;
  }

  public String getTaxCodeCq() {
    return taxCodeCq;
  }

  public void setTaxCodeCq(String taxCodeCq) {
    this.taxCodeCq = taxCodeCq;
  }
}

