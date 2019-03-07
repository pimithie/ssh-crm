package com.xiaqi.entity;

/**
 * 用户实体类
 */
public class User {
	

	// 用户id
	private Integer user_id;
	// 用户真实姓名
	private String real_name;
	// 登录用户名
	private String user_name;
	// 登录密码
	private String password;
	// 用户电话
	private String user_telephone;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User(String real_name, String user_name, String password, String user_telephone) {
		super();
		this.real_name = real_name;
		this.user_name = user_name;
		this.password = password;
		this.user_telephone = user_telephone;
	}

	public String getReal_name() {
		return real_name;
	}

	public void setReal_name(String real_name) {
		this.real_name = real_name;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUser_telephone() {
		return user_telephone;
	}

	public void setUser_telephone(String user_telephone) {
		this.user_telephone = user_telephone;
	}

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", real_name=" + real_name + ", user_name=" + user_name + ", password="
				+ password + ", user_telephone=" + user_telephone + "]";
	}

	
}
