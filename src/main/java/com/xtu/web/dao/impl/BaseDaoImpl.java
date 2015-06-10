package com.xtu.web.dao.impl;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.xtu.web.dao.BaseDao;
import com.xtu.web.utils.DateUtils;
import com.xtu.web.utils.Status;
@Repository("baseDao")
public class BaseDaoImpl<T> implements BaseDao<T> {
	private static Logger log = Logger.getLogger(BaseDaoImpl.class);
	@Resource()
	private SessionFactory sf;
	
 	 
	public int delete(T t) {
		// TODO Auto-generated method stub
		int result = Status.ERROR;
		try{
			sf.getCurrentSession().delete(t);
			result = Status.SUCCESS;
		}catch(Exception e){
			log.error(DateUtils.getCurrentTime() + 
					" delete entity "+t+" failed,error message:"+e.getMessage());
		}
		return result;
	}

 	public int add(T t) {
 		
		int result = Status.ERROR;
		try{
			sf.getCurrentSession().save(t);	
			result = Status.SUCCESS;
 		}catch(Exception e){
			log.error(DateUtils.getCurrentTime() + 
					" save entity "+t+" failed,error message:"+e.getMessage());
		}
		return result;
	}

 	public int update(T t) {
		int result = Status.ERROR;
		try{
			sf.getCurrentSession().update(t);
			result = Status.SUCCESS;
		}catch(Exception e){
			log.error(DateUtils.getCurrentTime() +
					" update entity "+t+" failed,error message:"+e.getMessage());
		}
		return result;
	}

	 
 	public List<T> getAll(T t) {
 		List<T> list = null;
 		try{
			sf.getCurrentSession().createQuery("select * from "+t.getClass()).list();
 		}catch(Exception e){
			log.error(DateUtils.getCurrentTime() +
					" get all entity  failed,error message:"+e.getMessage());
		}
		return list;
	}

 	public T get(Class clazz,Serializable id) {
		T t = null;
		try{
			t = (T) sf.getCurrentSession().get(clazz, id);
		}catch(Exception e){
			log.error(DateUtils.getCurrentTime() + 
					" get entity by id="+ id +"  failed,error message:"+e.getMessage());
		}
		return t;
	}

 	public T load(Class clazz,Serializable id) {
		T t = null;
		try{
			t = (T) sf.getCurrentSession().load(clazz, id);
		}catch(Exception e){
			log.error(DateUtils.getCurrentTime() + 
					" load entity by id="+id+" failed,error message:"+e.getMessage());
		}
		return t;
	}

}
