package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class ReserveAccountEntryCq implements Serializable {
	@JsonProperty("optimizationBalanceCqCollection")
	private List<OptimizationBalanceCq> optimizationBalanceCqCollection = new ArrayList<OptimizationBalanceCq>();
	
	@JsonProperty("coverId")
	private PolicyCoverIdCq coverId = null;
	
	@JsonProperty("calcFoundationIdCollection")
	private List<CalcFoundationIdCq> calcFoundationIdCollection = new ArrayList<CalcFoundationIdCq>();
	
	@JsonProperty("taxCodeCq")
	private String taxCodeCq = null;
	
	public ReserveAccountEntryCq addOptimizationBalanceCqCollectionItem(OptimizationBalanceCq optimizationBalanceCqCollectionItem) {
		this.optimizationBalanceCqCollection.add(optimizationBalanceCqCollectionItem);
		return this;
	}
	
	public List<OptimizationBalanceCq> getOptimizationBalanceCqCollection() {
		return optimizationBalanceCqCollection;
	}
	
	public void setOptimizationBalanceCqCollection(List<OptimizationBalanceCq> optimizationBalanceCqCollection) {
		this.optimizationBalanceCqCollection = optimizationBalanceCqCollection;
	}
	
	public PolicyCoverIdCq getCoverId() {
		return coverId;
	}
	
	public void setCoverId(PolicyCoverIdCq coverId) {
		this.coverId = coverId;
	}
	
	public ReserveAccountEntryCq addCalcFoundationIdCollectionItem(CalcFoundationIdCq calcFoundationIdCollectionItem) {
		this.calcFoundationIdCollection.add(calcFoundationIdCollectionItem);
		return this;
	}
	
	public List<CalcFoundationIdCq> getCalcFoundationIdCollection() {
		return calcFoundationIdCollection;
	}
	
	public void setCalcFoundationIdCollection(List<CalcFoundationIdCq> calcFoundationIdCollection) {
		this.calcFoundationIdCollection = calcFoundationIdCollection;
	}
	
	public String getTaxCodeCq() {
		return taxCodeCq;
	}
	
	public void setTaxCodeCq(String taxCodeCq) {
		this.taxCodeCq = taxCodeCq;
	}
}

