package com.flowerShop.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.flowerShop.domain.Goods;

/**
 * 商品的DAO类实现数据库的增删改、查询等操作
 */
public class GoodsDAOImpl implements GoodsDAO{

	/**
	 * 删除信息
	 * */
	public void delete(String id) {
		String sql = "delete from goods where goodsId=?";
		PreparedStatement pstmt = null;
		DataBaseConnection dbc = null;
		try{
			dbc = new DataBaseConnection();
			Connection conn = dbc.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, Integer.parseInt(id));
			pstmt.executeUpdate();
			conn.commit();
			pstmt.close();
		} catch(Exception e){
			e.printStackTrace();
		} finally {
			dbc.close();
		}
	}
	/**
	 * 插入信息
	 * */
	public void insert(Goods goods) {
		String sql = "Insert into goods(goodsName,goodsmaterial,goodsPackage,goodsLanguage,goodsPrice,goodsCent,goodsScope,goodsPlace,goodsHabitus,sortName) values(?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement pstmt = null;
		DataBaseConnection dbc = null;
		try{
			dbc = new DataBaseConnection();
			Connection conn = dbc.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, goods.getGoodsName());
			pstmt.setString(2, goods.getGoodsmaterial());
			pstmt.setString(3, goods.getGoodsPackage());
			pstmt.setString(4, goods.getGoodsLanguage());
			pstmt.setFloat(5, goods.getGoodsPrice());
			pstmt.setString(6, goods.getGoodsCent());
			pstmt.setString(7, goods.getGoodsScope());
			pstmt.setString(8, goods.getGoodsPlace());
			pstmt.setString(9,goods.getGoodsHabitus());
			pstmt.setString(10, goods.getSortName());
			pstmt.executeUpdate();
			conn.commit();
			pstmt.close();
		} catch(Exception e){
			e.printStackTrace();
		} finally {
			dbc.close();
		}
	}
	/**
	 * 查询全部信息
	 * */
	public List<Goods> queryAll() {
		List<Goods> goodsList = new ArrayList<Goods>();
		String sql = "select * from goods";
		PreparedStatement pstmt = null;
		DataBaseConnection dbc = null;
		try{
			dbc = new DataBaseConnection();
			Connection conn = dbc.getConnection();
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()){
				Goods goods = new Goods();
				goods.setGoodsId(rs.getInt(1));
				goods.setGoodsName(rs.getString(2));
				goods.setGoodsmaterial(rs.getString(3));
				goods.setGoodsPackage(rs.getString(4));
				goods.setGoodsLanguage(rs.getString(5));
				goods.setGoodsPrice(rs.getFloat(6));
				goods.setGoodsCent(rs.getString(7));
				goods.setGoodsScope(rs.getString(8));
				goods.setGoodsPlace(rs.getString(9));
				goods.setGoodsHabitus(rs.getString(10));
				goods.setSortName(rs.getString(11));
				goodsList.add(goods);
			}
			conn.commit();
			pstmt.close();
		} catch(Exception e){
			e.printStackTrace();
		} finally {
			dbc.close();
		}
		return goodsList;
	}
	/**
	 * 按照编号查询
	 * */
	public Goods queryById(String id) {
		String sql = "select * from goods where goodsId=?";
		PreparedStatement pstmt = null;
		DataBaseConnection dbc = null;
		Goods goods = null;
		try{
			dbc = new DataBaseConnection();
			Connection conn = dbc.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, Integer.parseInt(id));
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()){
				goods = new Goods();
				goods.setGoodsId(rs.getInt(1));
				goods.setGoodsName(rs.getString(2));
				goods.setGoodsmaterial(rs.getString(3));
				goods.setGoodsPackage(rs.getString(4));
				goods.setGoodsLanguage(rs.getString(5));
				goods.setGoodsPrice(rs.getFloat(6));
				goods.setGoodsCent(rs.getString(7));
				goods.setGoodsScope(rs.getString(8));
				goods.setGoodsPlace(rs.getString(9));
				goods.setGoodsHabitus(rs.getString(10));
				goods.setSortName(rs.getString(11));
			}
			conn.commit();
			pstmt.close();
		} catch(Exception e){
			e.printStackTrace();
		} finally {
			dbc.close();
		}
		return goods;
	}
	/**
	 * 更新信息
	 * */
	public void update(Goods goods) {
		String sql = "Update goods set goodsName=?,goodsmaterial=?,goodsPackage=?,goodsLanguage=?,goodsPrice=?,goodsCent=?,goodsScope=?,goodsPlace=?,goodsHabitus=?,sortName=? where goodsId=?";
		PreparedStatement pstmt = null;
		DataBaseConnection dbc = null;
		try{
			dbc = new DataBaseConnection();
			Connection conn = dbc.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, goods.getGoodsName());
			pstmt.setString(2, goods.getGoodsmaterial());
			pstmt.setString(3, goods.getGoodsPackage());
			pstmt.setString(4, goods.getGoodsLanguage());
			pstmt.setFloat(5, goods.getGoodsPrice());
			pstmt.setString(6, goods.getGoodsCent());
			pstmt.setString(7, goods.getGoodsScope());
			pstmt.setString(8, goods.getGoodsPlace());
			pstmt.setString(9,goods.getGoodsHabitus());
			pstmt.setString(10, goods.getSortName());
			pstmt.setInt(11, goods.getGoodsId());
			pstmt.executeUpdate();
			conn.commit();
			pstmt.close();
		} catch(Exception e){
			e.printStackTrace();
		} finally {
			dbc.close();
		}
		
	}
	/**
	 * 按照名称查询
	 * */
	public Goods queryByName(String name) {
		String sql = "select * from goods where goodsName=?";
		PreparedStatement pstmt = null;
		DataBaseConnection dbc = null;
		Goods goods = null;
		try{
			dbc = new DataBaseConnection();
			Connection conn = dbc.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()){
				goods = new Goods();
				goods.setGoodsId(rs.getInt(1));
				goods.setGoodsName(rs.getString(2));
				goods.setGoodsmaterial(rs.getString(3));
				goods.setGoodsPackage(rs.getString(4));
				goods.setGoodsLanguage(rs.getString(5));
				goods.setGoodsPrice(rs.getFloat(6));
				goods.setGoodsCent(rs.getString(7));
				goods.setGoodsScope(rs.getString(8));
				goods.setGoodsPlace(rs.getString(9));
				goods.setGoodsHabitus(rs.getString(10));
				goods.setSortName(rs.getString(11));
			}
			conn.commit();
			pstmt.close();
		} catch(Exception e){
			e.printStackTrace();
		} finally {
			dbc.close();
		}
		return goods;
	}

}
