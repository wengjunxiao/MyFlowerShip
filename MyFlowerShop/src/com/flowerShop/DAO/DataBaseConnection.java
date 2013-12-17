package com.flowerShop.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 数据库链接类
 */
public class DataBaseConnection {
	private static final String driver = "com.mysql.jdbc.Driver";
	private static final String url = "jdbc:mysql://localhost:3309/flowerdb";
	//jdbc:mysql://localhost:3306/myuser
	private static final String user = "root";
	private static final String pwd = "root";
	// 数据库连接对象
	private Connection conn = null;
	/**
	 * 构造方法，加载驱动
	 * */
	public DataBaseConnection() {
		try{
			Class.forName(driver);
			this.conn = DriverManager.getConnection(url, user, pwd);
		} catch (Exception e){
			System.out.println("数据库加载失败!"+e.toString());
		}
	}
	/**获得数据库连接
	 * @return conn 数据库连接 
	 * @throws SQLException 
	 */
	public Connection getConnection() throws SQLException{
		conn.setAutoCommit(false);
		return conn;
	}
	/**
	 * 关闭数据库连接
	 * */
	public void close() {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
