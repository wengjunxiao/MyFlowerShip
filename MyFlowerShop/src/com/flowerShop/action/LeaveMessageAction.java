package com.flowerShop.action;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.flowerShop.DAO.DAOFactory;
import com.flowerShop.domain.LeaveLanguage;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 处理对留言进行增加、查询，删除等操作
 */
public class LeaveMessageAction extends ActionSupport {
	private LeaveLanguage message;
	private static Date lastDate = null;
	private final int MSG_INTE = 7000;

	/** 
	 * 用户留言 
	 * */
	public String leaveMessage() throws Exception {
		// 获得request对象
		HttpServletRequest request = (HttpServletRequest) ActionContext
				.getContext().get(ServletActionContext.HTTP_REQUEST);
		// 设置显示格式
		DateFormat mediumDateFormat = DateFormat.getDateTimeInstance(
				DateFormat.MEDIUM, DateFormat.MEDIUM);
		// 当前时间
		Date currentDate = new Date();
		if (lastDate != null
				&& (currentDate.getTime() - lastDate.getTime()) <= MSG_INTE) {
			List<LeaveLanguage> messageList = DAOFactory
					.getLeaveLanguageDAOInstance().queryAll();
			// 将留言列表放入request中
			request.setAttribute("messageList", messageList);
			return "limitted";
		}
		lastDate = new Date();
		if (message != null) {
			message.setDateTime(mediumDateFormat.format(currentDate));
			// 插入数据库中
			DAOFactory.getLeaveLanguageDAOInstance().insert(message);
		}
		// 存放所有留言的列表
		List<LeaveLanguage> messageList = DAOFactory
				.getLeaveLanguageDAOInstance().queryAll();
		// 将留言列表放入request中
		request.setAttribute("messageList", messageList);
		return SUCCESS;
	}

	public void setMessage(LeaveLanguage message) {
		this.message = message;
	}

	public LeaveLanguage getMessage() {
		return message;
	}

	private LeaveLanguage leaveMessage;

	/** 
	 * 管理员增加留言
	 *  */
	public String add() throws Exception {
		// request对象
		HttpServletRequest request = (HttpServletRequest) ActionContext
				.getContext().get(ServletActionContext.HTTP_REQUEST);
		String message = "添加成功!";
		// 时间格式
		DateFormat mediumDateFormat = DateFormat.getDateTimeInstance(
				DateFormat.MEDIUM, DateFormat.MEDIUM);
		// 当前时间
		Date currentDate = new Date();
		leaveMessage.setDateTime(mediumDateFormat.format(currentDate));
		DAOFactory.getLeaveLanguageDAOInstance().insert(leaveMessage);
		request.setAttribute("Msg", message);
		return SUCCESS;
	}

	public void setLeaveMessage(LeaveLanguage leaveMessage) {
		this.leaveMessage = leaveMessage;
	}

	public LeaveLanguage getLeaveMessage() {
		return leaveMessage;
	}

	/** 
	 * 查看所有留言
	 *  */
	public String viewAll() throws Exception {
		// request对象
		HttpServletRequest request = (HttpServletRequest) ActionContext
				.getContext().get(ServletActionContext.HTTP_REQUEST);
		List<LeaveLanguage> list = DAOFactory.getLeaveLanguageDAOInstance()
				.queryAll();
		request.setAttribute("leaveMessageList", list);
		return SUCCESS;
	}

	/** 
	 * 删除留言
	 *  */
	public String delete() throws Exception {
		// request对象
		HttpServletRequest request = (HttpServletRequest) ActionContext
				.getContext().get(ServletActionContext.HTTP_REQUEST);
		// 获得留言id
		String leaveLanguageId = request.getParameter("leaveLanguageId");
		// 删除
		DAOFactory.getLeaveLanguageDAOInstance().delete(leaveLanguageId);
		List<LeaveLanguage> list = DAOFactory.getLeaveLanguageDAOInstance()
				.queryAll();
		request.setAttribute("leaveMessageList", list);
		return SUCCESS;
	}

	/** 
	 * 查询留言
	 *  */
	public String query() throws Exception {
		// request对象
		HttpServletRequest request = (HttpServletRequest) ActionContext
				.getContext().get(ServletActionContext.HTTP_REQUEST);
		// 获得用户名
		String name = request.getParameter("queryName");
		List<LeaveLanguage> leaveList = DAOFactory
				.getLeaveLanguageDAOInstance().queryAll();
		List<LeaveLanguage> list = new ArrayList<LeaveLanguage>();
		for (int i = 0; i < leaveList.size(); ++i) {
			LeaveLanguage leave = leaveList.get(i);
			if (name != null && leave.getName().contains(name)) {
				list.add(leave);
			}
		}
		request.setAttribute("leaveMessageList", list);
		return SUCCESS;
	}
}
