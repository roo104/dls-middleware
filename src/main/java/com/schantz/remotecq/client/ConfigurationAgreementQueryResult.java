package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class ConfigurationAgreementQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("agreementTypeConfigurationCqCollection")
  private List<AgreementTypeConfigurationCq> agreementTypeConfigurationCqCollection = new ArrayList<AgreementTypeConfigurationCq>();

  public ConfigurationAgreementQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }
  public ConfigurationAgreementQueryResult addAgreementTypeConfigurationCqCollectionItem(AgreementTypeConfigurationCq agreementTypeConfigurationCqCollectionItem) {
    this.agreementTypeConfigurationCqCollection.add(agreementTypeConfigurationCqCollectionItem);
    return this;
  }

  public List<AgreementTypeConfigurationCq> getAgreementTypeConfigurationCqCollection() {
    return agreementTypeConfigurationCqCollection;
  }

  public void setAgreementTypeConfigurationCqCollection(List<AgreementTypeConfigurationCq> agreementTypeConfigurationCqCollection) {
    this.agreementTypeConfigurationCqCollection = agreementTypeConfigurationCqCollection;
  }
}

