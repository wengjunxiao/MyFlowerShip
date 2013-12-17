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
 * 处理对账单的增加、查看、生成订单等操作
 */
public class OrderAction extends ActionSupport {
	private Orders order;

	/** 
	 * 增加账单
	 *  */
	public String add() throws Exception {
		// request对象
		HttpServletRequest request = (HttpServletRequest) ActionContext
				.getContext().get(ServletActionContext.HTTP_REQUEST);
		Orders existOrder = DAOFactory.getOrdersDAOInstance().queryById(
				Integer.toString(order.getOrdersId()));
		String message = null;
		// 订单已经存在了
		if (existOrder != null) {
			message = "订单已经存在了!";
			request.setAttribute("orderInfo", order);
			request.setAttribute("Msg", message);
			return ERROR;
		}
		message = "添加成功!";
		// 时间格式
		DateFormat mediumDateFormat = DateFormat.getDateTimeInstance(
				DateFormat.MEDIUM, DateFormat.MEDIUM);
		// 当前时间
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
	 * 删除账单
	 *  */
	public String delete() throws Exception {
		// request对象
		HttpServletRequest request = (HttpServletRequest) ActionContext
				.getContext().get(ServletActionContext.HTTP_REQUEST);
		// 获得订单id
		String orderId = (String) request.getParameter("orderId");
		// 根据用户id删除
		DAOFactory.getOrdersDAOInstance().delete(orderId);
		List<Orders> orderList = DAOFactory.getOrdersDAOInstance().queryAll();
		request.setAttribute("orderList", orderList);
		return SUCCESS;
	}

	/** 
	 * 查询账单 
	 * */
	public String query() throws Exception {
		// 获得request对象
		HttpServletRequest request = (HttpServletRequest) ActionContext
				.getContext().get(ServletActionContext.HTTP_REQUEST);
		// 获得订单编号或者用户名
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
	 * 查看所有订单
	 *  */
	public String viewAll() throws Exception {
		// request
		HttpServletRequest request = (HttpServletRequest) ActionContext
				.getContext().get(ServletActionContext.HTTP_REQUEST);
		// 订单列表
		List<Orders> orderList = DAOFactory.getOrdersDAOInstance().queryAll();
		request.setAttribute("orderList", orderList);
		return SUCCESS;
	}

	/** 
	 * 查看历史订单
	 *  */
	public String history() throws Exception {
		HttpServletRequest request = (HttpServletRequest) ActionContext
				.getContext().get(ServletActionContext.HTTP_REQUEST);
		// 获得用户名
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
	 * 历史订单详细信息 
	 * */
	public String historyDetail() throws Exception {
		HttpServletRequest request = (HttpServletRequest) ActionContext
				.getContext().get(ServletActionContext.HTTP_REQUEST);
		// 获得订单号
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
	 * 生成订单 
	 * */
	public String generate() throws Exception {
		// 获得request对象
		HttpServletRequest request = (HttpServletRequest) ActionContext
				.getContext().get(ServletActionContext.HTTP_REQUEST);
		// 判断用户是否登录
		String userName = (String) request.getSession().getAttribute(
				"loginUser");
		if (userName == null) {
			request.setAttribute("loginMessage", "您还未登录,不能下单!");
			return ERROR;
		}
		// 获得购物车中的商品列表
		List<Goods> goodsList = (List<Goods>) request.getSession()
				.getAttribute("myGoods");
		// 循环为每个商品计算价格
		float total = 0;
		for (int i = 0; i < goodsList.size(); ++i) {
			// 获得货物id
			String goodsId = Integer.toString(goodsList.get(i).getGoodsId());
			// 获得货物数量
			int amount = Integer.parseInt(request.getParameter(goodsId));
			// 获得货物单价
			float price = goodsList.get(i).getGoodsPrice();
			// 计算总价
			total += amount * price;
		}
		// 生成订单，保存到数据库中
		Orders order = new Orders();
		// 已登录的用户名
		String usersName = (String) request.getSession().getAttribute(
				"loginUser");
		order.setUsersName(usersName);
		order.setOrdersPrice(total);
		// 时间格式
		DateFormat mediumDateFormat = DateFormat.getDateTimeInstance(
				DateFormat.MEDIUM, DateFormat.MEDIUM);
		// 当前时间
		Date currentDate = new Date();
		order.setOrdersDatetime(mediumDateFormat.format(currentDate));
		// 保存到数据库
		DAOFactory.getOrdersDAOInstance().insert(order);

		// 获得订单编号(按时间查询)
		Orders ordr = DAOFactory.getOrdersDAOInstance().queryByDate(
				mediumDateFormat.format(currentDate));
		int ordersId = ordr.getOrdersId();
		for (int i = 0; i < goodsList.size(); ++i) {
			// 获得货物id
			String goodsId = Integer.toString(goodsList.get(i).getGoodsId());
			// 获得货物数量
			int amount = Integer.parseInt(request.getParameter(goodsId));
			// 获得货物单价
			float price = goodsList.get(i).getGoodsPrice();
			String goodsName = goodsList.get(i).getGoodsName();
			OrdersDetails detial = new OrdersDetails();
			detial.setGoodsCount(amount);
			detial.setGoodsName(goodsName);
			detial.setGoodsPrice(price);
			detial.setOrdersId(ordersId);
			// 写入数据库中
			DAOFactory.getOrdersDetailsDAOInstance().insert(detial);
		}
		order.setOrdersId(ordersId);
		// 将订保存到session中
		request.getSession().setAttribute("order", order);
		// 将购物车清空
		request.getSession().removeAttribute("myGoods");
		return SUCCESS;
	}
}
