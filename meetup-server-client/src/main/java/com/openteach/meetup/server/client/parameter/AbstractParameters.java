package com.openteach.meetup.server.client.parameter;


/**
 * 
 * @author rqq
 *
 */
public abstract class AbstractParameters implements Parameters {

	@Override
	public void withParameter(String key, Object value) {
		throw new UnsupportedOperationException();
	}
}
