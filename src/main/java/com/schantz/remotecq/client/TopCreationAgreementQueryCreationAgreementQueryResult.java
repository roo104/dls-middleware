package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class TopCreationAgreementQueryCreationAgreementQueryResult implements Serializable {
  @JsonProperty("choosenType")
  private String choosenType = null;

  @JsonProperty("agreementVersionId")
  private AgreementVersionIdCq agreementVersionId = null;

  @JsonProperty("companyId")
  private CompanyIdCq companyId = null;

  @JsonProperty("allowedParentAgreementTypesCollection")
  private List<String> allowedParentAgreementTypesCollection = new ArrayList<String>();


  public String getChoosenType() {
    return choosenType;
  }

  public void setChoosenType(String choosenType) {
    this.choosenType = choosenType;
  }

  public AgreementVersionIdCq getAgreementVersionId() {
    return agreementVersionId;
  }

  public void setAgreementVersionId(AgreementVersionIdCq agreementVersionId) {
    this.agreementVersionId = agreementVersionId;
  }

  public CompanyIdCq getCompanyId() {
    return companyId;
  }

  public void setCompanyId(CompanyIdCq companyId) {
    this.companyId = companyId;
  }
  public TopCreationAgreementQueryCreationAgreementQueryResult addAllowedParentAgreementTypesCollectionItem(String allowedParentAgreementTypesCollectionItem) {
    this.allowedParentAgreementTypesCollection.add(allowedParentAgreementTypesCollectionItem);
    return this;
  }

  public List<String> getAllowedParentAgreementTypesCollection() {
    return allowedParentAgreementTypesCollection;
  }

  public void setAllowedParentAgreementTypesCollection(List<String> allowedParentAgreementTypesCollection) {
    this.allowedParentAgreementTypesCollection = allowedParentAgreementTypesCollection;
  }
}

