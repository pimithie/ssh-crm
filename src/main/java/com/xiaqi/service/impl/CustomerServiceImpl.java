package com.xiaqi.service.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xiaqi.dao.CustomerDao;
import com.xiaqi.entity.Customer;
import com.xiaqi.entity.User;
import com.xiaqi.service.CustomerService;
import com.xiaqi.vo.PageBean;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao customerDao;

	@Override
	@Transactional
	public void addCustomer(Customer customer) {
		customerDao.save(customer);
	}

	@Override
	@Transactional
	public void deleteCustomer(Customer customer) {
		customerDao.delete(customer);
	}

	@Override
	@Transactional
	public void updateCustomer(Customer customer) {
		customerDao.update(customer);
	}

	@Override
	public PageBean<Customer> getPageBean(Customer customer, int currentPage, int pageSize) {
		// 实例化pageBean对象
		PageBean<Customer> pageBean = new PageBean<>();
		pageBean.setPageSize(pageSize);
		pageBean.setCurrentPage(currentPage);
		// 调用dao层获得总记录数
		DetachedCriteria criteria = DetachedCriteria.forClass(Customer.class);
		criteria.add(Restrictions.like("customer_name", "%" + customer.getCustomer_name() + "%"));
		Long totalCount = customerDao.getTotalCount(criteria);
		pageBean.setTotalCount(totalCount);
		// 计算获得总页数
		int totalPages = (int) Math.ceil(1.0 * totalCount / pageSize);
		pageBean.setTotalPages(totalPages);
		// 获得分页数据
		// 移除聚合函数count
		criteria.setProjection(null);
		List<Customer> list = customerDao.list(criteria, (currentPage - 1) * pageSize, pageSize);
		pageBean.setList(list);
		return pageBean;
	}

}
