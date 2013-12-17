package com.flowerShop.DAO;

import java.util.List;

import com.flowerShop.domain.ProduceDetails;

/**
 * ����������ϢDAO����ɾ�ġ���ѯ�Ⱥ����ӿ�
 */
public interface ProduceDetailsDAO {
	// ����
	public void insert(ProduceDetails produceDetails);
	// �޸�
	public void update(ProduceDetails produceDetails);
	// ɾ��
	public void delete(String id);
	// ��id��ѯ
	public ProduceDetails queryById(String id);
	// ��ѯȫ��
	public List<ProduceDetails> queryAll();
}
