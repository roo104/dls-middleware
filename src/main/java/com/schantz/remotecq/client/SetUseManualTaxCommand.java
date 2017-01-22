package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class SetUseManualTaxCommand implements Serializable {
  @JsonProperty("personIdCq")
  private PersonIdCq personIdCq = null;

  @JsonProperty("isUseManualTax")
  private Boolean isUseManualTax = false;


  public PersonIdCq getPersonIdCq() {
    return personIdCq;
  }

  public void setPersonIdCq(PersonIdCq personIdCq) {
    this.personIdCq = personIdCq;
  }

  public Boolean getIsUseManualTax() {
    return isUseManualTax;
  }

  public void setIsUseManualTax(Boolean isUseManualTax) {
    this.isUseManualTax = isUseManualTax;
  }
}

