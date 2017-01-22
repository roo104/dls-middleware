package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class ProjectionTimeSpecCq implements Serializable {
  @JsonProperty("datesCollection")
  private List<LocalDate> datesCollection = new ArrayList<LocalDate>();

  @JsonProperty("dateSpanStart")
  private LocalDate dateSpanStart = null;

  @JsonProperty("dateSpanEnd")
  private LocalDate dateSpanEnd = null;

  @JsonProperty("ageCqCollection")
  private List<AgeCq> ageCqCollection = new ArrayList<AgeCq>();

  @JsonProperty("ageSpanStart")
  private AgeCq ageSpanStart = null;

  @JsonProperty("ageSpanEnd")
  private AgeCq ageSpanEnd = null;

  public ProjectionTimeSpecCq addDatesCollectionItem(LocalDate datesCollectionItem) {
    this.datesCollection.add(datesCollectionItem);
    return this;
  }

  public List<LocalDate> getDatesCollection() {
    return datesCollection;
  }

  public void setDatesCollection(List<LocalDate> datesCollection) {
    this.datesCollection = datesCollection;
  }

  public LocalDate getDateSpanStart() {
    return dateSpanStart;
  }

  public void setDateSpanStart(LocalDate dateSpanStart) {
    this.dateSpanStart = dateSpanStart;
  }

  public LocalDate getDateSpanEnd() {
    return dateSpanEnd;
  }

  public void setDateSpanEnd(LocalDate dateSpanEnd) {
    this.dateSpanEnd = dateSpanEnd;
  }
  public ProjectionTimeSpecCq addAgeCqCollectionItem(AgeCq ageCqCollectionItem) {
    this.ageCqCollection.add(ageCqCollectionItem);
    return this;
  }

  public List<AgeCq> getAgeCqCollection() {
    return ageCqCollection;
  }

  public void setAgeCqCollection(List<AgeCq> ageCqCollection) {
    this.ageCqCollection = ageCqCollection;
  }

  public AgeCq getAgeSpanStart() {
    return ageSpanStart;
  }

  public void setAgeSpanStart(AgeCq ageSpanStart) {
    this.ageSpanStart = ageSpanStart;
  }

  public AgeCq getAgeSpanEnd() {
    return ageSpanEnd;
  }

  public void setAgeSpanEnd(AgeCq ageSpanEnd) {
    this.ageSpanEnd = ageSpanEnd;
  }
}

