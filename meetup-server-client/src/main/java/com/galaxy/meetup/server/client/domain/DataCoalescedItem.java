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
public class DataCoalescedItem extends GenericJson {
	
	public List a2aData;
	
    public List action;
    
    public String category;
    
    public String coalescingCode;
    
    public String debug;
    
    public String defaultUrl;
    
    public EntityEntityData entityData;
    
    public String entityReference;
    
    public String entityReferenceType;
    
    public String filterType;
    
    public Integer hashCode;
    
    public String id;
    
    public List involvedActorOid;
    
    public Boolean isEntityDeleted;
    
    public Boolean isMuted;
    
    public Boolean isRead;
    
    public List opaqueClientFields;
    
    public Boolean pushEnabled;
    
    public Double timestamp;

	public List getA2aData() {
		return a2aData;
	}

	public void setA2aData(List a2aData) {
		this.a2aData = a2aData;
	}

	public List getAction() {
		return action;
	}

	public void setAction(List action) {
		this.action = action;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCoalescingCode() {
		return coalescingCode;
	}

	public void setCoalescingCode(String coalescingCode) {
		this.coalescingCode = coalescingCode;
	}

	public String getDebug() {
		return debug;
	}

	public void setDebug(String debug) {
		this.debug = debug;
	}

	public String getDefaultUrl() {
		return defaultUrl;
	}

	public void setDefaultUrl(String defaultUrl) {
		this.defaultUrl = defaultUrl;
	}

	public EntityEntityData getEntityData() {
		return entityData;
	}

	public void setEntityData(EntityEntityData entityData) {
		this.entityData = entityData;
	}

	public String getEntityReference() {
		return entityReference;
	}

	public void setEntityReference(String entityReference) {
		this.entityReference = entityReference;
	}

	public String getEntityReferenceType() {
		return entityReferenceType;
	}

	public void setEntityReferenceType(String entityReferenceType) {
		this.entityReferenceType = entityReferenceType;
	}

	public String getFilterType() {
		return filterType;
	}

	public void setFilterType(String filterType) {
		this.filterType = filterType;
	}

	public Integer getHashCode() {
		return hashCode;
	}

	public void setHashCode(Integer hashCode) {
		this.hashCode = hashCode;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List getInvolvedActorOid() {
		return involvedActorOid;
	}

	public void setInvolvedActorOid(List involvedActorOid) {
		this.involvedActorOid = involvedActorOid;
	}

	public Boolean getIsEntityDeleted() {
		return isEntityDeleted;
	}

	public void setIsEntityDeleted(Boolean isEntityDeleted) {
		this.isEntityDeleted = isEntityDeleted;
	}

	public Boolean getIsMuted() {
		return isMuted;
	}

	public void setIsMuted(Boolean isMuted) {
		this.isMuted = isMuted;
	}

	public Boolean getIsRead() {
		return isRead;
	}

	public void setIsRead(Boolean isRead) {
		this.isRead = isRead;
	}

	public List getOpaqueClientFields() {
		return opaqueClientFields;
	}

	public void setOpaqueClientFields(List opaqueClientFields) {
		this.opaqueClientFields = opaqueClientFields;
	}

	public Boolean getPushEnabled() {
		return pushEnabled;
	}

	public void setPushEnabled(Boolean pushEnabled) {
		this.pushEnabled = pushEnabled;
	}

	public Double getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Double timestamp) {
		this.timestamp = timestamp;
	}
}
