package com.shx.adhoc.dao.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shx.adhoc.dao.BaseDao;

@Repository("baseDao")
@SuppressWarnings("unchecked")
public class BaseDaoImpl<T> implements BaseDao<T> {

	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return this.sessionFactory;
	} 
	
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory){
		this.sessionFactory = sessionFactory;
	}
	
	protected Session getCurrentSession() {
		return this.sessionFactory.getCurrentSession();
	}
	
	public Serializable save(T o) {
		// TODO Auto-generated method stub
		return this.getCurrentSession().save(o);
	}

	public void delete(Serializable serializableId) {
		// TODO Auto-generated method stub
		T object = this.get(serializableId);
		this.getCurrentSession().delete(object);
	}

	public void delete(T o) {
		// TODO Auto-generated method stub
		this.getCurrentSession().delete(o);
	}

	public void update(T o) {
		// TODO Auto-generated method stub
		this.getCurrentSession().update(o);
	}

	public void saveOrUpdate(T o) {
		// TODO Auto-generated method stub
		this.getCurrentSession().saveOrUpdate(o);
	}

	public T get(Serializable serializableId) {
		// TODO Auto-generated method stub
		return this.get(serializableId);
	}

	public T findOne(T o) {
		// TODO Auto-generated method stub
		return null;
	}

	public T findOne(String hql) {
		// TODO Auto-generated method stub
		return (T) this.getCurrentSession().createQuery(hql);
	}

	public List<T> findAll(T o) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public List<T> findAll(String hql) {
    	Query query = this.getCurrentSession().createQuery(hql);
    	return query.list();
    }
    
	public List<T> findAll(String hql, Map<String, Object> params) {
		// TODO Auto-generated method stub
		Query query = this.getCurrentSession().createQuery(hql);
		if (params != null && !params.isEmpty()) {
			for (String key : params.keySet()) {
				query.setParameter(key, params.get(key));
			}
		}
		return query.list();
	}

	public List<T> findAll(String hql, int page, int rows) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<T> findAll(String hql, Map<String, Object> params, int rows) {
		// TODO Auto-generated method stub
		return null;
	}

}
