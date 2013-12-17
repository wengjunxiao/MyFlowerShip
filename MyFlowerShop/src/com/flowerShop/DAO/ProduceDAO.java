package com.flowerShop.DAO;

import java.util.List;

import com.flowerShop.domain.Produce;

/**
 * 厂商信息DAO类增删改、查询等函数接口
 */
public interface ProduceDAO {
	// 增加
	public void insert(Produce produce);
	// 修改
	public void update(Produce produce);
	// 删除
	public void delete(String id);
	// 按id查询
	public Produce queryById(String id);
	// 按名称查询
	public Produce queryByName(String name);
	// 查询全部
	public List<Produce> queryAll();
}
