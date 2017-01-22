package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class CalculationDataEntryCq implements Serializable {
  @JsonProperty("aggregationCount")
  private Long aggregationCount = null;

  @JsonProperty("riskEnd")
  private Long riskEnd = null;

  @JsonProperty("age")
  private Long age = null;

  @JsonProperty("riskSum")
  private Double riskSum = null;

  @JsonProperty("benefitEnd")
  private Long benefitEnd = null;

  @JsonProperty("premiumEnd")
  private Long premiumEnd = null;

  @JsonProperty("settlingPeriods")
  private Long settlingPeriods = null;

  @JsonProperty("genderCq")
  private String genderCq = null;

  @JsonProperty("userDefinedCalculationDataEntryId")
  private UserDefinedCalculationDataEntryId userDefinedCalculationDataEntryId = null;

  @JsonProperty("policyCoverIdCqCollection")
  private List<PolicyCoverIdCq> policyCoverIdCqCollection = new ArrayList<PolicyCoverIdCq>();


  public Long getAggregationCount() {
    return aggregationCount;
  }

  public void setAggregationCount(Long aggregationCount) {
    this.aggregationCount = aggregationCount;
  }

  public Long getRiskEnd() {
    return riskEnd;
  }

  public void setRiskEnd(Long riskEnd) {
    this.riskEnd = riskEnd;
  }

  public Long getAge() {
    return age;
  }

  public void setAge(Long age) {
    this.age = age;
  }

  public Double getRiskSum() {
    return riskSum;
  }

  public void setRiskSum(Double riskSum) {
    this.riskSum = riskSum;
  }

  public Long getBenefitEnd() {
    return benefitEnd;
  }

  public void setBenefitEnd(Long benefitEnd) {
    this.benefitEnd = benefitEnd;
  }

  public Long getPremiumEnd() {
    return premiumEnd;
  }

  public void setPremiumEnd(Long premiumEnd) {
    this.premiumEnd = premiumEnd;
  }

  public Long getSettlingPeriods() {
    return settlingPeriods;
  }

  public void setSettlingPeriods(Long settlingPeriods) {
    this.settlingPeriods = settlingPeriods;
  }

  public String getGenderCq() {
    return genderCq;
  }

  public void setGenderCq(String genderCq) {
    this.genderCq = genderCq;
  }

  public UserDefinedCalculationDataEntryId getUserDefinedCalculationDataEntryId() {
    return userDefinedCalculationDataEntryId;
  }

  public void setUserDefinedCalculationDataEntryId(UserDefinedCalculationDataEntryId userDefinedCalculationDataEntryId) {
    this.userDefinedCalculationDataEntryId = userDefinedCalculationDataEntryId;
  }
  public CalculationDataEntryCq addPolicyCoverIdCqCollectionItem(PolicyCoverIdCq policyCoverIdCqCollectionItem) {
    this.policyCoverIdCqCollection.add(policyCoverIdCqCollectionItem);
    return this;
  }

  public List<PolicyCoverIdCq> getPolicyCoverIdCqCollection() {
    return policyCoverIdCqCollection;
  }

  public void setPolicyCoverIdCqCollection(List<PolicyCoverIdCq> policyCoverIdCqCollection) {
    this.policyCoverIdCqCollection = policyCoverIdCqCollection;
  }
}

