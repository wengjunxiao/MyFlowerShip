package com.flowerShop.action;


import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.flowerShop.DAO.DAOFactory;
import com.flowerShop.domain.Goods;
import com.flowerShop.domain.Sort;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 处理对购物车进行添加、删除等操作
 */
public class GoodAction extends ActionSupport {
	private Goods good;

	/** 
	 * 添加货物 
	 * */
	public String addGood() throws Exception {
		// request对象
		HttpServletRequest request = (HttpServletRequest) ActionContext
				.getContext().get(ServletActionContext.HTTP_REQUEST);
		Goods existGood = DAOFactory.getGoodsDAOInstance().queryByName(
				good.getGoodsName());
		String message = null;
		if (existGood != null) {
			message = "货物名已经存在!";
			request.setAttribute("Msg", message);
			request.setAttribute("goodInfo", good);
			return ERROR;
		}
		message = "添加成功!";
		DAOFactory.getGoodsDAOInstance().insert(good);
		request.setAttribute("Msg", message);
		return SUCCESS;
	}

	public Goods getGood() {
		return good;
	}

	public void setGood(Goods good) {
		this.good = good;
	}

	/** 
	 * 查看所有货物
	 *  */
	public String viewAll() throws Exception {
		// request对象
		HttpServletRequest request = (HttpServletRequest) ActionContext
				.getContext().get(ServletActionContext.HTTP_REQUEST);
		List<Goods> goodList = DAOFactory.getGoodsDAOInstance().queryAll();
		request.setAttribute("goodList", goodList);
		return SUCCESS;
	}

	/** 
	 * 查询货物 
	 * */
	public String query() throws Exception {
		// request对象
		HttpServletRequest request = (HttpServletRequest) ActionContext
				.getContext().get(ServletActionContext.HTTP_REQUEST);
		// 获得商品号、商品名或价格
		String goodId = request.getParameter("queryId");
		String goodName = request.getParameter("queryName");
		String goodPrice = request.getParameter("queryPrice");
		List<Goods> goodList = DAOFactory.getGoodsDAOInstance().queryAll();
		List<Goods> list = new ArrayList<Goods>();
		for (int i = 0; i < goodList.size(); ++i) {
			Goods good = goodList.get(i);
			if (goodId != null
					&& Integer.toString(good.getGoodsId()).contains(goodId)) {
				list.add(good);
			} else if (goodName != null
					&& good.getGoodsName().contains(goodName)) {
				list.add(good);
			} else if (goodPrice != null
					&& Float.toString(good.getGoodsPrice()).contains(goodPrice)) {
				list.add(good);
			}
		}
		request.setAttribute("goodList", list);
		return SUCCESS;
	}

	/**
	 *  删除货物
	 *   */
	public String delete() throws Exception {
		// request对象
		HttpServletRequest request = (HttpServletRequest) ActionContext
				.getContext().get(ServletActionContext.HTTP_REQUEST);
		// 获取货物Id
		String goodsId = request.getParameter("goodsId");
		DAOFactory.getGoodsDAOInstance().delete(goodsId);
		List<Goods> list = DAOFactory.getGoodsDAOInstance().queryAll();
		request.setAttribute("goodList", list);
		return SUCCESS;
	}

	private Sort sort;

	/** 
	 * 增加类别
	 *  */
	public String addSort() throws Exception {
		// request对象
		HttpServletRequest request = (HttpServletRequest) ActionContext
				.getContext().get(ServletActionContext.HTTP_REQUEST);
		Sort existSort = DAOFactory.getSortDAOInstance().queryByName(
				sort.getSortName());
		String message = null;
		if (existSort != null) {
			message = "类别名称已经存在!";
			request.setAttribute("Msg", message);
			//request.setAttribute("sortInfo", sort2);
			return ERROR;
		}
		message = "添加成功!";
		// 写入数据库
		DAOFactory.getSortDAOInstance().insert(sort);
		request.setAttribute("Msg", message);
		return SUCCESS;
	}

	public void setSort(Sort sort) {
		this.sort = sort;
	}

	public Sort getSort() {
		return sort;
	}

	private Goods goods = null;

	public String detail() throws Exception {
		HttpServletRequest request = (HttpServletRequest) ActionContext
				.getContext().get(ServletActionContext.HTTP_REQUEST);
		String goodsId = request.getParameter("goodsId");
		goods = DAOFactory.getGoodsDAOInstance().queryById(goodsId);
		request.setAttribute("goodsClass", goods);
		return SUCCESS;
	}

	/** 
	 * 从购物车中删除
	 *  */
	public String deleteGood() throws Exception {
		HttpServletRequest request = (HttpServletRequest) ActionContext
				.getContext().get(ServletActionContext.HTTP_REQUEST);
		List<Goods> goodsList = (List<Goods>) request.getSession()
				.getAttribute("myGoods");
		Enumeration e = request.getParameterNames();
		while (e.hasMoreElements()) {
			String paramName = (String) e.nextElement();
			String goodsId = request.getParameter(paramName);
			for (int i = 0; i < goodsList.size(); ++i) {
				if (Integer.parseInt(goodsId) == (goodsList.get(i).getGoodsId())) {
					goodsList.remove(i);
				}
			}
		}
		request.getSession().setAttribute("myGoods", goodsList);
		return SUCCESS;
	}

	/** 
	 * 购物车 
	 * */
	public String cart() throws Exception {
		HttpServletRequest request = (HttpServletRequest) ActionContext
				.getContext().get(ServletActionContext.HTTP_REQUEST);
		String userName = (String) request.getSession().getAttribute(
				"loginUser");
		List<Goods> goodsList = (List<Goods>) request.getSession()
				.getAttribute("myGoods");
		if (goodsList == null) {
			goodsList = new ArrayList<Goods>();
		}
		String goodsId = request.getParameter("goodsId");
		Goods good = DAOFactory.getGoodsDAOInstance().queryById(goodsId);
		goodsList.add(good);
		request.getSession().setAttribute("myGoods", goodsList);
		return SUCCESS;
	}
}
