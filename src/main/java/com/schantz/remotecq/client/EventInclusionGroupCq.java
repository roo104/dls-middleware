package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class EventInclusionGroupCq implements Serializable {
	@JsonProperty("eventDate")
	private LocalDate eventDate = null;
	
	@JsonProperty("inclusionIdCollection")
	private List<EventInclusionIdCq> inclusionIdCollection = new ArrayList<EventInclusionIdCq>();
	
	
	public LocalDate getEventDate() {
		return eventDate;
	}
	
	public void setEventDate(LocalDate eventDate) {
		this.eventDate = eventDate;
	}
	
	public EventInclusionGroupCq addInclusionIdCollectionItem(EventInclusionIdCq inclusionIdCollectionItem) {
		this.inclusionIdCollection.add(inclusionIdCollectionItem);
		return this;
	}
	
	public List<EventInclusionIdCq> getInclusionIdCollection() {
		return inclusionIdCollection;
	}
	
	public void setInclusionIdCollection(List<EventInclusionIdCq> inclusionIdCollection) {
		this.inclusionIdCollection = inclusionIdCollection;
	}
}

