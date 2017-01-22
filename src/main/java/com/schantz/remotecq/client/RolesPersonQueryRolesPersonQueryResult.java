package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class RolesPersonQueryRolesPersonQueryResult implements Serializable {
  @JsonProperty("viewAtDate")
  private LocalDate viewAtDate = null;

  @JsonProperty("personId")
  private PersonIdCq personId = null;

  @JsonProperty("showHistoryForCollection")
  private List<String> showHistoryForCollection = new ArrayList<String>();


  public LocalDate getViewAtDate() {
    return viewAtDate;
  }

  public void setViewAtDate(LocalDate viewAtDate) {
    this.viewAtDate = viewAtDate;
  }

  public PersonIdCq getPersonId() {
    return personId;
  }

  public void setPersonId(PersonIdCq personId) {
    this.personId = personId;
  }
  public RolesPersonQueryRolesPersonQueryResult addShowHistoryForCollectionItem(String showHistoryForCollectionItem) {
    this.showHistoryForCollection.add(showHistoryForCollectionItem);
    return this;
  }

  public List<String> getShowHistoryForCollection() {
    return showHistoryForCollection;
  }

  public void setShowHistoryForCollection(List<String> showHistoryForCollection) {
    this.showHistoryForCollection = showHistoryForCollection;
  }
}

