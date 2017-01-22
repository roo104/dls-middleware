package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class CustomerViewSubDivisions implements Serializable {
  @JsonProperty("priority")
  private Long priority = null;

  @JsonProperty("customerViewValueCollection")
  private List<CustomerViewValueObject> customerViewValueCollection = new ArrayList<CustomerViewValueObject>();


  public Long getPriority() {
    return priority;
  }

  public void setPriority(Long priority) {
    this.priority = priority;
  }
  public CustomerViewSubDivisions addCustomerViewValueCollectionItem(CustomerViewValueObject customerViewValueCollectionItem) {
    this.customerViewValueCollection.add(customerViewValueCollectionItem);
    return this;
  }

  public List<CustomerViewValueObject> getCustomerViewValueCollection() {
    return customerViewValueCollection;
  }

  public void setCustomerViewValueCollection(List<CustomerViewValueObject> customerViewValueCollection) {
    this.customerViewValueCollection = customerViewValueCollection;
  }
}

