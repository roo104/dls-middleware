package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class TopBulkContributorReceivableCq implements Serializable {
  @JsonProperty("companyRegistration")
  private String companyRegistration = null;

  @JsonProperty("personRegistration")
  private String personRegistration = null;

  @JsonProperty("personName")
  private String personName = null;

  @JsonProperty("totalAmount")
  private Double totalAmount = null;

  @JsonProperty("contributorReceivableChangeCqCollection")
  private List<ContributorReceivableChangeCq> contributorReceivableChangeCqCollection = new ArrayList<ContributorReceivableChangeCq>();

  @JsonProperty("contributorReceivableStatusCq")
  private ContributorReceivableStatusCq contributorReceivableStatusCq = null;

  @JsonProperty("receivableOnHoldStatusCq")
  private String receivableOnHoldStatusCq = null;

  @JsonProperty("topBulkPolicyReceivableCqCollection")
  private List<TopBulkPolicyReceivableCq> topBulkPolicyReceivableCqCollection = new ArrayList<TopBulkPolicyReceivableCq>();

  @JsonProperty("contributorReceivableIdCq")
  private ContributorReceivableIdCq contributorReceivableIdCq = null;


  public String getCompanyRegistration() {
    return companyRegistration;
  }

  public void setCompanyRegistration(String companyRegistration) {
    this.companyRegistration = companyRegistration;
  }

  public String getPersonRegistration() {
    return personRegistration;
  }

  public void setPersonRegistration(String personRegistration) {
    this.personRegistration = personRegistration;
  }

  public String getPersonName() {
    return personName;
  }

  public void setPersonName(String personName) {
    this.personName = personName;
  }

  public Double getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(Double totalAmount) {
    this.totalAmount = totalAmount;
  }
  public TopBulkContributorReceivableCq addContributorReceivableChangeCqCollectionItem(ContributorReceivableChangeCq contributorReceivableChangeCqCollectionItem) {
    this.contributorReceivableChangeCqCollection.add(contributorReceivableChangeCqCollectionItem);
    return this;
  }

  public List<ContributorReceivableChangeCq> getContributorReceivableChangeCqCollection() {
    return contributorReceivableChangeCqCollection;
  }

  public void setContributorReceivableChangeCqCollection(List<ContributorReceivableChangeCq> contributorReceivableChangeCqCollection) {
    this.contributorReceivableChangeCqCollection = contributorReceivableChangeCqCollection;
  }

  public ContributorReceivableStatusCq getContributorReceivableStatusCq() {
    return contributorReceivableStatusCq;
  }

  public void setContributorReceivableStatusCq(ContributorReceivableStatusCq contributorReceivableStatusCq) {
    this.contributorReceivableStatusCq = contributorReceivableStatusCq;
  }

  public String getReceivableOnHoldStatusCq() {
    return receivableOnHoldStatusCq;
  }

  public void setReceivableOnHoldStatusCq(String receivableOnHoldStatusCq) {
    this.receivableOnHoldStatusCq = receivableOnHoldStatusCq;
  }
  public TopBulkContributorReceivableCq addTopBulkPolicyReceivableCqCollectionItem(TopBulkPolicyReceivableCq topBulkPolicyReceivableCqCollectionItem) {
    this.topBulkPolicyReceivableCqCollection.add(topBulkPolicyReceivableCqCollectionItem);
    return this;
  }

  public List<TopBulkPolicyReceivableCq> getTopBulkPolicyReceivableCqCollection() {
    return topBulkPolicyReceivableCqCollection;
  }

  public void setTopBulkPolicyReceivableCqCollection(List<TopBulkPolicyReceivableCq> topBulkPolicyReceivableCqCollection) {
    this.topBulkPolicyReceivableCqCollection = topBulkPolicyReceivableCqCollection;
  }

  public ContributorReceivableIdCq getContributorReceivableIdCq() {
    return contributorReceivableIdCq;
  }

  public void setContributorReceivableIdCq(ContributorReceivableIdCq contributorReceivableIdCq) {
    this.contributorReceivableIdCq = contributorReceivableIdCq;
  }
}

