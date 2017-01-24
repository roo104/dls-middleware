package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class CancelTradeCommand implements Serializable {
	@JsonProperty("tradeId")
	private TradeIdCq tradeId = null;
	
	
	public TradeIdCq getTradeId() {
		return tradeId;
	}
	
	public void setTradeId(TradeIdCq tradeId) {
		this.tradeId = tradeId;
	}
}

