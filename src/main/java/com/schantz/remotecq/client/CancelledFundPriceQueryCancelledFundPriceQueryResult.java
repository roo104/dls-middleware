package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class CancelledFundPriceQueryCancelledFundPriceQueryResult implements Serializable {
	@JsonProperty("fundPriceIdCq")
	private FundPriceIdCq fundPriceIdCq = null;
	
	
	public FundPriceIdCq getFundPriceIdCq() {
		return fundPriceIdCq;
	}
	
	public void setFundPriceIdCq(FundPriceIdCq fundPriceIdCq) {
		this.fundPriceIdCq = fundPriceIdCq;
	}
}

