package com.xiaqi.entity;

public class ContactMan {
	
	//id
	private Integer contactMan_id;
	//所属客户
	private Integer customer_id;
	//联系人名称
	private String contactManName;
	//性别
	private String sex;
	//办公电话
	private String phone;
	//手机电话
	private String telephone;
	
	
	public Integer getContactMan_id() {
		return contactMan_id;
	}
	public void setContactMan_id(Integer contactMan_id) {
		this.contactMan_id = contactMan_id;
	}
	public Integer getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(Integer customer_id) {
		this.customer_id = customer_id;
	}
	public String getContactManName() {
		return contactManName;
	}
	public void setContactManName(String contactManName) {
		this.contactManName = contactManName;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
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
		return "ContactMan [contactMan_id=" + contactMan_id + ", customer_id=" + customer_id + ", contactManName="
				+ contactManName + ", sex=" + sex + ", phone=" + phone + ", telephone=" + telephone + "]";
	}
	
	
}
