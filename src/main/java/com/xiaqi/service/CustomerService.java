package com.xiaqi.service;

import com.xiaqi.entity.Customer;

public interface CustomerService {
	
	/**
	 * 新增客户接口
	 * @param customer 被新增客户对象
	 */
	public void addCustomer(Customer customer);

	/**
	 * 删除客户接口
	 * @param customer 被删除的用户对象
	 */
	public void deleteCustomer(Customer customer);
	
	/**
	 * 修改客户接口
	 * @param customer 被修改的客户对象
	 */
	public void updateCustomer(Customer customer);
	
}
