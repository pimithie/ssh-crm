package com.xiaqi.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

/**
 * dao的基本操作接口
 * @param <T> 当前dao对象对应的实体类型
 */
public interface BaseDao<T> {
	
	/**
	 * save an object
	 * @param t saved object
	 */
	public void save(T t);
	
	/**
	 * delete an object
	 * @param t deleted object
	 */
	public void delete (T t);
	
	/**
	 * delete an object by id
	 * @param id object's id
	 */
	public void deleteById(Serializable id);
	
	/**
	 * update an object 
	 * @param t updated object
	 */
	public void update(T t);
	
	/**
	 * find an object by its id
	 * @param id object id
	 * @return the target objects
	 */
	public T findById(Serializable id);
	
	/**
	 * according to the criteria,count the number of records
	 * @param detachedCriteria
	 * @return the count of records which are content to the criteria 
	 */
	public Long getTotalCount(DetachedCriteria detachedCriteria);
	
	/**
	 * list the records
	 * @return all records of current entity
	 */
	public List<T> list(DetachedCriteria detachedCriteria,int start,int pageSize);
}
