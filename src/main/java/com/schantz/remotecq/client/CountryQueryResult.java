package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class CountryQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("countriesCollection")
  private List<String> countriesCollection = new ArrayList<String>();

  public CountryQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }
  public CountryQueryResult addCountriesCollectionItem(String countriesCollectionItem) {
    this.countriesCollection.add(countriesCollectionItem);
    return this;
  }

  public List<String> getCountriesCollection() {
    return countriesCollection;
  }

  public void setCountriesCollection(List<String> countriesCollection) {
    this.countriesCollection = countriesCollection;
  }
}

