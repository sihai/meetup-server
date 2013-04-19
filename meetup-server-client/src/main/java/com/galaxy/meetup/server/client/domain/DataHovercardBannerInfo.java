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
public class DataHovercardBannerInfo extends GenericJson {

	public String fullBleedPhotoUrl;
	
    public DataHovercardBannerInfoImage origFullBleedImage;
    
    public DataScrapbookInfo scrapbookInfo;
    
    public List scrapbookPhotoUrl;

	public String getFullBleedPhotoUrl() {
		return fullBleedPhotoUrl;
	}

	public void setFullBleedPhotoUrl(String fullBleedPhotoUrl) {
		this.fullBleedPhotoUrl = fullBleedPhotoUrl;
	}

	public DataHovercardBannerInfoImage getOrigFullBleedImage() {
		return origFullBleedImage;
	}

	public void setOrigFullBleedImage(
			DataHovercardBannerInfoImage origFullBleedImage) {
		this.origFullBleedImage = origFullBleedImage;
	}

	public DataScrapbookInfo getScrapbookInfo() {
		return scrapbookInfo;
	}

	public void setScrapbookInfo(DataScrapbookInfo scrapbookInfo) {
		this.scrapbookInfo = scrapbookInfo;
	}

	public List getScrapbookPhotoUrl() {
		return scrapbookPhotoUrl;
	}

	public void setScrapbookPhotoUrl(List scrapbookPhotoUrl) {
		this.scrapbookPhotoUrl = scrapbookPhotoUrl;
	}
}
