package com.xtu.web.dao.impl;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.xtu.web.dao.BaseDao;
import com.xtu.web.dao.PlaceDao;
import com.xtu.web.pojo.Place;
@Repository("placeDao")
public class PlaceDaoImpl implements PlaceDao {

	@Resource(name="baseDao")
	BaseDao<Place> baseDao;
	@Override
	public int delete(Place t) {
		// TODO Auto-generated method stub
		return baseDao.delete(t);
	}

	@Override
	public int add(Place t) {
		// TODO Auto-generated method stub
		return baseDao.add(t);
	}

	@Override
	public int update(Place t) {
		// TODO Auto-generated method stub
		return baseDao.update(t);
	}

	@Override
	public Place get(Class clazz, Serializable id) {
		// TODO Auto-generated method stub
		return baseDao.get(clazz, id);
	}

	@Override
	public Place load(Class clazz, Serializable id) {
		// TODO Auto-generated method stub
		return baseDao.load(clazz, id);
	}

	@Override
	public List<Place> getAll(Place t) {
		// TODO Auto-generated method stub
		return baseDao.getAll(t);
	}

}
