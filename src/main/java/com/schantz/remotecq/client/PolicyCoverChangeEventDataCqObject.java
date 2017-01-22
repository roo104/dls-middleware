package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class PolicyCoverChangeEventDataCqObject implements Serializable {
  @JsonProperty("value")
  private Object value = null;

  @JsonProperty("customerViewCategory")
  private CustomerViewCategoryObject customerViewCategory = null;

  @JsonProperty("coverId")
  private PolicyCoverIdCq coverId = null;

  @JsonProperty("packageId")
  private PolicyPackageIdCq packageId = null;


  public Object getValue() {
    return value;
  }

  public void setValue(Object value) {
    this.value = value;
  }

  public CustomerViewCategoryObject getCustomerViewCategory() {
    return customerViewCategory;
  }

  public void setCustomerViewCategory(CustomerViewCategoryObject customerViewCategory) {
    this.customerViewCategory = customerViewCategory;
  }

  public PolicyCoverIdCq getCoverId() {
    return coverId;
  }

  public void setCoverId(PolicyCoverIdCq coverId) {
    this.coverId = coverId;
  }

  public PolicyPackageIdCq getPackageId() {
    return packageId;
  }

  public void setPackageId(PolicyPackageIdCq packageId) {
    this.packageId = packageId;
  }
}

