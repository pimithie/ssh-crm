package com.xiaqi.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.xiaqi.dao.BaseDao;

/**
 * dao基本操作的实现
 * @param <T> 当前dao对象对应的实体类型
 */
public class BaseDaoImpl<T> implements BaseDao<T> {
	
	private HibernateTemplate template;
	
	private Class clazz;
	
	public BaseDaoImpl() {
		ParameterizedType type = (ParameterizedType) this.getClass().getGenericSuperclass();
		clazz = (Class) type.getActualTypeArguments()[0];
	}
	
	@Override
	public void save(T t) {
		template.save(t);
	}

	@Override
	public void delete(T t) {
		template.delete(t);
	}

	@SuppressWarnings("unchecked")
	@Override
	public void deleteById(Serializable id) {
		template.delete(template.get(clazz, id));
	}

	@Override
	public void update(T t) {
		template.update(t);
	}

	@Override
	public T findById(Serializable id) {
		return (T) template.get(clazz, id);
	}

	@Override
	public Long getTotalCount(DetachedCriteria detachedCriteria) {
		detachedCriteria.setProjection(Projections.rowCount());
		return (Long) template.findByCriteria(detachedCriteria).get(0);
	}

	@Override
	public List<T> list(DetachedCriteria detachedCriteria,int start,int pageSize) {
		return (List<T>) template.findByCriteria(detachedCriteria,start,pageSize);
	}
	
	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}

	public HibernateTemplate getTemplate() {
		return template;
	}

}
