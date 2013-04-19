/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.dao;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * 
 * @author sihai
 *
 */
@ContextConfiguration(locations = {"classpath:/spring/spring-meetup-server-dao.xml" })
public class BaseTestCase extends AbstractJUnit4SpringContextTests {

}
