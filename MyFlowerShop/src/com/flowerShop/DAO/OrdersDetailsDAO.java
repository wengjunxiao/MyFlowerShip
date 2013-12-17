package com.flowerShop.DAO;
import java.util.List;

import com.flowerShop.domain.*;

/**
 * ������ϸ��ϢDAO����ɾ�ġ���ѯ�Ⱥ����ӿ�
 */
public interface OrdersDetailsDAO {
	// ����
	public void insert(OrdersDetails ordersDetails);
	// �޸�
	public void update(OrdersDetails ordersDetails);
	// ɾ��
	public void delete(String id);
	// ��id��ѯ
	public OrdersDetails queryById(String id);
	// ��ѯȫ��
	public List<OrdersDetails> queryAll();
}
