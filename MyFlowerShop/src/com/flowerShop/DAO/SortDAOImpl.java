package com.flowerShop.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.flowerShop.domain.Sort;

/**
 * 分类排序的DAO类实现数据库的增删改、查询等操作
 */
public class SortDAOImpl implements SortDAO{
	/**
	 * 删除信息
	 * */
	public void delete(String id) {
		String sql = "Delete from sort where sortId=?";
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
	public void insert(Sort sort) {
		String sql = "Insert into sort(sortName) values(?)";
		PreparedStatement pstmt = null;
		DataBaseConnection dbc = null;
		try{
			dbc = new DataBaseConnection();
			Connection conn = dbc.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, sort.getSortName());
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
	 * 查询全部
	 * */ 
	public List<Sort> queryAll() {
		String sql = "Select * from sort";
		PreparedStatement pstmt = null;
		DataBaseConnection dbc = null;
		List<Sort> sortList = new ArrayList<Sort>();
		try{
			dbc = new DataBaseConnection();
			Connection conn = dbc.getConnection();
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()){
				Sort sort = new Sort();
				sort.setSortId(rs.getInt(1));
				sort.setSortName(rs.getString(2));
				sortList.add(sort);
			}
			conn.commit();
			pstmt.close();
		} catch(Exception e){
			e.printStackTrace();
		} finally {
			dbc.close();
		}		
		return sortList;
	}
	/**
	 * 按编号查询
	 * */
	public Sort queryById(String id) {
		String sql = "Select * from sort where sortId=?";
		PreparedStatement pstmt = null;
		DataBaseConnection dbc = null;
		Sort sort = null;
		try{
			dbc = new DataBaseConnection();
			Connection conn = dbc.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, Integer.parseInt(id));
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()){
				sort = new Sort();
				sort.setSortId(rs.getInt(1));
				sort.setSortName(rs.getString(2));
			}
			conn.commit();
			pstmt.close();
		} catch(Exception e){
			e.printStackTrace();
		} finally {
			dbc.close();
		}		
		return sort;
	}
	/**
	 * 更新信息
	 * */ 
	public void update(Sort sort) {
		String sql = "Update sort set sortName=? where sortId=?";
		PreparedStatement pstmt = null;
		DataBaseConnection dbc = null;
		try{
			dbc = new DataBaseConnection();
			Connection conn = dbc.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, sort.getSortName());
			pstmt.setInt(2, sort.getSortId());
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
	 * 按名称查询
	 * */ 
	public Sort queryByName(String name) {
		String sql = "Select * from sort where sortName=?";
		PreparedStatement pstmt = null;
		DataBaseConnection dbc = null;
		Sort sort = null;
		try{
			dbc = new DataBaseConnection();
			Connection conn = dbc.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()){
				sort = new Sort();
				sort.setSortId(rs.getInt(1));
				sort.setSortName(rs.getString(2));
			}
			conn.commit();
			pstmt.close();
		} catch(Exception e){
			e.printStackTrace();
		} finally {
			dbc.close();
		}		
		return sort;
	}

}
