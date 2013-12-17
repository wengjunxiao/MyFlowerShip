package com.flowerShop.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.flowerShop.domain.Produce;

/**
 * 厂商信息的DAO类实现数据库的增删改、查询等操作
 */
public class ProduceDAOImpl implements ProduceDAO{

	/**
	 * 删除信息
	 * */	 
	public void delete(String id) {
		String sql = "Delete from produce where produceId=?";
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
	public void insert(Produce produce) {
		String sql = "Insert into produce(produceName) values(?)";
		PreparedStatement pstmt = null;
		DataBaseConnection dbc = null;
		try{
			dbc = new DataBaseConnection();
			Connection conn = dbc.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, produce.getProduceName());
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
	public List<Produce> queryAll() {
		String sql = "Select * from produce";
		PreparedStatement pstmt = null;
		DataBaseConnection dbc = null;
		List<Produce> produceList = new ArrayList<Produce>();
		try{
			dbc = new DataBaseConnection();
			Connection conn = dbc.getConnection();
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()){
				Produce produce = new Produce();
				produce.setProduceId(rs.getInt(1));
				produce.setProduceName(rs.getString(2));
				produceList.add(produce);
			}
			conn.commit();
			pstmt.close();
		} catch(Exception e){
			e.printStackTrace();
		} finally {
			dbc.close();
		}		
		return produceList;
	}
	/**
	 * 按编号查询
	 * */
	public Produce queryById(String id) {
		String sql = "Select * from produce where produceId=?";
		PreparedStatement pstmt = null;
		DataBaseConnection dbc = null;
		Produce produce = null;
		try{
			dbc = new DataBaseConnection();
			Connection conn = dbc.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, Integer.parseInt(id));
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()){
				produce = new Produce();
				produce.setProduceId(rs.getInt(1));
				produce.setProduceName(rs.getString(2));
			}
			conn.commit();
			pstmt.close();
		} catch(Exception e){
			e.printStackTrace();
		} finally {
			dbc.close();
		}		
		return produce;
	}
	/**
	 * 更新信息
	 * */
	public void update(Produce produce) {
		String sql = "Update produce set produceName=? where produceId=?";
		PreparedStatement pstmt = null;
		DataBaseConnection dbc = null;
		try{
			dbc = new DataBaseConnection();
			Connection conn = dbc.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, produce.getProduceName());
			pstmt.setInt(2, produce.getProduceId());
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
	public Produce queryByName(String name) {
		String sql = "Select * from produce where produceName=?";
		PreparedStatement pstmt = null;
		DataBaseConnection dbc = null;
		Produce produce = null;
		try{
			dbc = new DataBaseConnection();
			Connection conn = dbc.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()){
				produce = new Produce();
				produce.setProduceId(rs.getInt(1));
				produce.setProduceName(rs.getString(2));
			}
			conn.commit();
			pstmt.close();
		} catch(Exception e){
			e.printStackTrace();
		} finally {
			dbc.close();
		}		
		return produce;
	}

}
