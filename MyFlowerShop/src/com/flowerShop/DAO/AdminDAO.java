package com.flowerShop.DAO;
import java.util.List;

import com.flowerShop.domain.*;

/**
 * 管理员DAO类增删改、查询等函数接口
 */
public interface AdminDAO {
	// 增加
	public void insert(Admin admin);
	// 修改
	public void update(Admin admin);
	// 删除
	public void delete(String id);
	// 按管理员编号查询
	public Admin queryById(String id);
	// 按管理名称查询
	public Admin queryByName(String name);
	// 查询全部
	public List<Admin>queryAll();
}
