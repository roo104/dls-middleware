package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class CustomerViewEntry implements Serializable {
  @JsonProperty("priority")
  private Long priority = null;

  @JsonProperty("customerViewValueCollection")
  private List<CustomerViewValueObject> customerViewValueCollection = new ArrayList<CustomerViewValueObject>();

  @JsonProperty("customerViewSubDivisionsCollection")
  private List<CustomerViewSubDivisions> customerViewSubDivisionsCollection = new ArrayList<CustomerViewSubDivisions>();

  @JsonProperty("coverId")
  private PolicyCoverIdCq coverId = null;


  public Long getPriority() {
    return priority;
  }

  public void setPriority(Long priority) {
    this.priority = priority;
  }
  public CustomerViewEntry addCustomerViewValueCollectionItem(CustomerViewValueObject customerViewValueCollectionItem) {
    this.customerViewValueCollection.add(customerViewValueCollectionItem);
    return this;
  }

  public List<CustomerViewValueObject> getCustomerViewValueCollection() {
    return customerViewValueCollection;
  }

  public void setCustomerViewValueCollection(List<CustomerViewValueObject> customerViewValueCollection) {
    this.customerViewValueCollection = customerViewValueCollection;
  }
  public CustomerViewEntry addCustomerViewSubDivisionsCollectionItem(CustomerViewSubDivisions customerViewSubDivisionsCollectionItem) {
    this.customerViewSubDivisionsCollection.add(customerViewSubDivisionsCollectionItem);
    return this;
  }

  public List<CustomerViewSubDivisions> getCustomerViewSubDivisionsCollection() {
    return customerViewSubDivisionsCollection;
  }

  public void setCustomerViewSubDivisionsCollection(List<CustomerViewSubDivisions> customerViewSubDivisionsCollection) {
    this.customerViewSubDivisionsCollection = customerViewSubDivisionsCollection;
  }

  public PolicyCoverIdCq getCoverId() {
    return coverId;
  }

  public void setCoverId(PolicyCoverIdCq coverId) {
    this.coverId = coverId;
  }
}

