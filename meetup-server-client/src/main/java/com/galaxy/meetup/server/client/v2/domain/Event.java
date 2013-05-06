/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.client.v2.domain;

import java.util.List;


/**
 * 
 * @author sihai
 *
 */
public class Event extends BaseDO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8223704298376548538L;

	/**
	 * 
	 */
	private String authKey;
	
	/**
	 * Name of this event
	 */
	private String name;
	
	/**
	 * Description for this event
	 */
	private String description;
	
	/**
	 * Start time for this event
	 */
	private EventTime startTime;
	
	/**
	 * End time for this event
	 */
	private EventTime endTime;
	
	/**
	 * 
	 */
	private boolean isPublic;
	
	/**
	 * Location for this event
	 */
	private Location location;
	
	/**
	 * Status of this event
	 * @see com.galaxy.meetup.server.client.v2.enums.EventStatus
	 */
	private Integer status;
	
	/**
	 * Publisher of this event
	 */
	private String publisher;
	
	/**
	 * 
	 */
	private ThemeSpecification themeSpecification;
	
	/**
	 * 
	 */
	private Theme theme;
	
	/**
	 * 
	 */
	private HangoutInfo hangoutInfo;
	
	/**
	 * 
	 */
	private EventOptions options;
	
	/**
	 * All joiners
	 */
	private List<EventMember> memberList;
	
	public String getAuthKey() {
		return authKey;
	}

	public void setAuthKey(String authKey) {
		this.authKey = authKey;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public EventTime getStartTime() {
		return startTime;
	}

	public void setStartTime(EventTime startTime) {
		this.startTime = startTime;
	}

	public EventTime getEndTime() {
		return endTime;
	}

	public void setEndTime(EventTime endTime) {
		this.endTime = endTime;
	}

	public boolean isPublic() {
		return isPublic;
	}

	public void setPublic(boolean isPublic) {
		this.isPublic = isPublic;
	}
	
	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	public ThemeSpecification getThemeSpecification() {
		return themeSpecification;
	}

	public void setThemeSpecification(ThemeSpecification themeSpecification) {
		this.themeSpecification = themeSpecification;
	}
	
	public Theme getTheme() {
		return theme;
	}

	public void setTheme(Theme theme) {
		this.theme = theme;
	}
	
	public HangoutInfo getHangoutInfo() {
		return hangoutInfo;
	}

	public void setHangoutInfo(HangoutInfo hangoutInfo) {
		this.hangoutInfo = hangoutInfo;
	}
	
	public EventOptions getOptions() {
		return options;
	}

	public void setOptions(EventOptions options) {
		this.options = options;
	}
	
	public List<EventMember> getMemberList() {
		return memberList;
	}

	public void setMemberList(List<EventMember> memberList) {
		this.memberList = memberList;
	}
}
