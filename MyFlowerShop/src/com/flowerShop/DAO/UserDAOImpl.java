package com.flowerShop.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.flowerShop.domain.User;

public class UserDAOImpl implements UserDAO{
	
	/**
	 * 删除信息
	 * */
	public void delete(String id) {
		String sql = "Delete from users where usersId=?";
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
	public void insert(User user) {
		String sql = "Insert into users(usersName,usersPass,usersPassQuestion,usersPassReply,usersTrueName,usersAddress,usersPhone,usersE_mail) values(?,?,?,?,?,?,?,?)";
		PreparedStatement pstmt = null;
		DataBaseConnection dbc = null;
		try{
			dbc = new DataBaseConnection();
			Connection conn = dbc.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user.getUsersName());
			pstmt.setString(2, user.getUsersPass());
			pstmt.setString(3, user.getUsersPassQuestion());
			pstmt.setString(4, user.getUsersPassReply());
			pstmt.setString(5, user.getUsersTrueName());
			pstmt.setString(6, user.getUsersAddress());
			pstmt.setString(7, user.getUsersPhone());
			pstmt.setString(8, user.getUsersE_mail());
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
	public List<User> queryAll() {
		String sql = "Select * from users";
		PreparedStatement pstmt = null;
		DataBaseConnection dbc = null;
		List<User> usersList = new ArrayList<User>();
		try{
			dbc = new DataBaseConnection();
			Connection conn = dbc.getConnection();
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()){
				User user = new User();
				user.setUsersId(rs.getInt(1));
				user.setUsersName(rs.getString(2));
				user.setUsersPass(rs.getString(3));
				user.setUsersPassQuestion(rs.getString(4));
				user.setUsersPassReply(rs.getString(5));
				user.setUsersTrueName(rs.getString(6));
				user.setUsersAddress(rs.getString(7));
				user.setUsersPhone(rs.getString(8));
				user.setUsersE_mail(rs.getString(9));
				usersList.add(user);
			}
			conn.commit();
			pstmt.close();
		} catch(Exception e){
			e.printStackTrace();
		} finally {
			dbc.close();
		}		
		return usersList;
	}
	/**
	 * 按编号查询
	 * */
	public User queryById(String id) {
		String sql = "Select * from users where usersId=?";
		PreparedStatement pstmt = null;
		DataBaseConnection dbc = null;
		User user = null;
		try{
			dbc = new DataBaseConnection();
			Connection conn = dbc.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, Integer.parseInt(id));
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()){
				user = new User();
				user.setUsersId(rs.getInt(1));
				user.setUsersName(rs.getString(2));
				user.setUsersPass(rs.getString(3));
				user.setUsersPassQuestion(rs.getString(4));
				user.setUsersPassReply(rs.getString(5));
				user.setUsersTrueName(rs.getString(6));
				user.setUsersAddress(rs.getString(7));
				user.setUsersPhone(rs.getString(8));
				user.setUsersE_mail(rs.getString(9));
			}
			conn.commit();
			pstmt.close();
		} catch(Exception e){
			e.printStackTrace();
		} finally {
			dbc.close();
		}		
		return user;
	}
	/**
	 * 更新信息
	 * */ 
	public void update(User user) {
		String sql = "Update users set usersName=?,usersPass=?,usersPassQuestion=?,usersPassReply=?,usersTrueName=?,usersAddress=?,usersPhone=?,usersE_mail=? where usersId=?";
		PreparedStatement pstmt = null;
		DataBaseConnection dbc = null;
		try{
			dbc = new DataBaseConnection();
			Connection conn = dbc.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user.getUsersName());
			pstmt.setString(2, user.getUsersPass());
			pstmt.setString(3, user.getUsersPassQuestion());
			pstmt.setString(4, user.getUsersPassReply());
			pstmt.setString(5, user.getUsersTrueName());
			pstmt.setString(6, user.getUsersAddress());
			pstmt.setString(7, user.getUsersPhone());
			pstmt.setString(8, user.getUsersE_mail());
			pstmt.setInt(9, user.getUsersId());
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
	 * 按用户名查询
	 * */
	public User queryByName(String name) {
		String sql = "Select * from users where usersName=?";
		PreparedStatement pstmt = null;
		DataBaseConnection dbc = null;
		User user = null;
		try{
			dbc = new DataBaseConnection();
			Connection conn = dbc.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()){
				user = new User();
				user.setUsersId(rs.getInt(1));
				user.setUsersName(rs.getString(2));
				user.setUsersPass(rs.getString(3));
				user.setUsersPassQuestion(rs.getString(4));
				user.setUsersPassReply(rs.getString(5));
				user.setUsersTrueName(rs.getString(6));
				user.setUsersAddress(rs.getString(7));
				user.setUsersPhone(rs.getString(8));
				user.setUsersE_mail(rs.getString(9));
			}
			conn.commit();
			pstmt.close();
		} catch(Exception e){
			e.printStackTrace();
		} finally {
			dbc.close();
		}		
		return user;
	}
}
