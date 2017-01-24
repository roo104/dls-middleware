package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class DkTaxInformationQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("dkTaxCardCqCollection")
	private List<DkTaxCardCq> dkTaxCardCqCollection = new ArrayList<DkTaxCardCq>();
	
	@JsonProperty("isUseManualTax")
	private Boolean isUseManualTax = false;
	
	@JsonProperty("isUseGreenlandTax")
	private Boolean isUseGreenlandTax = false;
	
	public DkTaxInformationQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public DkTaxInformationQueryResult addDkTaxCardCqCollectionItem(DkTaxCardCq dkTaxCardCqCollectionItem) {
		this.dkTaxCardCqCollection.add(dkTaxCardCqCollectionItem);
		return this;
	}
	
	public List<DkTaxCardCq> getDkTaxCardCqCollection() {
		return dkTaxCardCqCollection;
	}
	
	public void setDkTaxCardCqCollection(List<DkTaxCardCq> dkTaxCardCqCollection) {
		this.dkTaxCardCqCollection = dkTaxCardCqCollection;
	}
	
	public Boolean getIsUseManualTax() {
		return isUseManualTax;
	}
	
	public void setIsUseManualTax(Boolean isUseManualTax) {
		this.isUseManualTax = isUseManualTax;
	}
	
	public Boolean getIsUseGreenlandTax() {
		return isUseGreenlandTax;
	}
	
	public void setIsUseGreenlandTax(Boolean isUseGreenlandTax) {
		this.isUseGreenlandTax = isUseGreenlandTax;
	}
}

