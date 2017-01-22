package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class ReservePackageItemCq implements Serializable {
  @JsonProperty("packageId")
  private CqMessageKey packageId = null;

  @JsonProperty("amount")
  private Double amount = null;

  @JsonProperty("ultimoReserve")
  private Double ultimoReserve = null;

  @JsonProperty("primoReserve")
  private Double primoReserve = null;

  @JsonProperty("reserveStatementItemCqCollection")
  private List<ReserveStatementItemCq> reserveStatementItemCqCollection = new ArrayList<ReserveStatementItemCq>();


  public CqMessageKey getPackageId() {
    return packageId;
  }

  public void setPackageId(CqMessageKey packageId) {
    this.packageId = packageId;
  }

  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public Double getUltimoReserve() {
    return ultimoReserve;
  }

  public void setUltimoReserve(Double ultimoReserve) {
    this.ultimoReserve = ultimoReserve;
  }

  public Double getPrimoReserve() {
    return primoReserve;
  }

  public void setPrimoReserve(Double primoReserve) {
    this.primoReserve = primoReserve;
  }
  public ReservePackageItemCq addReserveStatementItemCqCollectionItem(ReserveStatementItemCq reserveStatementItemCqCollectionItem) {
    this.reserveStatementItemCqCollection.add(reserveStatementItemCqCollectionItem);
    return this;
  }

  public List<ReserveStatementItemCq> getReserveStatementItemCqCollection() {
    return reserveStatementItemCqCollection;
  }

  public void setReserveStatementItemCqCollection(List<ReserveStatementItemCq> reserveStatementItemCqCollection) {
    this.reserveStatementItemCqCollection = reserveStatementItemCqCollection;
  }
}

