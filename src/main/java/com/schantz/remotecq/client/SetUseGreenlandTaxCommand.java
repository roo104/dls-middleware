package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class SetUseGreenlandTaxCommand implements Serializable {
  @JsonProperty("personIdCq")
  private PersonIdCq personIdCq = null;

  @JsonProperty("isUseGreenlandTax")
  private Boolean isUseGreenlandTax = false;


  public PersonIdCq getPersonIdCq() {
    return personIdCq;
  }

  public void setPersonIdCq(PersonIdCq personIdCq) {
    this.personIdCq = personIdCq;
  }

  public Boolean getIsUseGreenlandTax() {
    return isUseGreenlandTax;
  }

  public void setIsUseGreenlandTax(Boolean isUseGreenlandTax) {
    this.isUseGreenlandTax = isUseGreenlandTax;
  }
}

