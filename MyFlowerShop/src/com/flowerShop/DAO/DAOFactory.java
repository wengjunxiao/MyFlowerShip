package com.flowerShop.DAO;

/**
 * DAO工厂类
 * */
public class DAOFactory {
	/**
	 * 获得管理员DAO
	 * */
	public static AdminDAO getAdminDAOInstance(){
		return new AdminDAOImpl();
	}
	/**
	 * 获得货物DAO
	 * */
	public static GoodsDAO getGoodsDAOInstance(){
		return new GoodsDAOImpl();
	}
	/**
	 * 获得留言DAO
	 * */
	public static LeaveLanguageDAO getLeaveLanguageDAOInstance(){
		return new LeaveLanguageDAOImpl();
	}
	/**
	 * 获得订单DAO
	 * */
	public static OrdersDAO getOrdersDAOInstance(){
		return new OrdersDAOImpl();
	}
	/**
	 * 获得订单详细DAO
	 * */
	public static OrdersDetailsDAO getOrdersDetailsDAOInstance(){
		return new OrdersDetailsDAOImpl();
	}
	/**
	 * 获得厂商DAO
	 * */
	public static ProduceDAO getProduceDAOInstance(){
		return new ProduceDAOImpl();
	}
	/**
	 * 获得厂商详情DAO
	 * */
	public static ProduceDetailsDAO getProduceDetailsDAOInstance(){
		return new ProduceDetailsDAOImpl();
	}
	/**
	 * 获得日志DAO
	 * */
	public static SafeLogDAO getSafeLogDAOInstance(){
		return new SafeLogDAOImpl();
	}
	/**
	 * 获得分类DAO
	 * */
	public static SortDAO getSortDAOInstance(){
		return new SortDAOImpl();
	}
	/**
	 * 获得用户DAO
	 * */
	public static UserDAO getUserDAOInstance(){
		return new UserDAOImpl();
	}
}
