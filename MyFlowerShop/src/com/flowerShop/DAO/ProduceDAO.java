package com.flowerShop.DAO;

import java.util.List;

import com.flowerShop.domain.Produce;

/**
 * ������ϢDAO����ɾ�ġ���ѯ�Ⱥ����ӿ�
 */
public interface ProduceDAO {
	// ����
	public void insert(Produce produce);
	// �޸�
	public void update(Produce produce);
	// ɾ��
	public void delete(String id);
	// ��id��ѯ
	public Produce queryById(String id);
	// �����Ʋ�ѯ
	public Produce queryByName(String name);
	// ��ѯȫ��
	public List<Produce> queryAll();
}
