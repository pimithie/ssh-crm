package com.xiaqi.web.action;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;
import com.xiaqi.entity.Customer;
import com.xiaqi.service.CustomerService;
import com.xiaqi.vo.PageBean;

@Controller
//struts2的action因为原型多例bean
@Scope("prototype")
public class CustomerAction implements ModelDriven<Customer>{
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	private Customer customer = new Customer();
	
	public Integer pageSize;
	
	public Integer currentPage;
	
	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}


	@Autowired
	private CustomerService customerService;
	
	public String add() {
		customerService.addCustomer(customer);
		logger.info("新增客户："+customer);
		return "success";
	}
	
	public String update() {
		customerService.updateCustomer(customer);
		logger.info("修改customer_id为："+customer.getCustomer_id()+"用户信息为："+customer);
		return "success";
	}
	
	public String delete() {
		customerService.deleteCustomer(customer);
		logger.info("删除用户："+customer);
		return "success";
	}
	
	public String list() {
		PageBean<Customer> pageBean = customerService.getPageBean(customer, currentPage, pageSize);
		// 放入request域中
		ActionContext.getContext().put("pageBean", pageBean);
		return "list";
	}
	

	@Override
	public Customer getModel() {
		return customer;
	}
	
	
	
}
