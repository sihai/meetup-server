/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain;


/**
 * 
 * @author sihai
 *
 */
public class ActivityDetails extends GenericJson {

	public Integer albumSummary;
	
    public Integer embedType;
    
    public String explanationType;
    
    public Boolean isOwnerless;
    
    public Boolean isPublic;
    
    public Boolean isRead;
    
    public String itemCategory;
    
    public String mediaType;
    
    public String mediaUrl;
    
    public Integer metadataNamespace;
    
    public Integer numComments;
    
    public Integer numPlusones;
    
    public Integer numShares;
    
    public Integer originalPosition;
    
    public Integer popularUpdatePosition;
    
    public String sourceStreamId;
    
    public String verbType;

	public Integer getAlbumSummary() {
		return albumSummary;
	}

	public void setAlbumSummary(Integer albumSummary) {
		this.albumSummary = albumSummary;
	}

	public Integer getEmbedType() {
		return embedType;
	}

	public void setEmbedType(Integer embedType) {
		this.embedType = embedType;
	}

	public String getExplanationType() {
		return explanationType;
	}

	public void setExplanationType(String explanationType) {
		this.explanationType = explanationType;
	}

	public Boolean getIsOwnerless() {
		return isOwnerless;
	}

	public void setIsOwnerless(Boolean isOwnerless) {
		this.isOwnerless = isOwnerless;
	}

	public Boolean getIsPublic() {
		return isPublic;
	}

	public void setIsPublic(Boolean isPublic) {
		this.isPublic = isPublic;
	}

	public Boolean getIsRead() {
		return isRead;
	}

	public void setIsRead(Boolean isRead) {
		this.isRead = isRead;
	}

	public String getItemCategory() {
		return itemCategory;
	}

	public void setItemCategory(String itemCategory) {
		this.itemCategory = itemCategory;
	}

	public String getMediaType() {
		return mediaType;
	}

	public void setMediaType(String mediaType) {
		this.mediaType = mediaType;
	}

	public String getMediaUrl() {
		return mediaUrl;
	}

	public void setMediaUrl(String mediaUrl) {
		this.mediaUrl = mediaUrl;
	}

	public Integer getMetadataNamespace() {
		return metadataNamespace;
	}

	public void setMetadataNamespace(Integer metadataNamespace) {
		this.metadataNamespace = metadataNamespace;
	}

	public Integer getNumComments() {
		return numComments;
	}

	public void setNumComments(Integer numComments) {
		this.numComments = numComments;
	}

	public Integer getNumPlusones() {
		return numPlusones;
	}

	public void setNumPlusones(Integer numPlusones) {
		this.numPlusones = numPlusones;
	}

	public Integer getNumShares() {
		return numShares;
	}

	public void setNumShares(Integer numShares) {
		this.numShares = numShares;
	}

	public Integer getOriginalPosition() {
		return originalPosition;
	}

	public void setOriginalPosition(Integer originalPosition) {
		this.originalPosition = originalPosition;
	}

	public Integer getPopularUpdatePosition() {
		return popularUpdatePosition;
	}

	public void setPopularUpdatePosition(Integer popularUpdatePosition) {
		this.popularUpdatePosition = popularUpdatePosition;
	}

	public String getSourceStreamId() {
		return sourceStreamId;
	}

	public void setSourceStreamId(String sourceStreamId) {
		this.sourceStreamId = sourceStreamId;
	}

	public String getVerbType() {
		return verbType;
	}

	public void setVerbType(String verbType) {
		this.verbType = verbType;
	}
}
