package com.xiaqi.service;

import com.xiaqi.entity.ContactMan;

public interface ContactManService {
	
	/**
	 * 新增联系人接口
	 * @param customer 被新增联系人对象
	 */
	public void addContactMan(ContactMan contactMan);

	/**
	 * 删除联系人接口
	 * @param customer 被删除的联系人对象
	 */
	public void deleteContactMan(ContactMan contactMan);
	
	/**
	 * 修改联系人接口
	 * @param customer 被修改的联系人对象
	 */
	public void updateContactMan(ContactMan contactMan);
	
}
