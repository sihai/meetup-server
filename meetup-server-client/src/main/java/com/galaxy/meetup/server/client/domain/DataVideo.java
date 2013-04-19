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
public class DataVideo extends GenericJson  {

	public String downloadUrl;
	
    public Long durationMillis;
    
    public String id;
    
    public String status;
    
    public List stream;
    
    public DataTimedTextMetaData timedText;

	public String getDownloadUrl() {
		return downloadUrl;
	}

	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}

	public Long getDurationMillis() {
		return durationMillis;
	}

	public void setDurationMillis(Long durationMillis) {
		this.durationMillis = durationMillis;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List getStream() {
		return stream;
	}

	public void setStream(List stream) {
		this.stream = stream;
	}

	public DataTimedTextMetaData getTimedText() {
		return timedText;
	}

	public void setTimedText(DataTimedTextMetaData timedText) {
		this.timedText = timedText;
	}
}
