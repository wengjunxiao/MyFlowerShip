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
 * ����Գ�����Ϣ�ò�ѯ��ɾ�������ӵȲ���
 */
public class ProduceAction extends ActionSupport {
	private Produce produce;
	/**
	 * ���ӳ���
	 * */
	public String add() throws Exception{
		// request����
		HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		Produce existproduce = DAOFactory.getProduceDAOInstance().queryByName(produce.getProduceName());
		String message = null;
		if (existproduce != null){
			message = "�����Ѿ�����!";
			request.setAttribute("Msg", message);
		}
		message = "��ӳɹ�";
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
	 * ����ȫ����Ϣ
	 * */
	public String viewAll() throws Exception{
		// request����
		HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		List<Produce> list = DAOFactory.getProduceDAOInstance().queryAll();
		request.setAttribute("produceList", list);
		return SUCCESS;
	}
	/**
	 * ɾ������
	 * */
	public String delete() throws Exception{
		// request����
		HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		// ���id
		String produceId = request.getParameter("produceId");
		// ɾ��
		DAOFactory.getProduceDAOInstance().delete(produceId);
		DAOFactory.getProduceDetailsDAOInstance().delete(produceId);
		List<Produce> list = DAOFactory.getProduceDAOInstance().queryAll();
		request.setAttribute("produceList", list);
		return SUCCESS;
	}
	/**
	 * ��ѯ����
	 * */
	public String query() throws Exception{
		// request����
		HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		// ��ó��̱�Ż�����
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
	 * ������ϸ��Ϣ
	 * */
	public String detail() throws Exception{
		// ���request����
		HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		// ��ȡ����
		String produceId = request.getParameter("produceId");
		// ����goodId��ѯ������ϸ��Ϣ
		ProduceDetails produceDetail = DAOFactory.getProduceDetailsDAOInstance().queryById(produceId);
		// ���õ�request������
		request.setAttribute("produceDetail", produceDetail);
		return SUCCESS;
	}
	public String info() throws Exception{
		// ��ȡrequest����
		HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		// ������г�����Ϣ���б�
		List<Produce> produceList = DAOFactory.getProduceDAOInstance().queryAll();
		// ���õ�request������
		request.setAttribute("produceList", produceList);
		return SUCCESS;
	}
}
