/**
 * galaxy inc.
 * meetup server
 */
package com.openteach.meetup.server.dao.mongodb;

import static org.junit.Assert.fail;

import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang.time.DateUtils;
import org.junit.Test;

import com.openteach.meetup.server.client.entity.User;
import com.openteach.meetup.server.client.entity.Location;
import com.openteach.meetup.server.client.enums.Gender;
import com.openteach.meetup.server.dao.UserDAO;
import com.openteach.meetup.server.dao.BaseTestCase;

/**
 * 
 * @author sihai
 *
 */
public class AccountDAOImplTest extends BaseTestCase {

	@Resource
	private UserDAO accountDAO;
	
	@Test
	public void testInsertAccount() throws Exception {
		User account = new User();
		account.setName("sihai");
		account.setEmail("sihai@meetup.com");
		account.setMobile("18758286892");
		account.setBirthday(DateUtils.parseDate("1987-03-20", new String[]{"yyyy-MM-dd"}));
		account.setGender(Gender.MALE.getValue());
		account.setLogoURL("http://img.meetup.com/sihai.png");
		account.setPassword("123456");
		Location location = new Location();
		location.setZip("434000");
		location.setStreet("文一西路");
		location.setDistrict("西湖区");
		location.setCity("杭州市");
		location.setProvince("浙江省");
		location.setCountry("中国");
		location.setLatitude(32.00D);
		location.setLongitude(123.00D);
		account.setCurrentLocation(location);
		accountDAO.insert(account);
	}

	@Test
	public void testQuery_userEmail() {
		User account = accountDAO.queryByEmail("sihai@meetup.com");
		System.out.println(account);
	}
	
	@Test
	public void testQuery_userMobile() {
		User account = accountDAO.queryByMobile("18758286892");
		System.out.println(account);
	}
	
	@Test
	public void testQuery_nearby() {
		List<User> accountList = accountDAO.queryNearby(32.00D, 123.00D, 500.0D, 1, 100);
		System.out.println(accountList);
	}
	
	@Test
	public void testUpdateAccount() {
		fail("Not yet implemented");
	}

}
