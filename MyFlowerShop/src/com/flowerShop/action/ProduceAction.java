package com.flowerShop.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.flowerShop.DAO.DAOFactory;
import com.flowerShop.domain.Produce;
import com.flowerShop.domain.ProduceDetails;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 处理对厂商信息得查询、删除、增加等操作
 */
public class ProduceAction extends ActionSupport {
	private Produce produce;
	/**
	 * 增加厂商
	 * */
	public String add() throws Exception{
		// request对象
		HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		Produce existproduce = DAOFactory.getProduceDAOInstance().queryByName(produce.getProduceName());
		String message = null;
		if (existproduce != null){
			message = "厂商已经存在!";
			request.setAttribute("Msg", message);
		}
		message = "添加成功";
		DAOFactory.getProduceDAOInstance().insert(produce);
		request.setAttribute("Msg", message);
		return SUCCESS;
	}
	public void setProduce(Produce produce) {
		this.produce = produce;
	}
	public Produce getProduce() {
		return produce;
	}
	/**
	 * 厂商全部信息
	 * */
	public String viewAll() throws Exception{
		// request对象
		HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		List<Produce> list = DAOFactory.getProduceDAOInstance().queryAll();
		request.setAttribute("produceList", list);
		return SUCCESS;
	}
	/**
	 * 删除厂商
	 * */
	public String delete() throws Exception{
		// request对象
		HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		// 获得id
		String produceId = request.getParameter("produceId");
		// 删除
		DAOFactory.getProduceDAOInstance().delete(produceId);
		DAOFactory.getProduceDetailsDAOInstance().delete(produceId);
		List<Produce> list = DAOFactory.getProduceDAOInstance().queryAll();
		request.setAttribute("produceList", list);
		return SUCCESS;
	}
	/**
	 * 查询厂商
	 * */
	public String query() throws Exception{
		// request对象
		HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		// 获得厂商编号或名称
		String produceId = request.getParameter("queryId");
		String produceName = request.getParameter("queryName");
		List<Produce> produceList = DAOFactory.getProduceDAOInstance().queryAll();
		List<Produce> list = new ArrayList<Produce>();
		for (int i = 0; i < produceList.size(); ++i){
			Produce produce = produceList.get(i);
			if (produceId != null && Integer.toString(produce.getProduceId()).contains(produceId)){
				list.add(produce);
			} else if (produceName != null && produce.getProduceName().contains(produceName)){
				list.add(produce);
			}
		}
		request.setAttribute("produceList", list);
		return SUCCESS;
	}
	/**
	 * 厂商详细信息
	 * */
	public String detail() throws Exception{
		// 获得request对象
		HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		// 获取参数
		String produceId = request.getParameter("produceId");
		// 根据goodId查询厂商详细信息
		ProduceDetails produceDetail = DAOFactory.getProduceDetailsDAOInstance().queryById(produceId);
		// 设置到request属性中
		request.setAttribute("produceDetail", produceDetail);
		return SUCCESS;
	}
	public String info() throws Exception{
		// 获取request对象
		HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		// 存放所有厂商信息的列表
		List<Produce> produceList = DAOFactory.getProduceDAOInstance().queryAll();
		// 设置到request属性中
		request.setAttribute("produceList", produceList);
		return SUCCESS;
	}
}
