package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class PricePrivilgeCq implements Serializable {
  @JsonProperty("expiration")
  private LocalDate expiration = null;

  @JsonProperty("priority")
  private Long priority = null;

  @JsonProperty("startDate")
  private LocalDate startDate = null;

  @JsonProperty("pricePrivilegeFrameTypeCq")
  private String pricePrivilegeFrameTypeCq = null;

  @JsonProperty("percentDiscount")
  private PercentFrameCq percentDiscount = null;

  @JsonProperty("fixedDiscount")
  private AbsAmountFrameCq fixedDiscount = null;

  @JsonProperty("fixedPrice")
  private AbsAmountFrameCq fixedPrice = null;

  @JsonProperty("pricePrivilegeIdCq")
  private PricePrivilegeIdCq pricePrivilegeIdCq = null;

  @JsonProperty("privilegeTypeCq")
  private String privilegeTypeCq = null;

  @JsonProperty("lockedToCollection")
  private List<PriceGroupIdCq> lockedToCollection = new ArrayList<PriceGroupIdCq>();

  @JsonProperty("scopeCq")
  private ScopeCq scopeCq = null;


  public LocalDate getExpiration() {
    return expiration;
  }

  public void setExpiration(LocalDate expiration) {
    this.expiration = expiration;
  }

  public Long getPriority() {
    return priority;
  }

  public void setPriority(Long priority) {
    this.priority = priority;
  }

  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public String getPricePrivilegeFrameTypeCq() {
    return pricePrivilegeFrameTypeCq;
  }

  public void setPricePrivilegeFrameTypeCq(String pricePrivilegeFrameTypeCq) {
    this.pricePrivilegeFrameTypeCq = pricePrivilegeFrameTypeCq;
  }

  public PercentFrameCq getPercentDiscount() {
    return percentDiscount;
  }

  public void setPercentDiscount(PercentFrameCq percentDiscount) {
    this.percentDiscount = percentDiscount;
  }

  public AbsAmountFrameCq getFixedDiscount() {
    return fixedDiscount;
  }

  public void setFixedDiscount(AbsAmountFrameCq fixedDiscount) {
    this.fixedDiscount = fixedDiscount;
  }

  public AbsAmountFrameCq getFixedPrice() {
    return fixedPrice;
  }

  public void setFixedPrice(AbsAmountFrameCq fixedPrice) {
    this.fixedPrice = fixedPrice;
  }

  public PricePrivilegeIdCq getPricePrivilegeIdCq() {
    return pricePrivilegeIdCq;
  }

  public void setPricePrivilegeIdCq(PricePrivilegeIdCq pricePrivilegeIdCq) {
    this.pricePrivilegeIdCq = pricePrivilegeIdCq;
  }

  public String getPrivilegeTypeCq() {
    return privilegeTypeCq;
  }

  public void setPrivilegeTypeCq(String privilegeTypeCq) {
    this.privilegeTypeCq = privilegeTypeCq;
  }
  public PricePrivilgeCq addLockedToCollectionItem(PriceGroupIdCq lockedToCollectionItem) {
    this.lockedToCollection.add(lockedToCollectionItem);
    return this;
  }

  public List<PriceGroupIdCq> getLockedToCollection() {
    return lockedToCollection;
  }

  public void setLockedToCollection(List<PriceGroupIdCq> lockedToCollection) {
    this.lockedToCollection = lockedToCollection;
  }

  public ScopeCq getScopeCq() {
    return scopeCq;
  }

  public void setScopeCq(ScopeCq scopeCq) {
    this.scopeCq = scopeCq;
  }
}

