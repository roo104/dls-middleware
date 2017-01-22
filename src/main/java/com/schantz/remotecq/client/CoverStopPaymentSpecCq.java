package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class CoverStopPaymentSpecCq implements Serializable {
  @JsonProperty("noOfMonths")
  private Long noOfMonths = null;

  @JsonProperty("endDate")
  private LocalDate endDate = null;

  @JsonProperty("inheritanceTax")
  private Double inheritanceTax = null;

  @JsonProperty("benefitInformationEventSpecCqCollection")
  private List<BenefitInformationEventSpecCq> benefitInformationEventSpecCqCollection = new ArrayList<BenefitInformationEventSpecCq>();

  @JsonProperty("policyCoverIdCq")
  private PolicyCoverIdCq policyCoverIdCq = null;


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

  public Double getInheritanceTax() {
    return inheritanceTax;
  }

  public void setInheritanceTax(Double inheritanceTax) {
    this.inheritanceTax = inheritanceTax;
  }
  public CoverStopPaymentSpecCq addBenefitInformationEventSpecCqCollectionItem(BenefitInformationEventSpecCq benefitInformationEventSpecCqCollectionItem) {
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
}

