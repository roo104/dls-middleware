package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class StandardPartnerFromTreatmentProductSearchQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("companyIdCqCollection")
  private List<CompanyIdCq> companyIdCqCollection = new ArrayList<CompanyIdCq>();

  @JsonProperty("isProductLockedToStandardPartner")
  private Boolean isProductLockedToStandardPartner = false;

  public StandardPartnerFromTreatmentProductSearchQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }
  public StandardPartnerFromTreatmentProductSearchQueryResult addCompanyIdCqCollectionItem(CompanyIdCq companyIdCqCollectionItem) {
    this.companyIdCqCollection.add(companyIdCqCollectionItem);
    return this;
  }

  public List<CompanyIdCq> getCompanyIdCqCollection() {
    return companyIdCqCollection;
  }

  public void setCompanyIdCqCollection(List<CompanyIdCq> companyIdCqCollection) {
    this.companyIdCqCollection = companyIdCqCollection;
  }

  public Boolean getIsProductLockedToStandardPartner() {
    return isProductLockedToStandardPartner;
  }

  public void setIsProductLockedToStandardPartner(Boolean isProductLockedToStandardPartner) {
    this.isProductLockedToStandardPartner = isProductLockedToStandardPartner;
  }
}

