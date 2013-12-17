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
 * ��������Խ������ӡ���ѯ��ɾ���Ȳ���
 */
public class LeaveMessageAction extends ActionSupport {
	private LeaveLanguage message;
	private static Date lastDate = null;
	private final int MSG_INTE = 7000;

	/** 
	 * �û����� 
	 * */
	public String leaveMessage() throws Exception {
		// ���request����
		HttpServletRequest request = (HttpServletRequest) ActionContext
				.getContext().get(ServletActionContext.HTTP_REQUEST);
		// ������ʾ��ʽ
		DateFormat mediumDateFormat = DateFormat.getDateTimeInstance(
				DateFormat.MEDIUM, DateFormat.MEDIUM);
		// ��ǰʱ��
		Date currentDate = new Date();
		if (lastDate != null
				&& (currentDate.getTime() - lastDate.getTime()) <= MSG_INTE) {
			List<LeaveLanguage> messageList = DAOFactory
					.getLeaveLanguageDAOInstance().queryAll();
			// �������б����request��
			request.setAttribute("messageList", messageList);
			return "limitted";
		}
		lastDate = new Date();
		if (message != null) {
			message.setDateTime(mediumDateFormat.format(currentDate));
			// �������ݿ���
			DAOFactory.getLeaveLanguageDAOInstance().insert(message);
		}
		// ����������Ե��б�
		List<LeaveLanguage> messageList = DAOFactory
				.getLeaveLanguageDAOInstance().queryAll();
		// �������б����request��
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
	 * ����Ա��������
	 *  */
	public String add() throws Exception {
		// request����
		HttpServletRequest request = (HttpServletRequest) ActionContext
				.getContext().get(ServletActionContext.HTTP_REQUEST);
		String message = "��ӳɹ�!";
		// ʱ���ʽ
		DateFormat mediumDateFormat = DateFormat.getDateTimeInstance(
				DateFormat.MEDIUM, DateFormat.MEDIUM);
		// ��ǰʱ��
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
	 * �鿴��������
	 *  */
	public String viewAll() throws Exception {
		// request����
		HttpServletRequest request = (HttpServletRequest) ActionContext
				.getContext().get(ServletActionContext.HTTP_REQUEST);
		List<LeaveLanguage> list = DAOFactory.getLeaveLanguageDAOInstance()
				.queryAll();
		request.setAttribute("leaveMessageList", list);
		return SUCCESS;
	}

	/** 
	 * ɾ������
	 *  */
	public String delete() throws Exception {
		// request����
		HttpServletRequest request = (HttpServletRequest) ActionContext
				.getContext().get(ServletActionContext.HTTP_REQUEST);
		// �������id
		String leaveLanguageId = request.getParameter("leaveLanguageId");
		// ɾ��
		DAOFactory.getLeaveLanguageDAOInstance().delete(leaveLanguageId);
		List<LeaveLanguage> list = DAOFactory.getLeaveLanguageDAOInstance()
				.queryAll();
		request.setAttribute("leaveMessageList", list);
		return SUCCESS;
	}

	/** 
	 * ��ѯ����
	 *  */
	public String query() throws Exception {
		// request����
		HttpServletRequest request = (HttpServletRequest) ActionContext
				.getContext().get(ServletActionContext.HTTP_REQUEST);
		// ����û���
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
