package com.openteach.meetup.server.dao.mongodb;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.openteach.meetup.server.client.entity.Album;
import com.openteach.meetup.server.client.utils.JsonUtils;
import com.openteach.meetup.server.dao.AlbumDAO;

/**
 * 
 * @author rqq
 *
 */
@Component
public class AlbumDAOImpl extends BaseDAO implements AlbumDAO {

	@Override
	public void insert(Album album) {
		super.insert(album);
	}

	@Override
	public List<Album> query(String owner, int currentPage, int pageSize) {
		return super.query4List(Arrays.asList(newEqualQueryParameter("ownerUserId", owner)), emptySort(), currentPage, pageSize);
	}

	@Override
	public long count(String owner) {
		return super.count(Arrays.asList(newEqualQueryParameter("ownerUserId", owner)));
	}

	@Override
	public List<Album> queryNearby(double longitude, double latitude, double maxDistance, int currentPage, int pageSize) {
		return super.query4List(Arrays.asList(newNearQueryParamter("contentLocation", longitude, latitude, maxDistance)), emptySort(), currentPage, pageSize);
	}

	@Override
	public void update(Album album) {
		super.update(album);
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
		return JsonUtils.toBean(json, Album.class);
	}

	@Override
	protected String getCollectionName() {
		return "album";
	}
}
