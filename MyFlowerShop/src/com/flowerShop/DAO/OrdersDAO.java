package com.flowerShop.DAO;

import java.util.List;

import com.flowerShop.domain.Orders;
import com.flowerShop.domain.OrdersDetails;

/**
 * ����DAO����ɾ�ġ���ѯ�Ⱥ����ӿ�
 */
public interface OrdersDAO {
	// ����
	public void insert(Orders orders);
	// �޸�
	public void update(Orders orders);
	// ɾ��
	public void delete(String id);
	// ��id��ѯ
	public Orders queryById(String id);
	// ��ʱ���ѯ
	public Orders queryByDate(String date);
	// ��ѯȫ��
	public List<Orders> queryAll();
}
