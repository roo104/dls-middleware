package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class CustomerViewValueObject implements Serializable {
  @JsonProperty("value")
  private Object value = null;

  @JsonProperty("customerViewCategory")
  private CustomerViewCategoryObject customerViewCategory = null;

  @JsonProperty("frameCq")
  private FrameCqObject frameCq = null;


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

  public FrameCqObject getFrameCq() {
    return frameCq;
  }

  public void setFrameCq(FrameCqObject frameCq) {
    this.frameCq = frameCq;
  }
}

