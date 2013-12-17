package com.flowerShop.DAO;

import java.util.List;

import com.flowerShop.domain.Sort;

/**
 * 分类排序DAO类增删改、查询等函数接口
 */
public interface SortDAO {
	// 增加
	public void insert(Sort sort);
	// 修改
	public void update(Sort sort);
	// 删除
	public void delete(String id);
	// 按id查询
	public Sort queryById(String id);
	// 按名称查询
	public Sort queryByName(String name);
	// 查询全部
	public List<Sort> queryAll();
}
