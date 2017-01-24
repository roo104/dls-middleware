package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class BasicInfoPortfolioQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("basicInfoPortfolioCqCollection")
	private List<BasicInfoPortfolioCq> basicInfoPortfolioCqCollection = new ArrayList<BasicInfoPortfolioCq>();
	
	public BasicInfoPortfolioQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public BasicInfoPortfolioQueryResult addBasicInfoPortfolioCqCollectionItem(BasicInfoPortfolioCq basicInfoPortfolioCqCollectionItem) {
		this.basicInfoPortfolioCqCollection.add(basicInfoPortfolioCqCollectionItem);
		return this;
	}
	
	public List<BasicInfoPortfolioCq> getBasicInfoPortfolioCqCollection() {
		return basicInfoPortfolioCqCollection;
	}
	
	public void setBasicInfoPortfolioCqCollection(List<BasicInfoPortfolioCq> basicInfoPortfolioCqCollection) {
		this.basicInfoPortfolioCqCollection = basicInfoPortfolioCqCollection;
	}
}

