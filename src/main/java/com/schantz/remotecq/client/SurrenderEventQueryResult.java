package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class SurrenderEventQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("eventCq")
	private SurrenderEventCq eventCq = null;
	
	@JsonProperty("surrenderAnnexSpecCqCollection")
	private List<SurrenderAnnexSpecCq> surrenderAnnexSpecCqCollection = new ArrayList<SurrenderAnnexSpecCq>();
	
	public SurrenderEventQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public SurrenderEventCq getEventCq() {
		return eventCq;
	}
	
	public void setEventCq(SurrenderEventCq eventCq) {
		this.eventCq = eventCq;
	}
	
	public SurrenderEventQueryResult addSurrenderAnnexSpecCqCollectionItem(SurrenderAnnexSpecCq surrenderAnnexSpecCqCollectionItem) {
		this.surrenderAnnexSpecCqCollection.add(surrenderAnnexSpecCqCollectionItem);
		return this;
	}
	
	public List<SurrenderAnnexSpecCq> getSurrenderAnnexSpecCqCollection() {
		return surrenderAnnexSpecCqCollection;
	}
	
	public void setSurrenderAnnexSpecCqCollection(List<SurrenderAnnexSpecCq> surrenderAnnexSpecCqCollection) {
		this.surrenderAnnexSpecCqCollection = surrenderAnnexSpecCqCollection;
	}
}

