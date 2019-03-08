package com.xiaqi.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xiaqi.dao.UserDao;
import com.xiaqi.entity.User;
import com.xiaqi.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;

	@Override
	public boolean login(String username,String password) {
		//封装查询条件
		DetachedCriteria criteria = DetachedCriteria.forClass(User.class);
		Map<String,String> condition = new HashMap<>();
		condition.put("user_name", username);
		condition.put("password", password);
		criteria.add(Restrictions.allEq(condition));
		//调用dao层
		User u = userDao.findUserByUsernameAndPassword(criteria);
		//返回结果
		return null != u;
	}

	@Override
	@Transactional
	public void addUser(User user) {
		userDao.save(user);
	}

	@Override
	@Transactional
	public void updateUser(User user) {
		userDao.update(user);
	}

}
