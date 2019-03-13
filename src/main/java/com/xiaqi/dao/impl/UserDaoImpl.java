package com.xiaqi.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import com.xiaqi.dao.UserDao;
import com.xiaqi.entity.User;

public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {

	@Override
	public User findUserByUsernameAndPassword(DetachedCriteria criteria) {
		List<User> result = (List<User>) this.getTemplate().findByCriteria(criteria);
		if (0 == result.size()) {
			return null;
		}
		return result.get(0);
	}

}
