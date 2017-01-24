package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class EditTradeChargeFrameSelection implements Serializable {
	@JsonProperty("tradeCommandTypeCqCollection")
	private List<String> tradeCommandTypeCqCollection = new ArrayList<String>();
	
	@JsonProperty("tradeChargeFrameIdCq")
	private TradeChargeFrameIdCq tradeChargeFrameIdCq = null;
	
	public EditTradeChargeFrameSelection addTradeCommandTypeCqCollectionItem(String tradeCommandTypeCqCollectionItem) {
		this.tradeCommandTypeCqCollection.add(tradeCommandTypeCqCollectionItem);
		return this;
	}
	
	public List<String> getTradeCommandTypeCqCollection() {
		return tradeCommandTypeCqCollection;
	}
	
	public void setTradeCommandTypeCqCollection(List<String> tradeCommandTypeCqCollection) {
		this.tradeCommandTypeCqCollection = tradeCommandTypeCqCollection;
	}
	
	public TradeChargeFrameIdCq getTradeChargeFrameIdCq() {
		return tradeChargeFrameIdCq;
	}
	
	public void setTradeChargeFrameIdCq(TradeChargeFrameIdCq tradeChargeFrameIdCq) {
		this.tradeChargeFrameIdCq = tradeChargeFrameIdCq;
	}
}

