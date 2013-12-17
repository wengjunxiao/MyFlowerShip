package com.flowerShop.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.flowerShop.domain.Produce;

/**
 * ������Ϣ��DAO��ʵ�����ݿ����ɾ�ġ���ѯ�Ȳ���
 */
public class ProduceDAOImpl implements ProduceDAO{

	/**
	 * ɾ����Ϣ
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
	 * ������Ϣ
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
	 * ��ѯȫ��
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
	 * ����Ų�ѯ
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
	 * ������Ϣ
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
	 * �����Ʋ�ѯ
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
