package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class CustomerViewData implements Serializable {
  @JsonProperty("advanceDate")
  private LocalDate advanceDate = null;

  @JsonProperty("customerViewGroupCollection")
  private List<CustomerViewGroup> customerViewGroupCollection = new ArrayList<CustomerViewGroup>();

  @JsonProperty("customerViewPerspective")
  private CustomerViewPerspective customerViewPerspective = null;


  public LocalDate getAdvanceDate() {
    return advanceDate;
  }

  public void setAdvanceDate(LocalDate advanceDate) {
    this.advanceDate = advanceDate;
  }
  public CustomerViewData addCustomerViewGroupCollectionItem(CustomerViewGroup customerViewGroupCollectionItem) {
    this.customerViewGroupCollection.add(customerViewGroupCollectionItem);
    return this;
  }

  public List<CustomerViewGroup> getCustomerViewGroupCollection() {
    return customerViewGroupCollection;
  }

  public void setCustomerViewGroupCollection(List<CustomerViewGroup> customerViewGroupCollection) {
    this.customerViewGroupCollection = customerViewGroupCollection;
  }

  public CustomerViewPerspective getCustomerViewPerspective() {
    return customerViewPerspective;
  }

  public void setCustomerViewPerspective(CustomerViewPerspective customerViewPerspective) {
    this.customerViewPerspective = customerViewPerspective;
  }
}

