package com.flowerShop.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.flowerShop.DAO.DAOFactory;
import com.flowerShop.domain.Admin;
import com.flowerShop.domain.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 处理管理和用户的登录操作
 */
public class LoginAction extends ActionSupport {
	/** 用户名 */
	private String usersName;
	/** 密码 */
	private String usersPass;
	
	/**
	 * 用户登录
	 */
	public String userLogin() throws Exception {
		// 获得request对象
		HttpServletRequest request = (HttpServletRequest) ActionContext
				.getContext().get(ServletActionContext.HTTP_REQUEST);
		
		// 返回提示信息
		String message = null;
		User user = DAOFactory.getUserDAOInstance().queryByName(usersName);
		boolean flag = false;
		
		// 登录验证通过
		if (user != null && user.getUsersPass().equals(usersPass)) {
			message = "欢迎您," + usersName;
			flag = true;
		} else if (user == null) {
			message = "账户不存在，请先注册!";
		} else if (user != null && !user.getUsersPass().equals(usersPass)) {
			message = "密码错误!";
		}
		
		request.getSession().setAttribute("loginMessage", message);
		if (flag) {
			
			// 用户信息写入session
			request.getSession().setAttribute("loginUser", usersName);
			request.getSession().setAttribute("state", "LoginOK");
			return SUCCESS;
		}
		request.getSession().setAttribute("state", "Failed");
		return INPUT;
	}

	public String getUsersName() {
		return usersName;
	}

	public void setUsersName(String usersName) {
		this.usersName = usersName;
	}

	public String getUsersPass() {
		return usersPass;
	}

	public void setUsersPass(String usersPass) {
		this.usersPass = usersPass;
	}

	/** 管理员用户名 */
	private String adminName;
	/** 密码 */
	private String adminPass;
	
	/**
	 * 管理员登录
	 */
	public String adminLogin() throws Exception {
		
		// 验证用户名密码是否正确
		Admin admin = DAOFactory.getAdminDAOInstance().queryByName(adminName);
		// 获得request对象
		HttpServletRequest request = (HttpServletRequest) ActionContext
				.getContext().get(ServletActionContext.HTTP_REQUEST);
		// 合法用户
		if (admin != null && admin.getAdminPass().equals(adminPass)) {
			request.getSession().setAttribute("loginAdmin", adminName);
			return SUCCESS;
		}
		String message = "用户名或密码错误!";
		request.setAttribute("adminLoginMessage", message);
		return ERROR;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getAdminPass() {
		return adminPass;
	}

	public void setAdminPass(String adminPass) {
		this.adminPass = adminPass;
	}
}
