package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class CounsellingCostEventSpecCq implements Serializable {
	@JsonProperty("counsellingCost")
	private Double counsellingCost = null;
	
	@JsonProperty("compensation")
	private Double compensation = null;
	
	@JsonProperty("costType")
	private AgreementCostNamedEntryCq costType = null;
	
	@JsonProperty("isSelected")
	private Boolean isSelected = false;
	
	@JsonProperty("isExternalCost")
	private Boolean isExternalCost = false;
	
	
	public Double getCounsellingCost() {
		return counsellingCost;
	}
	
	public void setCounsellingCost(Double counsellingCost) {
		this.counsellingCost = counsellingCost;
	}
	
	public Double getCompensation() {
		return compensation;
	}
	
	public void setCompensation(Double compensation) {
		this.compensation = compensation;
	}
	
	public AgreementCostNamedEntryCq getCostType() {
		return costType;
	}
	
	public void setCostType(AgreementCostNamedEntryCq costType) {
		this.costType = costType;
	}
	
	public Boolean getIsSelected() {
		return isSelected;
	}
	
	public void setIsSelected(Boolean isSelected) {
		this.isSelected = isSelected;
	}
	
	public Boolean getIsExternalCost() {
		return isExternalCost;
	}
	
	public void setIsExternalCost(Boolean isExternalCost) {
		this.isExternalCost = isExternalCost;
	}
}

