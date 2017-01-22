package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class SubscribeToTaxCardTypeCommand implements Serializable {
  @JsonProperty("elevatedTaxPct")
  private Double elevatedTaxPct = null;

  @JsonProperty("dkPreferredTaxCardTypeCq")
  private String dkPreferredTaxCardTypeCq = null;

  @JsonProperty("personIdCq")
  private PersonIdCq personIdCq = null;

  @JsonProperty("isForceNewTaxCard")
  private Boolean isForceNewTaxCard = false;


  public Double getElevatedTaxPct() {
    return elevatedTaxPct;
  }

  public void setElevatedTaxPct(Double elevatedTaxPct) {
    this.elevatedTaxPct = elevatedTaxPct;
  }

  public String getDkPreferredTaxCardTypeCq() {
    return dkPreferredTaxCardTypeCq;
  }

  public void setDkPreferredTaxCardTypeCq(String dkPreferredTaxCardTypeCq) {
    this.dkPreferredTaxCardTypeCq = dkPreferredTaxCardTypeCq;
  }

  public PersonIdCq getPersonIdCq() {
    return personIdCq;
  }

  public void setPersonIdCq(PersonIdCq personIdCq) {
    this.personIdCq = personIdCq;
  }

  public Boolean getIsForceNewTaxCard() {
    return isForceNewTaxCard;
  }

  public void setIsForceNewTaxCard(Boolean isForceNewTaxCard) {
    this.isForceNewTaxCard = isForceNewTaxCard;
  }
}

