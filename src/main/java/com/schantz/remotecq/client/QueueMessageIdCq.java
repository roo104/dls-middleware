package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class QueueMessageIdCq implements Serializable {
	@JsonProperty("itemUid")
	private String itemUid = null;
	
	
	public String getItemUid() {
		return itemUid;
	}
	
	public void setItemUid(String itemUid) {
		this.itemUid = itemUid;
	}
}

