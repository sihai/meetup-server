/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.client.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author sihai
 *
 */
public class TraceRecords extends GenericJson {

	/**
	 * 
	 */
	public List<TraceRecordsRecord> records = new ArrayList<TraceRecordsRecord>(1);
	
	public List<TraceRecordsRecord> getRecords() {
		return records;
	}

	public void setRecords(List<TraceRecordsRecord> records) {
		this.records = records;
	}

	public TraceRecords addRecord(TraceRecordsRecord record) {
		records.add(record);
		return this;
	}
}
