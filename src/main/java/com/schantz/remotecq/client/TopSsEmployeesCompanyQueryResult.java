package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class TopSsEmployeesCompanyQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("employeeInfoCollection")
  private List<EmployeeInfo> employeeInfoCollection = new ArrayList<EmployeeInfo>();

  public TopSsEmployeesCompanyQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }
  public TopSsEmployeesCompanyQueryResult addEmployeeInfoCollectionItem(EmployeeInfo employeeInfoCollectionItem) {
    this.employeeInfoCollection.add(employeeInfoCollectionItem);
    return this;
  }

  public List<EmployeeInfo> getEmployeeInfoCollection() {
    return employeeInfoCollection;
  }

  public void setEmployeeInfoCollection(List<EmployeeInfo> employeeInfoCollection) {
    this.employeeInfoCollection = employeeInfoCollection;
  }
}

