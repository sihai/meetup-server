/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain.response;

import java.util.List;

import com.galaxy.meetup.server.client.domain.GenericJson;
import com.galaxy.meetup.server.client.domain.TraceRecords;

/**
 * 
 * @author sihai
 * 
 */
public class LinkPreviewResponse extends GenericJson {

	public TraceRecords backendTrace;
	public List blackboxPreviewData;
	public List embedItem;
	public List image;
	public List mediaLayout;
	public List selectedImage;
	public Boolean succeeded;

	public TraceRecords getBackendTrace() {
		return backendTrace;
	}

	public void setBackendTrace(TraceRecords backendTrace) {
		this.backendTrace = backendTrace;
	}

	public List getBlackboxPreviewData() {
		return blackboxPreviewData;
	}

	public void setBlackboxPreviewData(List blackboxPreviewData) {
		this.blackboxPreviewData = blackboxPreviewData;
	}

	public List getEmbedItem() {
		return embedItem;
	}

	public void setEmbedItem(List embedItem) {
		this.embedItem = embedItem;
	}

	public List getImage() {
		return image;
	}

	public void setImage(List image) {
		this.image = image;
	}

	public List getMediaLayout() {
		return mediaLayout;
	}

	public void setMediaLayout(List mediaLayout) {
		this.mediaLayout = mediaLayout;
	}

	public List getSelectedImage() {
		return selectedImage;
	}

	public void setSelectedImage(List selectedImage) {
		this.selectedImage = selectedImage;
	}

	public Boolean getSucceeded() {
		return succeeded;
	}

	public void setSucceeded(Boolean succeeded) {
		this.succeeded = succeeded;
	}
}
