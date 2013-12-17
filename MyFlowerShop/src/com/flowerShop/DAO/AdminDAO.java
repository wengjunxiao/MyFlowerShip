package com.flowerShop.DAO;
import java.util.List;

import com.flowerShop.domain.*;

/**
 * ����ԱDAO����ɾ�ġ���ѯ�Ⱥ����ӿ�
 */
public interface AdminDAO {
	// ����
	public void insert(Admin admin);
	// �޸�
	public void update(Admin admin);
	// ɾ��
	public void delete(String id);
	// ������Ա��Ų�ѯ
	public Admin queryById(String id);
	// ���������Ʋ�ѯ
	public Admin queryByName(String name);
	// ��ѯȫ��
	public List<Admin>queryAll();
}
