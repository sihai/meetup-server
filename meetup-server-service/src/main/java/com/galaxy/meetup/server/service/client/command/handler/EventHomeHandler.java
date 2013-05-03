/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.service.client.command.handler;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.galaxy.meetup.server.client.domain.EmbedsPerson;
import com.galaxy.meetup.server.client.domain.EventTime;
import com.galaxy.meetup.server.client.domain.Formatting;
import com.galaxy.meetup.server.client.domain.Hashtag;
import com.galaxy.meetup.server.client.domain.Link;
import com.galaxy.meetup.server.client.domain.PicasaAlbum;
import com.galaxy.meetup.server.client.domain.Place;
import com.galaxy.meetup.server.client.domain.PlusEvent;
import com.galaxy.meetup.server.client.domain.PlusEventAudience;
import com.galaxy.meetup.server.client.domain.PlusEventDisplayContent;
import com.galaxy.meetup.server.client.domain.Segment;
import com.galaxy.meetup.server.client.domain.UserRef;
import com.galaxy.meetup.server.client.domain.ViewSegments;
import com.galaxy.meetup.server.client.domain.response.EventsHomeResponse;
import com.galaxy.meetup.server.client.v2.response.EventHomeResponse;
import com.galaxy.meetup.server.core.command.framework.AbstractHandler;
import com.galaxy.meetup.server.core.command.framework.Command;
import com.galaxy.meetup.server.core.command.framework.ExecutionController;
import com.galaxy.meetup.server.core.command.framework.Handle;
import com.galaxy.meetup.server.core.command.framework.Result;
import com.galaxy.meetup.server.service.EventService;

/**
 * 
 * @author sihai
 *
 */
@Component
@Handle(value = "eventhome", index = 0)
public class EventHomeHandler extends AbstractHandler {

	static String URL_PREFIX = "http://192.168.10.101";
	
	@Resource
	private EventService eventService;
	
	@Override
	public void handle(Command command, Result result, ExecutionController controller) {
		EventHomeResponse response = new EventHomeResponse();
		response.setRunningEventList(eventService.getRunningEventOfJoiner(command.getUser().getName()));
		response.setUpcomingEventList(eventService.getUpcomingEventOfJoiner(command.getUser().getName()));
		response.setSucceed(true);
		result.setResponse(response);
	}

	/**
	 * 
	 * @return
	 */
	private EventsHomeResponse mock() {
		EventsHomeResponse response = new EventsHomeResponse();
		response.setDeclinedUpcoming(_mock_plus_event_list(0, 4));
		response.setPast(_mock_plus_event_list(1, 8));
		response.setResolvedPerson(_mock_person_list(8));
		response.setUpcoming(_mock_plus_event_list(3, 8));
		response.setPastResumeToken("pastResumeToken");
		return response;
	}
	
	/**
	 * 
	 * @param type
	 * @param size
	 * @return
	 */
	private List<PlusEvent> _mock_plus_event_list(int type, int size) {
		List<PlusEvent> eventList = new ArrayList<PlusEvent>(size);
		for(int i = 0; i < size; i++) {
			eventList.add(_mock_plus_event(String.format("Mocked event: %d", i), type));
		}
		return eventList;
	}
	
	private List<EmbedsPerson> _mock_person_list(int size) {
		List<EmbedsPerson> pList = new ArrayList<EmbedsPerson>(size);
		for(int i = 0; i < size; i++) {
			EmbedsPerson person = new EmbedsPerson();
			person.setEmail("iac-rqq@iac-rqq.com");
			person.setImageUrl(URL_PREFIX + "test.jpg");
			person.setName("sihai" + i);
			person.setUrl(URL_PREFIX + "/user/sihai.html");
			person.setOwnerObfuscatedId("sihai" + i);
			pList.add(person);
		}
		return pList;
	}
	
	/**
	 * @param name
	 * @param type
	 * @return
	 */
	private PlusEvent _mock_plus_event(String name, int type) {
		PlusEvent event = new PlusEvent();
		event.setAuthKey("authKey");
		EmbedsPerson person = new EmbedsPerson();
		person.setEmail("iac-rqq@iac-rqq.com");
		person.setImageUrl(URL_PREFIX + "test.jpg");
		person.setName("sihai");
		person.setUrl(URL_PREFIX + "/user/sihai.html");
		person.setOwnerObfuscatedId("sihai");
		event.setCreator(person);
		event.setCreatorObfuscatedId("sihai");
		event.setDescription("Mocked event...");
		PlusEventDisplayContent displayContent = new PlusEventDisplayContent();
		PlusEventAudience audience = new PlusEventAudience();
		audience.setIsDomainRestricted(true);
		audience.setIsExtendedCircles(true);
		audience.setIsPublic(true);
		displayContent.setAudience(audience);
		displayContent.setDescriptionHtml("<h1>Mocked event...<h1>");
		ViewSegments descriptionSegments = new ViewSegments();
		List<Segment> segments = new ArrayList<Segment>(4);
		for(int i = 0; i < 4; i++) {
			Segment segment = new Segment();
			Formatting formatting = new Formatting();
			formatting.setBold(true);
			formatting.setItalics(true);
			formatting.setStrikethrough(true);
			segment.setFormatting(formatting);
			Hashtag hashtag = new Hashtag();
			hashtag.setSearchText("Mocked");
			segment.setHashtag(hashtag);
			Link link = new Link();
			link.setClickUrl(URL_PREFIX + "/event/event.jhtml");
			PicasaAlbum picasaAlbum = new PicasaAlbum();
			picasaAlbum.setAlbumId("albumId");
			picasaAlbum.setOwnerId("sihai");
			link.setPicasaAlbum(picasaAlbum);
			link.setType("type");
			link.setUrl(URL_PREFIX + "/event/event_click.jhtml");
			segment.setLink(link);
			segment.setText("Mocked event...");
			segment.setType("type");
			UserRef user = new UserRef();
			user.setEmail("iac-rqq@iac-rqq.com");
			user.setName("sihai");
			user.setUserId("sihai");
			segment.setUser(user);
			segments.add(segment);
		}
		descriptionSegments.setSegments(segments);
		displayContent.setDescriptionSegments(descriptionSegments);
		displayContent.setEventTimeRange("eventTimeRange");
		displayContent.setEventTimeRangeShort("eventTimeRangeShort");
		displayContent.setEventTimeStart("eventTimeStart");
		displayContent.setIsEventOver(type == 1);
		displayContent.setVideoEmbedUrl(URL_PREFIX + "/video.jhtml");
		event.setDisplayContent(displayContent);
		event.setId("event_id" + UUID.randomUUID().toString());
		event.setName(name);
		event.setIsPublic(true);
		Place location = new Place();
		event.setLocation(location);
		event.setEndDate("endDate");
		EventTime endTime = new EventTime();
		endTime.setTimeMs(System.currentTimeMillis() + 1000 * 60 * 60);
		endTime.setTimezone(java.util.Calendar.getInstance().getTimeZone().getID());
		event.setEndTime(endTime);
		event.setStartDate("");
		EventTime startTime = new EventTime();
		startTime.setTimeMs(System.currentTimeMillis());
		startTime.setTimezone(java.util.Calendar.getInstance().getTimeZone().getID());
		event.setStartTime(startTime);
		return event;
	}
}
