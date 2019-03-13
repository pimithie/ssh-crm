package com.xiaqi.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xiaqi.dao.UserDao;
import com.xiaqi.entity.User;
import com.xiaqi.service.UserService;
import com.xiaqi.vo.PageBean;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;

	@Override
	public User login(String username,String password) {
		//封装查询条件
		DetachedCriteria criteria = DetachedCriteria.forClass(User.class);
		Map<String,String> condition = new HashMap<>();
		condition.put("user_name", username);
		condition.put("password", password);
		criteria.add(Restrictions.allEq(condition));
		//调用dao层
		User u = userDao.findUserByUsernameAndPassword(criteria);
		//返回结果
		return u;
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

	@Override
	@Transactional(readOnly=true)
	public PageBean<User> getPageBean(User user,Integer currentPage,Integer pageSize) {
		//实例化pageBean对象
		PageBean<User> pageBean = new PageBean<>();
		//判断前台是否传入当前页数
		if (null == currentPage || 0 == currentPage) {
			currentPage = 1;
		}
		pageBean.setCurrentPage(currentPage);
		pageBean.setPageSize(pageSize);
		//调用dao层获得总记录数
		DetachedCriteria criteria = DetachedCriteria.forClass(User.class);
		criteria.add(Restrictions.like("real_name","%"+user.getReal_name()+"%"));
		Long totalCount = userDao.getTotalCount(criteria);
		pageBean.setTotalCount(totalCount);
		//计算获得总页数
		int totalPages = (int) Math.ceil(1.0*totalCount/pageSize);
		pageBean.setTotalPages(totalPages);
		//获得分页数据
		//移除聚合函数count
		criteria.setProjection(null);
		List<User> list = userDao.list(criteria, (currentPage-1)*pageSize, pageSize);
		pageBean.setList(list);
		return pageBean;
	}

}
