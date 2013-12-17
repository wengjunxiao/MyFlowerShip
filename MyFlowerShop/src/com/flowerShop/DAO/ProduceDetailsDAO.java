package com.flowerShop.DAO;

import java.util.List;

import com.flowerShop.domain.ProduceDetails;

/**
 * 厂商详情信息DAO类增删改、查询等函数接口
 */
public interface ProduceDetailsDAO {
	// 增加
	public void insert(ProduceDetails produceDetails);
	// 修改
	public void update(ProduceDetails produceDetails);
	// 删除
	public void delete(String id);
	// 按id查询
	public ProduceDetails queryById(String id);
	// 查询全部
	public List<ProduceDetails> queryAll();
}
