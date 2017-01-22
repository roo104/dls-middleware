package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class PagingInfoCq implements Serializable {
  @JsonProperty("firstEntryOnPage")
  private Long firstEntryOnPage = null;

  @JsonProperty("entriesOnPage")
  private Long entriesOnPage = null;

  @JsonProperty("totalNoOfEntries")
  private Long totalNoOfEntries = null;


  public Long getFirstEntryOnPage() {
    return firstEntryOnPage;
  }

  public void setFirstEntryOnPage(Long firstEntryOnPage) {
    this.firstEntryOnPage = firstEntryOnPage;
  }

  public Long getEntriesOnPage() {
    return entriesOnPage;
  }

  public void setEntriesOnPage(Long entriesOnPage) {
    this.entriesOnPage = entriesOnPage;
  }

  public Long getTotalNoOfEntries() {
    return totalNoOfEntries;
  }

  public void setTotalNoOfEntries(Long totalNoOfEntries) {
    this.totalNoOfEntries = totalNoOfEntries;
  }
}

