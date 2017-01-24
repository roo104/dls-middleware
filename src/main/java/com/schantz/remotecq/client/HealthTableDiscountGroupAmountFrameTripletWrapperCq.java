package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class HealthTableDiscountGroupAmountFrameTripletWrapperCq implements Serializable {
	@JsonProperty("healthTableCategoryTypeCq")
	private String healthTableCategoryTypeCq = null;
	
	@JsonProperty("amountFrameTripletCq")
	private AmountFrameTripletCq amountFrameTripletCq = null;
	
	
	public String getHealthTableCategoryTypeCq() {
		return healthTableCategoryTypeCq;
	}
	
	public void setHealthTableCategoryTypeCq(String healthTableCategoryTypeCq) {
		this.healthTableCategoryTypeCq = healthTableCategoryTypeCq;
	}
	
	public AmountFrameTripletCq getAmountFrameTripletCq() {
		return amountFrameTripletCq;
	}
	
	public void setAmountFrameTripletCq(AmountFrameTripletCq amountFrameTripletCq) {
		this.amountFrameTripletCq = amountFrameTripletCq;
	}
}

