package com.flowerShop.DAO;

import com.flowerShop.domain.SafeLog;
import java.util.*;

/**
 * 登录日志信息DAO类增删改、查询等函数接口
 */
public interface SafeLogDAO {
	// 增加
	public void insert(SafeLog safeLog);
	// 修改
	public void update(SafeLog safeLog);
	// 删除
	public void delete(String id);
	// 按id查询
	public SafeLog queryById(String id);
	// 查询全部
	public List<SafeLog> queryAll();
}
