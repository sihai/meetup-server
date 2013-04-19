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
public class CommonContent extends GenericJson {

	public Contacts contacts;
	
    public StringField introduction;
    
    public Links links;
    
    public NickName nickname;
    
    public String photoUrl;
    
    public ScrapBook scrapbook;
    
    public ScrapbookInfo scrapbookInfo;
    
    public StringField tagLine;

	public Contacts getContacts() {
		return contacts;
	}

	public void setContacts(Contacts contacts) {
		this.contacts = contacts;
	}

	public StringField getIntroduction() {
		return introduction;
	}

	public void setIntroduction(StringField introduction) {
		this.introduction = introduction;
	}

	public Links getLinks() {
		return links;
	}

	public void setLinks(Links links) {
		this.links = links;
	}

	public NickName getNickname() {
		return nickname;
	}

	public void setNickname(NickName nickname) {
		this.nickname = nickname;
	}

	public String getPhotoUrl() {
		return photoUrl;
	}

	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}

	public ScrapBook getScrapbook() {
		return scrapbook;
	}

	public void setScrapbook(ScrapBook scrapbook) {
		this.scrapbook = scrapbook;
	}

	public ScrapbookInfo getScrapbookInfo() {
		return scrapbookInfo;
	}

	public void setScrapbookInfo(ScrapbookInfo scrapbookInfo) {
		this.scrapbookInfo = scrapbookInfo;
	}

	public StringField getTagLine() {
		return tagLine;
	}

	public void setTagLine(StringField tagLine) {
		this.tagLine = tagLine;
	}
}
