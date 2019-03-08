package com.xiaqi.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xiaqi.entity.ContactMan;
import com.xiaqi.entity.Customer;
import com.xiaqi.service.ContactManService;
import com.xiaqi.service.CustomerService;
import com.xiaqi.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestService {
	
	@Resource
	private UserService userService;
	
	@Test
	public void testUserService() {
		//测试登录接口
//		System.out.println("是否登录成功："+userService.login("zhangsan", "123456"));
		
		//测试添加用户接口
//		userService.addUser(new User("夏齐", "xiaqi", "147852", "15797957610"));
		
		//测试修改用户接口
//		User user = new User("夏齐", "xiaqi", "xq1998", "15797957610");
//		user.setUser_id(8);
//		userService.updateUser(user);
	}
	
	@Autowired
	private CustomerService customerService;
	
	@Test
	public void testCustomerService() {
		//测试新增客户接口
//		Customer customer = new Customer();
//		customer.setCustomer_name("阿里巴巴");
//		customer.setLevel("高级");
//		customer.setPhone("123456");
//		customer.setSource("网络");
//		customer.setTelephone("456789");
//		customerService.addCustomer(customer);
		
		//测试修改客户接口
//		Customer customer = new Customer();
//		customer.setCustomer_id(1);
//		customer.setCustomer_name("阿里巴巴");
//		customer.setLevel("高级");
//		customer.setPhone("123456");
//		customer.setSource("人脉");
//		customer.setTelephone("456789");
//		customerService.updateCustomer(customer);
		
		//测试删除用户接口
//		Customer customer = new Customer();
//		customer.setCustomer_id(1);
//		customerService.deleteCustomer(customer);
		
	}
	
	@Autowired
	private ContactManService contaceManService;
	
	@Test
	public void testContactService() {
		//测试新增
//		ContactMan contactMan = new ContactMan();
//		contactMan.setContactManName("夏齐");
//		contactMan.setCustomer_id(2);
//		contactMan.setPhone("15797957610");
//		contactMan.setSex("男");
//		contactMan.setTelephone("15797957610");
//		contaceManService.addContactMan(contactMan);
		
		//测试更新
//		ContactMan contactMan = new ContactMan();
//		contactMan.setContactMan_id(1);
//		contactMan.setContactManName("齐下");
//		contactMan.setCustomer_id(2);
//		contactMan.setPhone("15797957610");
//		contactMan.setSex("男");
//		contactMan.setTelephone("15797957610");
//		contaceManService.updateContactMan(contactMan);
		
		//测试删除
		ContactMan contactMan = new ContactMan();
		contactMan.setContactMan_id(1);
		contaceManService.deleteContactMan(contactMan);
		
	}

}
