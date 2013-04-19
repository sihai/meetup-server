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
public class MusicRecording extends GenericJson {

	public EmbedClientItem about;
	public AudioObject audio;
	public String buyLinkImageUrl;
	public MusicGroup byArtist;
	public String description;
	public String imageUrl;
	public MusicAlbum inAlbum;
	public String name;
	public String url;

	public EmbedClientItem getAbout() {
		return about;
	}

	public void setAbout(EmbedClientItem about) {
		this.about = about;
	}

	public AudioObject getAudio() {
		return audio;
	}

	public void setAudio(AudioObject audio) {
		this.audio = audio;
	}

	public String getBuyLinkImageUrl() {
		return buyLinkImageUrl;
	}

	public void setBuyLinkImageUrl(String buyLinkImageUrl) {
		this.buyLinkImageUrl = buyLinkImageUrl;
	}

	public MusicGroup getByArtist() {
		return byArtist;
	}

	public void setByArtist(MusicGroup byArtist) {
		this.byArtist = byArtist;
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

	public MusicAlbum getInAlbum() {
		return inAlbum;
	}

	public void setInAlbum(MusicAlbum inAlbum) {
		this.inAlbum = inAlbum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
