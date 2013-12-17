package com.flowerShop.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 处理用户和管理员的退出
 */
public class LogoutAction extends ActionSupport {
	/**
	 * 用户退出
	 */
	public String userLogout() throws Exception{
		// 获得request对象
		HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		// 销毁会话
		request.getSession().invalidate();
		return SUCCESS;
	}
	
	/**
	 * 管理员退出
	 */
	public String adminLogout() throws Exception{
		HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		request.getSession().invalidate();
		return SUCCESS;
	}
}
