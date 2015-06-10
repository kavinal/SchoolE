package com.xtu.web.services.impl;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xtu.web.dao.BaseDao;
import com.xtu.web.services.BaseService;
@Service("baseService")
public class BaseServiceImpl<T> implements BaseService<T> {
	@Resource(name="baseDao")
	BaseDao<T> baseDao;
	@Override
	public int add(T t) {
  		return baseDao.add(t);
	}

	@Override
	public int delete(T t) {
		 
		return baseDao.delete(t);
	}

	@Override
	public int update(T t) {
		 
		return baseDao.update(t);
	}

	@Override
	public T get(Class clazz, Serializable id) {
		 
		return baseDao.get(clazz, id);
	}

	@Override
	public T load(Class clazz, Serializable id) {
		 
		return baseDao.load(clazz, id);
	}

	@Override
	public List<T> getAll(T t) {
		 
		return baseDao.getAll(t);
	}

}
