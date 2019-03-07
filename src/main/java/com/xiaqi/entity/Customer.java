package com.xiaqi.entity;


public class Customer {
	
	//id
	private Integer customer_id;
	//客户名称
	private String customer_name;
	//客户级别
	private String level;
	//信息来源
	private String source;
	//固定电话
	private String phone;
	//移动电话
	private String telephone;
	
	
	public Integer getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(Integer customer_id) {
		this.customer_id = customer_id;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	@Override
	public String toString() {
		return "Customer [customer_id=" + customer_id + ", customer_name=" + customer_name + ", level=" + level
				+ ", source=" + source + ", phone=" + phone + ", telephone=" + telephone + "]";
	}
	
	
	
	
}
