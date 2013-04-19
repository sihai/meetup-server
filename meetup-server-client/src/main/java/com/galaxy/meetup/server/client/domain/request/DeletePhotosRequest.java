/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain.request;

import java.util.List;

import com.galaxy.meetup.server.client.domain.ApiaryFields;
import com.galaxy.meetup.server.client.domain.GenericJson;

/**
 * 
 * @author sihai
 *
 */
public class DeletePhotosRequest extends GenericJson {

	public ApiaryFields commonFields;
	
    public Boolean enableTracing;
    
    public List photoId;

	public ApiaryFields getCommonFields() {
		return commonFields;
	}

	public void setCommonFields(ApiaryFields commonFields) {
		this.commonFields = commonFields;
	}

	public Boolean getEnableTracing() {
		return enableTracing;
	}

	public void setEnableTracing(Boolean enableTracing) {
		this.enableTracing = enableTracing;
	}

	public List getPhotoId() {
		return photoId;
	}

	public void setPhotoId(List photoId) {
		this.photoId = photoId;
	}
}
