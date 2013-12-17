package com.flowerShop.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.flowerShop.domain.Orders;

/**
 * 货物的DAO类实现数据库的增删改、查询等操作
 */
public class OrdersDAOImpl implements OrdersDAO{

	/**
	 * 删除信息
	 * */
	public void delete(String id) {
		String sql = "delete from orders where ordersId=?";
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
	public void insert(Orders orders) {
		String sql = "Insert into orders(usersName,ordersPrice,ordersDatetime) values(?,?,?)";
		PreparedStatement pstmt = null;
		DataBaseConnection dbc = null;
		try{
			dbc = new DataBaseConnection();
			Connection conn = dbc.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,orders.getUsersName());
			pstmt.setFloat(2, orders.getOrdersPrice());
			pstmt.setString(3, orders.getOrdersDatetime());
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
	public List<Orders> queryAll() {
		String sql = "Select * from orders";
		PreparedStatement pstmt = null;
		DataBaseConnection dbc = null;
		List<Orders> ordersList = new ArrayList<Orders>();
		try{
			dbc = new DataBaseConnection();
			Connection conn = dbc.getConnection();
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()){
				Orders orders = new Orders();
				orders.setOrdersId(rs.getInt(1));
				orders.setUsersName(rs.getString(2));
				orders.setOrdersPrice(rs.getFloat(3));
				orders.setOrdersDatetime(rs.getString(4));
				ordersList.add(orders);
			}
			conn.commit();
			pstmt.close();
		} catch(Exception e){
			e.printStackTrace();
		} finally {
			dbc.close();
		}		
		return ordersList;
	}
	/**
	 * 按照编号查询
	 * */
	public Orders queryById(String id) {
		String sql = "Select * from orders where ordersId=?";
		PreparedStatement pstmt = null;
		DataBaseConnection dbc = null;
		Orders orders = null;
		try{
			dbc = new DataBaseConnection();
			Connection conn = dbc.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, Integer.parseInt(id));
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()){
				orders = new Orders();
				orders.setOrdersId(rs.getInt(1));
				orders.setUsersName(rs.getString(2));
				orders.setOrdersPrice(rs.getFloat(3));
				orders.setOrdersDatetime(rs.getString(4));
			}
			conn.commit();
			pstmt.close();
		} catch(Exception e){
			e.printStackTrace();
		} finally {
			dbc.close();
		}		
		return orders;
	}
	/**
	 * 更新信息
	 * */
	public void update(Orders orders) {
		String sql = "Update orders set usersName=?,ordersPrice=?,ordersDatetime=? where ordersId=?";
		PreparedStatement pstmt = null;
		DataBaseConnection dbc = null;
		try{
			dbc = new DataBaseConnection();
			Connection conn = dbc.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,orders.getUsersName());
			pstmt.setFloat(2, orders.getOrdersPrice());
			pstmt.setString(3, orders.getOrdersDatetime());
			pstmt.setInt(4, orders.getOrdersId());
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
	 * 按时间查询
	 * */
	public Orders queryByDate(String date) {
		String sql = "Select * from orders where ordersDatetime=?";
		PreparedStatement pstmt = null;
		DataBaseConnection dbc = null;
		Orders orders = null;
		try{
			dbc = new DataBaseConnection();
			Connection conn = dbc.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, date);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()){
				orders = new Orders();
				orders.setOrdersId(rs.getInt(1));
				orders.setUsersName(rs.getString(2));
				orders.setOrdersPrice(rs.getFloat(3));
				orders.setOrdersDatetime(rs.getString(4));
			}
			conn.commit();
			pstmt.close();
		} catch(Exception e){
			e.printStackTrace();
		} finally {
			dbc.close();
		}		
		return orders;
	}

}
