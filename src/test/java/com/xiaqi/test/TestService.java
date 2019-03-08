package com.xiaqi.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xiaqi.entity.ContactMan;
import com.xiaqi.entity.Customer;
import com.xiaqi.entity.User;
import com.xiaqi.service.ContactManService;
import com.xiaqi.service.CustomerService;
import com.xiaqi.service.UserService;
import com.xiaqi.vo.PageBean;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestService {

	@Resource
	private UserService userService;

	@Test
	public void testUserService() {
		// 测试登录接口
		// System.out.println("是否登录成功："+userService.login("zhangsan", "123456"));

		// 测试添加用户接口
		// userService.addUser(new User("张三", "zhangsan", "147852", "55555"));

		// 测试修改用户接口
		// User user = new User("张三", "zhangsan", "1111", "66666");
		// user.setUser_id(8);
		// userService.updateUser(user);

		// 测试分页
		// User user = new User();
		// user.setReal_name("张");
		// PageBean<User> pageBean = userService.getPageBean(user, 4, 3);
		// System.out.println(pageBean.getList());
	}

	@Autowired
	private CustomerService customerService;

	@Test
	public void testCustomerService() {
		// 测试新增客户接口
		// Customer customer = new Customer();
		// customer.setCustomer_name("百度");
		// customer.setLevel("高级");
		// customer.setPhone("123456");
		// customer.setSource("网络");
		// customer.setTelephone("456789");
		// customerService.addCustomer(customer);

		// 测试修改客户接口
		// Customer customer = new Customer();
		// customer.setCustomer_id(1);
		// customer.setCustomer_name("阿里巴巴");
		// customer.setLevel("高级");
		// customer.setPhone("123456");
		// customer.setSource("人脉");
		// customer.setTelephone("456789");
		// customerService.updateCustomer(customer);

		// 测试删除用户接口
		// Customer customer = new Customer();
		// customer.setCustomer_id(1);
		// customerService.deleteCustomer(customer);

		// 测试分页接口
		// Customer customer = new Customer();
		// customer.setCustomer_name("百");
		// PageBean<Customer> pageBean = customerService.getPageBean(customer, 1, 3);
		// System.out.println(pageBean.getList());

	}

	@Autowired
	private ContactManService contactManService;

	@Test
	public void testContactService() {
		// 测试新增
//		ContactMan contactMan = new ContactMan();
//		contactMan.setContactManName("zhangsan");
//		contactMan.setCustomer_id(2);
//		contactMan.setPhone("155132");
//		contactMan.setSex("男");
//		contactMan.setTelephone("155132");
//		contactManService.addContactMan(contactMan);

		// 测试更新
		// ContactMan contactMan = new ContactMan();
		// contactMan.setContactMan_id(1);
		// contactMan.setContactManName("lisi");
		// contactMan.setCustomer_id(2);
		// contactMan.setPhone("155132");
		// contactMan.setSex("男");
		// contactMan.setTelephone("155132");
		// contactManService.updateContactMan(contactMan);

		// 测试删除
		// ContactMan contactMan = new ContactMan();
		// contactMan.setContactMan_id(1);
		// contactManService.deleteContactMan(contactMan);

		// 测试分页接口
//		ContactMan contactMan = new ContactMan();
//		contactMan.setContactManName("ia");
//		PageBean<ContactMan> pageBean = contactManService.getPageBean(contactMan, 1, 3);
//		System.out.println(pageBean.getList());
	}

}
