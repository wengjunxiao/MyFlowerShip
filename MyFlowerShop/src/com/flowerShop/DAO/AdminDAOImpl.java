package com.flowerShop.DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.flowerShop.domain.Admin;

/**
 * ����Ա��DAO��ʵ�����ݿ����ɾ�ġ���ѯ�Ȳ���
 */
public class AdminDAOImpl implements AdminDAO {

	/**
	 * ɾ����Ϣ
	 * */
	public void delete(String id) {
		int adminId = Integer.parseInt(id);
		String sql = "Delete from admin where adminId=?";
		PreparedStatement pstmt = null;
		DataBaseConnection dbc = null;
		try{
			dbc = new DataBaseConnection();
			Connection conn = dbc.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, adminId);
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
	public void insert(Admin admin) {
		String sql = "Insert into admin(adminName,adminPass) values(?,?)";
		PreparedStatement pstmt = null;
		DataBaseConnection dbc = null;
		try{
			dbc = new DataBaseConnection();
			Connection conn = dbc.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, admin.getAdminName());
			pstmt.setString(2, admin.getAdminPass());
			pstmt.executeUpdate();
			conn.commit();
			pstmt.close();
		} catch(Exception e){
			e.printStackTrace();
		} finally{
			dbc.close();
		}
	}
	/**
	 * ��ѯȫ����Ϣ
	 * */
	public List<Admin> queryAll() {
		List<Admin> adminList = new ArrayList<Admin>();
		String sql = "select * from admin";
		DataBaseConnection dbc = null;
		PreparedStatement pstmt = null;
		try{
			dbc = new DataBaseConnection();
			Connection conn = dbc.getConnection();
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()){
				Admin admin = new Admin();
				admin.setAdminId(rs.getInt(1));
				admin.setAdminName(rs.getString(2));
				admin.setAdminPass(rs.getString(3));
				adminList.add(admin);
			}
			conn.commit();
		} catch (Exception e){
			e.printStackTrace();
		} finally{
			dbc.close();
		}
		return adminList;
	}
	/**
	 * ����Ų�ѯ
	 * */
	public Admin queryById(String id) {
		Admin admin = null;
		String sql = "select * from admin where adminId=?";
		DataBaseConnection dbc = null;
		PreparedStatement pstmt = null;
		try{
			dbc = new DataBaseConnection();
			Connection conn = dbc.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, Integer.parseInt(id));
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()){
				admin = new Admin();
				admin.setAdminId(rs.getInt(1));
				admin.setAdminName(rs.getString(2));
				admin.setAdminPass(rs.getString(3));
			}
			conn.commit();
			pstmt.close();
		} catch (Exception e){
			e.printStackTrace();
		} finally {
			dbc.close();
		}
		return admin;
	}
	/**
	 * ������Ϣ
	 * */
	public void update(Admin admin) {
		String sql = "Update admin set adminName=?,adminPass=? where adminId=?";
		PreparedStatement pstmt = null;
		DataBaseConnection dbc = null;
		try{
			dbc = new DataBaseConnection();
			Connection conn = dbc.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, admin.getAdminName());
			pstmt.setString(2, admin.getAdminPass());
			pstmt.setInt(3,admin.getAdminId());
			pstmt.executeUpdate();
			conn.commit();
			pstmt.close();
		} catch (Exception e){
			e.printStackTrace();
		} finally{
			dbc.close();
		}
	}
	/**
	 * �����Ʋ�ѯ
	 * */
	public Admin queryByName(String name) {
		Admin admin = null;
		String sql = "select * from admin where adminName=?";
		DataBaseConnection dbc = null;
		PreparedStatement pstmt = null;
		try{
			dbc = new DataBaseConnection();
			Connection conn = dbc.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()){
				admin = new Admin();
				admin.setAdminId(rs.getInt(1));
				admin.setAdminName(rs.getString(2));
				admin.setAdminPass(rs.getString(3));
			}
			conn.commit();
			pstmt.close();
		} catch (Exception e){
			e.printStackTrace();
		} finally {
			dbc.close();
		}
		return admin;
	}

}
