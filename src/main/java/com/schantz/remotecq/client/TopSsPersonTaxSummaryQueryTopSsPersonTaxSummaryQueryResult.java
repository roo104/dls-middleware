package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class TopSsPersonTaxSummaryQueryTopSsPersonTaxSummaryQueryResult implements Serializable {
  @JsonProperty("taxYear")
  private Long taxYear = null;

  @JsonProperty("personUID")
  private PersonUID personUID = null;


  public Long getTaxYear() {
    return taxYear;
  }

  public void setTaxYear(Long taxYear) {
    this.taxYear = taxYear;
  }

  public PersonUID getPersonUID() {
    return personUID;
  }

  public void setPersonUID(PersonUID personUID) {
    this.personUID = personUID;
  }
}

