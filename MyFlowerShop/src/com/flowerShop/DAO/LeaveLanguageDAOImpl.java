package com.flowerShop.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.flowerShop.domain.LeaveLanguage;

/**
 * 留言的DAO类实现数据库的增删改、查询等操作
 */
public class LeaveLanguageDAOImpl implements LeaveLanguageDAO{

	/**
	 * 删除信息
	 * */
	public void delete(String id) {
		String sql = "delete from leaveLanguage where leaveLanguageId=?";
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
	public void insert(LeaveLanguage leaveLanguage) {
		String sql = "Insert into leaveLanguage(name,qq,email,leaveLanguage,dateTime) values(?,?,?,?,?)";
		PreparedStatement pstmt = null;
		DataBaseConnection dbc = null;
		try{
			dbc = new DataBaseConnection();
			Connection conn = dbc.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, leaveLanguage.getName());
			pstmt.setString(2, leaveLanguage.getQq());
			pstmt.setString(3, leaveLanguage.getEmail());
			pstmt.setString(4, leaveLanguage.getLeaveLanguage());
			pstmt.setString(5, leaveLanguage.getDateTime());
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
	public List<LeaveLanguage> queryAll() {
		List<LeaveLanguage> leaveLanguageList = new ArrayList<LeaveLanguage>();
		String sql = "select * from leaveLanguage";
		PreparedStatement pstmt = null;
		DataBaseConnection dbc = null;
		try{
			dbc = new DataBaseConnection();
			Connection conn = dbc.getConnection();
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()){
				LeaveLanguage leaveLanguage = new LeaveLanguage();
				leaveLanguage.setLeaveLanguageId(rs.getInt(1));
				leaveLanguage.setName(rs.getString(2));
				leaveLanguage.setQq(rs.getString(3));
				leaveLanguage.setEmail(rs.getString(4));
				leaveLanguage.setLeaveLanguage(rs.getString(5));
				leaveLanguage.setDateTime(rs.getString(6));
				leaveLanguageList.add(leaveLanguage);
			}
			conn.commit();
			pstmt.close();
		} catch(Exception e){
			e.printStackTrace();
		} finally {
			dbc.close();
		}		
		return leaveLanguageList;
	}
	/**
	 * 按照编号查询
	 * */
	public LeaveLanguage queryById(String id) {
		String sql = "select * from leaveLanguage where leaveLanguageId=?";
		PreparedStatement pstmt = null;
		DataBaseConnection dbc = null;
		LeaveLanguage leaveLanguage = null;
		try{
			dbc = new DataBaseConnection();
			Connection conn = dbc.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, Integer.parseInt(id));
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()){
				leaveLanguage = new LeaveLanguage();
				leaveLanguage.setLeaveLanguageId(rs.getInt(1));
				leaveLanguage.setName(rs.getString(2));
				leaveLanguage.setQq(rs.getString(3));
				leaveLanguage.setEmail(rs.getString(4));
				leaveLanguage.setLeaveLanguage(rs.getString(5));
				leaveLanguage.setDateTime(rs.getString(6));
			}
			conn.commit();
			pstmt.close();
		} catch(Exception e){
			e.printStackTrace();
		} finally {
			dbc.close();
		}		
		return leaveLanguage;
	}
	/**
	 * 更新信息
	 * */
	public void update(LeaveLanguage leaveLanguage) {
		String sql = "Update leaveLanguage set name=?,qq=?,email=?,leaveLanguage=?,dateTime=? where leaveLanguageId=?";
		PreparedStatement pstmt = null;
		DataBaseConnection dbc = null;
		try{
			dbc = new DataBaseConnection();
			Connection conn = dbc.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, leaveLanguage.getName());
			pstmt.setString(2, leaveLanguage.getQq());
			pstmt.setString(3, leaveLanguage.getEmail());
			pstmt.setString(4, leaveLanguage.getLeaveLanguage());
			pstmt.setString(5, leaveLanguage.getDateTime());
			pstmt.setInt(6, leaveLanguage.getLeaveLanguageId());
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
	 * 按名字查询
	 * */
	public LeaveLanguage queryByName(String name) {
		String sql = "select * from leaveLanguage where name=?";
		PreparedStatement pstmt = null;
		DataBaseConnection dbc = null;
		LeaveLanguage leaveLanguage = null;
		try{
			dbc = new DataBaseConnection();
			Connection conn = dbc.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()){
				leaveLanguage = new LeaveLanguage();
				leaveLanguage.setLeaveLanguageId(rs.getInt(1));
				leaveLanguage.setName(rs.getString(2));
				leaveLanguage.setQq(rs.getString(3));
				leaveLanguage.setEmail(rs.getString(4));
				leaveLanguage.setLeaveLanguage(rs.getString(5));
				leaveLanguage.setDateTime(rs.getString(6));
			}
			conn.commit();
			pstmt.close();
		} catch(Exception e){
			e.printStackTrace();
		} finally {
			dbc.close();
		}		
		return leaveLanguage;
	}

}
