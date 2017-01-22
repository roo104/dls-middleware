package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class CostAgreementQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("agreementCostDataCqCollection")
  private List<AgreementCostDataCq> agreementCostDataCqCollection = new ArrayList<AgreementCostDataCq>();

  @JsonProperty("costType")
  private String costType = null;

  @JsonProperty("costGroupIdCq")
  private CostGroupIdCq costGroupIdCq = null;

  @JsonProperty("actualCostType")
  private String actualCostType = null;

  public CostAgreementQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }
  public CostAgreementQueryResult addAgreementCostDataCqCollectionItem(AgreementCostDataCq agreementCostDataCqCollectionItem) {
    this.agreementCostDataCqCollection.add(agreementCostDataCqCollectionItem);
    return this;
  }

  public List<AgreementCostDataCq> getAgreementCostDataCqCollection() {
    return agreementCostDataCqCollection;
  }

  public void setAgreementCostDataCqCollection(List<AgreementCostDataCq> agreementCostDataCqCollection) {
    this.agreementCostDataCqCollection = agreementCostDataCqCollection;
  }

  public String getCostType() {
    return costType;
  }

  public void setCostType(String costType) {
    this.costType = costType;
  }

  public CostGroupIdCq getCostGroupIdCq() {
    return costGroupIdCq;
  }

  public void setCostGroupIdCq(CostGroupIdCq costGroupIdCq) {
    this.costGroupIdCq = costGroupIdCq;
  }

  public String getActualCostType() {
    return actualCostType;
  }

  public void setActualCostType(String actualCostType) {
    this.actualCostType = actualCostType;
  }
}

