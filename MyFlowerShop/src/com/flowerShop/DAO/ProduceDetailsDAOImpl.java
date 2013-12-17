package com.flowerShop.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.flowerShop.domain.ProduceDetails;

/**
 * 厂商详情信息的DAO类实现数据库的增删改、查询等操作
 */
public class ProduceDetailsDAOImpl implements ProduceDetailsDAO{
	/**
	 * 删除信息
	 * */
	public void delete(String id) {
		String sql = "Delete from produceDetails where produceId=?";
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
	public void insert(ProduceDetails produceDetails) {
		String sql = "Insert into produceDetails(produceId,produceName,sortId,goodsId) values(?,?,?,?)";
		PreparedStatement pstmt = null;
		DataBaseConnection dbc = null;
		try{
			dbc = new DataBaseConnection();
			Connection conn = dbc.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, produceDetails.getProduceId());
			pstmt.setString(2, produceDetails.getProduceName());
			pstmt.setInt(3, produceDetails.getSortId());
			pstmt.setInt(4,produceDetails.getGoodsId());
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
	public List<ProduceDetails> queryAll() {
		String sql = "Select * from produceDetails";
		PreparedStatement pstmt = null;
		DataBaseConnection dbc = null;
		List<ProduceDetails> produceDetailsList = new ArrayList<ProduceDetails>();
		try{
			dbc = new DataBaseConnection();
			Connection conn = dbc.getConnection();
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()){
				ProduceDetails produceDetails = new ProduceDetails();
				produceDetails.setProduceId(rs.getInt(1));
				produceDetails.setProduceName(rs.getString(2));
				produceDetails.setSortId(rs.getInt(3));
				produceDetails.setGoodsId(rs.getInt(4));
				produceDetailsList.add(produceDetails);
			}
			conn.commit();
			pstmt.close();
		} catch(Exception e){
			e.printStackTrace();
		} finally {
			dbc.close();
		}		
		return produceDetailsList;
	}
	/**
	 * 按编号查询
	 * */
	public ProduceDetails queryById(String id) {
		String sql = "Select * from produceDetails where produceId=?";
		PreparedStatement pstmt = null;
		DataBaseConnection dbc = null;
		ProduceDetails produceDetails = null;
		try{
			dbc = new DataBaseConnection();
			Connection conn = dbc.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, Integer.parseInt(id));
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()){
				produceDetails = new ProduceDetails();
				produceDetails.setProduceId(rs.getInt(1));
				produceDetails.setProduceName(rs.getString(2));
				produceDetails.setSortId(rs.getInt(3));
				produceDetails.setGoodsId(rs.getInt(4));
			}
			conn.commit();
			pstmt.close();
		} catch(Exception e){
			e.printStackTrace();
		} finally {
			dbc.close();
		}		
		return produceDetails;
	}
	/**
	 * 更新信息
	 * */ 
	public void update(ProduceDetails produceDetails) {
		String sql = "Update produceDetails set produceName=?,sortId=?,goodsId=? where produceId=?";
		PreparedStatement pstmt = null;
		DataBaseConnection dbc = null;
		try{
			dbc = new DataBaseConnection();
			Connection conn = dbc.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, produceDetails.getProduceName());
			pstmt.setInt(2, produceDetails.getSortId());
			pstmt.setInt(3,produceDetails.getGoodsId());
			pstmt.setInt(4,produceDetails.getProduceId());
			pstmt.executeUpdate();
			conn.commit();
			pstmt.close();
		} catch(Exception e){
			e.printStackTrace();
		} finally {
			dbc.close();
		}		
	}

}
