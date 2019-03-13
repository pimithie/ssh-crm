package com.xiaqi.service.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xiaqi.dao.ContactManDao;
import com.xiaqi.entity.ContactMan;
import com.xiaqi.service.ContactManService;
import com.xiaqi.vo.PageBean;

@Service
public class ContactManServiceImpl implements ContactManService {

	@Autowired
	private ContactManDao contactDao;

	@Override
	@Transactional
	public void addContactMan(ContactMan contactMan) {
		contactDao.save(contactMan);
	}

	@Override
	@Transactional
	public void deleteContactMan(ContactMan contactMan) {
		contactDao.delete(contactMan);
	}

	@Override
	@Transactional
	public void updateContactMan(ContactMan contactMan) {
		contactDao.update(contactMan);
	}

	@Override
	@Transactional(readOnly=true)
	public PageBean<ContactMan> getPageBean(ContactMan contactMan, Integer currentPage, Integer pageSize) {
		// 实例化pageBean对象
		PageBean<ContactMan> pageBean = new PageBean<>();
		// 判断前台是否传入当前页数
		if (null == currentPage || 0 == currentPage) {
			currentPage = 1;
		}
		pageBean.setPageSize(pageSize);
		pageBean.setCurrentPage(currentPage);
		// 调用dao层获得总记录数
		DetachedCriteria criteria = DetachedCriteria.forClass(ContactMan.class);
		criteria.add(Restrictions.like("contactManName", "%" + contactMan.getContactManName() + "%"));
		Long totalCount = contactDao.getTotalCount(criteria);
		pageBean.setTotalCount(totalCount);
		// 计算获得总页数
		int totalPages = (int) Math.ceil(1.0 * totalCount / pageSize);
		pageBean.setTotalPages(totalPages);
		// 获得分页数据
		// 移除聚合函数count
		criteria.setProjection(null);
		List<ContactMan> list = contactDao.list(criteria, (currentPage - 1) * pageSize, pageSize);
		pageBean.setList(list);
		return pageBean;
	}

}
