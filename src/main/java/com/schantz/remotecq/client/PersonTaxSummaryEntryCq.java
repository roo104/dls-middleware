package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class PersonTaxSummaryEntryCq implements Serializable {
  @JsonProperty("taxContributionCqCollection")
  private List<TaxContributionCq> taxContributionCqCollection = new ArrayList<TaxContributionCq>();

  @JsonProperty("taxReportingCqCollection")
  private List<TaxReportingCq> taxReportingCqCollection = new ArrayList<TaxReportingCq>();

  @JsonProperty("taxLumpSumCqCollection")
  private List<TaxLumpSumCq> taxLumpSumCqCollection = new ArrayList<TaxLumpSumCq>();

  public PersonTaxSummaryEntryCq addTaxContributionCqCollectionItem(TaxContributionCq taxContributionCqCollectionItem) {
    this.taxContributionCqCollection.add(taxContributionCqCollectionItem);
    return this;
  }

  public List<TaxContributionCq> getTaxContributionCqCollection() {
    return taxContributionCqCollection;
  }

  public void setTaxContributionCqCollection(List<TaxContributionCq> taxContributionCqCollection) {
    this.taxContributionCqCollection = taxContributionCqCollection;
  }
  public PersonTaxSummaryEntryCq addTaxReportingCqCollectionItem(TaxReportingCq taxReportingCqCollectionItem) {
    this.taxReportingCqCollection.add(taxReportingCqCollectionItem);
    return this;
  }

  public List<TaxReportingCq> getTaxReportingCqCollection() {
    return taxReportingCqCollection;
  }

  public void setTaxReportingCqCollection(List<TaxReportingCq> taxReportingCqCollection) {
    this.taxReportingCqCollection = taxReportingCqCollection;
  }
  public PersonTaxSummaryEntryCq addTaxLumpSumCqCollectionItem(TaxLumpSumCq taxLumpSumCqCollectionItem) {
    this.taxLumpSumCqCollection.add(taxLumpSumCqCollectionItem);
    return this;
  }

  public List<TaxLumpSumCq> getTaxLumpSumCqCollection() {
    return taxLumpSumCqCollection;
  }

  public void setTaxLumpSumCqCollection(List<TaxLumpSumCq> taxLumpSumCqCollection) {
    this.taxLumpSumCqCollection = taxLumpSumCqCollection;
  }
}

