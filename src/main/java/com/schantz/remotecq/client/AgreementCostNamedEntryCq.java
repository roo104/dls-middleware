package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class AgreementCostNamedEntryCq implements Serializable {
	@JsonProperty("value")
	private Double value = null;
	
	@JsonProperty("entryId")
	private AgreementCostEntryIdCq entryId = null;
	
	@JsonProperty("globalValue")
	private ParameterSeriesIdCq globalValue = null;
	
	@JsonProperty("name")
	private String name = null;
	
	@JsonProperty("reserveItemTypeCq")
	private String reserveItemTypeCq = null;
	
	
	public Double getValue() {
		return value;
	}
	
	public void setValue(Double value) {
		this.value = value;
	}
	
	public AgreementCostEntryIdCq getEntryId() {
		return entryId;
	}
	
	public void setEntryId(AgreementCostEntryIdCq entryId) {
		this.entryId = entryId;
	}
	
	public ParameterSeriesIdCq getGlobalValue() {
		return globalValue;
	}
	
	public void setGlobalValue(ParameterSeriesIdCq globalValue) {
		this.globalValue = globalValue;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getReserveItemTypeCq() {
		return reserveItemTypeCq;
	}
	
	public void setReserveItemTypeCq(String reserveItemTypeCq) {
		this.reserveItemTypeCq = reserveItemTypeCq;
	}
}

