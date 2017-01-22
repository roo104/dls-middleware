package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class TopBasicInfoPersonQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("personCq")
  private PersonCq personCq = null;

  @JsonProperty("isHasOngoingActivities")
  private Boolean isHasOngoingActivities = false;

  public TopBasicInfoPersonQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }

  public PersonCq getPersonCq() {
    return personCq;
  }

  public void setPersonCq(PersonCq personCq) {
    this.personCq = personCq;
  }

  public Boolean getIsHasOngoingActivities() {
    return isHasOngoingActivities;
  }

  public void setIsHasOngoingActivities(Boolean isHasOngoingActivities) {
    this.isHasOngoingActivities = isHasOngoingActivities;
  }
}

