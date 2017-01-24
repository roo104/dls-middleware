package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class CustomerViewCategoryObject implements Serializable {
	@JsonProperty("title")
	private CqMessageKey title = null;
	
	@JsonProperty("type")
	private String type = null;
	
	@JsonProperty("isMainCategory")
	private Boolean isMainCategory = false;
	
	
	public CqMessageKey getTitle() {
		return title;
	}
	
	public void setTitle(CqMessageKey title) {
		this.title = title;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public Boolean getIsMainCategory() {
		return isMainCategory;
	}
	
	public void setIsMainCategory(Boolean isMainCategory) {
		this.isMainCategory = isMainCategory;
	}
}

