package com.flowerShop.DAO;

import java.util.List;

import com.flowerShop.domain.User;

/**
 *�û�DAO����ɾ�ġ���ѯ�Ⱥ����ӿ�
 */
public interface UserDAO {
	// ����
	public void insert(User user);
	// �޸�
	public void update(User user);
	// ɾ��
	public void delete(String id);
	// ��id��ѯ
	public User queryById(String id);
	// ���û�����ѯ
	public User queryByName(String name);
	// ��ѯȫ��
	public List<User> queryAll();
}
