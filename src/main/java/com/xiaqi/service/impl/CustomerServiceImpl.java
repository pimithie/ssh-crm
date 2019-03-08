package com.xiaqi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xiaqi.dao.CustomerDao;
import com.xiaqi.entity.Customer;
import com.xiaqi.service.CustomerService;

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

}
