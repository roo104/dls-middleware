package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class PostTaxMaxPersonCommand implements Serializable {
  @JsonProperty("personId")
  private PersonIdCq personId = null;

  @JsonProperty("amount")
  private Double amount = null;

  @JsonProperty("year")
  private Long year = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("taxCodeCq")
  private String taxCodeCq = null;


  public PersonIdCq getPersonId() {
    return personId;
  }

  public void setPersonId(PersonIdCq personId) {
    this.personId = personId;
  }

  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public Long getYear() {
    return year;
  }

  public void setYear(Long year) {
    this.year = year;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getTaxCodeCq() {
    return taxCodeCq;
  }

  public void setTaxCodeCq(String taxCodeCq) {
    this.taxCodeCq = taxCodeCq;
  }
}

