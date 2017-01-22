package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class RolesPersonQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("personRoleCqCollection")
  private List<PersonRoleCq> personRoleCqCollection = new ArrayList<PersonRoleCq>();

  public RolesPersonQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }
  public RolesPersonQueryResult addPersonRoleCqCollectionItem(PersonRoleCq personRoleCqCollectionItem) {
    this.personRoleCqCollection.add(personRoleCqCollectionItem);
    return this;
  }

  public List<PersonRoleCq> getPersonRoleCqCollection() {
    return personRoleCqCollection;
  }

  public void setPersonRoleCqCollection(List<PersonRoleCq> personRoleCqCollection) {
    this.personRoleCqCollection = personRoleCqCollection;
  }
}

