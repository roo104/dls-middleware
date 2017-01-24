package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class SetCompensationChoiceCommand implements Serializable {
	@JsonProperty("portfolioIdCollection")
	private List<PortfolioIdCq> portfolioIdCollection = new ArrayList<PortfolioIdCq>();
	
	@JsonProperty("valueDate")
	private LocalDate valueDate = null;
	
	@JsonProperty("compensate")
	private Boolean compensate = false;
	
	public SetCompensationChoiceCommand addPortfolioIdCollectionItem(PortfolioIdCq portfolioIdCollectionItem) {
		this.portfolioIdCollection.add(portfolioIdCollectionItem);
		return this;
	}
	
	public List<PortfolioIdCq> getPortfolioIdCollection() {
		return portfolioIdCollection;
	}
	
	public void setPortfolioIdCollection(List<PortfolioIdCq> portfolioIdCollection) {
		this.portfolioIdCollection = portfolioIdCollection;
	}
	
	public LocalDate getValueDate() {
		return valueDate;
	}
	
	public void setValueDate(LocalDate valueDate) {
		this.valueDate = valueDate;
	}
	
	public Boolean getCompensate() {
		return compensate;
	}
	
	public void setCompensate(Boolean compensate) {
		this.compensate = compensate;
	}
}

