package com.openteach.meetup.server.client.entity;

import java.util.List;
import java.util.Map;

/**
 * 
 * @author sihai
 *
 */
public class Event extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2136604405273394077L;
	
	public static final String RSVP_TYPE_CHECKIN = "checkin";
	public static final String RSVP_TYPE_ATTENDING = "attending";
	public static final String RSVP_TYPE_MAYBE = "maybe";
	public static final String RSVP_TYPE_NOT_ATTENDING = "not_attending";
	public static final String RSVP_TYPE_NOT_ATTENDING_AND_REMOVE = "not_attending_and_remove";
	public static final String RSVP_TYPE_NOT_RESPONDED = "not_responded";
	
	

	/**
	 * 
	 */
	private String authKey;
	
	/**
	 * 
	 */
	private String name;
	
	/**
	 * 
	 */
	private EventTime startTime;
	
	/**
	 * 
	 */
	private EventTime endTime;
	
	/**
	 * 
	 */
	private Location location;
	
	/**
	 * 
	 */
	private String description;
	
	/**
	 * 
	 */
	private int status;
	
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
	private String publisher;
	
	/**
	 * 
	 */
	private List<EventMember> memberList;
	
	/**
	 * 
	 */
	private Invitee viewerInfo;
	
	/**
	 * 
	 */
	private List<InviteeSummary> inviteeSummaryList;
	
	/**
	 * 
	 */
	private EventOptions options;
	
	//
	private HangoutInfo hangoutInfo;
	
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

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
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

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public List<EventMember> getMemberList() {
		return memberList;
	}

	public void setMemberList(List<EventMember> memberList) {
		this.memberList = memberList;
	}
	
	public Invitee getViewerInfo() {
		return viewerInfo;
	}

	public void setViewerInfo(Invitee viewerInfo) {
		this.viewerInfo = viewerInfo;
	}
	
	public List<InviteeSummary> getInviteeSummaryList() {
		return inviteeSummaryList;
	}

	public void setInviteeSummaryList(List<InviteeSummary> inviteeSummaryList) {
		this.inviteeSummaryList = inviteeSummaryList;
	}
	
	public EventOptions getOptions() {
		return options;
	}

	public void setOptions(EventOptions options) {
		this.options = options;
	}
	
	public HangoutInfo getHangoutInfo() {
		return hangoutInfo;
	}

	public void setHangoutInfo(HangoutInfo hangoutInfo) {
		this.hangoutInfo = hangoutInfo;
	}

	@Override
	public Map<String, Object> toMap() {
		Map<String, Object> map = super.toMap();
		if(null != name) {
			map.put("name", name);
		}
		if(null != startTime) {
			map.put("startTime", startTime);
		}
		if(null != endTime) {
			map.put("endTime", endTime);
		}
		if(null != location) {
			map.put("location", location);
		}
		if(null != description) {
			map.put("description", description);
		}
		if(null != theme) {
			map.put("theme", theme.getId());
		}
		if(null != theme) {
			map.put("theme", themeSpecification.getId());
		}
		if(null != options) {
			map.put("options", options);
		}
		return map;
	}

}
