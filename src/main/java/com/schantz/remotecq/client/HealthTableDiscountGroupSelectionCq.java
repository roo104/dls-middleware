package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class HealthTableDiscountGroupSelectionCq implements Serializable {
	@JsonProperty("healthTableDiscountGroupAmountFrameTripletWrapperCqCollection")
	private List<HealthTableDiscountGroupAmountFrameTripletWrapperCq> healthTableDiscountGroupAmountFrameTripletWrapperCqCollection = new ArrayList<HealthTableDiscountGroupAmountFrameTripletWrapperCq>();
	
	public HealthTableDiscountGroupSelectionCq addHealthTableDiscountGroupAmountFrameTripletWrapperCqCollectionItem(HealthTableDiscountGroupAmountFrameTripletWrapperCq healthTableDiscountGroupAmountFrameTripletWrapperCqCollectionItem) {
		this.healthTableDiscountGroupAmountFrameTripletWrapperCqCollection.add(healthTableDiscountGroupAmountFrameTripletWrapperCqCollectionItem);
		return this;
	}
	
	public List<HealthTableDiscountGroupAmountFrameTripletWrapperCq> getHealthTableDiscountGroupAmountFrameTripletWrapperCqCollection() {
		return healthTableDiscountGroupAmountFrameTripletWrapperCqCollection;
	}
	
	public void setHealthTableDiscountGroupAmountFrameTripletWrapperCqCollection(List<HealthTableDiscountGroupAmountFrameTripletWrapperCq> healthTableDiscountGroupAmountFrameTripletWrapperCqCollection) {
		this.healthTableDiscountGroupAmountFrameTripletWrapperCqCollection = healthTableDiscountGroupAmountFrameTripletWrapperCqCollection;
	}
}

