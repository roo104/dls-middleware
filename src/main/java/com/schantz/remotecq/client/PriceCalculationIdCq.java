package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class PriceCalculationIdCq implements Serializable {
	@JsonProperty("orderUid")
	private String orderUid = null;
	
	@JsonProperty("orderId")
	private String orderId = null;
	
	
	public String getOrderUid() {
		return orderUid;
	}
	
	public void setOrderUid(String orderUid) {
		this.orderUid = orderUid;
	}
	
	public String getOrderId() {
		return orderId;
	}
	
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
}

