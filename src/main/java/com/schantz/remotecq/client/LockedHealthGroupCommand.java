package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class LockedHealthGroupCommand implements Serializable {
  @JsonProperty("healthGroupIdCq")
  private HealthGroupIdCq healthGroupIdCq = null;

  @JsonProperty("agreementIdCqCollection")
  private List<AgreementIdCq> agreementIdCqCollection = new ArrayList<AgreementIdCq>();

  @JsonProperty("isLockedToAgreements")
  private Boolean isLockedToAgreements = false;


  public HealthGroupIdCq getHealthGroupIdCq() {
    return healthGroupIdCq;
  }

  public void setHealthGroupIdCq(HealthGroupIdCq healthGroupIdCq) {
    this.healthGroupIdCq = healthGroupIdCq;
  }
  public LockedHealthGroupCommand addAgreementIdCqCollectionItem(AgreementIdCq agreementIdCqCollectionItem) {
    this.agreementIdCqCollection.add(agreementIdCqCollectionItem);
    return this;
  }

  public List<AgreementIdCq> getAgreementIdCqCollection() {
    return agreementIdCqCollection;
  }

  public void setAgreementIdCqCollection(List<AgreementIdCq> agreementIdCqCollection) {
    this.agreementIdCqCollection = agreementIdCqCollection;
  }

  public Boolean getIsLockedToAgreements() {
    return isLockedToAgreements;
  }

  public void setIsLockedToAgreements(Boolean isLockedToAgreements) {
    this.isLockedToAgreements = isLockedToAgreements;
  }
}

