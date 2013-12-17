package com.flowerShop.action;

import java.util.List;


import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.flowerShop.DAO.DAOFactory;
import com.flowerShop.domain.Admin;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 处理管理员进行增加、删除、查询等操作
 */
public class AdminAction extends ActionSupport {
	private Admin admin;

	/** 
	 * 增加管理员
	 *  */
	public String add() throws Exception {
		HttpServletRequest request = (HttpServletRequest) ActionContext
				.getContext().get(ServletActionContext.HTTP_REQUEST);
		Admin existAdmin = DAOFactory.getAdminDAOInstance().queryByName(
				admin.getAdminName());
		String message = null;
		if (existAdmin != null) {
			message = "用户名已经存在!";
			request.setAttribute("Msg", message);
			return ERROR;
		}
		message = "添加成功!";
		DAOFactory.getAdminDAOInstance().insert(admin);
		request.setAttribute("Msg", message);
		return SUCCESS;
	}

	/** 
	 * 删除管理员
	 *  */
	public String delete() throws Exception {
		HttpServletRequest request = (HttpServletRequest) ActionContext
				.getContext().get(ServletActionContext.HTTP_REQUEST);
		String adminId = request.getParameter("adminId");
		DAOFactory.getAdminDAOInstance().delete(adminId);
		List<Admin> adminList = DAOFactory.getAdminDAOInstance().queryAll();
		request.setAttribute("adminList", adminList);
		return SUCCESS;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public Admin getAdmin() {
		return admin;
	}

	/** 
	 * 查看所有管理员 
	 * */
	public String viewAll() throws Exception {
		HttpServletRequest request = (HttpServletRequest) ActionContext
				.getContext().get(ServletActionContext.HTTP_REQUEST);
		List<Admin> adminList = DAOFactory.getAdminDAOInstance().queryAll();
		request.setAttribute("adminList", adminList);
		return SUCCESS;
	}
}
