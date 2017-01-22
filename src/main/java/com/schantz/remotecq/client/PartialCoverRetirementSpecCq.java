package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class PartialCoverRetirementSpecCq implements Serializable {
  @JsonProperty("interestIncrease")
  private Double interestIncrease = null;

  @JsonProperty("endDate")
  private LocalDate endDate = null;

  @JsonProperty("retirementPercentage")
  private Double retirementPercentage = null;

  @JsonProperty("noOfMonths")
  private Long noOfMonths = null;

  @JsonProperty("transferPct")
  private Double transferPct = null;

  @JsonProperty("transferAmount")
  private Double transferAmount = null;

  @JsonProperty("retirementAmount")
  private Double retirementAmount = null;

  @JsonProperty("policyCoverIdCq")
  private PolicyCoverIdCq policyCoverIdCq = null;

  @JsonProperty("benefitInformationEventSpecCqCollection")
  private List<BenefitInformationEventSpecCq> benefitInformationEventSpecCqCollection = new ArrayList<BenefitInformationEventSpecCq>();

  @JsonProperty("taxCodeCq")
  private String taxCodeCq = null;


  public Double getInterestIncrease() {
    return interestIncrease;
  }

  public void setInterestIncrease(Double interestIncrease) {
    this.interestIncrease = interestIncrease;
  }

  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  public Double getRetirementPercentage() {
    return retirementPercentage;
  }

  public void setRetirementPercentage(Double retirementPercentage) {
    this.retirementPercentage = retirementPercentage;
  }

  public Long getNoOfMonths() {
    return noOfMonths;
  }

  public void setNoOfMonths(Long noOfMonths) {
    this.noOfMonths = noOfMonths;
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

  public Double getRetirementAmount() {
    return retirementAmount;
  }

  public void setRetirementAmount(Double retirementAmount) {
    this.retirementAmount = retirementAmount;
  }

  public PolicyCoverIdCq getPolicyCoverIdCq() {
    return policyCoverIdCq;
  }

  public void setPolicyCoverIdCq(PolicyCoverIdCq policyCoverIdCq) {
    this.policyCoverIdCq = policyCoverIdCq;
  }
  public PartialCoverRetirementSpecCq addBenefitInformationEventSpecCqCollectionItem(BenefitInformationEventSpecCq benefitInformationEventSpecCqCollectionItem) {
    this.benefitInformationEventSpecCqCollection.add(benefitInformationEventSpecCqCollectionItem);
    return this;
  }

  public List<BenefitInformationEventSpecCq> getBenefitInformationEventSpecCqCollection() {
    return benefitInformationEventSpecCqCollection;
  }

  public void setBenefitInformationEventSpecCqCollection(List<BenefitInformationEventSpecCq> benefitInformationEventSpecCqCollection) {
    this.benefitInformationEventSpecCqCollection = benefitInformationEventSpecCqCollection;
  }

  public String getTaxCodeCq() {
    return taxCodeCq;
  }

  public void setTaxCodeCq(String taxCodeCq) {
    this.taxCodeCq = taxCodeCq;
  }
}

