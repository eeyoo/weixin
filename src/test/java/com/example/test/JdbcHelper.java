package com.example.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcHelper {
	private final static String URL = "mysql:jdbc:mysql//localhost:3306/imooc";
	private final static String USER = "root";
	private final static String PWD = "root";

	
	private JdbcHelper() {
	}
	
	public static JdbcHelper getInstance() {
		return new JdbcHelper();
	}
	
	public Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(URL, USER, PWD);
			System.out.println("connect successfully.");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	
	public static void main(String[] args) {
		Connection connection = JdbcHelper.getInstance().getConnection();
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
