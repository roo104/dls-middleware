package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class ChangePersonRoleCommand implements Serializable {
  @JsonProperty("personId")
  private PersonIdCq personId = null;

  @JsonProperty("cancelRoleCollection")
  private List<PersonRoleCq> cancelRoleCollection = new ArrayList<PersonRoleCq>();

  @JsonProperty("createRoleCollection")
  private List<PersonRoleCq> createRoleCollection = new ArrayList<PersonRoleCq>();


  public PersonIdCq getPersonId() {
    return personId;
  }

  public void setPersonId(PersonIdCq personId) {
    this.personId = personId;
  }
  public ChangePersonRoleCommand addCancelRoleCollectionItem(PersonRoleCq cancelRoleCollectionItem) {
    this.cancelRoleCollection.add(cancelRoleCollectionItem);
    return this;
  }

  public List<PersonRoleCq> getCancelRoleCollection() {
    return cancelRoleCollection;
  }

  public void setCancelRoleCollection(List<PersonRoleCq> cancelRoleCollection) {
    this.cancelRoleCollection = cancelRoleCollection;
  }
  public ChangePersonRoleCommand addCreateRoleCollectionItem(PersonRoleCq createRoleCollectionItem) {
    this.createRoleCollection.add(createRoleCollectionItem);
    return this;
  }

  public List<PersonRoleCq> getCreateRoleCollection() {
    return createRoleCollection;
  }

  public void setCreateRoleCollection(List<PersonRoleCq> createRoleCollection) {
    this.createRoleCollection = createRoleCollection;
  }
}

