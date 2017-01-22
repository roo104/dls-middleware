package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class TopPersonPremiumAndReserveInfo implements Serializable {
  @JsonProperty("policyId")
  private PolicyIdCq policyId = null;

  @JsonProperty("yearlyPremium")
  private Double yearlyPremium = null;

  @JsonProperty("reserve")
  private Double reserve = null;

  @JsonProperty("topPersonPremiumAndReserveDetailCollection")
  private List<TopPersonPremiumAndReserveDetail> topPersonPremiumAndReserveDetailCollection = new ArrayList<TopPersonPremiumAndReserveDetail>();

  @JsonProperty("isTotalRow")
  private Boolean isTotalRow = false;


  public PolicyIdCq getPolicyId() {
    return policyId;
  }

  public void setPolicyId(PolicyIdCq policyId) {
    this.policyId = policyId;
  }

  public Double getYearlyPremium() {
    return yearlyPremium;
  }

  public void setYearlyPremium(Double yearlyPremium) {
    this.yearlyPremium = yearlyPremium;
  }

  public Double getReserve() {
    return reserve;
  }

  public void setReserve(Double reserve) {
    this.reserve = reserve;
  }
  public TopPersonPremiumAndReserveInfo addTopPersonPremiumAndReserveDetailCollectionItem(TopPersonPremiumAndReserveDetail topPersonPremiumAndReserveDetailCollectionItem) {
    this.topPersonPremiumAndReserveDetailCollection.add(topPersonPremiumAndReserveDetailCollectionItem);
    return this;
  }

  public List<TopPersonPremiumAndReserveDetail> getTopPersonPremiumAndReserveDetailCollection() {
    return topPersonPremiumAndReserveDetailCollection;
  }

  public void setTopPersonPremiumAndReserveDetailCollection(List<TopPersonPremiumAndReserveDetail> topPersonPremiumAndReserveDetailCollection) {
    this.topPersonPremiumAndReserveDetailCollection = topPersonPremiumAndReserveDetailCollection;
  }

  public Boolean getIsTotalRow() {
    return isTotalRow;
  }

  public void setIsTotalRow(Boolean isTotalRow) {
    this.isTotalRow = isTotalRow;
  }
}

