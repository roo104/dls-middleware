package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class CustomerSelectablityRuleCq implements Serializable {
	@JsonProperty("systemControlled")
	private Boolean systemControlled = false;
	
	@JsonProperty("minEntityMultiplicity")
	private Long minEntityMultiplicity = null;
	
	@JsonProperty("maxEntityMultiplicity")
	private Long maxEntityMultiplicity = null;
	
	@JsonProperty("minEntityMultiplicityMagicUnresolved")
	private Long minEntityMultiplicityMagicUnresolved = null;
	
	@JsonProperty("maxEntityMultiplicityMagicUnresolved")
	private Long maxEntityMultiplicityMagicUnresolved = null;
	
	@JsonProperty("booleanSelectionSelectionFrameCq")
	private BooleanSelectionSelectionFrameCq booleanSelectionSelectionFrameCq = null;
	
	
	public Boolean getSystemControlled() {
		return systemControlled;
	}
	
	public void setSystemControlled(Boolean systemControlled) {
		this.systemControlled = systemControlled;
	}
	
	public Long getMinEntityMultiplicity() {
		return minEntityMultiplicity;
	}
	
	public void setMinEntityMultiplicity(Long minEntityMultiplicity) {
		this.minEntityMultiplicity = minEntityMultiplicity;
	}
	
	public Long getMaxEntityMultiplicity() {
		return maxEntityMultiplicity;
	}
	
	public void setMaxEntityMultiplicity(Long maxEntityMultiplicity) {
		this.maxEntityMultiplicity = maxEntityMultiplicity;
	}
	
	public Long getMinEntityMultiplicityMagicUnresolved() {
		return minEntityMultiplicityMagicUnresolved;
	}
	
	public void setMinEntityMultiplicityMagicUnresolved(Long minEntityMultiplicityMagicUnresolved) {
		this.minEntityMultiplicityMagicUnresolved = minEntityMultiplicityMagicUnresolved;
	}
	
	public Long getMaxEntityMultiplicityMagicUnresolved() {
		return maxEntityMultiplicityMagicUnresolved;
	}
	
	public void setMaxEntityMultiplicityMagicUnresolved(Long maxEntityMultiplicityMagicUnresolved) {
		this.maxEntityMultiplicityMagicUnresolved = maxEntityMultiplicityMagicUnresolved;
	}
	
	public BooleanSelectionSelectionFrameCq getBooleanSelectionSelectionFrameCq() {
		return booleanSelectionSelectionFrameCq;
	}
	
	public void setBooleanSelectionSelectionFrameCq(BooleanSelectionSelectionFrameCq booleanSelectionSelectionFrameCq) {
		this.booleanSelectionSelectionFrameCq = booleanSelectionSelectionFrameCq;
	}
}

