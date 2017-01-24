package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class BatchDataQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("batchDataResultEntryCollection")
	private List<BatchDataResultEntry> batchDataResultEntryCollection = new ArrayList<BatchDataResultEntry>();
	
	@JsonProperty("batchDataResultRecordEntryCollection")
	private List<BatchDataResultRecordEntry> batchDataResultRecordEntryCollection = new ArrayList<BatchDataResultRecordEntry>();
	
	@JsonProperty("noticeIdCqCollection")
	private List<NoticeIdCq> noticeIdCqCollection = new ArrayList<NoticeIdCq>();
	
	@JsonProperty("batchDataResultActionEntryCollection")
	private List<BatchDataResultActionEntry> batchDataResultActionEntryCollection = new ArrayList<BatchDataResultActionEntry>();
	
	@JsonProperty("noticeCqCollection")
	private List<NoticeCq> noticeCqCollection = new ArrayList<NoticeCq>();
	
	public BatchDataQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public BatchDataQueryResult addBatchDataResultEntryCollectionItem(BatchDataResultEntry batchDataResultEntryCollectionItem) {
		this.batchDataResultEntryCollection.add(batchDataResultEntryCollectionItem);
		return this;
	}
	
	public List<BatchDataResultEntry> getBatchDataResultEntryCollection() {
		return batchDataResultEntryCollection;
	}
	
	public void setBatchDataResultEntryCollection(List<BatchDataResultEntry> batchDataResultEntryCollection) {
		this.batchDataResultEntryCollection = batchDataResultEntryCollection;
	}
	
	public BatchDataQueryResult addBatchDataResultRecordEntryCollectionItem(BatchDataResultRecordEntry batchDataResultRecordEntryCollectionItem) {
		this.batchDataResultRecordEntryCollection.add(batchDataResultRecordEntryCollectionItem);
		return this;
	}
	
	public List<BatchDataResultRecordEntry> getBatchDataResultRecordEntryCollection() {
		return batchDataResultRecordEntryCollection;
	}
	
	public void setBatchDataResultRecordEntryCollection(List<BatchDataResultRecordEntry> batchDataResultRecordEntryCollection) {
		this.batchDataResultRecordEntryCollection = batchDataResultRecordEntryCollection;
	}
	
	public BatchDataQueryResult addNoticeIdCqCollectionItem(NoticeIdCq noticeIdCqCollectionItem) {
		this.noticeIdCqCollection.add(noticeIdCqCollectionItem);
		return this;
	}
	
	public List<NoticeIdCq> getNoticeIdCqCollection() {
		return noticeIdCqCollection;
	}
	
	public void setNoticeIdCqCollection(List<NoticeIdCq> noticeIdCqCollection) {
		this.noticeIdCqCollection = noticeIdCqCollection;
	}
	
	public BatchDataQueryResult addBatchDataResultActionEntryCollectionItem(BatchDataResultActionEntry batchDataResultActionEntryCollectionItem) {
		this.batchDataResultActionEntryCollection.add(batchDataResultActionEntryCollectionItem);
		return this;
	}
	
	public List<BatchDataResultActionEntry> getBatchDataResultActionEntryCollection() {
		return batchDataResultActionEntryCollection;
	}
	
	public void setBatchDataResultActionEntryCollection(List<BatchDataResultActionEntry> batchDataResultActionEntryCollection) {
		this.batchDataResultActionEntryCollection = batchDataResultActionEntryCollection;
	}
	
	public BatchDataQueryResult addNoticeCqCollectionItem(NoticeCq noticeCqCollectionItem) {
		this.noticeCqCollection.add(noticeCqCollectionItem);
		return this;
	}
	
	public List<NoticeCq> getNoticeCqCollection() {
		return noticeCqCollection;
	}
	
	public void setNoticeCqCollection(List<NoticeCq> noticeCqCollection) {
		this.noticeCqCollection = noticeCqCollection;
	}
}

