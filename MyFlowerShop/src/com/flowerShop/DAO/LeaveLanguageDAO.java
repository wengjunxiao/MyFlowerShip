package com.flowerShop.DAO;

import java.util.List;

import com.flowerShop.domain.LeaveLanguage;

/**
 * 留言DAO类增删改、查询等函数接口
 */
public interface LeaveLanguageDAO {
	// 增加
	public void insert(LeaveLanguage leaveLanguage);
	// 修改
	public void update(LeaveLanguage leaveLanguage);
	// 删除
	public void delete(String id);
	// 按id查询
	public LeaveLanguage queryById(String id);
	// 按名字查询
	public LeaveLanguage queryByName(String name);
	// 查询全部
	public List<LeaveLanguage> queryAll();
}
