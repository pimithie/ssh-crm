package com.xiaqi.dao.test;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xiaqi.dao.UserDao;
import com.xiaqi.entity.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestDao {
	
	@Autowired
	private UserDao userDao;
	
	@Test
	public void testUserDao() {
		//test the list method
		listAndPrint();
		
		//--------------------test the save method---------------
//		User user = new User("王五","wangwu","456456","741258963");
//		userDao.save(user);
//		listAndPrint();
		
		//-----------------------test the update method------------------
//		User user2 = new User("王五","wangwu","000000","741258963");
//		user2.setUser_id(5);
//		userDao.update(user2);
//		listAndPrint();
		
		//------------------test the delete method------------------------
//		User user = new User();
//		user.setUser_id(5);
//		userDao.delete(user);
		
		//----------------test deleteById method----------------------
//		userDao.deleteById(6);
//		listAndPrint();
		
		//------------------test getTotalCount-------------------
//		Long totalCount = userDao.getTotalCount(DetachedCriteria.forClass(User.class));
//		System.out.println("当前共有"+totalCount+"条记录.");
		
		//--------------test findById ----------------
		System.out.println(userDao.findById(2));
	}
	
	@Test
	public void test() {
		System.out.println("123");
	}
	
	private void listAndPrint() {
		List<User> list1 = userDao.list(DetachedCriteria.forClass(User.class), 0, 100);
		System.out.println("第一次list的结果为：");
		for (User u : list1) {
			System.out.println(u);
		}
	}
	
	
}
