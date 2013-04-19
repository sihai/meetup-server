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
public class TvEpisode extends GenericJson {

	public EmbedClientItem about;
	public String description;
	public String imageUrl;
	public String name;
	public TvSeries partOfTvSeries;
	public String url;

	public EmbedClientItem getAbout() {
		return about;
	}

	public void setAbout(EmbedClientItem about) {
		this.about = about;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TvSeries getPartOfTvSeries() {
		return partOfTvSeries;
	}

	public void setPartOfTvSeries(TvSeries partOfTvSeries) {
		this.partOfTvSeries = partOfTvSeries;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
