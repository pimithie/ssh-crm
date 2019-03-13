package com.xiaqi.web.action;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;
import com.xiaqi.entity.User;
import com.xiaqi.service.UserService;
import com.xiaqi.vo.PageBean;

@Controller
// struts2的action因为原型多例bean
@Scope("prototype")
public class UserAction implements ModelDriven<User>{
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	//接收前台录入的信息
	private User user = new User();
	
	//接收当前页数
	private Integer currentPage;
	
	//接收当前页面显示条数
	private Integer pageSize;
	
	@Autowired
	private UserService userService;
	
	public String login() {
		logger.info("----->当前登录的用户为："+user.toString());
		User currentUser = userService.login(user.getUser_name(), user.getPassword());
		if (currentUser != null) {
			logger.info("------->用户："+user.getUser_name()+"成功登录.");
			//登录成功将当前用户对象存入session域中
			ActionContext.getContext().getSession().put("currentUser", currentUser);
			return "login_success";
		} else {
			logger.info("------->用户："+user.getUser_name()+"登录失败.");
			return "login_failed";
		}
	}
	
	public String list() {
		PageBean<User> pageBean = userService.getPageBean(user, currentPage, pageSize);
		logger.info("获得User的pageBean---->"+pageBean.toString());
		ActionContext.getContext().put("pageBean", pageBean);
		return "list";
	}

	@Override
	public User getModel() {
		return user;
	}

	
	
}
