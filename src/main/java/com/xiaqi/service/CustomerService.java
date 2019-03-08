package com.xiaqi.service;

import com.xiaqi.entity.Customer;
import com.xiaqi.vo.PageBean;

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
	
	/**
	 * 获取分页数据对象
	 * @param customer 封装条件的实体对象
	 * @param currentPage 当前页数
	 * @param pageSize 当前页显示大小
	 * @return 分页数据对象
	 */
	public PageBean<Customer> getPageBean(Customer customer,int currentPage,int pageSize);
	
}
