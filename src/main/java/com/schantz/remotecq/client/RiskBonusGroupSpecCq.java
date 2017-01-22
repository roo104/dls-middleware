package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class RiskBonusGroupSpecCq implements Serializable {
  @JsonProperty("administrationCost")
  private Double administrationCost = null;

  @JsonProperty("maxDamages")
  private Double maxDamages = null;

  @JsonProperty("surplusDistributionSelectionCqCollection")
  private List<SurplusDistributionSelectionCq> surplusDistributionSelectionCqCollection = new ArrayList<SurplusDistributionSelectionCq>();

  @JsonProperty("depreciationSpecCq")
  private DepreciationSpecCq depreciationSpecCq = null;

  @JsonProperty("poolingNetworkCq")
  private String poolingNetworkCq = null;

  @JsonProperty("statementPeriodCq")
  private String statementPeriodCq = null;

  @JsonProperty("isCommissionIncluded")
  private Boolean isCommissionIncluded = false;

  @JsonProperty("isLossCarriedOver")
  private Boolean isLossCarriedOver = false;

  @JsonProperty("isPooling")
  private Boolean isPooling = false;


  public Double getAdministrationCost() {
    return administrationCost;
  }

  public void setAdministrationCost(Double administrationCost) {
    this.administrationCost = administrationCost;
  }

  public Double getMaxDamages() {
    return maxDamages;
  }

  public void setMaxDamages(Double maxDamages) {
    this.maxDamages = maxDamages;
  }
  public RiskBonusGroupSpecCq addSurplusDistributionSelectionCqCollectionItem(SurplusDistributionSelectionCq surplusDistributionSelectionCqCollectionItem) {
    this.surplusDistributionSelectionCqCollection.add(surplusDistributionSelectionCqCollectionItem);
    return this;
  }

  public List<SurplusDistributionSelectionCq> getSurplusDistributionSelectionCqCollection() {
    return surplusDistributionSelectionCqCollection;
  }

  public void setSurplusDistributionSelectionCqCollection(List<SurplusDistributionSelectionCq> surplusDistributionSelectionCqCollection) {
    this.surplusDistributionSelectionCqCollection = surplusDistributionSelectionCqCollection;
  }

  public DepreciationSpecCq getDepreciationSpecCq() {
    return depreciationSpecCq;
  }

  public void setDepreciationSpecCq(DepreciationSpecCq depreciationSpecCq) {
    this.depreciationSpecCq = depreciationSpecCq;
  }

  public String getPoolingNetworkCq() {
    return poolingNetworkCq;
  }

  public void setPoolingNetworkCq(String poolingNetworkCq) {
    this.poolingNetworkCq = poolingNetworkCq;
  }

  public String getStatementPeriodCq() {
    return statementPeriodCq;
  }

  public void setStatementPeriodCq(String statementPeriodCq) {
    this.statementPeriodCq = statementPeriodCq;
  }

  public Boolean getIsCommissionIncluded() {
    return isCommissionIncluded;
  }

  public void setIsCommissionIncluded(Boolean isCommissionIncluded) {
    this.isCommissionIncluded = isCommissionIncluded;
  }

  public Boolean getIsLossCarriedOver() {
    return isLossCarriedOver;
  }

  public void setIsLossCarriedOver(Boolean isLossCarriedOver) {
    this.isLossCarriedOver = isLossCarriedOver;
  }

  public Boolean getIsPooling() {
    return isPooling;
  }

  public void setIsPooling(Boolean isPooling) {
    this.isPooling = isPooling;
  }
}

