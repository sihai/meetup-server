/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain;

import javax.xml.transform.Source;

/**
 * 
 * @author sihai
 * 
 */
public class Frame extends GenericJson {

	public String domain;
	public EmbedClientItem embed;
	public FrameEmbedDuplicateFields embedDupes;
	public String iconUrl;
	public Boolean isPrivate;
	public Source source;
	public Long timestampMsec;
	public Verb verb;

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public EmbedClientItem getEmbed() {
		return embed;
	}

	public void setEmbed(EmbedClientItem embed) {
		this.embed = embed;
	}

	public FrameEmbedDuplicateFields getEmbedDupes() {
		return embedDupes;
	}

	public void setEmbedDupes(FrameEmbedDuplicateFields embedDupes) {
		this.embedDupes = embedDupes;
	}

	public String getIconUrl() {
		return iconUrl;
	}

	public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
	}

	public Boolean getIsPrivate() {
		return isPrivate;
	}

	public void setIsPrivate(Boolean isPrivate) {
		this.isPrivate = isPrivate;
	}

	public Source getSource() {
		return source;
	}

	public void setSource(Source source) {
		this.source = source;
	}

	public Long getTimestampMsec() {
		return timestampMsec;
	}

	public void setTimestampMsec(Long timestampMsec) {
		this.timestampMsec = timestampMsec;
	}

	public Verb getVerb() {
		return verb;
	}

	public void setVerb(Verb verb) {
		this.verb = verb;
	}
}
