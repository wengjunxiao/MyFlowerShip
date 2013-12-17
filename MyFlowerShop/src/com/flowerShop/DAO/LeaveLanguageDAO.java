package com.flowerShop.DAO;

import java.util.List;

import com.flowerShop.domain.LeaveLanguage;

/**
 * ����DAO����ɾ�ġ���ѯ�Ⱥ����ӿ�
 */
public interface LeaveLanguageDAO {
	// ����
	public void insert(LeaveLanguage leaveLanguage);
	// �޸�
	public void update(LeaveLanguage leaveLanguage);
	// ɾ��
	public void delete(String id);
	// ��id��ѯ
	public LeaveLanguage queryById(String id);
	// �����ֲ�ѯ
	public LeaveLanguage queryByName(String name);
	// ��ѯȫ��
	public List<LeaveLanguage> queryAll();
}
