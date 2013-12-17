package com.flowerShop.DAO;
import java.util.List;

import com.flowerShop.domain.*;

/**
 * 订单详细信息DAO类增删改、查询等函数接口
 */
public interface OrdersDetailsDAO {
	// 增加
	public void insert(OrdersDetails ordersDetails);
	// 修改
	public void update(OrdersDetails ordersDetails);
	// 删除
	public void delete(String id);
	// 按id查询
	public OrdersDetails queryById(String id);
	// 查询全部
	public List<OrdersDetails> queryAll();
}
