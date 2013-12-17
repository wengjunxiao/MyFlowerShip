package com.flowerShop.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * ���ݿ�������
 */
public class DataBaseConnection {
	private static final String driver = "com.mysql.jdbc.Driver";
	private static final String url = "jdbc:mysql://localhost:3309/flowerdb";
	//jdbc:mysql://localhost:3306/myuser
	private static final String user = "root";
	private static final String pwd = "root";
	// ���ݿ����Ӷ���
	private Connection conn = null;
	/**
	 * ���췽������������
	 * */
	public DataBaseConnection() {
		try{
			Class.forName(driver);
			this.conn = DriverManager.getConnection(url, user, pwd);
		} catch (Exception e){
			System.out.println("���ݿ����ʧ��!"+e.toString());
		}
	}
	/**������ݿ�����
	 * @return conn ���ݿ����� 
	 * @throws SQLException 
	 */
	public Connection getConnection() throws SQLException{
		conn.setAutoCommit(false);
		return conn;
	}
	/**
	 * �ر����ݿ�����
	 * */
	public void close() {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
