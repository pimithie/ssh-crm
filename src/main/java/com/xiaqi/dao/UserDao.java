package com.xiaqi.dao;

import org.hibernate.criterion.DetachedCriteria;

import com.xiaqi.entity.User;

public interface UserDao extends BaseDao<User>{
	
	/**
	 * 根据用户名和密码查询用户
	 * @param criteria 查询的规则
	 * @return 满足条件的对象
	 */
	public User findUserByUsernameAndPassword(DetachedCriteria criteria);
	
}
