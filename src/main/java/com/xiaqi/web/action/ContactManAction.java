package com.xiaqi.web.action;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;
import com.xiaqi.entity.ContactMan;
import com.xiaqi.service.ContactManService;
import com.xiaqi.vo.PageBean;

@Controller
@Scope("prototype")
public class ContactManAction implements ModelDriven<ContactMan> {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	private ContactMan contactMan = new ContactMan();

	private Integer currentPage;

	private Integer pageSize;

	@Autowired
	private ContactManService contactManService;

	public String add() {
		contactManService.addContactMan(contactMan);
		logger.info("新增联系人：" + contactMan);
		return "success";
	}

	public String update() {
		contactManService.updateContactMan(contactMan);
		logger.info("修改contactMan_id为：" + contactMan.getContactMan_id() + "联系人信息为：" + contactMan);
		return "success";
	}

	public String delete() {
		contactManService.deleteContactMan(contactMan);
		logger.info("删除联系人：" + contactMan);
		return "success";
	}

	public String list() {
		PageBean<ContactMan> pageBean = contactManService.getPageBean(contactMan, currentPage, pageSize);
		// 放入request域中
		ActionContext.getContext().put("pageBean", pageBean);
		return "list";
	}

	public Integer getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	@Override
	public ContactMan getModel() {
		return contactMan;
	}

}
