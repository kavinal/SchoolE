package com.xtu.web.services.impl;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xtu.web.dao.PlaceDao;
import com.xtu.web.pojo.Place;
import com.xtu.web.services.PlaceManageService;
@Service("placeManageService")
public class PlaceManageServiceImpl implements PlaceManageService {

	@Resource(name="placeDao")
	PlaceDao  placeDao;
	@Override
	public int add(Place t) {
		// TODO Auto-generated method stub
		return placeDao.add(t);
	}

	@Override
	public int delete(Place t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Place t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Place get(Class clazz, Serializable id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Place load(Class clazz, Serializable id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Place> getAll(Place t) {
		// TODO Auto-generated method stub
		return null;
	}

}
