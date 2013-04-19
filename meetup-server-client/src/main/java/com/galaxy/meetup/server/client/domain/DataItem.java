/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain;

import java.util.List;

/**
 * 
 * @author sihai
 *
 */
public class DataItem extends GenericJson {

	public DataActor actor;
	
	public String actorOid;
	
	public String id;
	
	public Boolean isRead;
	
	public String notificationType;
	
	public List<DataKvPair> opaqueClientFields;
	
	public Double timestamp;

	public DataActor getActor() {
		return actor;
	}

	public void setActor(DataActor actor) {
		this.actor = actor;
	}

	public String getActorOid() {
		return actorOid;
	}

	public void setActorOid(String actorOid) {
		this.actorOid = actorOid;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Boolean getIsRead() {
		return isRead;
	}

	public void setIsRead(Boolean isRead) {
		this.isRead = isRead;
	}

	public String getNotificationType() {
		return notificationType;
	}

	public void setNotificationType(String notificationType) {
		this.notificationType = notificationType;
	}

	public List<DataKvPair> getOpaqueClientFields() {
		return opaqueClientFields;
	}

	public void setOpaqueClientFields(List<DataKvPair> opaqueClientFields) {
		this.opaqueClientFields = opaqueClientFields;
	}

	public Double getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Double timestamp) {
		this.timestamp = timestamp;
	}
}
