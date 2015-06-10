package com.xtu.web.dao;

import java.io.Serializable;
import java.util.List;

public interface BaseDao<T> {
	/**
	 * 
	 * @param t 要删除的对象
	 * @return 是否删除成功， -1 删除失败， 1 删除成功
	 * 
	 */
	int delete(T t);
	/**
	 * 
	 * @param t 要保存的对象
	 * @return 是否保存成功 -1 保存失败，1 保存成功
	 */
	int add(T t);
	/**
	 * 
	 * @param t 要更新的对象
	 * @return 是否更新成功 -1 更新失败，1 更新成功
	 */
	int update(T t);
	/**
	 * 
	 * @param clazz 要查询对象的Class
	 * @param id 要查询对象的id号
	 * @return 查询到的对象
	 */
	T get(Class clazz,Serializable id);
	/**
	 * 
	 * @param clazz 要查询对象的Class
	 * @param id 要查询对象的id号
	 * @return 查询到的对象
	 */
	T load(Class clazz,Serializable id);
	/**
	 * 
	 * @param t 要查询的对象
	 * @return 返回 查询到的T 类型的所有数据
	 */
	List<T> getAll(T t);
}
