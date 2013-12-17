package com.flowerShop.DAO;

import java.util.List;

import com.flowerShop.domain.Sort;

/**
 * ��������DAO����ɾ�ġ���ѯ�Ⱥ����ӿ�
 */
public interface SortDAO {
	// ����
	public void insert(Sort sort);
	// �޸�
	public void update(Sort sort);
	// ɾ��
	public void delete(String id);
	// ��id��ѯ
	public Sort queryById(String id);
	// �����Ʋ�ѯ
	public Sort queryByName(String name);
	// ��ѯȫ��
	public List<Sort> queryAll();
}
