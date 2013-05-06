/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain.response;

import java.util.List;

import com.galaxy.meetup.server.client.domain.DataUser;
import com.galaxy.meetup.server.client.v2.response.Response;
import com.galaxy.meetup.server.client.domain.TraceRecords;

/**
 * 
 * @author sihai
 *
 */
public final class UserPhotoAlbumsResponse extends Response {

	public List aggregateAlbum;
	public TraceRecords backendTrace;
	public List nonAggregateAlbum;
	public Integer offset;
	public DataUser owner;

	public List getAggregateAlbum() {
		return aggregateAlbum;
	}

	public void setAggregateAlbum(List aggregateAlbum) {
		this.aggregateAlbum = aggregateAlbum;
	}

	public TraceRecords getBackendTrace() {
		return backendTrace;
	}

	public void setBackendTrace(TraceRecords backendTrace) {
		this.backendTrace = backendTrace;
	}

	public List getNonAggregateAlbum() {
		return nonAggregateAlbum;
	}

	public void setNonAggregateAlbum(List nonAggregateAlbum) {
		this.nonAggregateAlbum = nonAggregateAlbum;
	}

	public Integer getOffset() {
		return offset;
	}

	public void setOffset(Integer offset) {
		this.offset = offset;
	}

	public DataUser getOwner() {
		return owner;
	}

	public void setOwner(DataUser owner) {
		this.owner = owner;
	}

}
