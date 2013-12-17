package com.flowerShop.DAO;

import java.util.List;

import com.flowerShop.domain.User;

/**
 *用户DAO类增删改、查询等函数接口
 */
public interface UserDAO {
	// 增加
	public void insert(User user);
	// 修改
	public void update(User user);
	// 删除
	public void delete(String id);
	// 按id查询
	public User queryById(String id);
	// 按用户名查询
	public User queryByName(String name);
	// 查询全部
	public List<User> queryAll();
}
