package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class MoneyAccountShareCq implements Serializable {
	@JsonProperty("datePctCqCollection")
	private List<DatePctCq> datePctCqCollection = new ArrayList<DatePctCq>();
	
	public MoneyAccountShareCq addDatePctCqCollectionItem(DatePctCq datePctCqCollectionItem) {
		this.datePctCqCollection.add(datePctCqCollectionItem);
		return this;
	}
	
	public List<DatePctCq> getDatePctCqCollection() {
		return datePctCqCollection;
	}
	
	public void setDatePctCqCollection(List<DatePctCq> datePctCqCollection) {
		this.datePctCqCollection = datePctCqCollection;
	}
}

