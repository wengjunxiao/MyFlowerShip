package com.flowerShop.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.flowerShop.domain.OrdersDetails;

/**
 * ������ϸ��Ϣ��DAO��ʵ�����ݿ����ɾ�ġ���ѯ�Ȳ���
 */
public class OrdersDetailsDAOImpl implements OrdersDetailsDAO{

	/**
	 * ɾ����Ϣ
	 * */
	public void delete(String id) {
		String sql = "Delete from ordersDetails where ordersId=?";
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
	 * ������Ϣ
	 * */
	public void insert(OrdersDetails ordersDetails) {
		String sql = "Insert into ordersDetails(ordersId,goodsName,goodsPrice,goodsCount) values(?,?,?,?)";
		PreparedStatement pstmt = null;
		DataBaseConnection dbc = null;
		try{
			dbc = new DataBaseConnection();
			Connection conn = dbc.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, ordersDetails.getOrdersId());
			pstmt.setString(2, ordersDetails.getGoodsName());
			pstmt.setFloat(3, ordersDetails.getGoodsPrice());
			pstmt.setInt(4, ordersDetails.getGoodsCount());
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
	 * ��ѯȫ��
	 * */
	public List<OrdersDetails> queryAll() {
		String sql = "Select * from ordersDetails";
		PreparedStatement pstmt = null;
		DataBaseConnection dbc = null;
		List<OrdersDetails> ordersDetailsList = new ArrayList<OrdersDetails>();
		try{
			dbc = new DataBaseConnection();
			Connection conn = dbc.getConnection();
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()){
				OrdersDetails ordersDetails = new OrdersDetails();
				ordersDetails.setOrdersId(rs.getInt(1));
				ordersDetails.setGoodsName(rs.getString(2));
				ordersDetails.setGoodsPrice(rs.getFloat(3));
				ordersDetails.setGoodsCount(rs.getInt(4));
				ordersDetailsList.add(ordersDetails);
			}
			conn.commit();
			pstmt.close();
		} catch(Exception e){
			e.printStackTrace();
		} finally {
			dbc.close();
		}		
		return ordersDetailsList;
	}
	/**
	 * ����Ų�ѯ
	 * */
	public OrdersDetails queryById(String id) {
		String sql = "Select * from ordersDetails where ordersId=?";
		PreparedStatement pstmt = null;
		DataBaseConnection dbc = null;
		OrdersDetails ordersDetails = null;
		try{
			dbc = new DataBaseConnection();
			Connection conn = dbc.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, Integer.parseInt(id));
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()){
				ordersDetails = new OrdersDetails();
				ordersDetails.setOrdersId(rs.getInt(1));
				ordersDetails.setGoodsName(rs.getString(2));
				ordersDetails.setGoodsPrice(rs.getFloat(3));
				ordersDetails.setGoodsCount(rs.getInt(4));
			}
			conn.commit();
			pstmt.close();
		} catch(Exception e){
			e.printStackTrace();
		} finally {
			dbc.close();
		}		
		return ordersDetails;
	}
	/**
	 * ������Ϣ
	 * */
	public void update(OrdersDetails ordersDetails) {
		String sql = "Update ordersDetails set goodsName=?,goodsPrice=?,goodsCount=? where ordersId=?";
		PreparedStatement pstmt = null;
		DataBaseConnection dbc = null;
		try{
			dbc = new DataBaseConnection();
			Connection conn = dbc.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, ordersDetails.getGoodsName());
			pstmt.setFloat(2, ordersDetails.getGoodsPrice());
			pstmt.setInt(3, ordersDetails.getGoodsCount());
			pstmt.setInt(4, ordersDetails.getOrdersId());
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
