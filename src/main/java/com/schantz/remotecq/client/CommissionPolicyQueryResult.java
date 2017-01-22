package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class CommissionPolicyQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("commissionDataCq")
  private CommissionDataCq commissionDataCq = null;

  @JsonProperty("commissionAgreementRoleCqCollection")
  private List<CommissionAgreementRoleCq> commissionAgreementRoleCqCollection = new ArrayList<CommissionAgreementRoleCq>();

  public CommissionPolicyQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }

  public CommissionDataCq getCommissionDataCq() {
    return commissionDataCq;
  }

  public void setCommissionDataCq(CommissionDataCq commissionDataCq) {
    this.commissionDataCq = commissionDataCq;
  }
  public CommissionPolicyQueryResult addCommissionAgreementRoleCqCollectionItem(CommissionAgreementRoleCq commissionAgreementRoleCqCollectionItem) {
    this.commissionAgreementRoleCqCollection.add(commissionAgreementRoleCqCollectionItem);
    return this;
  }

  public List<CommissionAgreementRoleCq> getCommissionAgreementRoleCqCollection() {
    return commissionAgreementRoleCqCollection;
  }

  public void setCommissionAgreementRoleCqCollection(List<CommissionAgreementRoleCq> commissionAgreementRoleCqCollection) {
    this.commissionAgreementRoleCqCollection = commissionAgreementRoleCqCollection;
  }
}

