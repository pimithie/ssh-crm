package com.xiaqi.service;


import com.xiaqi.entity.User;
import com.xiaqi.vo.PageBean;

public interface UserService {
	
	/**
	 * 登录 服务接口
	 * @param username 用户名
	 * @param password 用户名
	 * @return 当前用户对象
	 */
	public User login(String username,String password);
	
	/**
	 * 新增用户接口
	 * @param user 被增加的用户对象
	 */
	public void addUser(User user);
	
	/**
	 * 修改用户接口
	 * @param user 更新之后的用户的信息
	 */
	public void updateUser(User user);
	
	/**
	 * 获取分页数据对象
	 * @param user 封装条件的实体对象
	 * @param currentPage 当前页数
	 * @param pageSize 当前页显示大小
	 * @return 分页数据对象
	 */
	public PageBean<User> getPageBean(User user,Integer currentPage,Integer pageSize);
	
}
