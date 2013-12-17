package com.flowerShop.DAO;

import java.util.List;

import com.flowerShop.domain.Orders;
import com.flowerShop.domain.OrdersDetails;

/**
 * 订单DAO类增删改、查询等函数接口
 */
public interface OrdersDAO {
	// 增加
	public void insert(Orders orders);
	// 修改
	public void update(Orders orders);
	// 删除
	public void delete(String id);
	// 按id查询
	public Orders queryById(String id);
	// 按时间查询
	public Orders queryByDate(String date);
	// 查询全部
	public List<Orders> queryAll();
}
