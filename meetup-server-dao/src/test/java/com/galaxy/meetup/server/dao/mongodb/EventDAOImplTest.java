/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.dao.mongodb;

import static org.junit.Assert.fail;

import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import javax.annotation.Resource;

import org.apache.commons.lang.time.DateUtils;
import org.junit.Test;

import com.galaxy.meetup.server.client.v2.domain.Event;
import com.galaxy.meetup.server.client.v2.domain.EventTime;
import com.galaxy.meetup.server.client.v2.domain.Location;
import com.galaxy.meetup.server.client.v2.enums.EventStatus;
import com.galaxy.meetup.server.dao.BaseTestCase;
import com.galaxy.meetup.server.dao.EventDAO;

/**
 * 
 * @author sihai
 *
 */
public class EventDAOImplTest extends BaseTestCase {

	@Resource
	private EventDAO eventDAO;
	
	@Test
	public void testInsert() throws Exception {
		Event event = new Event();
		event.setName("来一起喝个酒");
		event.setPublisher("sihai");
		event.setDescription("小聚一下");
		EventTime startTime = new EventTime();
		Date date = DateUtils.parseDate("2013-05-02 18:30:00", new String[]{"yyyy-MM-dd HH:mm:ss"});
		startTime.setTimeMs(date.getTime());
		startTime.setTimezone(TimeZone.getDefault().getID());
		event.setStartTime(startTime);
		EventTime endTime = new EventTime();
		date = DateUtils.parseDate("2013-05-02 23:30:00", new String[]{"yyyy-MM-dd HH:mm:ss"});
		endTime.setTimeMs(date.getTime());
		endTime.setTimezone(TimeZone.getDefault().getID());
		event.setEndTime(endTime);
		event.setStatus(EventStatus.WAITING.getValue());
		Location location = new Location();
		location.setZip("434000");
		location.setStreet("岳桥村3组9号，关沮乡");
		location.setDistrict("沙市区");
		location.setCity("荆州市");
		location.setProvince("湖北省");
		location.setCountry("中国");
		location.setLatitude(32.00D);
		location.setLongitude(123.00D);
		event.setLocation(location);
		eventDAO.insert(event);
	}
	
	@Test
	public void testUpdate() {
		fail("Not yet implemented");
	}

}
