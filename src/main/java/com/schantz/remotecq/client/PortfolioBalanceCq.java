package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class PortfolioBalanceCq implements Serializable {
  @JsonProperty("totalValue")
  private Double totalValue = null;

  @JsonProperty("portfolioUnitsCqCollection")
  private List<PortfolioUnitsCq> portfolioUnitsCqCollection = new ArrayList<PortfolioUnitsCq>();


  public Double getTotalValue() {
    return totalValue;
  }

  public void setTotalValue(Double totalValue) {
    this.totalValue = totalValue;
  }
  public PortfolioBalanceCq addPortfolioUnitsCqCollectionItem(PortfolioUnitsCq portfolioUnitsCqCollectionItem) {
    this.portfolioUnitsCqCollection.add(portfolioUnitsCqCollectionItem);
    return this;
  }

  public List<PortfolioUnitsCq> getPortfolioUnitsCqCollection() {
    return portfolioUnitsCqCollection;
  }

  public void setPortfolioUnitsCqCollection(List<PortfolioUnitsCq> portfolioUnitsCqCollection) {
    this.portfolioUnitsCqCollection = portfolioUnitsCqCollection;
  }
}

