package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class TopPriceGroupExportQueryTopPriceGroupExportQueryResult implements Serializable {
  @JsonProperty("startDate")
  private LocalDate startDate = null;

  @JsonProperty("externalDocumentId")
  private String externalDocumentId = null;

  @JsonProperty("priceGroupVersionIdCq")
  private PriceGroupVersionIdCq priceGroupVersionIdCq = null;


  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public String getExternalDocumentId() {
    return externalDocumentId;
  }

  public void setExternalDocumentId(String externalDocumentId) {
    this.externalDocumentId = externalDocumentId;
  }

  public PriceGroupVersionIdCq getPriceGroupVersionIdCq() {
    return priceGroupVersionIdCq;
  }

  public void setPriceGroupVersionIdCq(PriceGroupVersionIdCq priceGroupVersionIdCq) {
    this.priceGroupVersionIdCq = priceGroupVersionIdCq;
  }
}

