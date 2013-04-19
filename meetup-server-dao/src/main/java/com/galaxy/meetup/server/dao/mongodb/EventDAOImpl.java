/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.dao.mongodb;

import org.springframework.stereotype.Service;

import com.galaxy.meetup.server.client.domain.PlusEvent;
import com.galaxy.meetup.server.dao.EventDAO;

/**
 * 
 * @author sihai
 *
 */
@Service
public class EventDAOImpl extends BaseDAO implements EventDAO {

	@Override
	public void insert(PlusEvent event) {
		String id = super.insert(event);
		event.setId(id);
	}

	@Override
	public void update(PlusEvent event) {
		super.update(event);
	}

	@Override
	protected String toJSON(Object bean) {
		return ((PlusEvent)bean).toJsonStringExcluseFieldsOfGenericJson();
	}

	@Override
	protected String getCollectionName() {
		return "event";
	}

}
