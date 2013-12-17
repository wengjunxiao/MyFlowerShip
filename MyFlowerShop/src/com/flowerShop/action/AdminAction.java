package com.flowerShop.action;

import java.util.List;


import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.flowerShop.DAO.DAOFactory;
import com.flowerShop.domain.Admin;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * �������Ա�������ӡ�ɾ������ѯ�Ȳ���
 */
public class AdminAction extends ActionSupport {
	private Admin admin;

	/** 
	 * ���ӹ���Ա
	 *  */
	public String add() throws Exception {
		HttpServletRequest request = (HttpServletRequest) ActionContext
				.getContext().get(ServletActionContext.HTTP_REQUEST);
		Admin existAdmin = DAOFactory.getAdminDAOInstance().queryByName(
				admin.getAdminName());
		String message = null;
		if (existAdmin != null) {
			message = "�û����Ѿ�����!";
			request.setAttribute("Msg", message);
			return ERROR;
		}
		message = "��ӳɹ�!";
		DAOFactory.getAdminDAOInstance().insert(admin);
		request.setAttribute("Msg", message);
		return SUCCESS;
	}

	/** 
	 * ɾ������Ա
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
	 * �鿴���й���Ա 
	 * */
	public String viewAll() throws Exception {
		HttpServletRequest request = (HttpServletRequest) ActionContext
				.getContext().get(ServletActionContext.HTTP_REQUEST);
		List<Admin> adminList = DAOFactory.getAdminDAOInstance().queryAll();
		request.setAttribute("adminList", adminList);
		return SUCCESS;
	}
}
