package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class QuoteCq implements Serializable {
  @JsonProperty("createTime")
  private OffsetDateTime createTime = null;

  @JsonProperty("createUser")
  private String createUser = null;

  @JsonProperty("startDate")
  private LocalDate startDate = null;

  @JsonProperty("firstEventDate")
  private LocalDate firstEventDate = null;

  @JsonProperty("quoteRequireRebase")
  private Boolean quoteRequireRebase = false;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("quoteStatusCq")
  private String quoteStatusCq = null;

  @JsonProperty("quoteId")
  private QuoteIdCq quoteId = null;

  @JsonProperty("documentInfoCqCollection")
  private List<DocumentInfoCq> documentInfoCqCollection = new ArrayList<DocumentInfoCq>();


  public OffsetDateTime getCreateTime() {
    return createTime;
  }

  public void setCreateTime(OffsetDateTime createTime) {
    this.createTime = createTime;
  }

  public String getCreateUser() {
    return createUser;
  }

  public void setCreateUser(String createUser) {
    this.createUser = createUser;
  }

  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public LocalDate getFirstEventDate() {
    return firstEventDate;
  }

  public void setFirstEventDate(LocalDate firstEventDate) {
    this.firstEventDate = firstEventDate;
  }

  public Boolean getQuoteRequireRebase() {
    return quoteRequireRebase;
  }

  public void setQuoteRequireRebase(Boolean quoteRequireRebase) {
    this.quoteRequireRebase = quoteRequireRebase;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getQuoteStatusCq() {
    return quoteStatusCq;
  }

  public void setQuoteStatusCq(String quoteStatusCq) {
    this.quoteStatusCq = quoteStatusCq;
  }

  public QuoteIdCq getQuoteId() {
    return quoteId;
  }

  public void setQuoteId(QuoteIdCq quoteId) {
    this.quoteId = quoteId;
  }
  public QuoteCq addDocumentInfoCqCollectionItem(DocumentInfoCq documentInfoCqCollectionItem) {
    this.documentInfoCqCollection.add(documentInfoCqCollectionItem);
    return this;
  }

  public List<DocumentInfoCq> getDocumentInfoCqCollection() {
    return documentInfoCqCollection;
  }

  public void setDocumentInfoCqCollection(List<DocumentInfoCq> documentInfoCqCollection) {
    this.documentInfoCqCollection = documentInfoCqCollection;
  }
}

