package com.flowerShop.action;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.flowerShop.DAO.DAOFactory;
import com.flowerShop.domain.Goods;
import com.flowerShop.domain.Orders;
import com.flowerShop.domain.OrdersDetails;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * ������˵������ӡ��鿴�����ɶ����Ȳ���
 */
public class OrderAction extends ActionSupport {
	private Orders order;

	/** 
	 * �����˵�
	 *  */
	public String add() throws Exception {
		// request����
		HttpServletRequest request = (HttpServletRequest) ActionContext
				.getContext().get(ServletActionContext.HTTP_REQUEST);
		Orders existOrder = DAOFactory.getOrdersDAOInstance().queryById(
				Integer.toString(order.getOrdersId()));
		String message = null;
		// �����Ѿ�������
		if (existOrder != null) {
			message = "�����Ѿ�������!";
			request.setAttribute("orderInfo", order);
			request.setAttribute("Msg", message);
			return ERROR;
		}
		message = "��ӳɹ�!";
		// ʱ���ʽ
		DateFormat mediumDateFormat = DateFormat.getDateTimeInstance(
				DateFormat.MEDIUM, DateFormat.MEDIUM);
		// ��ǰʱ��
		Date currentDate = new Date();
		order.setOrdersDatetime(mediumDateFormat.format(currentDate));
		DAOFactory.getOrdersDAOInstance().insert(order);
		request.setAttribute("Msg", message);
		return SUCCESS;
	}

	public void setOrder(Orders order) {
		this.order = order;
	}

	public Orders getOrder() {
		return order;
	}

	/** 
	 * ɾ���˵�
	 *  */
	public String delete() throws Exception {
		// request����
		HttpServletRequest request = (HttpServletRequest) ActionContext
				.getContext().get(ServletActionContext.HTTP_REQUEST);
		// ��ö���id
		String orderId = (String) request.getParameter("orderId");
		// �����û�idɾ��
		DAOFactory.getOrdersDAOInstance().delete(orderId);
		List<Orders> orderList = DAOFactory.getOrdersDAOInstance().queryAll();
		request.setAttribute("orderList", orderList);
		return SUCCESS;
	}

	/** 
	 * ��ѯ�˵� 
	 * */
	public String query() throws Exception {
		// ���request����
		HttpServletRequest request = (HttpServletRequest) ActionContext
				.getContext().get(ServletActionContext.HTTP_REQUEST);
		// ��ö�����Ż����û���
		String orderId = request.getParameter("queryId");
		String userName = request.getParameter("queryName");
		List<Orders> orderList = DAOFactory.getOrdersDAOInstance().queryAll();
		List<Orders> list = new ArrayList<Orders>();
		for (int i = 0; i < orderList.size(); ++i) {
			Orders order = orderList.get(i);
			if (orderId != null
					&& Integer.toString(order.getOrdersId()).contains(orderId)) {
				list.add(order);
			} else if (userName != null
					&& order.getUsersName().contains(userName)) {
				list.add(order);
			}
		}
		request.setAttribute("orderList", list);
		return SUCCESS;
	}

	/** 
	 * �鿴���ж���
	 *  */
	public String viewAll() throws Exception {
		// request
		HttpServletRequest request = (HttpServletRequest) ActionContext
				.getContext().get(ServletActionContext.HTTP_REQUEST);
		// �����б�
		List<Orders> orderList = DAOFactory.getOrdersDAOInstance().queryAll();
		request.setAttribute("orderList", orderList);
		return SUCCESS;
	}

	/** 
	 * �鿴��ʷ����
	 *  */
	public String history() throws Exception {
		HttpServletRequest request = (HttpServletRequest) ActionContext
				.getContext().get(ServletActionContext.HTTP_REQUEST);
		// ����û���
		String userName = request.getParameter("userName");
		List<Orders> orderList = DAOFactory.getOrdersDAOInstance().queryAll();
		List<Orders> list = new ArrayList<Orders>();
		for (int i = 0; i < orderList.size(); ++i) {
			Orders order = orderList.get(i);
			if (userName.equals(order.getUsersName())) {
				list.add(order);
			}
		}
		request.setAttribute("myOrderList", list);
		return SUCCESS;
	}

	/** 
	 * ��ʷ������ϸ��Ϣ 
	 * */
	public String historyDetail() throws Exception {
		HttpServletRequest request = (HttpServletRequest) ActionContext
				.getContext().get(ServletActionContext.HTTP_REQUEST);
		// ��ö�����
		String orderId = request.getParameter("ordersId");
		List<OrdersDetails> orderList = DAOFactory
				.getOrdersDetailsDAOInstance().queryAll();
		List<OrdersDetails> list = new ArrayList<OrdersDetails>();
		for (int i = 0; i < orderList.size(); ++i) {
			OrdersDetails detail = orderList.get(i);
			if (Integer.toString(detail.getOrdersId()).equals(orderId)) {
				list.add(detail);
			}
		}
		request.setAttribute("orderDetailList", list);
		return SUCCESS;
	}

	/** 
	 * ���ɶ��� 
	 * */
	public String generate() throws Exception {
		// ���request����
		HttpServletRequest request = (HttpServletRequest) ActionContext
				.getContext().get(ServletActionContext.HTTP_REQUEST);
		// �ж��û��Ƿ��¼
		String userName = (String) request.getSession().getAttribute(
				"loginUser");
		if (userName == null) {
			request.setAttribute("loginMessage", "����δ��¼,�����µ�!");
			return ERROR;
		}
		// ��ù��ﳵ�е���Ʒ�б�
		List<Goods> goodsList = (List<Goods>) request.getSession()
				.getAttribute("myGoods");
		// ѭ��Ϊÿ����Ʒ����۸�
		float total = 0;
		for (int i = 0; i < goodsList.size(); ++i) {
			// ��û���id
			String goodsId = Integer.toString(goodsList.get(i).getGoodsId());
			// ��û�������
			int amount = Integer.parseInt(request.getParameter(goodsId));
			// ��û��ﵥ��
			float price = goodsList.get(i).getGoodsPrice();
			// �����ܼ�
			total += amount * price;
		}
		// ���ɶ��������浽���ݿ���
		Orders order = new Orders();
		// �ѵ�¼���û���
		String usersName = (String) request.getSession().getAttribute(
				"loginUser");
		order.setUsersName(usersName);
		order.setOrdersPrice(total);
		// ʱ���ʽ
		DateFormat mediumDateFormat = DateFormat.getDateTimeInstance(
				DateFormat.MEDIUM, DateFormat.MEDIUM);
		// ��ǰʱ��
		Date currentDate = new Date();
		order.setOrdersDatetime(mediumDateFormat.format(currentDate));
		// ���浽���ݿ�
		DAOFactory.getOrdersDAOInstance().insert(order);

		// ��ö������(��ʱ���ѯ)
		Orders ordr = DAOFactory.getOrdersDAOInstance().queryByDate(
				mediumDateFormat.format(currentDate));
		int ordersId = ordr.getOrdersId();
		for (int i = 0; i < goodsList.size(); ++i) {
			// ��û���id
			String goodsId = Integer.toString(goodsList.get(i).getGoodsId());
			// ��û�������
			int amount = Integer.parseInt(request.getParameter(goodsId));
			// ��û��ﵥ��
			float price = goodsList.get(i).getGoodsPrice();
			String goodsName = goodsList.get(i).getGoodsName();
			OrdersDetails detial = new OrdersDetails();
			detial.setGoodsCount(amount);
			detial.setGoodsName(goodsName);
			detial.setGoodsPrice(price);
			detial.setOrdersId(ordersId);
			// д�����ݿ���
			DAOFactory.getOrdersDetailsDAOInstance().insert(detial);
		}
		order.setOrdersId(ordersId);
		// �������浽session��
		request.getSession().setAttribute("order", order);
		// �����ﳵ���
		request.getSession().removeAttribute("myGoods");
		return SUCCESS;
	}
}
