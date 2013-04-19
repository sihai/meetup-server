/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.dao.mongodb;

import static org.junit.Assert.fail;

import javax.annotation.Resource;

import org.junit.Test;

import com.galaxy.meetup.server.client.domain.PlusEvent;
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
	public void testInsertPlusEvent() {
		PlusEvent event = new PlusEvent();
		event.setAuthKey("authKey");
		eventDAO.insert(event);
	}
	
	@Test
	public void testUpdatePlusEvent() {
		fail("Not yet implemented");
	}

}
