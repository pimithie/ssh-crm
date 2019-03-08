package com.xiaqi.service;


import com.xiaqi.entity.User;

public interface UserService {
	
	/**
	 * 登录 服务接口
	 * @param username 用户名
	 * @param password 用户名
	 * @return 是否登录成功
	 */
	public boolean login(String username,String password);
	
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
	
}
