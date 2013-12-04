package com.openteach.meetup.server.dao.mongodb;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.openteach.meetup.server.client.entity.Photo;
import com.openteach.meetup.server.client.utils.JsonUtils;
import com.openteach.meetup.server.dao.PhotoDAO;

/**
 * 
 * @author rqq
 *
 */
@Component
public class PhotoDAOImpl extends BaseDAO implements PhotoDAO {

	@Override
	public void insert(Photo photo) {
		super.insert(photo);
	}

	@Override
	public List<Photo> query(String album, int currentPage, int pageSize) {
		return super.query4List(Arrays.asList(newEqualQueryParameter("albumId", album)), emptySort(), currentPage, pageSize);
	}

	@Override
	public long count(String album) {
		return super.count(Arrays.asList(newEqualQueryParameter("albumId", album)));
	}

	@Override
	public List<Photo> queryNearby(double longitude, double latitude, double maxDistance, int currentPage, int pageSize) {
		return super.query4List(Arrays.asList(newNearQueryParamter("contentLocation", longitude, latitude, maxDistance)), emptySort(), currentPage, pageSize);
	}

	@Override
	public void update(Photo photo) {
		super.update(photo);
	}

	@Override
	public void delete(String id) {
		super.delete(Arrays.asList(newEqualQueryParameter("_id", id)));
	}

	@Override
	protected String toJSON(Object bean) {
		return JsonUtils.toJsonString(bean);
	}

	@Override
	protected Object toBean(String json) {
		return JsonUtils.toBean(json, Photo.class);
	}

	@Override
	protected String getCollectionName() {
		return "photo";
	}
}
