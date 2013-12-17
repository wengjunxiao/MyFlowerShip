package com.flowerShop.DAO;

/**
 * DAO������
 * */
public class DAOFactory {
	/**
	 * ��ù���ԱDAO
	 * */
	public static AdminDAO getAdminDAOInstance(){
		return new AdminDAOImpl();
	}
	/**
	 * ��û���DAO
	 * */
	public static GoodsDAO getGoodsDAOInstance(){
		return new GoodsDAOImpl();
	}
	/**
	 * �������DAO
	 * */
	public static LeaveLanguageDAO getLeaveLanguageDAOInstance(){
		return new LeaveLanguageDAOImpl();
	}
	/**
	 * ��ö���DAO
	 * */
	public static OrdersDAO getOrdersDAOInstance(){
		return new OrdersDAOImpl();
	}
	/**
	 * ��ö�����ϸDAO
	 * */
	public static OrdersDetailsDAO getOrdersDetailsDAOInstance(){
		return new OrdersDetailsDAOImpl();
	}
	/**
	 * ��ó���DAO
	 * */
	public static ProduceDAO getProduceDAOInstance(){
		return new ProduceDAOImpl();
	}
	/**
	 * ��ó�������DAO
	 * */
	public static ProduceDetailsDAO getProduceDetailsDAOInstance(){
		return new ProduceDetailsDAOImpl();
	}
	/**
	 * �����־DAO
	 * */
	public static SafeLogDAO getSafeLogDAOInstance(){
		return new SafeLogDAOImpl();
	}
	/**
	 * ��÷���DAO
	 * */
	public static SortDAO getSortDAOInstance(){
		return new SortDAOImpl();
	}
	/**
	 * ����û�DAO
	 * */
	public static UserDAO getUserDAOInstance(){
		return new UserDAOImpl();
	}
}
