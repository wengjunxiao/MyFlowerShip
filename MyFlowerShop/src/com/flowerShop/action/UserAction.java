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
 * 处理对用户的增加、删除、查询、注册等操作
 */
public class UserAction extends ActionSupport {
	private User user;

	/** 
	 * 增加用户 
	 * */
	public String add() throws Exception {
		// request对象
		HttpServletRequest request = (HttpServletRequest) ActionContext
				.getContext().get(ServletActionContext.HTTP_REQUEST);
		User existUser = DAOFactory.getUserDAOInstance().queryByName(
				user.getUsersName());
		String message = null;
		if (existUser != null) {
			message = "该用户名已经存在了!";
			request.setAttribute("Msg", message);
			request.setAttribute("userInfo", user);
			return ERROR;
		}
		message = "注册成功!";
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
	 * 删除用户 
	 * */
	public String delete() throws Exception {
		// 获得request对象
		HttpServletRequest request = (HttpServletRequest) ActionContext
				.getContext().get(ServletActionContext.HTTP_REQUEST);
		// 获得要删除的用户的id
		String userId = request.getParameter("userId");
		// 从数据库中删除
		DAOFactory.getUserDAOInstance().delete(userId);
		// 查询全部数据
		List<User> userList = DAOFactory.getUserDAOInstance().queryAll();
		request.setAttribute("userList", userList);
		return SUCCESS;
	}

	/**
	 *  查询用户 
	 *  */
	public String query() throws Exception {
		// 获得request对象
		HttpServletRequest request = (HttpServletRequest) ActionContext
				.getContext().get(ServletActionContext.HTTP_REQUEST);
		// 获得查询的用户号或者用户名
		String queryId = request.getParameter("queryId");
		String queryName = request.getParameter("queryName");
		// 所有用户列表
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
	 * 查看所有用户 
	 * */
	public String viewAll() throws Exception {
		// request
		HttpServletRequest request = (HttpServletRequest) ActionContext
				.getContext().get(ServletActionContext.HTTP_REQUEST);
		// 用户列表
		List<User> userList = DAOFactory.getUserDAOInstance().queryAll();
		request.setAttribute("userList", userList);
		return SUCCESS;
	}

	/** 
	 * 查看我的账户
	 *  */
	public String myAccount() throws Exception {
		// 获得request对象
		HttpServletRequest request = (HttpServletRequest) ActionContext
				.getContext().get(ServletActionContext.HTTP_REQUEST);
		// 获得登录用户的用户名
		String name = (String) request.getSession().getAttribute("loginUser");
		// 用户还未登录
		if (name == null) {
			String message = "对不起，用户未登录!";
			request.setAttribute("loginMesage", message);
			return ERROR;
		}
		// 根据用户名从数据库中查询这个用户的所以信息
		User user = DAOFactory.getUserDAOInstance().queryByName(name);
		// 把查询出的用户信息设置到request中
		request.getSession().setAttribute("myInfo", user);
		return SUCCESS;
	}

	/** 
	 * 用户注册
	 *  */
	public String register() throws Exception {
		// 判断用户名是否已经注册
		User userInDB = DAOFactory.getUserDAOInstance().queryByName(
				user.getUsersName());
		// 提示信息
		String registerMessage = null;
		// request 对象
		HttpServletRequest request = (HttpServletRequest) ActionContext
				.getContext().get(ServletActionContext.HTTP_REQUEST);
		if (userInDB != null) {
			registerMessage = "该用户名已经存在了!";
			request.setAttribute("registerInfo", user);
			request.setAttribute("message", registerMessage);
			return ERROR;
		}
		DAOFactory.getUserDAOInstance().insert(user);
		request.setAttribute("name", user.getUsersName());
		return SUCCESS;
	}
}
