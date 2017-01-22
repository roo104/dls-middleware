package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class AgreementEditPerspectiveCq implements Serializable {
  @JsonProperty("perspectiveKey")
  private CqMessageKey perspectiveKey = null;

  @JsonProperty("agreementModeCq")
  private String agreementModeCq = null;

  @JsonProperty("agreementSectionCqCollection")
  private List<AgreementSectionCq> agreementSectionCqCollection = new ArrayList<AgreementSectionCq>();

  @JsonProperty("isDefaultPerspective")
  private Boolean isDefaultPerspective = false;


  public CqMessageKey getPerspectiveKey() {
    return perspectiveKey;
  }

  public void setPerspectiveKey(CqMessageKey perspectiveKey) {
    this.perspectiveKey = perspectiveKey;
  }

  public String getAgreementModeCq() {
    return agreementModeCq;
  }

  public void setAgreementModeCq(String agreementModeCq) {
    this.agreementModeCq = agreementModeCq;
  }
  public AgreementEditPerspectiveCq addAgreementSectionCqCollectionItem(AgreementSectionCq agreementSectionCqCollectionItem) {
    this.agreementSectionCqCollection.add(agreementSectionCqCollectionItem);
    return this;
  }

  public List<AgreementSectionCq> getAgreementSectionCqCollection() {
    return agreementSectionCqCollection;
  }

  public void setAgreementSectionCqCollection(List<AgreementSectionCq> agreementSectionCqCollection) {
    this.agreementSectionCqCollection = agreementSectionCqCollection;
  }

  public Boolean getIsDefaultPerspective() {
    return isDefaultPerspective;
  }

  public void setIsDefaultPerspective(Boolean isDefaultPerspective) {
    this.isDefaultPerspective = isDefaultPerspective;
  }
}

