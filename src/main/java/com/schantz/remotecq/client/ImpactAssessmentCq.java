package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class ImpactAssessmentCq implements Serializable {
  @JsonProperty("createTime")
  private OffsetDateTime createTime = null;

  @JsonProperty("createUser")
  private String createUser = null;

  @JsonProperty("doneTime")
  private OffsetDateTime doneTime = null;

  @JsonProperty("impactAssessmentIdCq")
  private ImpactAssessmentIdCq impactAssessmentIdCq = null;

  @JsonProperty("policyImpactEntityCqCollection")
  private List<PolicyImpactEntityCq> policyImpactEntityCqCollection = new ArrayList<PolicyImpactEntityCq>();

  @JsonProperty("lifeProductVersionImpactEntityCqCollection")
  private List<LifeProductVersionImpactEntityCq> lifeProductVersionImpactEntityCqCollection = new ArrayList<LifeProductVersionImpactEntityCq>();


  public OffsetDateTime getCreateTime() {
    return createTime;
  }

  public void setCreateTime(OffsetDateTime createTime) {
    this.createTime = createTime;
  }

  public String getCreateUser() {
    return createUser;
  }

  public void setCreateUser(String createUser) {
    this.createUser = createUser;
  }

  public OffsetDateTime getDoneTime() {
    return doneTime;
  }

  public void setDoneTime(OffsetDateTime doneTime) {
    this.doneTime = doneTime;
  }

  public ImpactAssessmentIdCq getImpactAssessmentIdCq() {
    return impactAssessmentIdCq;
  }

  public void setImpactAssessmentIdCq(ImpactAssessmentIdCq impactAssessmentIdCq) {
    this.impactAssessmentIdCq = impactAssessmentIdCq;
  }
  public ImpactAssessmentCq addPolicyImpactEntityCqCollectionItem(PolicyImpactEntityCq policyImpactEntityCqCollectionItem) {
    this.policyImpactEntityCqCollection.add(policyImpactEntityCqCollectionItem);
    return this;
  }

  public List<PolicyImpactEntityCq> getPolicyImpactEntityCqCollection() {
    return policyImpactEntityCqCollection;
  }

  public void setPolicyImpactEntityCqCollection(List<PolicyImpactEntityCq> policyImpactEntityCqCollection) {
    this.policyImpactEntityCqCollection = policyImpactEntityCqCollection;
  }
  public ImpactAssessmentCq addLifeProductVersionImpactEntityCqCollectionItem(LifeProductVersionImpactEntityCq lifeProductVersionImpactEntityCqCollectionItem) {
    this.lifeProductVersionImpactEntityCqCollection.add(lifeProductVersionImpactEntityCqCollectionItem);
    return this;
  }

  public List<LifeProductVersionImpactEntityCq> getLifeProductVersionImpactEntityCqCollection() {
    return lifeProductVersionImpactEntityCqCollection;
  }

  public void setLifeProductVersionImpactEntityCqCollection(List<LifeProductVersionImpactEntityCq> lifeProductVersionImpactEntityCqCollection) {
    this.lifeProductVersionImpactEntityCqCollection = lifeProductVersionImpactEntityCqCollection;
  }
}

