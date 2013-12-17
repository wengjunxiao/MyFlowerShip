package com.flowerShop.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.flowerShop.domain.SafeLog;

/**
 * 登录日志信息的DAO类实现数据库的增删改、查询等操作
 */
public class SafeLogDAOImpl implements SafeLogDAO{
	
	/**
	 * 删除信息
	 * */ 
	public void delete(String id) {
		String sql = "Delete from safeLog where logId=?";
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
	public void insert(SafeLog safeLog) {
		String sql = "Insert into safeLog(usersId,landingDatetime,exitDatetime,landingIp) values(?,?,?,?)";
		PreparedStatement pstmt = null;
		DataBaseConnection dbc = null;
		try{
			dbc = new DataBaseConnection();
			Connection conn = dbc.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, safeLog.getUsersId());
			pstmt.setString(2, safeLog.getLandingDatetime());
			pstmt.setString(3, safeLog.getExitDatetime());
			pstmt.setString(4, safeLog.getLandingIp());
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
	public List<SafeLog> queryAll() {
		String sql = "Select * from safeLog";
		PreparedStatement pstmt = null;
		DataBaseConnection dbc = null;
		List<SafeLog> safeLogList = new ArrayList<SafeLog>();
		try{
			dbc = new DataBaseConnection();
			Connection conn = dbc.getConnection();
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()){
				SafeLog safeLog = new SafeLog();
				safeLog.setLogId(rs.getInt(1));
				safeLog.setUsersId(rs.getString(2));
				safeLog.setLandingDatetime(rs.getString(3));
				safeLog.setExitDatetime(rs.getString(4));
				safeLog.setLandingIp(rs.getString(5));
				safeLogList.add(safeLog);
			}
			conn.commit();
			pstmt.close();
		} catch(Exception e){
			e.printStackTrace();
		} finally {
			dbc.close();
		}		
		return safeLogList;
	}
	/**
	 * 按编号查询
	 * */
	public SafeLog queryById(String id) {
		String sql = "Select * from safeLog where logId=?";
		PreparedStatement pstmt = null;
		DataBaseConnection dbc = null;
		SafeLog safeLog = null;
		try{
			dbc = new DataBaseConnection();
			Connection conn = dbc.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, Integer.parseInt(id));
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()){
				safeLog = new SafeLog();
				safeLog.setLogId(rs.getInt(1));
				safeLog.setUsersId(rs.getString(2));
				safeLog.setLandingDatetime(rs.getString(3));
				safeLog.setExitDatetime(rs.getString(4));
				safeLog.setLandingIp(rs.getString(5));
			}
			conn.commit();
			pstmt.close();
		} catch(Exception e){
			e.printStackTrace();
		} finally {
			dbc.close();
		}		
		return safeLog;
	}
	/**
	 * 更新信息
	 * */
	public void update(SafeLog safeLog) {
		String sql = "Update safeLog set usersId=?,landingDatetime=?,exitDatetime=?,landingIp=? where logId=?";
		PreparedStatement pstmt = null;
		DataBaseConnection dbc = null;
		try{
			dbc = new DataBaseConnection();
			Connection conn = dbc.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, safeLog.getUsersId());
			pstmt.setString(2, safeLog.getLandingDatetime());
			pstmt.setString(3, safeLog.getExitDatetime());
			pstmt.setString(4, safeLog.getLandingIp());
			pstmt.setInt(5, safeLog.getLogId());
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
