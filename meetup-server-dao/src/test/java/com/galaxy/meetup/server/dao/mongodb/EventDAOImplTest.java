/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.dao.mongodb;

import static org.junit.Assert.fail;

import javax.annotation.Resource;

import org.apache.commons.lang.time.DateUtils;
import org.junit.Test;

import com.galaxy.meetup.server.client.v2.domain.Event;
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
		event.setStartTime(DateUtils.parseDate("2013-05-02 18:30:00", new String[]{"yyyy-MM-dd HH:mm:ss"}));
		event.setStartTime(DateUtils.parseDate("2013-05-02 23:30:00", new String[]{"yyyy-MM-dd HH:mm:ss"}));
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
