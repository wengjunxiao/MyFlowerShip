package com.flowerShop.DAO;

import com.flowerShop.domain.Goods;
import java.util.*;

/**
 * 商品DAO类增删改、查询等函数接口
 */
public interface GoodsDAO {
	// 增加
	public void insert(Goods goods);
	// 修改
	public void update(Goods goods);
	// 删除
	public void delete(String id);
	// 按id查询
	public Goods queryById(String id);
	// 按名称查询
	public Goods queryByName(String name);
	// 查询全部
	public List<Goods>queryAll();
}
