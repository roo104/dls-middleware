package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class EmployeeInfo implements Serializable {
  @JsonProperty("employeeDetailsPolicyEntryCollection")
  private List<EmployeeDetailsPolicyEntry> employeeDetailsPolicyEntryCollection = new ArrayList<EmployeeDetailsPolicyEntry>();

  @JsonProperty("personId")
  private PersonIdCq personId = null;

  public EmployeeInfo addEmployeeDetailsPolicyEntryCollectionItem(EmployeeDetailsPolicyEntry employeeDetailsPolicyEntryCollectionItem) {
    this.employeeDetailsPolicyEntryCollection.add(employeeDetailsPolicyEntryCollectionItem);
    return this;
  }

  public List<EmployeeDetailsPolicyEntry> getEmployeeDetailsPolicyEntryCollection() {
    return employeeDetailsPolicyEntryCollection;
  }

  public void setEmployeeDetailsPolicyEntryCollection(List<EmployeeDetailsPolicyEntry> employeeDetailsPolicyEntryCollection) {
    this.employeeDetailsPolicyEntryCollection = employeeDetailsPolicyEntryCollection;
  }

  public PersonIdCq getPersonId() {
    return personId;
  }

  public void setPersonId(PersonIdCq personId) {
    this.personId = personId;
  }
}

