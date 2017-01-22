package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class TopMovePackageEventPackageInfoCq implements Serializable {
  @JsonProperty("policyPackageIdCq")
  private PolicyPackageIdCq policyPackageIdCq = null;

  @JsonProperty("coverInfoCollection")
  private List<TopMovePackageEventCoverInfoCq> coverInfoCollection = new ArrayList<TopMovePackageEventCoverInfoCq>();


  public PolicyPackageIdCq getPolicyPackageIdCq() {
    return policyPackageIdCq;
  }

  public void setPolicyPackageIdCq(PolicyPackageIdCq policyPackageIdCq) {
    this.policyPackageIdCq = policyPackageIdCq;
  }
  public TopMovePackageEventPackageInfoCq addCoverInfoCollectionItem(TopMovePackageEventCoverInfoCq coverInfoCollectionItem) {
    this.coverInfoCollection.add(coverInfoCollectionItem);
    return this;
  }

  public List<TopMovePackageEventCoverInfoCq> getCoverInfoCollection() {
    return coverInfoCollection;
  }

  public void setCoverInfoCollection(List<TopMovePackageEventCoverInfoCq> coverInfoCollection) {
    this.coverInfoCollection = coverInfoCollection;
  }
}

