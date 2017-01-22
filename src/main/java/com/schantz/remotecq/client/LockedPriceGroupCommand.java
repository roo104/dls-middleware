package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class LockedPriceGroupCommand implements Serializable {
  @JsonProperty("priceGroupIdCq")
  private PriceGroupIdCq priceGroupIdCq = null;

  @JsonProperty("agreementIdCqCollection")
  private List<AgreementIdCq> agreementIdCqCollection = new ArrayList<AgreementIdCq>();

  @JsonProperty("isLockedToAgreements")
  private Boolean isLockedToAgreements = false;


  public PriceGroupIdCq getPriceGroupIdCq() {
    return priceGroupIdCq;
  }

  public void setPriceGroupIdCq(PriceGroupIdCq priceGroupIdCq) {
    this.priceGroupIdCq = priceGroupIdCq;
  }
  public LockedPriceGroupCommand addAgreementIdCqCollectionItem(AgreementIdCq agreementIdCqCollectionItem) {
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

