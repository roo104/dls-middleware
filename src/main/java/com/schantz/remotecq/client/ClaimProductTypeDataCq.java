package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class ClaimProductTypeDataCq implements Serializable {
  @JsonProperty("occurrenceDate")
  private LocalDate occurrenceDate = null;

  @JsonProperty("reportedDate")
  private LocalDate reportedDate = null;

  @JsonProperty("statusDate")
  private LocalDate statusDate = null;

  @JsonProperty("claimProductTypeCq")
  private String claimProductTypeCq = null;

  @JsonProperty("claimProductTypeStatusCq")
  private String claimProductTypeStatusCq = null;

  @JsonProperty("claimClosingCauseCq")
  private ClaimClosingCauseCq claimClosingCauseCq = null;

  @JsonProperty("userCommentCqCollection")
  private List<UserCommentCq> userCommentCqCollection = new ArrayList<UserCommentCq>();

  @JsonProperty("claimGrantVersionCqCollection")
  private List<ClaimGrantVersionCq> claimGrantVersionCqCollection = new ArrayList<ClaimGrantVersionCq>();


  public LocalDate getOccurrenceDate() {
    return occurrenceDate;
  }

  public void setOccurrenceDate(LocalDate occurrenceDate) {
    this.occurrenceDate = occurrenceDate;
  }

  public LocalDate getReportedDate() {
    return reportedDate;
  }

  public void setReportedDate(LocalDate reportedDate) {
    this.reportedDate = reportedDate;
  }

  public LocalDate getStatusDate() {
    return statusDate;
  }

  public void setStatusDate(LocalDate statusDate) {
    this.statusDate = statusDate;
  }

  public String getClaimProductTypeCq() {
    return claimProductTypeCq;
  }

  public void setClaimProductTypeCq(String claimProductTypeCq) {
    this.claimProductTypeCq = claimProductTypeCq;
  }

  public String getClaimProductTypeStatusCq() {
    return claimProductTypeStatusCq;
  }

  public void setClaimProductTypeStatusCq(String claimProductTypeStatusCq) {
    this.claimProductTypeStatusCq = claimProductTypeStatusCq;
  }

  public ClaimClosingCauseCq getClaimClosingCauseCq() {
    return claimClosingCauseCq;
  }

  public void setClaimClosingCauseCq(ClaimClosingCauseCq claimClosingCauseCq) {
    this.claimClosingCauseCq = claimClosingCauseCq;
  }
  public ClaimProductTypeDataCq addUserCommentCqCollectionItem(UserCommentCq userCommentCqCollectionItem) {
    this.userCommentCqCollection.add(userCommentCqCollectionItem);
    return this;
  }

  public List<UserCommentCq> getUserCommentCqCollection() {
    return userCommentCqCollection;
  }

  public void setUserCommentCqCollection(List<UserCommentCq> userCommentCqCollection) {
    this.userCommentCqCollection = userCommentCqCollection;
  }
  public ClaimProductTypeDataCq addClaimGrantVersionCqCollectionItem(ClaimGrantVersionCq claimGrantVersionCqCollectionItem) {
    this.claimGrantVersionCqCollection.add(claimGrantVersionCqCollectionItem);
    return this;
  }

  public List<ClaimGrantVersionCq> getClaimGrantVersionCqCollection() {
    return claimGrantVersionCqCollection;
  }

  public void setClaimGrantVersionCqCollection(List<ClaimGrantVersionCq> claimGrantVersionCqCollection) {
    this.claimGrantVersionCqCollection = claimGrantVersionCqCollection;
  }
}

