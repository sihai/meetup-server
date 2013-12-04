package com.openteach.meetup.server.dao.mongodb;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.openteach.meetup.server.client.entity.Location;
import com.openteach.meetup.server.client.utils.JsonUtils;
import com.openteach.meetup.server.dao.LocationDAO;

/**
 * 
 * @author sihai
 *
 */
@Component
public class LocationDAOImpl extends BaseDAO implements LocationDAO {

	@Override
	public void insert(Location location) {
		location.setCreateTime(new Date());
		location.setLastModifiedTime(location.getCreateTime());
		super.insert(location);
	}

	@Override
	public List<Location> query(String userId, Date startTime, Date endTime) {
		return super.query4List(Arrays.asList(newEqualQueryParameter("userId", userId), this.newBigGreaterOrEqualQueryParamter("startTime", startTime), this.newBigLessOrEqualQueryParamter("startTime", endTime)), newSortBuilder().append("createTime", SortDirection.ASC).build(), 1, Integer.MAX_VALUE);
	}

	@Override
	protected String toJSON(Object bean) {
		return JsonUtils.toJsonString(bean);
	}

	@Override
	protected Object toBean(String json) {
		return JsonUtils.toBean(json, Location.class);
	}

	@Override
	protected String getCollectionName() {
		return "location_record";
	}
}
