package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class LifeInsuranceCompanyQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("lifeInsuranceCompanyCq")
  private LifeInsuranceCompanyCq lifeInsuranceCompanyCq = null;

  public LifeInsuranceCompanyQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }

  public LifeInsuranceCompanyCq getLifeInsuranceCompanyCq() {
    return lifeInsuranceCompanyCq;
  }

  public void setLifeInsuranceCompanyCq(LifeInsuranceCompanyCq lifeInsuranceCompanyCq) {
    this.lifeInsuranceCompanyCq = lifeInsuranceCompanyCq;
  }
}

