package com.flowerShop.DAO;

import com.flowerShop.domain.Goods;
import java.util.*;

/**
 * ��ƷDAO����ɾ�ġ���ѯ�Ⱥ����ӿ�
 */
public interface GoodsDAO {
	// ����
	public void insert(Goods goods);
	// �޸�
	public void update(Goods goods);
	// ɾ��
	public void delete(String id);
	// ��id��ѯ
	public Goods queryById(String id);
	// �����Ʋ�ѯ
	public Goods queryByName(String name);
	// ��ѯȫ��
	public List<Goods>queryAll();
}
