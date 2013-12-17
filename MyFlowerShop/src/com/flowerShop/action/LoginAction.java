package com.flowerShop.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.flowerShop.DAO.DAOFactory;
import com.flowerShop.domain.Admin;
import com.flowerShop.domain.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * ���������û��ĵ�¼����
 */
public class LoginAction extends ActionSupport {
	/** �û��� */
	private String usersName;
	/** ���� */
	private String usersPass;
	
	/**
	 * �û���¼
	 */
	public String userLogin() throws Exception {
		// ���request����
		HttpServletRequest request = (HttpServletRequest) ActionContext
				.getContext().get(ServletActionContext.HTTP_REQUEST);
		
		// ������ʾ��Ϣ
		String message = null;
		User user = DAOFactory.getUserDAOInstance().queryByName(usersName);
		boolean flag = false;
		
		// ��¼��֤ͨ��
		if (user != null && user.getUsersPass().equals(usersPass)) {
			message = "��ӭ��," + usersName;
			flag = true;
		} else if (user == null) {
			message = "�˻������ڣ�����ע��!";
		} else if (user != null && !user.getUsersPass().equals(usersPass)) {
			message = "�������!";
		}
		
		request.getSession().setAttribute("loginMessage", message);
		if (flag) {
			
			// �û���Ϣд��session
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

	/** ����Ա�û��� */
	private String adminName;
	/** ���� */
	private String adminPass;
	
	/**
	 * ����Ա��¼
	 */
	public String adminLogin() throws Exception {
		
		// ��֤�û��������Ƿ���ȷ
		Admin admin = DAOFactory.getAdminDAOInstance().queryByName(adminName);
		// ���request����
		HttpServletRequest request = (HttpServletRequest) ActionContext
				.getContext().get(ServletActionContext.HTTP_REQUEST);
		// �Ϸ��û�
		if (admin != null && admin.getAdminPass().equals(adminPass)) {
			request.getSession().setAttribute("loginAdmin", adminName);
			return SUCCESS;
		}
		String message = "�û������������!";
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
