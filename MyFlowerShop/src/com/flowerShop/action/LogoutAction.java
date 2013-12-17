package com.flowerShop.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * �����û��͹���Ա���˳�
 */
public class LogoutAction extends ActionSupport {
	/**
	 * �û��˳�
	 */
	public String userLogout() throws Exception{
		// ���request����
		HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		// ���ٻỰ
		request.getSession().invalidate();
		return SUCCESS;
	}
	
	/**
	 * ����Ա�˳�
	 */
	public String adminLogout() throws Exception{
		HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		request.getSession().invalidate();
		return SUCCESS;
	}
}
