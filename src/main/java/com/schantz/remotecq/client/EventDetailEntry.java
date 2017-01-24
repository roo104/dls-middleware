package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class EventDetailEntry implements Serializable {
	@JsonProperty("eventDetailValueCollection")
	private List<EventDetailValueObject> eventDetailValueCollection = new ArrayList<EventDetailValueObject>();
	
	public EventDetailEntry addEventDetailValueCollectionItem(EventDetailValueObject eventDetailValueCollectionItem) {
		this.eventDetailValueCollection.add(eventDetailValueCollectionItem);
		return this;
	}
	
	public List<EventDetailValueObject> getEventDetailValueCollection() {
		return eventDetailValueCollection;
	}
	
	public void setEventDetailValueCollection(List<EventDetailValueObject> eventDetailValueCollection) {
		this.eventDetailValueCollection = eventDetailValueCollection;
	}
}

