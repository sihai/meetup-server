/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain.request;

import java.util.List;

import com.galaxy.meetup.server.client.domain.ApiaryFields;
import com.galaxy.meetup.server.client.domain.EditSegments;
import com.galaxy.meetup.server.client.domain.GenericJson;

/**
 * 
 * @author sihai
 *
 */
public class EditActivityRequest extends GenericJson {

	public String annotation;
	
    public ApiaryFields commonFields;
    
    public String contentFormat;
    
    public Boolean deleteLocation;
    
    public EditSegments editSegments;
    
    public List embed;
    
    public Boolean enableTracing;
    
    public String externalId;
    
    public Boolean isReshare;
    
    public String mediaJson;
    
    public Boolean preserveExistingAttachment;
    
    public String renderContextLocation;
    
    public String updateText;

	public String getAnnotation() {
		return annotation;
	}

	public void setAnnotation(String annotation) {
		this.annotation = annotation;
	}

	public ApiaryFields getCommonFields() {
		return commonFields;
	}

	public void setCommonFields(ApiaryFields commonFields) {
		this.commonFields = commonFields;
	}

	public String getContentFormat() {
		return contentFormat;
	}

	public void setContentFormat(String contentFormat) {
		this.contentFormat = contentFormat;
	}

	public Boolean getDeleteLocation() {
		return deleteLocation;
	}

	public void setDeleteLocation(Boolean deleteLocation) {
		this.deleteLocation = deleteLocation;
	}

	public EditSegments getEditSegments() {
		return editSegments;
	}

	public void setEditSegments(EditSegments editSegments) {
		this.editSegments = editSegments;
	}

	public List getEmbed() {
		return embed;
	}

	public void setEmbed(List embed) {
		this.embed = embed;
	}

	public Boolean getEnableTracing() {
		return enableTracing;
	}

	public void setEnableTracing(Boolean enableTracing) {
		this.enableTracing = enableTracing;
	}

	public String getExternalId() {
		return externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public Boolean getIsReshare() {
		return isReshare;
	}

	public void setIsReshare(Boolean isReshare) {
		this.isReshare = isReshare;
	}

	public String getMediaJson() {
		return mediaJson;
	}

	public void setMediaJson(String mediaJson) {
		this.mediaJson = mediaJson;
	}

	public Boolean getPreserveExistingAttachment() {
		return preserveExistingAttachment;
	}

	public void setPreserveExistingAttachment(Boolean preserveExistingAttachment) {
		this.preserveExistingAttachment = preserveExistingAttachment;
	}

	public String getRenderContextLocation() {
		return renderContextLocation;
	}

	public void setRenderContextLocation(String renderContextLocation) {
		this.renderContextLocation = renderContextLocation;
	}

	public String getUpdateText() {
		return updateText;
	}

	public void setUpdateText(String updateText) {
		this.updateText = updateText;
	}
}
