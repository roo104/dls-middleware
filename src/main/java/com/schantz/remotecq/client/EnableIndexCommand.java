package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class EnableIndexCommand implements Serializable {
	@JsonProperty("indexName")
	private String indexName = null;
	
	@JsonProperty("tableName")
	private String tableName = null;
	
	
	public String getIndexName() {
		return indexName;
	}
	
	public void setIndexName(String indexName) {
		this.indexName = indexName;
	}
	
	public String getTableName() {
		return tableName;
	}
	
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
}

