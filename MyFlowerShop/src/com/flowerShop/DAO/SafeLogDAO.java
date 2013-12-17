package com.flowerShop.DAO;

import com.flowerShop.domain.SafeLog;
import java.util.*;

/**
 * ��¼��־��ϢDAO����ɾ�ġ���ѯ�Ⱥ����ӿ�
 */
public interface SafeLogDAO {
	// ����
	public void insert(SafeLog safeLog);
	// �޸�
	public void update(SafeLog safeLog);
	// ɾ��
	public void delete(String id);
	// ��id��ѯ
	public SafeLog queryById(String id);
	// ��ѯȫ��
	public List<SafeLog> queryAll();
}
