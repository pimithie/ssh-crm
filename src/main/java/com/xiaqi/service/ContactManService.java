package com.xiaqi.service;

import com.xiaqi.entity.ContactMan;
import com.xiaqi.vo.PageBean;

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
	
	/**
	 * 获取分页数据对象
	 * @param contactMan 封装条件的实体对象
	 * @param currentPage 当前页数
	 * @param pageSize 当前页显示大小
	 * @return 分页数据对象
	 */
	public PageBean<ContactMan> getPageBean(ContactMan contactMan,Integer currentPage,Integer pageSize);
	
}
