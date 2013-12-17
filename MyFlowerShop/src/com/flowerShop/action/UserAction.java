package com.flowerShop.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.flowerShop.DAO.DAOFactory;
import com.flowerShop.domain.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * ������û������ӡ�ɾ������ѯ��ע��Ȳ���
 */
public class UserAction extends ActionSupport {
	private User user;

	/** 
	 * �����û� 
	 * */
	public String add() throws Exception {
		// request����
		HttpServletRequest request = (HttpServletRequest) ActionContext
				.getContext().get(ServletActionContext.HTTP_REQUEST);
		User existUser = DAOFactory.getUserDAOInstance().queryByName(
				user.getUsersName());
		String message = null;
		if (existUser != null) {
			message = "���û����Ѿ�������!";
			request.setAttribute("Msg", message);
			request.setAttribute("userInfo", user);
			return ERROR;
		}
		message = "ע��ɹ�!";
		request.setAttribute("Msg", message);
		DAOFactory.getUserDAOInstance().insert(user);

		return SUCCESS;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public User getUser() {
		return user;
	}

	/** 
	 * ɾ���û� 
	 * */
	public String delete() throws Exception {
		// ���request����
		HttpServletRequest request = (HttpServletRequest) ActionContext
				.getContext().get(ServletActionContext.HTTP_REQUEST);
		// ���Ҫɾ�����û���id
		String userId = request.getParameter("userId");
		// �����ݿ���ɾ��
		DAOFactory.getUserDAOInstance().delete(userId);
		// ��ѯȫ������
		List<User> userList = DAOFactory.getUserDAOInstance().queryAll();
		request.setAttribute("userList", userList);
		return SUCCESS;
	}

	/**
	 *  ��ѯ�û� 
	 *  */
	public String query() throws Exception {
		// ���request����
		HttpServletRequest request = (HttpServletRequest) ActionContext
				.getContext().get(ServletActionContext.HTTP_REQUEST);
		// ��ò�ѯ���û��Ż����û���
		String queryId = request.getParameter("queryId");
		String queryName = request.getParameter("queryName");
		// �����û��б�
		List<User> userList = DAOFactory.getUserDAOInstance().queryAll();
		List<User> list = new ArrayList<User>();
		for (int i = 0; i < userList.size(); ++i) {
			User user = userList.get(i);
			if (queryId != null
					&& Integer.toString(user.getUsersId()).contains(queryId)) {
				list.add(user);
			} else if (queryName != null
					&& user.getUsersName().contains(queryName)) {
				list.add(user);
			}
		}
		request.setAttribute("userList", list);
		return SUCCESS;
	}

	/** 
	 * �鿴�����û� 
	 * */
	public String viewAll() throws Exception {
		// request
		HttpServletRequest request = (HttpServletRequest) ActionContext
				.getContext().get(ServletActionContext.HTTP_REQUEST);
		// �û��б�
		List<User> userList = DAOFactory.getUserDAOInstance().queryAll();
		request.setAttribute("userList", userList);
		return SUCCESS;
	}

	/** 
	 * �鿴�ҵ��˻�
	 *  */
	public String myAccount() throws Exception {
		// ���request����
		HttpServletRequest request = (HttpServletRequest) ActionContext
				.getContext().get(ServletActionContext.HTTP_REQUEST);
		// ��õ�¼�û����û���
		String name = (String) request.getSession().getAttribute("loginUser");
		// �û���δ��¼
		if (name == null) {
			String message = "�Բ����û�δ��¼!";
			request.setAttribute("loginMesage", message);
			return ERROR;
		}
		// �����û��������ݿ��в�ѯ����û���������Ϣ
		User user = DAOFactory.getUserDAOInstance().queryByName(name);
		// �Ѳ�ѯ�����û���Ϣ���õ�request��
		request.getSession().setAttribute("myInfo", user);
		return SUCCESS;
	}

	/** 
	 * �û�ע��
	 *  */
	public String register() throws Exception {
		// �ж��û����Ƿ��Ѿ�ע��
		User userInDB = DAOFactory.getUserDAOInstance().queryByName(
				user.getUsersName());
		// ��ʾ��Ϣ
		String registerMessage = null;
		// request ����
		HttpServletRequest request = (HttpServletRequest) ActionContext
				.getContext().get(ServletActionContext.HTTP_REQUEST);
		if (userInDB != null) {
			registerMessage = "���û����Ѿ�������!";
			request.setAttribute("registerInfo", user);
			request.setAttribute("message", registerMessage);
			return ERROR;
		}
		DAOFactory.getUserDAOInstance().insert(user);
		request.setAttribute("name", user.getUsersName());
		return SUCCESS;
	}
}
