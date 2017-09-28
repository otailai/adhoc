package com.shx.adhoc.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public interface BaseDao<T> {

	public Serializable save(T o);
	
	public void delete(Serializable serializableId);
	
	public void delete(T o);
	
	public void update(T o);
	
	public void saveOrUpdate(T o);
	
	public T get(Serializable serializableId);
	
	public T findOne(T o);
	
	public T findOne(String hql);
	
	public List<T> findAll(T o);
	
	public List<T> findAll(String hql);
	
	public List<T> findAll(String hql, Map<String, Object> params);
	
	public List<T> findAll(String hql, int page, int rows);
	
	public List<T> findAll(String hql, Map<String, Object> params, int rows);
}
